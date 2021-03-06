package com.chenyou.mapper;

import com.chenyou.DataSource;
import com.chenyou.pojo.TaskMessage;
import com.chenyou.pojo.TaskMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
@DataSource("dataSource1")
public interface TaskMessageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_message
     *
     * @mbggenerated Wed Oct 10 11:49:41 CST 2018
     */
    int countByExample(TaskMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_message
     *
     * @mbggenerated Wed Oct 10 11:49:41 CST 2018
     */
    int deleteByExample(TaskMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_message
     *
     * @mbggenerated Wed Oct 10 11:49:41 CST 2018
     */
    int deleteByPrimaryKey(Integer taskId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_message
     *
     * @mbggenerated Wed Oct 10 11:49:41 CST 2018
     */
    int insert(TaskMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_message
     *
     * @mbggenerated Wed Oct 10 11:49:41 CST 2018
     */
    int insertSelective(TaskMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_message
     *
     * @mbggenerated Wed Oct 10 11:49:41 CST 2018
     */
    List<TaskMessage> selectByExample(TaskMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_message
     *
     * @mbggenerated Wed Oct 10 11:49:41 CST 2018
     */
    TaskMessage selectByPrimaryKey(Integer taskId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_message
     *
     * @mbggenerated Wed Oct 10 11:49:41 CST 2018
     */
    int updateByExampleSelective(@Param("record") TaskMessage record, @Param("example") TaskMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_message
     *
     * @mbggenerated Wed Oct 10 11:49:41 CST 2018
     */
    int updateByExample(@Param("record") TaskMessage record, @Param("example") TaskMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_message
     *
     * @mbggenerated Wed Oct 10 11:49:41 CST 2018
     */
    int updateByPrimaryKeySelective(TaskMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_task_message
     *
     * @mbggenerated Wed Oct 10 11:49:41 CST 2018
     */
    int updateByPrimaryKey(TaskMessage record);
}