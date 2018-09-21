package com.chenyou.mapper;

import com.chenyou.pojo.AwayPlayer;
import com.chenyou.pojo.AwayPlayerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AwayPlayerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_away_player
     *
     * @mbggenerated Fri Sep 21 13:46:01 CST 2018
     */
    int countByExample(AwayPlayerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_away_player
     *
     * @mbggenerated Fri Sep 21 13:46:01 CST 2018
     */
    int deleteByExample(AwayPlayerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_away_player
     *
     * @mbggenerated Fri Sep 21 13:46:01 CST 2018
     */
    int deleteByPrimaryKey(Integer awayId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_away_player
     *
     * @mbggenerated Fri Sep 21 13:46:01 CST 2018
     */
    int insert(AwayPlayer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_away_player
     *
     * @mbggenerated Fri Sep 21 13:46:01 CST 2018
     */
    int insertSelective(AwayPlayer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_away_player
     *
     * @mbggenerated Fri Sep 21 13:46:01 CST 2018
     */
    List<AwayPlayer> selectByExample(AwayPlayerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_away_player
     *
     * @mbggenerated Fri Sep 21 13:46:01 CST 2018
     */
    AwayPlayer selectByPrimaryKey(Integer awayId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_away_player
     *
     * @mbggenerated Fri Sep 21 13:46:01 CST 2018
     */
    int updateByExampleSelective(@Param("record") AwayPlayer record, @Param("example") AwayPlayerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_away_player
     *
     * @mbggenerated Fri Sep 21 13:46:01 CST 2018
     */
    int updateByExample(@Param("record") AwayPlayer record, @Param("example") AwayPlayerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_away_player
     *
     * @mbggenerated Fri Sep 21 13:46:01 CST 2018
     */
    int updateByPrimaryKeySelective(AwayPlayer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_away_player
     *
     * @mbggenerated Fri Sep 21 13:46:01 CST 2018
     */
    int updateByPrimaryKey(AwayPlayer record);
}