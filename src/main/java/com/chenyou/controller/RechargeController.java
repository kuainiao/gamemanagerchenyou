package com.chenyou.controller;

import com.chenyou.Constants.ApplicationConstants;
import com.chenyou.base.BizException;
import com.chenyou.service.rechargecountservice.EverydayChargeService;
import com.chenyou.service.rechargecountservice.PointAnalyseService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/recharge")
public class RechargeController  extends  BaseController{

    @Autowired
    private EverydayChargeService everyDayChargeService;

    @Autowired
    private PointAnalyseService pointAnalyseService;

    /**
     * 每日充值
     * @param
     * @param serverId
     * @param channelId
     * @param page
     * @param rows
     * @return
     * @throws ParseException
     */
    @RequiresPermissions("recharge:day:view")
    @RequestMapping(value = "/listEveryDayCharge", method = RequestMethod.GET)
    public Map <String, Object> listEveryDayCharge(String start,String end, Integer serverId, String channelId, int page, int rows) throws ParseException, BizException {
        Map <String, Object> resultMap = new HashMap <>();
        resultMap.put(ApplicationConstants.TAG_DATA, everyDayChargeService.listEveryDayCharget(start,end, serverId, channelId, page, rows));
        resultMap.put(ApplicationConstants.TAG_SC, ApplicationConstants.SC_OK);
        return resultMap;
    }

    /**
     * 计费点分析
     * @param serverId
     * @param channelId
     * @param page
     * @param rows
     * @return
     * @throws BizException
     */
    @RequiresPermissions("point:pricing:view")
    @RequestMapping(value = "/listPointAnalyse", method = RequestMethod.GET)
    public Map <String, Object> listPointAnalyse(String start,String end,Integer serverId, String channelId, int page, int rows) throws BizException, ParseException {
        Map <String, Object> resultMap = new HashMap <>();
        resultMap.put(ApplicationConstants.TAG_DATA, pointAnalyseService.listPointAnalyse(start,end,serverId, channelId, page, rows));
        resultMap.put(ApplicationConstants.TAG_SC, ApplicationConstants.SC_OK);
        return resultMap;
    }


}
