package vn.com.vti.springexam.entity;

import java.util.Date;

public class OrderHeader {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_header.order_no
     *
     * @mbg.generated Sat Mar 18 15:57:40 JST 2023
     */
    private String orderNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_header.order_datetime
     *
     * @mbg.generated Sat Mar 18 15:57:40 JST 2023
     */
    private Date orderDatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_header.member_id
     *
     * @mbg.generated Sat Mar 18 15:57:40 JST 2023
     */
    private String memberId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_header.payment_type
     *
     * @mbg.generated Sat Mar 18 15:57:40 JST 2023
     */
    private String paymentType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_header.member_card_id
     *
     * @mbg.generated Sat Mar 18 15:57:40 JST 2023
     */
    private Integer memberCardId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_header.order_no
     *
     * @return the value of order_header.order_no
     *
     * @mbg.generated Sat Mar 18 15:57:40 JST 2023
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_header.order_no
     *
     * @param orderNo the value for order_header.order_no
     *
     * @mbg.generated Sat Mar 18 15:57:40 JST 2023
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_header.order_datetime
     *
     * @return the value of order_header.order_datetime
     *
     * @mbg.generated Sat Mar 18 15:57:40 JST 2023
     */
    public Date getOrderDatetime() {
        return orderDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_header.order_datetime
     *
     * @param orderDatetime the value for order_header.order_datetime
     *
     * @mbg.generated Sat Mar 18 15:57:40 JST 2023
     */
    public void setOrderDatetime(Date orderDatetime) {
        this.orderDatetime = orderDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_header.member_id
     *
     * @return the value of order_header.member_id
     *
     * @mbg.generated Sat Mar 18 15:57:40 JST 2023
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_header.member_id
     *
     * @param memberId the value for order_header.member_id
     *
     * @mbg.generated Sat Mar 18 15:57:40 JST 2023
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_header.payment_type
     *
     * @return the value of order_header.payment_type
     *
     * @mbg.generated Sat Mar 18 15:57:40 JST 2023
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_header.payment_type
     *
     * @param paymentType the value for order_header.payment_type
     *
     * @mbg.generated Sat Mar 18 15:57:40 JST 2023
     */
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_header.member_card_id
     *
     * @return the value of order_header.member_card_id
     *
     * @mbg.generated Sat Mar 18 15:57:40 JST 2023
     */
    public Integer getMemberCardId() {
        return memberCardId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_header.member_card_id
     *
     * @param memberCardId the value for order_header.member_card_id
     *
     * @mbg.generated Sat Mar 18 15:57:40 JST 2023
     */
    public void setMemberCardId(Integer memberCardId) {
        this.memberCardId = memberCardId;
    }
}