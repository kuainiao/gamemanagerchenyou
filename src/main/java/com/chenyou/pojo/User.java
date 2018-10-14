package com.chenyou.pojo;

import java.util.Date;
import java.util.List;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.user_id
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.login_name
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    private String loginName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.user_name
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.email
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.phonenumber
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    private String phonenumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.sex
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    private String sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.password
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.salt
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    private String salt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.status
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.del_flag
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    private String delFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.login_ip
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    private String loginIp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.login_date
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    private Date loginDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.create_by
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    private String createBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.create_time
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.update_by
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    private String updateBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.update_time
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.remark
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.channel_id
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    private String channelId;

    private String channelName;

    private List<Integer> roleIds;

    private List<Role> roles;


    public List <Integer> getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(List <Integer> roleIds) {
        this.roleIds = roleIds;
    }

    public List <Role> getRoles() {
        return roles;
    }

    public void setRoles(List <Role> roles) {
        this.roles = roles;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.user_id
     *
     * @return the value of sys_user.user_id
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.user_id
     *
     * @param userId the value for sys_user.user_id
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.login_name
     *
     * @return the value of sys_user.login_name
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.login_name
     *
     * @param loginName the value for sys_user.login_name
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.user_name
     *
     * @return the value of sys_user.user_name
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.user_name
     *
     * @param userName the value for sys_user.user_name
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.email
     *
     * @return the value of sys_user.email
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.email
     *
     * @param email the value for sys_user.email
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.phonenumber
     *
     * @return the value of sys_user.phonenumber
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    public String getPhonenumber() {
        return phonenumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.phonenumber
     *
     * @param phonenumber the value for sys_user.phonenumber
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.sex
     *
     * @return the value of sys_user.sex
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.sex
     *
     * @param sex the value for sys_user.sex
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.password
     *
     * @return the value of sys_user.password
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.password
     *
     * @param password the value for sys_user.password
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.salt
     *
     * @return the value of sys_user.salt
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    public String getSalt() {
        return salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.salt
     *
     * @param salt the value for sys_user.salt
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.status
     *
     * @return the value of sys_user.status
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.status
     *
     * @param status the value for sys_user.status
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.del_flag
     *
     * @return the value of sys_user.del_flag
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.del_flag
     *
     * @param delFlag the value for sys_user.del_flag
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.login_ip
     *
     * @return the value of sys_user.login_ip
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.login_ip
     *
     * @param loginIp the value for sys_user.login_ip
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.login_date
     *
     * @return the value of sys_user.login_date
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    public Date getLoginDate() {
        return loginDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.login_date
     *
     * @param loginDate the value for sys_user.login_date
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.create_by
     *
     * @return the value of sys_user.create_by
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.create_by
     *
     * @param createBy the value for sys_user.create_by
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.create_time
     *
     * @return the value of sys_user.create_time
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.create_time
     *
     * @param createTime the value for sys_user.create_time
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.update_by
     *
     * @return the value of sys_user.update_by
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.update_by
     *
     * @param updateBy the value for sys_user.update_by
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.update_time
     *
     * @return the value of sys_user.update_time
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.update_time
     *
     * @param updateTime the value for sys_user.update_time
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.remark
     *
     * @return the value of sys_user.remark
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.remark
     *
     * @param remark the value for sys_user.remark
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.channel_id
     *
     * @return the value of sys_user.channel_id
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.channel_id
     *
     * @param channelId the value for sys_user.channel_id
     *
     * @mbggenerated Thu Oct 11 16:41:53 CST 2018
     */
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", loginName='" + loginName + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", sex='" + sex + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", status='" + status + '\'' +
                ", delFlag='" + delFlag + '\'' +
                ", loginIp='" + loginIp + '\'' +
                ", loginDate=" + loginDate +
                ", createBy='" + createBy + '\'' +
                ", createTime=" + createTime +
                ", updateBy='" + updateBy + '\'' +
                ", updateTime=" + updateTime +
                ", remark='" + remark + '\'' +
                ", channelId='" + channelId + '\'' +
                ", channelName='" + channelName + '\'' +
                ", roleIds=" + roleIds +
                ", roles=" + roles +
                '}';
    }
}