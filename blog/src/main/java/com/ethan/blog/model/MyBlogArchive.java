package com.ethan.blog.model;

import javax.persistence.*;

@Table(name = "myblog..my_blog_archive")
public class MyBlogArchive {
    @Id
    @Column(name = "o_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String oId;

    /**
     * 存档日期时间，该月第一天的时间戳
     */
    @Column(name = "archive_time")
    private Long archiveTime;

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
     * 获取存档日期时间，该月第一天的时间戳
     *
     * @return archive_time - 存档日期时间，该月第一天的时间戳
     */
    public Long getArchiveTime() {
        return archiveTime;
    }

    /**
     * 设置存档日期时间，该月第一天的时间戳
     *
     * @param archiveTime 存档日期时间，该月第一天的时间戳
     */
    public void setArchiveTime(Long archiveTime) {
        this.archiveTime = archiveTime;
    }
}