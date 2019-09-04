package com.ethan.blog.model;

import javax.persistence.*;

@Table(name = "myblog..my_blog_category")
public class MyBlogCategory {
    @Id
    @Column(name = "o_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String oId;

    /**
     * 分类标题
     */
    @Column(name = "category_title")
    private String categoryTitle;

    /**
     * 分类访问路径
     */
    @Column(name = "category_url")
    private String categoryUrl;

    /**
     * 分类展现的排序
     */
    @Column(name = "category_order")
    private Integer categoryOrder;

    /**
     * 分类型聚合的标签个数
     */
    @Column(name = "category_tag_cnt")
    private Integer categoryTagCnt;

    /**
     * 分类描述
     */
    @Column(name = "category_description")
    private String categoryDescription;

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
     * 获取分类标题
     *
     * @return category_title - 分类标题
     */
    public String getCategoryTitle() {
        return categoryTitle;
    }

    /**
     * 设置分类标题
     *
     * @param categoryTitle 分类标题
     */
    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle == null ? null : categoryTitle.trim();
    }

    /**
     * 获取分类访问路径
     *
     * @return category_url - 分类访问路径
     */
    public String getCategoryUrl() {
        return categoryUrl;
    }

    /**
     * 设置分类访问路径
     *
     * @param categoryUrl 分类访问路径
     */
    public void setCategoryUrl(String categoryUrl) {
        this.categoryUrl = categoryUrl == null ? null : categoryUrl.trim();
    }

    /**
     * 获取分类展现的排序
     *
     * @return category_order - 分类展现的排序
     */
    public Integer getCategoryOrder() {
        return categoryOrder;
    }

    /**
     * 设置分类展现的排序
     *
     * @param categoryOrder 分类展现的排序
     */
    public void setCategoryOrder(Integer categoryOrder) {
        this.categoryOrder = categoryOrder;
    }

    /**
     * 获取分类型聚合的标签个数
     *
     * @return category_tag_cnt - 分类型聚合的标签个数
     */
    public Integer getCategoryTagCnt() {
        return categoryTagCnt;
    }

    /**
     * 设置分类型聚合的标签个数
     *
     * @param categoryTagCnt 分类型聚合的标签个数
     */
    public void setCategoryTagCnt(Integer categoryTagCnt) {
        this.categoryTagCnt = categoryTagCnt;
    }

    /**
     * 获取分类描述
     *
     * @return category_description - 分类描述
     */
    public String getCategoryDescription() {
        return categoryDescription;
    }

    /**
     * 设置分类描述
     *
     * @param categoryDescription 分类描述
     */
    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription == null ? null : categoryDescription.trim();
    }
}