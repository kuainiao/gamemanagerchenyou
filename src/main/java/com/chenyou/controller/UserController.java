package com.chenyou.controller;

import com.chenyou.Constants.ApplicationConstants;
import com.chenyou.base.BizException;
import com.chenyou.pojo.Role;
import com.chenyou.pojo.User;
import com.chenyou.pojo.entity.PageResult;
import com.chenyou.service.backmanagerservice.RoleService;
import com.chenyou.service.backmanagerservice.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleServic;




    @RequestMapping(value = "/countListUser", method = RequestMethod.GET)
    public Map <String, Object> countListUser() throws BizException {
        Map <String, Object> map = new HashMap <>();
        int count = userService.countListUser();
        map.put("count", count);
        return map;
    }


    /**
     * 查看所有用户
     *
     * @param page
     * @param rows
     * @return
     */
    @RequiresPermissions("system:user:view")
    @RequestMapping(value = "/findPage", method = RequestMethod.GET)
    public PageResult findPage(int page, int rows) throws BizException {
        return userService.findPage(page, rows);
    }

    /**
     * 根绝条件查询用户
     *
     * @param user
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public PageResult search(User user, int page, int rows, HttpServletRequest request) throws BizException, UnsupportedEncodingException {
        return userService.findPage(user, page, rows);
    }

    /**
     * 添加用户时,校验登录名是否唯一
     *
     * @param loginName
     * @return
     */
    @RequestMapping(value = "/checkLoginNameUnique", method = RequestMethod.GET)
    public Map <String, Object> checkLoginNameUnique(String loginName) throws BizException {

//        if(StringUtils.isNotEmpty(loginName)){
//          if("0".equals(userService.checkLoginNameUnique(loginName))){
//              return new Result(true,"用户名唯一!");
//          }else{
//              return new Result(false,"用户名已经存在!");
//          }
//        }else{
//            return  new Result(false,"用户名不能为空!");
//        }
        Map <String, Object> resultMap = new HashMap <>();
        resultMap.put(ApplicationConstants.TAG_DATA, userService.checkLoginNameUnique(loginName));
        resultMap.put(ApplicationConstants.TAG_SC, ApplicationConstants.SC_OK);
        return resultMap;
    }

    /**
     * 添加用户时,校验手机号是否唯一
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "/checkPhoneUnique", method = RequestMethod.POST)
    public Map <String, Object> checkPhonUnique(User user) throws BizException {
        Map <String, Object> resultMap = new HashMap <>();
        resultMap.put(ApplicationConstants.TAG_DATA, userService.checkPhoneUnique(user));
        resultMap.put(ApplicationConstants.TAG_SC, ApplicationConstants.SC_OK);
        return resultMap;
    }

    /**
     * 添加用户时，展现所有角色供用户选择
     *
     * @return
     */
    @RequestMapping(value = "/findAllRole", method = RequestMethod.GET)
    public List <Role> findAllRole() throws BizException {
        List <Role> roles = roleServic.listRole();
        return roles;
    }

    /**
     * 用户新增
     *
     * @return
     */
    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public Map <String, Object> saveUser(User user) throws BizException {
        Subject subject = SecurityUtils.getSubject();
        User u = (User) subject.getPrincipal();
        user.setCreateBy(u.getUserName());
        user.setUpdateBy(u.getUserName());
        Map <String, Object> resultMap = new HashMap <>();
        resultMap.put(ApplicationConstants.TAG_DATA, userService.saveUser(user));
        resultMap.put(ApplicationConstants.TAG_SC, ApplicationConstants.SC_OK);
        return resultMap;
    }

    /**
     * 用户管理时查看用户和修改时展现的用户
     *
     * @param userId
     * @return
     */
    @RequestMapping(value = "/getUserByUserId", method = RequestMethod.GET)
    public User selectuserByUserId(Integer userId) throws BizException {
        User user = userService.getUserByUserId(userId);
        return user;
    }

    /**
     * 根据用户查询角色
     *
     * @param userId
     * @return
     */
    @RequestMapping(value = "/selectListRoleByUserId", method = RequestMethod.GET)
    public Map <String, Object> selectListRoleByUserId(Integer userId) throws BizException {
        Map <String, Object> resultMap = new HashMap <>();
        List <Role> roles = roleServic.listRoleByUserId(userId);
        resultMap.put(ApplicationConstants.TAG_DATA, roles);
        resultMap.put(ApplicationConstants.TAG_SC, ApplicationConstants.SC_OK);
        return resultMap;
    }

    /**
     * 修改用户
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    public Map <String, Object> updateUser(User user) throws BizException {
        Subject subject = SecurityUtils.getSubject();
        User uu = (User) subject.getPrincipal();
        user.setCreateBy(uu.getUserName());
        Map <String, Object> resultMap = new HashMap <>();
        resultMap.put(ApplicationConstants.TAG_DATA, userService.updateUser(user));
        resultMap.put(ApplicationConstants.TAG_SC, ApplicationConstants.SC_OK);
        return resultMap;
    }

    /**
     * 修改密码
     *
     * @param
     * @param
     * @return
     */
    @RequestMapping(value = "/changepwd", method = RequestMethod.POST)
    public Map <String, Object> changepwd(String oldPassword, String newPassword, String againPassword) throws BizException {
        Subject subject = SecurityUtils.getSubject();
        User u = (User) subject.getPrincipal();
        Map <String, Object> resultMap = new HashMap <>();
        resultMap.put(ApplicationConstants.TAG_DATA, userService.changePassword(u.getLoginName(), oldPassword, newPassword, againPassword));
        resultMap.put(ApplicationConstants.TAG_SC, ApplicationConstants.SC_OK);
        return resultMap;
    }

    /**
     * 用户删除
     *
     * @param userIds
     * @return
     */
    @RequestMapping(value = "/removeUserByUserId", method = RequestMethod.GET)
    public Map <String, Object> delete(Integer[] userIds) throws BizException {
        Map <String, Object> resultMap = new HashMap <>();
        resultMap.put(ApplicationConstants.TAG_DATA, userService.removeUserByUserId(userIds));
        resultMap.put(ApplicationConstants.TAG_SC, ApplicationConstants.SC_OK);
        return resultMap;
    }




}
