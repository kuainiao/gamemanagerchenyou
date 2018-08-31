package com.chenyou.controller;

import com.chenyou.pojo.Menu;
import com.chenyou.pojo.Role;
import com.chenyou.pojo.User;
import com.chenyou.pojo.entity.Result;
import com.chenyou.service.MenuService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @RequestMapping(value = "/listMenu",method = RequestMethod.GET)
    public List<Menu> listMenu(){
        return menuService.listMenu();
    }

    /**
     * 加载角色的菜单列表树
     * @param role
     * @return
     */
    @RequestMapping(value = "/roleMenuTreeData",method = RequestMethod.GET)
    public List <Map <String, Object>> roleMenuTreeData(Role role) {
        List <Map <String, Object>> tree = menuService.roleMenuTreeData(role);
        return tree;
    }

    /**
     * 获取到加载时的菜单树
     *
     * @return
     */
    @RequestMapping(value = "/menuTreeData",method = RequestMethod.GET)
    public List <Map <String, Object>> menuTreeData() {
        List <Map <String, Object>> tree = menuService.menuTreeData();
        return tree;
    }

    /**
     * 校验菜单名是否唯一
     *
     * @param menu
     * @return
     */
    @RequestMapping(value = "checkMenuNameUnique",method = RequestMethod.POST)
    public String checkMenuNameUnique(Menu menu) {
        String uniqueFlag = "0";
        if (null != menu) {
            uniqueFlag = menuService.checkMenuNameUnique(menu);
        }
        return uniqueFlag;
    }

    /**
     * 根据菜单id进行删除
     * @param menuId
     * @return
     */
    @RequestMapping(value = "/deleteMenu",method = RequestMethod.GET)
    public Result delete(Integer menuId) {
        if (menuService.countChildMenuByParentId(menuId) > 0) {
            return new Result(false, "存在子菜单不允许删除");
        }
        if (menuService.countRoleByRoleMenuId(menuId) > 0) {
            return new Result(false, "菜案已分配，不允许删除");
        }
        menuService.removeMenu(menuId);
        return new Result(true, "删除成功!");
    }

    /**
     * 根据menuId查找菜单
     * @param parentId
     * @return
     */
    @RequestMapping(value = "/addMenuparentId",method = RequestMethod.GET)
        public Menu findMenuByMenuId(Integer parentId) {
        Menu menu=null;
        if (0 != parentId) {
            return menuService.getMenuByMenuId(parentId);
        } else {
             menu = new Menu();
            menu.setMenuId(0);
            menu.setMenuName("主目录");
            return menu;
        }
    }

    /**
     * 增加菜单
     * @param menu
     * @return
     */
    @RequestMapping(value = "/saveMenu",method = RequestMethod.POST)
    public int inserMenu(Menu menu) {
        Subject subject = SecurityUtils.getSubject();
        User u = (User) subject.getPrincipal();
        menu.setCreateBy(u.getUserName());
        return menuService.saveMenu(menu);
    }


    @RequestMapping(value = "/getMenuByMenuId",method = RequestMethod.GET)
        public Menu getMenuByMenuId(Integer menuId) {
        return menuService.getMenuByMenuId(menuId);
    }

    /**
     * 修改菜单
     * @param menu
     * @return
     */
    @RequestMapping(value = "/updateMenu",method = RequestMethod.POST)
    public Result updateMenu(Menu menu) {
        try {
            Subject subject = SecurityUtils.getSubject();
            User u = (User) subject.getPrincipal();
            menu.setCreateBy(u.getUserName());
            menuService.updateMenu(menu);
            return new Result(true, "修改成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "修改失败!");
        }
    }


}
