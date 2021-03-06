package com.chenyou.service.backmanagerservice;

import com.chenyou.base.BizException;
import com.chenyou.pojo.Menu;
import com.chenyou.pojo.Role;
import com.mysql.jdbc.MysqlErrorNumbers;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface MenuService {


    /**
     * 查询菜单用户名是否重复
     *
     * @param menu
     * @return
     */
     String checkMenuNameUnique(Menu menu) throws BizException;

    /**
     * 根据menuId查询该菜单下的子菜单的数量
     *
     * @param parentId
     * @return
     */
     int countChildMenuByParentId(Integer parentId) throws BizException;

    int countRoleByRoleMenuId(Integer menuId) throws BizException;




     int removeMenu(Integer menuId) throws BizException;

    /**
     * 获取到上级菜单名称
     * 如果id为0则为主目录
     */
     Menu getMenuByMenuId(Integer parentId) throws BizException;


    /**
     * 查询出所有的菜单
     *
     * @return
     */
     List <Menu> listMenu() throws BizException;

    /**
     * 增加menu
     *
     * @param menu
     * @return
     */
     int saveMenu(Menu menu) throws BizException;

    /**
     * 修改menu
     *
     * @param menu
     * @return
     */
     int updateMenu(Menu menu) throws BizException;


    /**
     * 加载角色的菜单列表树
     *
     * @param role 角色对象
     * @return 菜单列表
     */
     List <Map <String, Object>> roleMenuTreeData(Role role) throws BizException;

    /**
     * 查询所有的菜单
     *
     * @return
     */
     List <Map <String, Object>> menuTreeData() throws BizException;


    /**
     * 根据menuId查询对应的Menu
     */
     Menu findMenu(Integer menuId) throws BizException;

    /**
     * 根据userId查询对应的权限菜单集合
     *
     * @param userId
     * @return
     */
     Set <String> selectListMenuByUserId(Integer userId) throws BizException;


    /**
     * 根据用户id查找对应的权限
     * @param userId
     * @return
     */
     List<Menu> listMenusByUserId(Integer userId) throws BizException;


}
