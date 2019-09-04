package com.ethan.blog.model;

import javax.persistence.*;

@Table(name = "myblog..my_blog_comment")
public class MyBlogComment {
    @Id
    @Column(name = "o_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String oId;

    /**
     * 评论创建时间戳
     */
    @Column(name = "comment_created")
    private Long commentCreated;

    /**
     * 评论者昵称
     */
    @Column(name = "comment_name")
    private String commentName;

    /**
     * 评论文章或页面id
     */
    @Column(name = "comment_on_id")
    private String commentOnId;

    /**
     * 评论访问路径,带锚点
     */
    @Column(name = "comment_sharp_url")
    private String commentSharpUrl;

    /**
     * 评论人头像地址
     */
    @Column(name = "comment_thumbnail_url")
    private String commentThumbnailUrl;

    /**
     * 评论人链接
     */
    @Column(name = "commentl_url")
    private String commentlUrl;

    /**
     * 子评论id
     */
    @Column(name = "commentl_son_id")
    private String commentlSonId;

    /**
     * 子评论人昵称
     */
    @Column(name = "commentl_son_name")
    private String commentlSonName;

    /**
     * 评论内容
     */
    @Column(name = "comment_content")
    private String commentContent;

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
     * 获取评论创建时间戳
     *
     * @return comment_created - 评论创建时间戳
     */
    public Long getCommentCreated() {
        return commentCreated;
    }

    /**
     * 设置评论创建时间戳
     *
     * @param commentCreated 评论创建时间戳
     */
    public void setCommentCreated(Long commentCreated) {
        this.commentCreated = commentCreated;
    }

    /**
     * 获取评论者昵称
     *
     * @return comment_name - 评论者昵称
     */
    public String getCommentName() {
        return commentName;
    }

    /**
     * 设置评论者昵称
     *
     * @param commentName 评论者昵称
     */
    public void setCommentName(String commentName) {
        this.commentName = commentName == null ? null : commentName.trim();
    }

    /**
     * 获取评论文章或页面id
     *
     * @return comment_on_id - 评论文章或页面id
     */
    public String getCommentOnId() {
        return commentOnId;
    }

    /**
     * 设置评论文章或页面id
     *
     * @param commentOnId 评论文章或页面id
     */
    public void setCommentOnId(String commentOnId) {
        this.commentOnId = commentOnId == null ? null : commentOnId.trim();
    }

    /**
     * 获取评论访问路径,带锚点
     *
     * @return comment_sharp_url - 评论访问路径,带锚点
     */
    public String getCommentSharpUrl() {
        return commentSharpUrl;
    }

    /**
     * 设置评论访问路径,带锚点
     *
     * @param commentSharpUrl 评论访问路径,带锚点
     */
    public void setCommentSharpUrl(String commentSharpUrl) {
        this.commentSharpUrl = commentSharpUrl == null ? null : commentSharpUrl.trim();
    }

    /**
     * 获取评论人头像地址
     *
     * @return comment_thumbnail_url - 评论人头像地址
     */
    public String getCommentThumbnailUrl() {
        return commentThumbnailUrl;
    }

    /**
     * 设置评论人头像地址
     *
     * @param commentThumbnailUrl 评论人头像地址
     */
    public void setCommentThumbnailUrl(String commentThumbnailUrl) {
        this.commentThumbnailUrl = commentThumbnailUrl == null ? null : commentThumbnailUrl.trim();
    }

    /**
     * 获取评论人链接
     *
     * @return commentl_url - 评论人链接
     */
    public String getCommentlUrl() {
        return commentlUrl;
    }

    /**
     * 设置评论人链接
     *
     * @param commentlUrl 评论人链接
     */
    public void setCommentlUrl(String commentlUrl) {
        this.commentlUrl = commentlUrl == null ? null : commentlUrl.trim();
    }

    /**
     * 获取子评论id
     *
     * @return commentl_son_id - 子评论id
     */
    public String getCommentlSonId() {
        return commentlSonId;
    }

    /**
     * 设置子评论id
     *
     * @param commentlSonId 子评论id
     */
    public void setCommentlSonId(String commentlSonId) {
        this.commentlSonId = commentlSonId == null ? null : commentlSonId.trim();
    }

    /**
     * 获取子评论人昵称
     *
     * @return commentl_son_name - 子评论人昵称
     */
    public String getCommentlSonName() {
        return commentlSonName;
    }

    /**
     * 设置子评论人昵称
     *
     * @param commentlSonName 子评论人昵称
     */
    public void setCommentlSonName(String commentlSonName) {
        this.commentlSonName = commentlSonName == null ? null : commentlSonName.trim();
    }

    /**
     * 获取评论内容
     *
     * @return comment_content - 评论内容
     */
    public String getCommentContent() {
        return commentContent;
    }

    /**
     * 设置评论内容
     *
     * @param commentContent 评论内容
     */
    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }
}