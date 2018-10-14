package com.chenyou.service.impl;

import com.chenyou.base.BizException;
import com.chenyou.mapper.OnlineplayerCountMapper;
import com.chenyou.pojo.OnlineplayerCount;
import com.chenyou.pojo.OnlineplayerCountExample;
import com.chenyou.pojo.entity.PageResult;
import com.chenyou.service.OnlinePlayerCountService;
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
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class OnlinePlayerCountServiceImpl implements OnlinePlayerCountService {

    private static  final Logger logger=LoggerFactory.getLogger(OnlinePlayerCountServiceImpl.class);

    @Autowired
    private OnlineplayerCountMapper onlineplayerCountMapper;


    @Override
    public PageResult listOnlinePlayerCount(String start,String end, Integer serverId, String channelId, int pageNum, int pageSize) throws ParseException, BizException {
        logger.info("start:"+start);
        logger.info("end:"+end);
        logger.info("serverId:"+serverId);
        logger.info("channelId:"+channelId);
        String startTime = null;
        String endTime = null;
        String temp = null;
        PageHelper.startPage(pageNum,pageSize);
        OnlineplayerCountExample example = new OnlineplayerCountExample();
        example.setOrderByClause("record_time desc");
        OnlineplayerCountExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(start) && !StringUtils.isEmpty(end)) {
            startTime = start;
            endTime = end;
            if (DateUtil.parse(startTime).after(DateUtil.parse(endTime))) {
                //如果前面时间大于后面时间
                temp = endTime;
                endTime = startTime;
                startTime = temp;
                criteria.andRecordTimeBetween(startTime, endTime);
            } else {
                criteria.andRecordTimeBetween(startTime, endTime);
            }
        }
        //如果其中一个为空
        if (!StringUtils.isEmpty(start) && StringUtils.isEmpty(end)) {
            startTime=start;
            criteria.andRecordTimeEqualTo(startTime);
        }
        if (StringUtils.isEmpty(start) && !StringUtils.isEmpty(end)) {
            endTime=end;
            criteria.andRecordTimeEqualTo(endTime);
        }
        if(serverId ==null && channelId==null){
            criteria.andServerIdIsNull();
            criteria.andChannelIdIsNull();
        }
        if (serverId != null) {
            criteria.andServerIdEqualTo(serverId);
        }
        if (channelId != null) {
            criteria.andChannelIdEqualTo(channelId);
        }
        List <OnlineplayerCount> list = onlineplayerCountMapper.selectByExample(example);
        if(StringUtils.isEmpty(list)){
            throw  new BizException(BizException.CODE_RESULT_NULL,"不好意思,当前没有数据!");
        }
        Page <OnlineplayerCount> page = (Page <OnlineplayerCount>) list;
        return new PageResult(page.getTotal(), page.getResult());
    }
}
