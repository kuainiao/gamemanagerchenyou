package com.chenyou.service;

import com.chenyou.base.BizException;
import com.chenyou.pojo.entity.PageResult;

public interface LoginDayService {
    PageResult listLoginDay(Integer serverId,Integer channelId,int pageNum,int pageSize) throws BizException;
}
