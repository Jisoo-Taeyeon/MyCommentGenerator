package com.lh.dao;

import com.lh.entity.CourseLesson;

public interface CourseLessonMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_lesson
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_lesson
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    int insert(CourseLesson row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_lesson
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    int insertSelective(CourseLesson row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_lesson
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    CourseLesson selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_lesson
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    int updateByPrimaryKeySelective(CourseLesson row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_lesson
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    int updateByPrimaryKey(CourseLesson row);
}