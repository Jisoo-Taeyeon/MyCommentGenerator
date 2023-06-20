package com.lh.entity;

import java.util.Date;

/**
 * Database Table Remarks:
 *   课节视频表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table course_media
 */
public class CourseMedia {
    /**
     * Database Column Remarks:
     *   课程媒体主键ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_media.id
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   课程Id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_media.course_id
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private Integer courseId;

    /**
     * Database Column Remarks:
     *   章ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_media.section_id
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private Integer sectionId;

    /**
     * Database Column Remarks:
     *   课时ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_media.lesson_id
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private Integer lessonId;

    /**
     * Database Column Remarks:
     *   封面图URL
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_media.cover_image_url
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private String coverImageUrl;

    /**
     * Database Column Remarks:
     *   时长（06:02）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_media.duration
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private String duration;

    /**
     * Database Column Remarks:
     *   媒体资源文件对应的EDK
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_media.file_edk
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private String fileEdk;

    /**
     * Database Column Remarks:
     *   文件大小MB
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_media.file_size
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private Double fileSize;

    /**
     * Database Column Remarks:
     *   文件名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_media.file_name
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private String fileName;

    /**
     * Database Column Remarks:
     *   媒体资源文件对应的DK
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_media.file_dk
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private String fileDk;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_media.create_time
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_media.update_time
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private Date updateTime;

    /**
     * Database Column Remarks:
     *   是否删除，0未删除，1删除
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_media.is_del
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private Boolean isDel;

    /**
     * Database Column Remarks:
     *   时长，秒数（主要用于音频在H5控件中使用）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_media.duration_num
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private Integer durationNum;

    /**
     * Database Column Remarks:
     *   媒体资源文件ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_media.file_id
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private String fileId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_media.id
     *
     * @return the value of course_media.id
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_media.id
     *
     * @param id the value for course_media.id
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_media.course_id
     *
     * @return the value of course_media.course_id
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public Integer getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_media.course_id
     *
     * @param courseId the value for course_media.course_id
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_media.section_id
     *
     * @return the value of course_media.section_id
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public Integer getSectionId() {
        return sectionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_media.section_id
     *
     * @param sectionId the value for course_media.section_id
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_media.lesson_id
     *
     * @return the value of course_media.lesson_id
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public Integer getLessonId() {
        return lessonId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_media.lesson_id
     *
     * @param lessonId the value for course_media.lesson_id
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setLessonId(Integer lessonId) {
        this.lessonId = lessonId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_media.cover_image_url
     *
     * @return the value of course_media.cover_image_url
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public String getCoverImageUrl() {
        return coverImageUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_media.cover_image_url
     *
     * @param coverImageUrl the value for course_media.cover_image_url
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setCoverImageUrl(String coverImageUrl) {
        this.coverImageUrl = coverImageUrl == null ? null : coverImageUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_media.duration
     *
     * @return the value of course_media.duration
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public String getDuration() {
        return duration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_media.duration
     *
     * @param duration the value for course_media.duration
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setDuration(String duration) {
        this.duration = duration == null ? null : duration.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_media.file_edk
     *
     * @return the value of course_media.file_edk
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public String getFileEdk() {
        return fileEdk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_media.file_edk
     *
     * @param fileEdk the value for course_media.file_edk
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setFileEdk(String fileEdk) {
        this.fileEdk = fileEdk == null ? null : fileEdk.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_media.file_size
     *
     * @return the value of course_media.file_size
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public Double getFileSize() {
        return fileSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_media.file_size
     *
     * @param fileSize the value for course_media.file_size
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setFileSize(Double fileSize) {
        this.fileSize = fileSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_media.file_name
     *
     * @return the value of course_media.file_name
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_media.file_name
     *
     * @param fileName the value for course_media.file_name
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_media.file_dk
     *
     * @return the value of course_media.file_dk
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public String getFileDk() {
        return fileDk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_media.file_dk
     *
     * @param fileDk the value for course_media.file_dk
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setFileDk(String fileDk) {
        this.fileDk = fileDk == null ? null : fileDk.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_media.create_time
     *
     * @return the value of course_media.create_time
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_media.create_time
     *
     * @param createTime the value for course_media.create_time
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_media.update_time
     *
     * @return the value of course_media.update_time
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_media.update_time
     *
     * @param updateTime the value for course_media.update_time
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_media.is_del
     *
     * @return the value of course_media.is_del
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public Boolean getIsDel() {
        return isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_media.is_del
     *
     * @param isDel the value for course_media.is_del
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_media.duration_num
     *
     * @return the value of course_media.duration_num
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public Integer getDurationNum() {
        return durationNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_media.duration_num
     *
     * @param durationNum the value for course_media.duration_num
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setDurationNum(Integer durationNum) {
        this.durationNum = durationNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_media.file_id
     *
     * @return the value of course_media.file_id
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_media.file_id
     *
     * @param fileId the value for course_media.file_id
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setFileId(String fileId) {
        this.fileId = fileId == null ? null : fileId.trim();
    }
}