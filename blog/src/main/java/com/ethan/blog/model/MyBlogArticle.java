package com.ethan.blog.model;

import javax.persistence.*;

@Table(name = "myblog..my_blog_article")
public class MyBlogArticle {
    @Id
    @Column(name = "o_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String oId;

    /**
     * 文章标题
     */
    @Column(name = "article_title")
    private String articleTitle;

    /**
     * 文章作者id
     */
    @Column(name = "article_authorld")
    private String articleAuthorld;

    /**
     * 文章评论条数
     */
    @Column(name = "article_comment_count")
    private Integer articleCommentCount;

    /**
     * 文章浏览人数
     */
    @Column(name = "article_view_count")
    private Integer articleViewCount;

    /**
     * 文章访问路径
     */
    @Column(name = "article_link")
    private String articleLink;

    /**
     * 文章是否置顶
     */
    @Column(name = "article_put_top")
    private String articlePutTop;

    /**
     * 文章创建时间戳
     */
    @Column(name = "article_created")
    private Long articleCreated;

    /**
     * 文章更新时间戳
     */
    @Column(name = "article_updated")
    private Long articleUpdated;

    /**
     * 文章随机数
     */
    @Column(name = "article_random_double")
    private Double articleRandomDouble;

    /**
     * 文章签名档id
     */
    @Column(name = "article_sign_id")
    private String articleSignId;

    /**
     * 文章是否可评论
     */
    @Column(name = "article_is_comment")
    private String articleIsComment;

    /**
     * 文章浏览密码
     */
    @Column(name = "article_view_pwd")
    private String articleViewPwd;

    /**
     * 文章首图地址
     */
    @Column(name = "article_img_url")
    private String articleImgUrl;

    /**
     * 文章状态
     */
    @Column(name = "article_status")
    private Integer articleStatus;

    /**
     * 文章摘要
     */
    @Column(name = "article_abstract")
    private String articleAbstract;

    /**
     * 文章摘要纯文本
     */
    @Column(name = "article_abstract_text")
    private String articleAbstractText;

    /**
     * 文章标签，英文逗号分隔符
     */
    @Column(name = "article_tags")
    private String articleTags;

    /**
     * 文章内容
     */
    @Column(name = "article_context")
    private String articleContext;

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
     * 获取文章标题
     *
     * @return article_title - 文章标题
     */
    public String getArticleTitle() {
        return articleTitle;
    }

    /**
     * 设置文章标题
     *
     * @param articleTitle 文章标题
     */
    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    /**
     * 获取文章作者id
     *
     * @return article_authorld - 文章作者id
     */
    public String getArticleAuthorld() {
        return articleAuthorld;
    }

    /**
     * 设置文章作者id
     *
     * @param articleAuthorld 文章作者id
     */
    public void setArticleAuthorld(String articleAuthorld) {
        this.articleAuthorld = articleAuthorld == null ? null : articleAuthorld.trim();
    }

    /**
     * 获取文章评论条数
     *
     * @return article_comment_count - 文章评论条数
     */
    public Integer getArticleCommentCount() {
        return articleCommentCount;
    }

    /**
     * 设置文章评论条数
     *
     * @param articleCommentCount 文章评论条数
     */
    public void setArticleCommentCount(Integer articleCommentCount) {
        this.articleCommentCount = articleCommentCount;
    }

    /**
     * 获取文章浏览人数
     *
     * @return article_view_count - 文章浏览人数
     */
    public Integer getArticleViewCount() {
        return articleViewCount;
    }

    /**
     * 设置文章浏览人数
     *
     * @param articleViewCount 文章浏览人数
     */
    public void setArticleViewCount(Integer articleViewCount) {
        this.articleViewCount = articleViewCount;
    }

    /**
     * 获取文章访问路径
     *
     * @return article_link - 文章访问路径
     */
    public String getArticleLink() {
        return articleLink;
    }

    /**
     * 设置文章访问路径
     *
     * @param articleLink 文章访问路径
     */
    public void setArticleLink(String articleLink) {
        this.articleLink = articleLink == null ? null : articleLink.trim();
    }

    /**
     * 获取文章是否置顶
     *
     * @return article_put_top - 文章是否置顶
     */
    public String getArticlePutTop() {
        return articlePutTop;
    }

    /**
     * 设置文章是否置顶
     *
     * @param articlePutTop 文章是否置顶
     */
    public void setArticlePutTop(String articlePutTop) {
        this.articlePutTop = articlePutTop == null ? null : articlePutTop.trim();
    }

    /**
     * 获取文章创建时间戳
     *
     * @return article_created - 文章创建时间戳
     */
    public Long getArticleCreated() {
        return articleCreated;
    }

    /**
     * 设置文章创建时间戳
     *
     * @param articleCreated 文章创建时间戳
     */
    public void setArticleCreated(Long articleCreated) {
        this.articleCreated = articleCreated;
    }

    /**
     * 获取文章更新时间戳
     *
     * @return article_updated - 文章更新时间戳
     */
    public Long getArticleUpdated() {
        return articleUpdated;
    }

    /**
     * 设置文章更新时间戳
     *
     * @param articleUpdated 文章更新时间戳
     */
    public void setArticleUpdated(Long articleUpdated) {
        this.articleUpdated = articleUpdated;
    }

    /**
     * 获取文章随机数
     *
     * @return article_random_double - 文章随机数
     */
    public Double getArticleRandomDouble() {
        return articleRandomDouble;
    }

    /**
     * 设置文章随机数
     *
     * @param articleRandomDouble 文章随机数
     */
    public void setArticleRandomDouble(Double articleRandomDouble) {
        this.articleRandomDouble = articleRandomDouble;
    }

    /**
     * 获取文章签名档id
     *
     * @return article_sign_id - 文章签名档id
     */
    public String getArticleSignId() {
        return articleSignId;
    }

    /**
     * 设置文章签名档id
     *
     * @param articleSignId 文章签名档id
     */
    public void setArticleSignId(String articleSignId) {
        this.articleSignId = articleSignId == null ? null : articleSignId.trim();
    }

    /**
     * 获取文章是否可评论
     *
     * @return article_is_comment - 文章是否可评论
     */
    public String getArticleIsComment() {
        return articleIsComment;
    }

    /**
     * 设置文章是否可评论
     *
     * @param articleIsComment 文章是否可评论
     */
    public void setArticleIsComment(String articleIsComment) {
        this.articleIsComment = articleIsComment == null ? null : articleIsComment.trim();
    }

    /**
     * 获取文章浏览密码
     *
     * @return article_view_pwd - 文章浏览密码
     */
    public String getArticleViewPwd() {
        return articleViewPwd;
    }

    /**
     * 设置文章浏览密码
     *
     * @param articleViewPwd 文章浏览密码
     */
    public void setArticleViewPwd(String articleViewPwd) {
        this.articleViewPwd = articleViewPwd == null ? null : articleViewPwd.trim();
    }

    /**
     * 获取文章首图地址
     *
     * @return article_img_url - 文章首图地址
     */
    public String getArticleImgUrl() {
        return articleImgUrl;
    }

    /**
     * 设置文章首图地址
     *
     * @param articleImgUrl 文章首图地址
     */
    public void setArticleImgUrl(String articleImgUrl) {
        this.articleImgUrl = articleImgUrl == null ? null : articleImgUrl.trim();
    }

    /**
     * 获取文章状态
     *
     * @return article_status - 文章状态
     */
    public Integer getArticleStatus() {
        return articleStatus;
    }

    /**
     * 设置文章状态
     *
     * @param articleStatus 文章状态
     */
    public void setArticleStatus(Integer articleStatus) {
        this.articleStatus = articleStatus;
    }

    /**
     * 获取文章摘要
     *
     * @return article_abstract - 文章摘要
     */
    public String getArticleAbstract() {
        return articleAbstract;
    }

    /**
     * 设置文章摘要
     *
     * @param articleAbstract 文章摘要
     */
    public void setArticleAbstract(String articleAbstract) {
        this.articleAbstract = articleAbstract == null ? null : articleAbstract.trim();
    }

    /**
     * 获取文章摘要纯文本
     *
     * @return article_abstract_text - 文章摘要纯文本
     */
    public String getArticleAbstractText() {
        return articleAbstractText;
    }

    /**
     * 设置文章摘要纯文本
     *
     * @param articleAbstractText 文章摘要纯文本
     */
    public void setArticleAbstractText(String articleAbstractText) {
        this.articleAbstractText = articleAbstractText == null ? null : articleAbstractText.trim();
    }

    /**
     * 获取文章标签，英文逗号分隔符
     *
     * @return article_tags - 文章标签，英文逗号分隔符
     */
    public String getArticleTags() {
        return articleTags;
    }

    /**
     * 设置文章标签，英文逗号分隔符
     *
     * @param articleTags 文章标签，英文逗号分隔符
     */
    public void setArticleTags(String articleTags) {
        this.articleTags = articleTags == null ? null : articleTags.trim();
    }

    /**
     * 获取文章内容
     *
     * @return article_context - 文章内容
     */
    public String getArticleContext() {
        return articleContext;
    }

    /**
     * 设置文章内容
     *
     * @param articleContext 文章内容
     */
    public void setArticleContext(String articleContext) {
        this.articleContext = articleContext == null ? null : articleContext.trim();
    }
}