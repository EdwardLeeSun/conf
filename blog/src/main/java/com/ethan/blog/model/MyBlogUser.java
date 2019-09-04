package com.ethan.blog.model;

import javax.persistence.*;

@Table(name = "myblog..my_blog_user")
public class MyBlogUser {
    /**
     * 主键
     */
    @Id
    @Column(name = "o_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String oId;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 用户链接地址
     */
    @Column(name = "user_url")
    private String userUrl;

    /**
     * 用户角色
     */
    @Column(name = "user_role")
    private String userRole;

    /**
     * 用户头像图片地址
     */
    @Column(name = "user_avatar")
    private String userAvatar;

    /**
     * 获取主键
     *
     * @return o_id - 主键
     */
    public String getoId() {
        return oId;
    }

    /**
     * 设置主键
     *
     * @param oId 主键
     */
    public void setoId(String oId) {
        this.oId = oId == null ? null : oId.trim();
    }

    /**
     * 获取用户名
     *
     * @return user_name - 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 获取用户链接地址
     *
     * @return user_url - 用户链接地址
     */
    public String getUserUrl() {
        return userUrl;
    }

    /**
     * 设置用户链接地址
     *
     * @param userUrl 用户链接地址
     */
    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl == null ? null : userUrl.trim();
    }

    /**
     * 获取用户角色
     *
     * @return user_role - 用户角色
     */
    public String getUserRole() {
        return userRole;
    }

    /**
     * 设置用户角色
     *
     * @param userRole 用户角色
     */
    public void setUserRole(String userRole) {
        this.userRole = userRole == null ? null : userRole.trim();
    }

    /**
     * 获取用户头像图片地址
     *
     * @return user_avatar - 用户头像图片地址
     */
    public String getUserAvatar() {
        return userAvatar;
    }

    /**
     * 设置用户头像图片地址
     *
     * @param userAvatar 用户头像图片地址
     */
    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar == null ? null : userAvatar.trim();
    }
}