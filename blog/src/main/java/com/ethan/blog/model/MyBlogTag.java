package com.ethan.blog.model;

import javax.persistence.*;

@Table(name = "myblog..my_blog_tag")
public class MyBlogTag {
    @Id
    @Column(name = "o_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String oId;

    /**
     * 标签标题
     */
    @Column(name = "tag_title")
    private String tagTitle;

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
     * 获取标签标题
     *
     * @return tag_title - 标签标题
     */
    public String getTagTitle() {
        return tagTitle;
    }

    /**
     * 设置标签标题
     *
     * @param tagTitle 标签标题
     */
    public void setTagTitle(String tagTitle) {
        this.tagTitle = tagTitle == null ? null : tagTitle.trim();
    }
}