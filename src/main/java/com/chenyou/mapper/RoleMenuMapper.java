package com.chenyou.mapper;

import com.chenyou.DataSource;
import com.chenyou.pojo.RoleMenuExample;
import com.chenyou.pojo.RoleMenuKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
@DataSource("dataSource1")
public interface RoleMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated Fri Aug 03 15:17:28 CST 2018
     */
    int countByExample(RoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated Fri Aug 03 15:17:28 CST 2018
     */
    int deleteByExample(RoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated Fri Aug 03 15:17:28 CST 2018
     */
    int deleteByPrimaryKey(RoleMenuKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated Fri Aug 03 15:17:28 CST 2018
     */
    int insert(RoleMenuKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated Fri Aug 03 15:17:28 CST 2018
     */
    int insertSelective(RoleMenuKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated Fri Aug 03 15:17:28 CST 2018
     */
    List<RoleMenuKey> selectByExample(RoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated Fri Aug 03 15:17:28 CST 2018
     */
    int updateByExampleSelective(@Param("record") RoleMenuKey record, @Param("example") RoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated Fri Aug 03 15:17:28 CST 2018
     */
    int updateByExample(@Param("record") RoleMenuKey record, @Param("example") RoleMenuExample example);

     int batchRoleMenu(List<RoleMenuKey> roleMenuList);

     int countUserRoleByRoleId(Integer roleId);

    /**
     * 查询使用菜单的角色个数
     * @param menuId
     * @return
     */
     int countRoleByRoleMenuId(Integer menuId);

    /**
     * 根据角色id删除，角色菜单的中间表
     * @param roleId
     * @return
     */
     int deleteRoleMenuByRoleId(Integer roleId);


}