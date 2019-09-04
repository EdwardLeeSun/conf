package com.ethan.blog.model;

import javax.persistence.*;

@Table(name = "myblog..archivedate_article")
public class ArchivedateArticle {
    /**
     * 主键
     */
    @Id
    @Column(name = "o_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String oId;

    /**
     * 存档表主键
     */
    @Column(name = "archivedate_article")
    private String archivedateArticle;

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
     * 获取存档表主键
     *
     * @return archivedate_article - 存档表主键
     */
    public String getArchivedateArticle() {
        return archivedateArticle;
    }

    /**
     * 设置存档表主键
     *
     * @param archivedateArticle 存档表主键
     */
    public void setArchivedateArticle(String archivedateArticle) {
        this.archivedateArticle = archivedateArticle == null ? null : archivedateArticle.trim();
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