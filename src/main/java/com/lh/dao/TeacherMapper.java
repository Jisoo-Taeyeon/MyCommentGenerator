package com.lh.dao;

import com.lh.entity.Teacher;

public interface TeacherMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    int insert(Teacher row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    int insertSelective(Teacher row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    Teacher selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    int updateByPrimaryKeySelective(Teacher row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    int updateByPrimaryKeyWithBLOBs(Teacher row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    int updateByPrimaryKey(Teacher row);
}