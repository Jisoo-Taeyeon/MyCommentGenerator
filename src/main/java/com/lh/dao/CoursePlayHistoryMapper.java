package com.lh.dao;

import com.lh.entity.CoursePlayHistory;

public interface CoursePlayHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_play_history
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_play_history
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    int insert(CoursePlayHistory row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_play_history
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    int insertSelective(CoursePlayHistory row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_play_history
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    CoursePlayHistory selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_play_history
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    int updateByPrimaryKeySelective(CoursePlayHistory row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_play_history
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    int updateByPrimaryKey(CoursePlayHistory row);
}