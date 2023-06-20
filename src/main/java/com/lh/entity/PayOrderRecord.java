package com.lh.entity;

import java.util.Date;

/**
 * Database Table Remarks:
 *   支付订单状态日志表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table pay_order_record
 */
public class PayOrderRecord {
    /**
     * Database Column Remarks:
     *   ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order_record.id
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   订单号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order_record.order_no
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private String orderNo;

    /**
     * Database Column Remarks:
     *   操作类型：CREATE|PAY|REFUND...
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order_record.type
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private String type;

    /**
     * Database Column Remarks:
     *   原订单状态
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order_record.from_status
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private String fromStatus;

    /**
     * Database Column Remarks:
     *   新订单状态
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order_record.to_status
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private String toStatus;

    /**
     * Database Column Remarks:
     *   实付金额，单位为分
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order_record.paid_amount
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private Integer paidAmount;

    /**
     * Database Column Remarks:
     *   备注
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order_record.remark
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private String remark;

    /**
     * Database Column Remarks:
     *   操作人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order_record.created_by
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private String createdBy;

    /**
     * Database Column Remarks:
     *   操作时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order_record.created_at
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    private Date createdAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order_record.id
     *
     * @return the value of pay_order_record.id
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order_record.id
     *
     * @param id the value for pay_order_record.id
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order_record.order_no
     *
     * @return the value of pay_order_record.order_no
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order_record.order_no
     *
     * @param orderNo the value for pay_order_record.order_no
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order_record.type
     *
     * @return the value of pay_order_record.type
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order_record.type
     *
     * @param type the value for pay_order_record.type
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order_record.from_status
     *
     * @return the value of pay_order_record.from_status
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public String getFromStatus() {
        return fromStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order_record.from_status
     *
     * @param fromStatus the value for pay_order_record.from_status
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setFromStatus(String fromStatus) {
        this.fromStatus = fromStatus == null ? null : fromStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order_record.to_status
     *
     * @return the value of pay_order_record.to_status
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public String getToStatus() {
        return toStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order_record.to_status
     *
     * @param toStatus the value for pay_order_record.to_status
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setToStatus(String toStatus) {
        this.toStatus = toStatus == null ? null : toStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order_record.paid_amount
     *
     * @return the value of pay_order_record.paid_amount
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public Integer getPaidAmount() {
        return paidAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order_record.paid_amount
     *
     * @param paidAmount the value for pay_order_record.paid_amount
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setPaidAmount(Integer paidAmount) {
        this.paidAmount = paidAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order_record.remark
     *
     * @return the value of pay_order_record.remark
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order_record.remark
     *
     * @param remark the value for pay_order_record.remark
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order_record.created_by
     *
     * @return the value of pay_order_record.created_by
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order_record.created_by
     *
     * @param createdBy the value for pay_order_record.created_by
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order_record.created_at
     *
     * @return the value of pay_order_record.created_at
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order_record.created_at
     *
     * @param createdAt the value for pay_order_record.created_at
     *
     * @mbg.generated Tue Jun 20 09:40:37 CST 2023
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}