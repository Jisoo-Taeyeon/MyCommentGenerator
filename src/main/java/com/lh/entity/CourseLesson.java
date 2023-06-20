package com.lh.entity;

import java.util.Date;

/**
 * Database Table Remarks:
 *   课程节内容
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table course_lesson
 */
public class CourseLesson {
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_lesson.id
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   课程id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_lesson.course_id
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private Integer courseId;

    /**
     * Database Column Remarks:
     *   章节id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_lesson.section_id
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private Integer sectionId;

    /**
     * Database Column Remarks:
     *   课时主题
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_lesson.theme
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private String theme;

    /**
     * Database Column Remarks:
     *   课时时长(分钟)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_lesson.duration
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private Integer duration;

    /**
     * Database Column Remarks:
     *   是否免费
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_lesson.is_free
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private Boolean isFree;

    /**
     * Database Column Remarks:
     *   记录创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_lesson.create_time
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_lesson.update_time
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private Date updateTime;

    /**
     * Database Column Remarks:
     *   是否删除
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_lesson.is_del
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private Boolean isDel;

    /**
     * Database Column Remarks:
     *   排序字段
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_lesson.order_num
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private Integer orderNum;

    /**
     * Database Column Remarks:
     *   课时状态,0-隐藏，1-未发布，2-已发布
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_lesson.status
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_lesson.id
     *
     * @return the value of course_lesson.id
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_lesson.id
     *
     * @param id the value for course_lesson.id
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_lesson.course_id
     *
     * @return the value of course_lesson.course_id
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public Integer getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_lesson.course_id
     *
     * @param courseId the value for course_lesson.course_id
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_lesson.section_id
     *
     * @return the value of course_lesson.section_id
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public Integer getSectionId() {
        return sectionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_lesson.section_id
     *
     * @param sectionId the value for course_lesson.section_id
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_lesson.theme
     *
     * @return the value of course_lesson.theme
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public String getTheme() {
        return theme;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_lesson.theme
     *
     * @param theme the value for course_lesson.theme
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setTheme(String theme) {
        this.theme = theme == null ? null : theme.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_lesson.duration
     *
     * @return the value of course_lesson.duration
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_lesson.duration
     *
     * @param duration the value for course_lesson.duration
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_lesson.is_free
     *
     * @return the value of course_lesson.is_free
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public Boolean getIsFree() {
        return isFree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_lesson.is_free
     *
     * @param isFree the value for course_lesson.is_free
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setIsFree(Boolean isFree) {
        this.isFree = isFree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_lesson.create_time
     *
     * @return the value of course_lesson.create_time
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_lesson.create_time
     *
     * @param createTime the value for course_lesson.create_time
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_lesson.update_time
     *
     * @return the value of course_lesson.update_time
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_lesson.update_time
     *
     * @param updateTime the value for course_lesson.update_time
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_lesson.is_del
     *
     * @return the value of course_lesson.is_del
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public Boolean getIsDel() {
        return isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_lesson.is_del
     *
     * @param isDel the value for course_lesson.is_del
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_lesson.order_num
     *
     * @return the value of course_lesson.order_num
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public Integer getOrderNum() {
        return orderNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_lesson.order_num
     *
     * @param orderNum the value for course_lesson.order_num
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_lesson.status
     *
     * @return the value of course_lesson.status
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_lesson.status
     *
     * @param status the value for course_lesson.status
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}