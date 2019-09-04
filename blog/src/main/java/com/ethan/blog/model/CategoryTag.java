package com.ethan.blog.model;

import javax.persistence.*;

@Table(name = "myblog..category_tag")
public class CategoryTag {
    /**
     * 主键
     */
    @Id
    @Column(name = "o_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String oId;

    /**
     * 分类表主键
     */
    @Column(name = "category_id")
    private String categoryId;

    /**
     * 标签表主键
     */
    @Column(name = "tag_id")
    private String tagId;

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
     * 获取分类表主键
     *
     * @return category_id - 分类表主键
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * 设置分类表主键
     *
     * @param categoryId 分类表主键
     */
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId == null ? null : categoryId.trim();
    }

    /**
     * 获取标签表主键
     *
     * @return tag_id - 标签表主键
     */
    public String getTagId() {
        return tagId;
    }

    /**
     * 设置标签表主键
     *
     * @param tagId 标签表主键
     */
    public void setTagId(String tagId) {
        this.tagId = tagId == null ? null : tagId.trim();
    }
}