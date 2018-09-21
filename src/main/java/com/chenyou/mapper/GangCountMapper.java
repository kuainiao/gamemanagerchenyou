package com.chenyou.mapper;

import com.chenyou.pojo.GangCount;
import com.chenyou.pojo.GangCountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GangCountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_gang_count
     *
     * @mbggenerated Fri Sep 21 15:15:00 CST 2018
     */
    int countByExample(GangCountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_gang_count
     *
     * @mbggenerated Fri Sep 21 15:15:00 CST 2018
     */
    int deleteByExample(GangCountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_gang_count
     *
     * @mbggenerated Fri Sep 21 15:15:00 CST 2018
     */
    int insert(GangCount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_gang_count
     *
     * @mbggenerated Fri Sep 21 15:15:00 CST 2018
     */
    int insertSelective(GangCount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_gang_count
     *
     * @mbggenerated Fri Sep 21 15:15:00 CST 2018
     */
    List<GangCount> selectByExample(GangCountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_gang_count
     *
     * @mbggenerated Fri Sep 21 15:15:00 CST 2018
     */
    int updateByExampleSelective(@Param("record") GangCount record, @Param("example") GangCountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_gang_count
     *
     * @mbggenerated Fri Sep 21 15:15:00 CST 2018
     */
    int updateByExample(@Param("record") GangCount record, @Param("example") GangCountExample example);
}