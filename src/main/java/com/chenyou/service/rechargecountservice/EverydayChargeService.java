package com.chenyou.service.rechargecountservice;

import com.chenyou.base.BizException;
import com.chenyou.pojo.entity.PageResult;

import java.text.ParseException;

public interface EverydayChargeService {

    PageResult listEveryDayCharget(String startTime,String endTime,Integer serverId,String channelId,int pageNum,int pageSize) throws ParseException, BizException;

}
