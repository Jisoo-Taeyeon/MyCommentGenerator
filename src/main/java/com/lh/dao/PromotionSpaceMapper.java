package com.lh.dao;

import com.lh.entity.PromotionSpace;

public interface PromotionSpaceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promotion_space
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promotion_space
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    int insert(PromotionSpace row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promotion_space
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    int insertSelective(PromotionSpace row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promotion_space
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    PromotionSpace selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promotion_space
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    int updateByPrimaryKeySelective(PromotionSpace row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promotion_space
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    int updateByPrimaryKey(PromotionSpace row);
}