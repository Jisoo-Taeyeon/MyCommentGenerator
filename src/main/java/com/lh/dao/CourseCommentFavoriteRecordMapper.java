package com.lh.dao;

import com.lh.entity.CourseCommentFavoriteRecord;

public interface CourseCommentFavoriteRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_comment_favorite_record
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_comment_favorite_record
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    int insert(CourseCommentFavoriteRecord row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_comment_favorite_record
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    int insertSelective(CourseCommentFavoriteRecord row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_comment_favorite_record
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    CourseCommentFavoriteRecord selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_comment_favorite_record
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    int updateByPrimaryKeySelective(CourseCommentFavoriteRecord row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_comment_favorite_record
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    int updateByPrimaryKey(CourseCommentFavoriteRecord row);
}