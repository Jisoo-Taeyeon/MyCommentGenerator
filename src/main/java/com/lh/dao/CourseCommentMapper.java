package com.lh.dao;

import com.lh.entity.CourseComment;

public interface CourseCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_comment
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_comment
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    int insert(CourseComment row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_comment
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    int insertSelective(CourseComment row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_comment
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    CourseComment selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_comment
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    int updateByPrimaryKeySelective(CourseComment row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_comment
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    int updateByPrimaryKeyWithBLOBs(CourseComment row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_comment
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    int updateByPrimaryKey(CourseComment row);
}