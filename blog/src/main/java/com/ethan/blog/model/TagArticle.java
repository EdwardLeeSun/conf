package com.ethan.blog.model;

import javax.persistence.*;

@Table(name = "myblog..tag_article")
public class TagArticle {
    /**
     * 主键
     */
    @Id
    @Column(name = "o_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String oId;

    /**
     * 标签表主键
     */
    @Column(name = "tag_id")
    private String tagId;

    /**
     * 文章表主键
     */
    @Column(name = "article_id")
    private String articleId;

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

    /**
     * 获取文章表主键
     *
     * @return article_id - 文章表主键
     */
    public String getArticleId() {
        return articleId;
    }

    /**
     * 设置文章表主键
     *
     * @param articleId 文章表主键
     */
    public void setArticleId(String articleId) {
        this.articleId = articleId == null ? null : articleId.trim();
    }
}