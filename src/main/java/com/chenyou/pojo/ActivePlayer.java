package com.chenyou.pojo;

import java.util.Date;

public class ActivePlayer {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_active_player.active_id
     *
     * @mbggenerated Thu Sep 13 18:01:17 CST 2018
     */
    private Integer activeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_active_player.show_time
     *
     * @mbggenerated Thu Sep 13 18:01:17 CST 2018
     */
    private Date showTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_active_player.active_player_count
     *
     * @mbggenerated Thu Sep 13 18:01:17 CST 2018
     */
    private Integer activePlayerCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_active_player.server_id
     *
     * @mbggenerated Thu Sep 13 18:01:17 CST 2018
     */
    private Integer serverId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_active_player.channel_id
     *
     * @mbggenerated Thu Sep 13 18:01:17 CST 2018
     */
    private Integer channelId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_active_player.active_id
     *
     * @return the value of t_active_player.active_id
     *
     * @mbggenerated Thu Sep 13 18:01:17 CST 2018
     */
    public Integer getActiveId() {
        return activeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_active_player.active_id
     *
     * @param activeId the value for t_active_player.active_id
     *
     * @mbggenerated Thu Sep 13 18:01:17 CST 2018
     */
    public void setActiveId(Integer activeId) {
        this.activeId = activeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_active_player.show_time
     *
     * @return the value of t_active_player.show_time
     *
     * @mbggenerated Thu Sep 13 18:01:17 CST 2018
     */
    public Date getShowTime() {
        return showTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_active_player.show_time
     *
     * @param showTime the value for t_active_player.show_time
     *
     * @mbggenerated Thu Sep 13 18:01:17 CST 2018
     */
    public void setShowTime(Date showTime) {
        this.showTime = showTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_active_player.active_player_count
     *
     * @return the value of t_active_player.active_player_count
     *
     * @mbggenerated Thu Sep 13 18:01:17 CST 2018
     */
    public Integer getActivePlayerCount() {
        return activePlayerCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_active_player.active_player_count
     *
     * @param activePlayerCount the value for t_active_player.active_player_count
     *
     * @mbggenerated Thu Sep 13 18:01:17 CST 2018
     */
    public void setActivePlayerCount(Integer activePlayerCount) {
        this.activePlayerCount = activePlayerCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_active_player.server_id
     *
     * @return the value of t_active_player.server_id
     *
     * @mbggenerated Thu Sep 13 18:01:17 CST 2018
     */
    public Integer getServerId() {
        return serverId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_active_player.server_id
     *
     * @param serverId the value for t_active_player.server_id
     *
     * @mbggenerated Thu Sep 13 18:01:17 CST 2018
     */
    public void setServerId(Integer serverId) {
        this.serverId = serverId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_active_player.channel_id
     *
     * @return the value of t_active_player.channel_id
     *
     * @mbggenerated Thu Sep 13 18:01:17 CST 2018
     */
    public Integer getChannelId() {
        return channelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_active_player.channel_id
     *
     * @param channelId the value for t_active_player.channel_id
     *
     * @mbggenerated Thu Sep 13 18:01:17 CST 2018
     */
    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    @Override
    public String toString() {
        return "ActivePlayer{" +
                "activeId=" + activeId +
                ", showTime=" + showTime +
                ", activePlayerCount=" + activePlayerCount +
                ", serverId=" + serverId +
                ", channelId=" + channelId +
                '}';
    }
}