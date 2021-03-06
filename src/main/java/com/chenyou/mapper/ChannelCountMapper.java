package com.chenyou.mapper;

import com.chenyou.DataSource;
import com.chenyou.pojo.Channel;
import com.chenyou.pojo.ChannelCount;
import com.chenyou.pojo.ChannelCountExample;

import java.util.List;

import com.chenyou.utils.StringUtils;
import org.apache.ibatis.annotations.Param;
@DataSource("dataSource1")
public interface ChannelCountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_channel_count
     *
     * @mbggenerated Wed Oct 10 15:32:28 CST 2018
     */
    int countByExample(ChannelCountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_channel_count
     *
     * @mbggenerated Wed Oct 10 15:32:28 CST 2018
     */
    int deleteByExample(ChannelCountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_channel_count
     *
     * @mbggenerated Wed Oct 10 15:32:28 CST 2018
     */
    int deleteByPrimaryKey(Integer cId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_channel_count
     *
     * @mbggenerated Wed Oct 10 15:32:28 CST 2018
     */
    int insert(ChannelCount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_channel_count
     *
     * @mbggenerated Wed Oct 10 15:32:28 CST 2018
     */
    int insertSelective(ChannelCount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_channel_count
     *
     * @mbggenerated Wed Oct 10 15:32:28 CST 2018
     */
    List <ChannelCount> selectByExample(ChannelCountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_channel_count
     *
     * @mbggenerated Wed Oct 10 15:32:28 CST 2018
     */
    ChannelCount selectByPrimaryKey(Integer cId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_channel_count
     *
     * @mbggenerated Wed Oct 10 15:32:28 CST 2018
     */
    int updateByExampleSelective(@Param("record") ChannelCount record, @Param("example") ChannelCountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_channel_count
     *
     * @mbggenerated Wed Oct 10 15:32:28 CST 2018
     */
    int updateByExample(@Param("record") ChannelCount record, @Param("example") ChannelCountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_channel_count
     *
     * @mbggenerated Wed Oct 10 15:32:28 CST 2018
     */
    int updateByPrimaryKeySelective(ChannelCount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_channel_count
     *
     * @mbggenerated Wed Oct 10 15:32:28 CST 2018
     */
    int updateByPrimaryKey(ChannelCount record);

    List <ChannelCount> queryChannelCountAll();

    List <ChannelCount> queryChannelCountByTimeTo(@Param("start") String start, @Param("end") String end);

    List<ChannelCount> queryChannelCountByTime(@Param("time")String time);
}