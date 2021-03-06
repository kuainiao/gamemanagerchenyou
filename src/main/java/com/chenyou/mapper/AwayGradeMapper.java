package com.chenyou.mapper;

import com.chenyou.DataSource;
import com.chenyou.pojo.AwayGrade;
import com.chenyou.pojo.AwayGradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
@DataSource("dataSource1")
public interface AwayGradeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_away_grade
     *
     * @mbggenerated Wed Oct 10 10:01:34 CST 2018
     */
    int countByExample(AwayGradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_away_grade
     *
     * @mbggenerated Wed Oct 10 10:01:34 CST 2018
     */
    int deleteByExample(AwayGradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_away_grade
     *
     * @mbggenerated Wed Oct 10 10:01:34 CST 2018
     */
    int deleteByPrimaryKey(Integer gradeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_away_grade
     *
     * @mbggenerated Wed Oct 10 10:01:34 CST 2018
     */
    int insert(AwayGrade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_away_grade
     *
     * @mbggenerated Wed Oct 10 10:01:34 CST 2018
     */
    int insertSelective(AwayGrade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_away_grade
     *
     * @mbggenerated Wed Oct 10 10:01:34 CST 2018
     */
    List<AwayGrade> selectByExample(AwayGradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_away_grade
     *
     * @mbggenerated Wed Oct 10 10:01:34 CST 2018
     */
    AwayGrade selectByPrimaryKey(Integer gradeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_away_grade
     *
     * @mbggenerated Wed Oct 10 10:01:34 CST 2018
     */
    int updateByExampleSelective(@Param("record") AwayGrade record, @Param("example") AwayGradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_away_grade
     *
     * @mbggenerated Wed Oct 10 10:01:34 CST 2018
     */
    int updateByExample(@Param("record") AwayGrade record, @Param("example") AwayGradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_away_grade
     *
     * @mbggenerated Wed Oct 10 10:01:34 CST 2018
     */
    int updateByPrimaryKeySelective(AwayGrade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_away_grade
     *
     * @mbggenerated Wed Oct 10 10:01:34 CST 2018
     */
    int updateByPrimaryKey(AwayGrade record);
}