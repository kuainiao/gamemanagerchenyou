package com.chenyou.service.gamecountservice.impl;

import com.chenyou.base.BizException;
import com.chenyou.mapper.GangCountMapper;
import com.chenyou.pojo.GangCount;
import com.chenyou.pojo.GangCountExample;
import com.chenyou.pojo.entity.PageResult;
import com.chenyou.service.gamecountservice.GangCountService;
import com.chenyou.service.ServerService;
import com.chenyou.utils.DateUtil;
import com.chenyou.utils.StringUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * 帮派数量
 */
@Service
@Transactional
public class GangCountServiceImpl implements GangCountService {

    private static  final Logger logger=LoggerFactory.getLogger(GangCountServiceImpl.class);

    @Autowired
    private GangCountMapper gangCountMapper;

    @Autowired
    private ServerService serverService;

    @Override
    public PageResult listGangCount(String start,String end,Integer serverId, String channelId, int pageNum, int pageSize) throws BizException, ParseException {
        logger.info("start:" + start);
        logger.info("end:" + end);
        logger.info("serverId:" + serverId);
        logger.info("channelId:" + channelId);
        List <GangCount> list = new ArrayList <>();
        PageHelper.startPage(pageNum, pageSize);
        DateUtil.exchangeTime(start, end);
        GangCountExample example = new GangCountExample();
        example.setOrderByClause("gang_num asc");
        GangCountExample.Criteria criteria = example.createCriteria();
        if (serverId == null && channelId == null) {
            criteria.andServerIdIsNull();
            criteria.andChannelIdIsNull();
        }
        if (null != serverId) {
            criteria.andServerIdEqualTo(serverId);
        }
        if (null != channelId) {
            criteria.andChannelIdEqualTo(channelId);
        }
        if (!StringUtils.isEmpty(start) && !StringUtils.isEmpty(end)) {
            criteria.andShowTimeBetween(start, end);
        }
        if (!StringUtils.isEmpty(start) && StringUtils.isEmpty(end)) {
            criteria.andShowTimeEqualTo(start);
        }
        if (StringUtils.isEmpty(start) && !StringUtils.isEmpty(end)) {
            criteria.andShowTimeEqualTo(end);
        }
        list = gangCountMapper.selectByExample(example);
        if (StringUtils.isEmpty(list)) {
            throw new BizException(BizException.CODE_RESULT_NULL, "不好意思,当前没有数据!");
        }
        for (GangCount gangCount : list) {
            gangCount.setServerName(serverService.getServerName(gangCount.getServerId()));
        }
        Page <GangCount> page = (Page <GangCount>) list;
        return new PageResult(page.getTotal(), page.getResult());
    }
}
