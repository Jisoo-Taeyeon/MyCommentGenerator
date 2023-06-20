package com.lh.entity;

import java.util.Date;

/**
 * Database Table Remarks:
 *   讲师表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table teacher
 */
public class Teacher {
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.id
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   课程ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.course_id
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private Integer courseId;

    /**
     * Database Column Remarks:
     *   讲师姓名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.teacher_name
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private String teacherName;

    /**
     * Database Column Remarks:
     *   职务
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.position
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private String position;

    /**
     * Database Column Remarks:
     *   记录创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.create_time
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.update_time
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private Date updateTime;

    /**
     * Database Column Remarks:
     *   是否删除
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.is_del
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private Boolean isDel;

    /**
     * Database Column Remarks:
     *   讲师介绍
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.description
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.id
     *
     * @return the value of teacher.id
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.id
     *
     * @param id the value for teacher.id
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.course_id
     *
     * @return the value of teacher.course_id
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public Integer getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.course_id
     *
     * @param courseId the value for teacher.course_id
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.teacher_name
     *
     * @return the value of teacher.teacher_name
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public String getTeacherName() {
        return teacherName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.teacher_name
     *
     * @param teacherName the value for teacher.teacher_name
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.position
     *
     * @return the value of teacher.position
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public String getPosition() {
        return position;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.position
     *
     * @param position the value for teacher.position
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.create_time
     *
     * @return the value of teacher.create_time
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.create_time
     *
     * @param createTime the value for teacher.create_time
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.update_time
     *
     * @return the value of teacher.update_time
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.update_time
     *
     * @param updateTime the value for teacher.update_time
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.is_del
     *
     * @return the value of teacher.is_del
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public Boolean getIsDel() {
        return isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.is_del
     *
     * @param isDel the value for teacher.is_del
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.description
     *
     * @return the value of teacher.description
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.description
     *
     * @param description the value for teacher.description
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}