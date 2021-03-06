package com.chenyou.mapper;

import com.chenyou.DataSource;
import com.chenyou.pojo.ChannelSummary;
import com.chenyou.pojo.ChannelSummaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
@DataSource("dataSource1")
public interface ChannelSummaryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_channel_summary
     *
     * @mbggenerated Wed Oct 10 10:35:50 CST 2018
     */
    int countByExample(ChannelSummaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_channel_summary
     *
     * @mbggenerated Wed Oct 10 10:35:50 CST 2018
     */
    int deleteByExample(ChannelSummaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_channel_summary
     *
     * @mbggenerated Wed Oct 10 10:35:50 CST 2018
     */
    int deleteByPrimaryKey(Integer cId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_channel_summary
     *
     * @mbggenerated Wed Oct 10 10:35:50 CST 2018
     */
    int insert(ChannelSummary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_channel_summary
     *
     * @mbggenerated Wed Oct 10 10:35:50 CST 2018
     */
    int insertSelective(ChannelSummary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_channel_summary
     *
     * @mbggenerated Wed Oct 10 10:35:50 CST 2018
     */
    List<ChannelSummary> selectByExample(ChannelSummaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_channel_summary
     *
     * @mbggenerated Wed Oct 10 10:35:50 CST 2018
     */
    ChannelSummary selectByPrimaryKey(Integer cId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_channel_summary
     *
     * @mbggenerated Wed Oct 10 10:35:50 CST 2018
     */
    int updateByExampleSelective(@Param("record") ChannelSummary record, @Param("example") ChannelSummaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_channel_summary
     *
     * @mbggenerated Wed Oct 10 10:35:50 CST 2018
     */
    int updateByExample(@Param("record") ChannelSummary record, @Param("example") ChannelSummaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_channel_summary
     *
     * @mbggenerated Wed Oct 10 10:35:50 CST 2018
     */
    int updateByPrimaryKeySelective(ChannelSummary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_channel_summary
     *
     * @mbggenerated Wed Oct 10 10:35:50 CST 2018
     */
    int updateByPrimaryKey(ChannelSummary record);
}