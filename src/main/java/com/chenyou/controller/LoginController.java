package com.chenyou.controller;

import com.chenyou.Constants.ApplicationConstants;
import com.chenyou.base.BizException;
import com.chenyou.pojo.Menu;
import com.chenyou.pojo.User;
import com.chenyou.pojo.entity.Result;
import com.chenyou.service.MenuService;
import com.chenyou.service.UserService;
import com.chenyou.utils.MD5Utils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
public class LoginController extends  BaseController{

    private static Log logger = LogFactory.getLog(LoginController.class);

    @Autowired
    private MenuService menuService;


    @Autowired
    private UserService userService;

    /**
     * 进行登录验证
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Result login(String loginName, String password, HttpServletRequest request) {
        //获取到subject主体
        Subject subject = SecurityUtils.getSubject();
        //创建令牌
        UsernamePasswordToken token = new UsernamePasswordToken(loginName, MD5Utils.md5(password));
        try {
            //进行验证
            subject.login(token);
            User user = (User) subject.getPrincipal();
            //将登录的user放入到session
            request.getSession().setAttribute("user", user);
            return new Result(true, "登录成功!!!");
        } catch (AuthenticationException e) {
            e.printStackTrace();
            return new Result(false, "登录失败!!!");
        }
    }

    /**
     * 登出
     */

    @RequestMapping("/logout")
    public String logout() {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "login";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public Map <String, Object> map() throws BizException {
        Map <String, Object> map = new HashMap <>();
        //获取到用户
//        User user = ShiroUtils.getUser();
        Subject subject = SecurityUtils.getSubject();
        User user = (User) subject.getPrincipal();
        //根据用户id查询对应的权限
        List <Menu> menus = menuService.listMenusByUserId(user.getUserId());
        map.put(ApplicationConstants.TAG_DATA, menus);
        map.put(ApplicationConstants.TAG_SC,ApplicationConstants.SC_OK);
        return map;
    }

    @RequestMapping("/getUser")
    public User getUser() throws BizException {
        Subject subject = SecurityUtils.getSubject();
        User u = (User) subject.getPrincipal();
        User user = userService.getUserByUserId(u.getUserId());
        return user;
    }

}
