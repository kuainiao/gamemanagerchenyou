package com.chenyou.service.newplayerservice.impl;

import com.chenyou.base.BizException;
import com.chenyou.mapper.LoginDayMapper;
import com.chenyou.pojo.LoginDay;
import com.chenyou.pojo.LoginDayExample;
import com.chenyou.pojo.entity.PageResult;
import com.chenyou.service.newplayerservice.LoginDayService;
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

@Service
@Transactional
public class LoginDayServiceImpl implements LoginDayService {


    private static final Logger logger=LoggerFactory.getLogger(LoginDayServiceImpl.class);

    @Autowired
    private LoginDayMapper loginDayMapper;

    /*
    *  
    * 登录天数
    * @author hlx
    * @date 2018\11\27 0027 18:12
    * @param [start, end, serverId, channelId, pageNum, pageSize]
    * @return com.chenyou.pojo.entity.PageResult
    */
    @Override
    public PageResult listLoginDay(String start, String end, Integer serverId, String channelId, int pageNum, int pageSize) throws BizException, ParseException {
        logger.info("start:" + start);
        logger.info("end:" + end);
        logger.info("serverId:" + serverId);
        logger.info("channelId:" + channelId);
        PageHelper.startPage(pageNum, pageSize);
        List <LoginDay> list = new ArrayList <LoginDay>();
        DateUtil.exchangeTime(start,end);
        LoginDayExample example = new LoginDayExample();
        example.setOrderByClause("show_time desc");
        LoginDayExample.Criteria criteria = example.createCriteria();
        if (null == serverId && null == channelId) {
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
        list = loginDayMapper.selectByExample(example);
        if (StringUtils.isEmpty(list)) {
            throw new BizException(BizException.CODE_RESULT_NULL, "不好意思,当前没有数据!");
        }
        Page <LoginDay> page = (Page <LoginDay>) list;
        return new PageResult(page.getTotal(), page.getResult());
    }


//        String startTime = null;
//        String endTime = null;
//        String temp = null;
//        PageHelper.startPage(pageNum, pageSize);
//        LoginDayExample example = new LoginDayExample();
//        example.setOrderByClause("count_num");
//        LoginDayExample.Criteria criteria = example.createCriteria();
//        if (!StringUtils.isEmpty(start) & !StringUtils.isEmpty(end)) {
//            startTime = start;
//            endTime =end;
//            if (DateUtil.parse(startTime).after(DateUtil.parse(endTime))) {
//                //如果前面时间大于后面时间
//                temp = endTime;
//                endTime = startTime;
//                startTime = temp;
//                criteria.andShowTimeBetween(startTime, endTime);
//            } else {
//                criteria.andShowTimeBetween(startTime, endTime);
//            }
//        }
//        //如果其中一个为空
//        if (!StringUtils.isEmpty(start) && StringUtils.isEmpty(end)) {
//            startTime=start;
//            criteria.andShowTimeEqualTo(startTime);
//        }
//        if (StringUtils.isEmpty(start) && !StringUtils.isEmpty(end)) {
//            endTime=end;
//            criteria.andShowTimeEqualTo(endTime);
//        }
//        //进行条件选择
//        if (serverId == null && channelId == null) {
//            criteria.andServerIdIsNull();
//            criteria.andChannelIdIsNull();
//        }
//        if (null != serverId) {
//            criteria.andServerIdEqualTo(serverId);
//        }
//        if (null != channelId) {
//            criteria.andChannelIdEqualTo(channelId);
//        }
//        List <LoginDay> list = loginDayMapper.selectByExample(example);
//        if (StringUtils.isEmpty(list)) {
//            throw new BizException(BizException.CODE_RESULT_NULL, "不好意思,当前没有数据!");
//        }
//        Page <LoginDay> page = (Page <LoginDay>) list;
//        return new PageResult(page.getTotal(), page.getResult());
//    }
}
