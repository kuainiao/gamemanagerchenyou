package com.chenyou.controller;

import com.chenyou.base.BizException;
import com.chenyou.pojo.Role;
import com.chenyou.pojo.User;
import com.chenyou.pojo.entity.PageResult;
import com.chenyou.pojo.entity.Result;
import com.chenyou.service.RoleService;
import com.chenyou.service.UserService;
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
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    /**
     * 给增加用户时给用户选择
     * @return
     */
    @RequestMapping("listRole")
    public Map<String,Object> listRole() {
        Map<String,Object> map =new HashMap<>();
        List<Role> roles = roleService.listRole();
        if(null !=roles && roles.size()>0){
            map.put("success",true);
            map.put("data",roles);
        }else  {
            map.put("success","false");
            map.put("message","角色为空!");
        }
        return map;
    }

    /**
     * 查看所有角色
     *
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping(value = "/findPage", method = RequestMethod.GET)
    public PageResult findPage(int page, int rows) {
        return roleService.findPage(page, rows);
    }

    /**
     * 根据条件查询，展示对应的角色
     *
     * @param role
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public PageResult search(Role role, int page, int rows) {
        return roleService.findPage(role, page, rows);
    }

    /**
     * 角色增加
     *
     * @param role
     * @return
     */
    @RequestMapping(value = "/saveRole", method = RequestMethod.POST)
    public Result saveRole(Role role) {
        try {
            Subject subject = SecurityUtils.getSubject();
            User u = (User) subject.getPrincipal();
            role.setCreateBy(u.getUserName());
            roleService.saveRole(role);
            return new Result(true, "角色增加成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "角色增加失败!");
        }
    }

    /**
     * 校验角色名是否唯一
     *
     * @param role
     * @return
     */
    @RequestMapping(value = "/checkRoleNameUnique", method = RequestMethod.POST)
    public String checkRoleNameUnique(Role role) {
        String uniqueFlag = "0";
        if (null != role) {
            uniqueFlag = roleService.checkRoleNameUnique(role);
        }
        return uniqueFlag;
    }

    /**
     * 根据roleId查找对应的角色
     *
     * @param roleId
     * @return
     */
    @RequestMapping(value = "/findOne", method = RequestMethod.GET)
    public Role findOne(Integer roleId) {
        return roleService.getRoleByRoleId(roleId);
    }

    /**
     * 修改角色
     *
     * @param role
     * @return
     */
    @RequestMapping(value = "/updateRole", method = RequestMethod.POST)
    public Result update(Role role) {
        try {
            Subject subject = SecurityUtils.getSubject();
            User u = (User) subject.getPrincipal();
            role.setCreateBy(u.getUserName());
            roleService.updateRole(role);
            return new Result(true, "角色修改成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "角色修改失败!!");
        }
    }

    /**
     * 删除角色
     *
     * @param roleIds
     * @return
     * @throws BizException
     */
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public Result delete(Integer[] roleIds) throws BizException {
        try {
            roleService.removeRoleByRoleIds(roleIds);
            return new Result(true, "删除成功!");
        } catch (BizException e) {
            e.printStackTrace();
            return new Result(false, "删除失败!");
        }
    }





}
