package com.ethan.blog.model;

import javax.persistence.*;

@Table(name = "myblog..my_blog_page")
public class MyBlogPage {
    @Id
    @Column(name = "o_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String oId;

    /**
     * 页面导航栏排序
     */
    @Column(name = "page_order")
    private Integer pageOrder;

    /**
     * 页面访问路径
     */
    @Column(name = "page_link")
    private String pageLink;

    /**
     * 页面标题
     */
    @Column(name = "page_title")
    private String pageTitle;

    /**
     * 页面打开方式
     */
    @Column(name = "page_open_target")
    private String pageOpenTarget;

    /**
     * 页面小图标地址
     */
    @Column(name = "page_icon")
    private String pageIcon;

    /**
     * @return o_id
     */
    public String getoId() {
        return oId;
    }

    /**
     * @param oId
     */
    public void setoId(String oId) {
        this.oId = oId == null ? null : oId.trim();
    }

    /**
     * 获取页面导航栏排序
     *
     * @return page_order - 页面导航栏排序
     */
    public Integer getPageOrder() {
        return pageOrder;
    }

    /**
     * 设置页面导航栏排序
     *
     * @param pageOrder 页面导航栏排序
     */
    public void setPageOrder(Integer pageOrder) {
        this.pageOrder = pageOrder;
    }

    /**
     * 获取页面访问路径
     *
     * @return page_link - 页面访问路径
     */
    public String getPageLink() {
        return pageLink;
    }

    /**
     * 设置页面访问路径
     *
     * @param pageLink 页面访问路径
     */
    public void setPageLink(String pageLink) {
        this.pageLink = pageLink == null ? null : pageLink.trim();
    }

    /**
     * 获取页面标题
     *
     * @return page_title - 页面标题
     */
    public String getPageTitle() {
        return pageTitle;
    }

    /**
     * 设置页面标题
     *
     * @param pageTitle 页面标题
     */
    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle == null ? null : pageTitle.trim();
    }

    /**
     * 获取页面打开方式
     *
     * @return page_open_target - 页面打开方式
     */
    public String getPageOpenTarget() {
        return pageOpenTarget;
    }

    /**
     * 设置页面打开方式
     *
     * @param pageOpenTarget 页面打开方式
     */
    public void setPageOpenTarget(String pageOpenTarget) {
        this.pageOpenTarget = pageOpenTarget == null ? null : pageOpenTarget.trim();
    }

    /**
     * 获取页面小图标地址
     *
     * @return page_icon - 页面小图标地址
     */
    public String getPageIcon() {
        return pageIcon;
    }

    /**
     * 设置页面小图标地址
     *
     * @param pageIcon 页面小图标地址
     */
    public void setPageIcon(String pageIcon) {
        this.pageIcon = pageIcon == null ? null : pageIcon.trim();
    }
}