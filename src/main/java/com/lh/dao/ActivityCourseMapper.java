package com.lh.dao;

import com.lh.entity.ActivityCourse;

public interface ActivityCourseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_course
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_course
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    int insert(ActivityCourse row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_course
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    int insertSelective(ActivityCourse row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_course
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    ActivityCourse selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_course
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    int updateByPrimaryKeySelective(ActivityCourse row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_course
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    int updateByPrimaryKey(ActivityCourse row);
}