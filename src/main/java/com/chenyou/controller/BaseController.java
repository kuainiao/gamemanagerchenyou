package com.chenyou.controller;

import com.chenyou.Constants.ApplicationConstants;
import com.chenyou.base.BizException;
import com.chenyou.pojo.User;
import com.chenyou.utils.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

public class BaseController {
    private static final Logger logger = LoggerFactory.getLogger(BaseController.class);

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String, Object> ExceptionHandler(Exception ex) {
        logger.error("ExceptionHandler", ex);
        Map<String, Object> resultMap = new HashMap<String, Object>();

        if (ex instanceof BizException) {
            BizException bizException = (BizException) ex;
            String errorMsg = "";
            if (logger.isDebugEnabled())
                errorMsg = bizException.getMessage();
            resultMap.put(ApplicationConstants.TAG_SC, bizException.getCode());
            resultMap.put(ApplicationConstants.TAG_SC_MSG, errorMsg);
            resultMap.put(ApplicationConstants.TAG_SC_ERRORMSG, errorMsg);
        } else {
            StringBuffer buf = new StringBuffer();
            if (logger.isDebugEnabled()) {
                buf.append("<");
                buf.append(ex.toString());
                buf.append(">");
                StringWriter sw = new StringWriter(1024);
                PrintWriter pw = new PrintWriter(sw);
                ex.printStackTrace(pw);
                pw.close();
                buf.append(sw.toString());
            } else {
                buf.append(ex.toString());
            }

            resultMap.put(ApplicationConstants.TAG_SC, "-99999");
            resultMap.put(ApplicationConstants.TAG_SC_ERRORMSG, buf.toString());
        }
        return resultMap;
    }


    @ExceptionHandler({UnauthorizedException.class, AuthorizationException.class})
    public Map<String, Object> authorizationException(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> resultMaP = new HashMap<>();
        resultMaP.put(ApplicationConstants.TAG_SC_ERRORMSG, "不好意思，您的权限不足!");
        return resultMaP;
    }

    //获取到登录名称
    public  static  String getUserName(){
        Subject subject = SecurityUtils.getSubject();
        User u = (User) subject.getPrincipal();
        return  u.getUserName();
    }


}
