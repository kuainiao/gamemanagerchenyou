package com.chenyou.service.activityservice;

import com.chenyou.base.BizException;
import com.chenyou.pojo.entity.PageResult;

import java.text.ParseException;

public interface ActivityRankService {
    PageResult listActivityRank(String startTime,String endTime,Integer serverId,int pageNum,int pageSize) throws ParseException, BizException;
}
