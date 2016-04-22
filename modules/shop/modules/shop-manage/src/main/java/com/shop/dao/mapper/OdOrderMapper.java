package com.shop.dao.mapper;

import com.shop.model.pojo.OdOrder;
import com.shop.model.pojo.OdOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface OdOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table od_order
     *
     * @mbggenerated Tue Apr 19 19:35:25 CST 2016
     */
    int countByExample(OdOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table od_order
     *
     * @mbggenerated Tue Apr 19 19:35:25 CST 2016
     */
    int deleteByExample(OdOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table od_order
     *
     * @mbggenerated Tue Apr 19 19:35:25 CST 2016
     */
    @Delete({
        "delete from od_order",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table od_order
     *
     * @mbggenerated Tue Apr 19 19:35:25 CST 2016
     */
    @Insert({
        "insert into od_order (order_id, trade_code, ",
        "from_source, order_state, ",
        "user_id, user_name, ",
        "user_comment, seller_id, ",
        "seller_name, seller_comment, ",
        "create_time, is_overbuy, ",
        "is_cancel, cancel_time, ",
        "cancel_type, cancel_reason, ",
        "update_time, update_user_id, ",
        "price_amount, postage, ",
        "exchange_score, exchange_cash, ",
        "coupon_no, coupon_price, ",
        "discount_id, discount_type, ",
        "discount_desc, discount_rule, ",
        "discount_price, pay_state, ",
        "pay_time, pay_account, ",
        "trade_pay_id, pay_channel, ",
        "pay_id, receiver_province_id, ",
        "receiver_province_name, receiver_city_id, ",
        "receiver_city_name, receiver_area_id, ",
        "receiver_area_name, receiver_address, ",
        "receiver_name, receiver_mobile, ",
        "receiver_tele, receiver_address_id, ",
        "receive_time, deliver_time, ",
        "deliver_time_limit, remind_deliver_count, ",
        "express_id, express_name, ",
        "express_no)",
        "values (#{orderId,jdbcType=VARCHAR}, #{tradeCode,jdbcType=VARCHAR}, ",
        "#{fromSource,jdbcType=INTEGER}, #{orderState,jdbcType=INTEGER}, ",
        "#{userId,jdbcType=BIGINT}, #{userName,jdbcType=VARCHAR}, ",
        "#{userComment,jdbcType=VARCHAR}, #{sellerId,jdbcType=INTEGER}, ",
        "#{sellerName,jdbcType=VARCHAR}, #{sellerComment,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{isOverbuy,jdbcType=INTEGER}, ",
        "#{isCancel,jdbcType=INTEGER}, #{cancelTime,jdbcType=TIMESTAMP}, ",
        "#{cancelType,jdbcType=INTEGER}, #{cancelReason,jdbcType=INTEGER}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{updateUserId,jdbcType=INTEGER}, ",
        "#{priceAmount,jdbcType=BIGINT}, #{postage,jdbcType=BIGINT}, ",
        "#{exchangeScore,jdbcType=INTEGER}, #{exchangeCash,jdbcType=BIGINT}, ",
        "#{couponNo,jdbcType=VARCHAR}, #{couponPrice,jdbcType=BIGINT}, ",
        "#{discountId,jdbcType=INTEGER}, #{discountType,jdbcType=INTEGER}, ",
        "#{discountDesc,jdbcType=VARCHAR}, #{discountRule,jdbcType=VARCHAR}, ",
        "#{discountPrice,jdbcType=BIGINT}, #{payState,jdbcType=INTEGER}, ",
        "#{payTime,jdbcType=TIMESTAMP}, #{payAccount,jdbcType=VARCHAR}, ",
        "#{tradePayId,jdbcType=VARCHAR}, #{payChannel,jdbcType=INTEGER}, ",
        "#{payId,jdbcType=VARCHAR}, #{receiverProvinceId,jdbcType=INTEGER}, ",
        "#{receiverProvinceName,jdbcType=VARCHAR}, #{receiverCityId,jdbcType=INTEGER}, ",
        "#{receiverCityName,jdbcType=VARCHAR}, #{receiverAreaId,jdbcType=INTEGER}, ",
        "#{receiverAreaName,jdbcType=VARCHAR}, #{receiverAddress,jdbcType=VARCHAR}, ",
        "#{receiverName,jdbcType=VARCHAR}, #{receiverMobile,jdbcType=VARCHAR}, ",
        "#{receiverTele,jdbcType=VARCHAR}, #{receiverAddressId,jdbcType=INTEGER}, ",
        "#{receiveTime,jdbcType=TIMESTAMP}, #{deliverTime,jdbcType=TIMESTAMP}, ",
        "#{deliverTimeLimit,jdbcType=INTEGER}, #{remindDeliverCount,jdbcType=INTEGER}, ",
        "#{expressId,jdbcType=INTEGER}, #{expressName,jdbcType=VARCHAR}, ",
        "#{expressNo,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(OdOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table od_order
     *
     * @mbggenerated Tue Apr 19 19:35:25 CST 2016
     */
    int insertSelective(OdOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table od_order
     *
     * @mbggenerated Tue Apr 19 19:35:25 CST 2016
     */
    List<OdOrder> selectByExample(OdOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table od_order
     *
     * @mbggenerated Tue Apr 19 19:35:25 CST 2016
     */
    @Select({
        "select",
        "id, order_id, trade_code, from_source, order_state, user_id, user_name, user_comment, ",
        "seller_id, seller_name, seller_comment, create_time, is_overbuy, is_cancel, ",
        "cancel_time, cancel_type, cancel_reason, update_time, update_user_id, price_amount, ",
        "postage, exchange_score, exchange_cash, coupon_no, coupon_price, discount_id, ",
        "discount_type, discount_desc, discount_rule, discount_price, pay_state, pay_time, ",
        "pay_account, trade_pay_id, pay_channel, pay_id, receiver_province_id, receiver_province_name, ",
        "receiver_city_id, receiver_city_name, receiver_area_id, receiver_area_name, ",
        "receiver_address, receiver_name, receiver_mobile, receiver_tele, receiver_address_id, ",
        "receive_time, deliver_time, deliver_time_limit, remind_deliver_count, express_id, ",
        "express_name, express_no",
        "from od_order",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("BaseResultMap")
    OdOrder selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table od_order
     *
     * @mbggenerated Tue Apr 19 19:35:25 CST 2016
     */
    int updateByExampleSelective(@Param("record") OdOrder record, @Param("example") OdOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table od_order
     *
     * @mbggenerated Tue Apr 19 19:35:25 CST 2016
     */
    int updateByExample(@Param("record") OdOrder record, @Param("example") OdOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table od_order
     *
     * @mbggenerated Tue Apr 19 19:35:25 CST 2016
     */
    int updateByPrimaryKeySelective(OdOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table od_order
     *
     * @mbggenerated Tue Apr 19 19:35:25 CST 2016
     */
    @Update({
        "update od_order",
        "set order_id = #{orderId,jdbcType=VARCHAR},",
          "trade_code = #{tradeCode,jdbcType=VARCHAR},",
          "from_source = #{fromSource,jdbcType=INTEGER},",
          "order_state = #{orderState,jdbcType=INTEGER},",
          "user_id = #{userId,jdbcType=BIGINT},",
          "user_name = #{userName,jdbcType=VARCHAR},",
          "user_comment = #{userComment,jdbcType=VARCHAR},",
          "seller_id = #{sellerId,jdbcType=INTEGER},",
          "seller_name = #{sellerName,jdbcType=VARCHAR},",
          "seller_comment = #{sellerComment,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "is_overbuy = #{isOverbuy,jdbcType=INTEGER},",
          "is_cancel = #{isCancel,jdbcType=INTEGER},",
          "cancel_time = #{cancelTime,jdbcType=TIMESTAMP},",
          "cancel_type = #{cancelType,jdbcType=INTEGER},",
          "cancel_reason = #{cancelReason,jdbcType=INTEGER},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "update_user_id = #{updateUserId,jdbcType=INTEGER},",
          "price_amount = #{priceAmount,jdbcType=BIGINT},",
          "postage = #{postage,jdbcType=BIGINT},",
          "exchange_score = #{exchangeScore,jdbcType=INTEGER},",
          "exchange_cash = #{exchangeCash,jdbcType=BIGINT},",
          "coupon_no = #{couponNo,jdbcType=VARCHAR},",
          "coupon_price = #{couponPrice,jdbcType=BIGINT},",
          "discount_id = #{discountId,jdbcType=INTEGER},",
          "discount_type = #{discountType,jdbcType=INTEGER},",
          "discount_desc = #{discountDesc,jdbcType=VARCHAR},",
          "discount_rule = #{discountRule,jdbcType=VARCHAR},",
          "discount_price = #{discountPrice,jdbcType=BIGINT},",
          "pay_state = #{payState,jdbcType=INTEGER},",
          "pay_time = #{payTime,jdbcType=TIMESTAMP},",
          "pay_account = #{payAccount,jdbcType=VARCHAR},",
          "trade_pay_id = #{tradePayId,jdbcType=VARCHAR},",
          "pay_channel = #{payChannel,jdbcType=INTEGER},",
          "pay_id = #{payId,jdbcType=VARCHAR},",
          "receiver_province_id = #{receiverProvinceId,jdbcType=INTEGER},",
          "receiver_province_name = #{receiverProvinceName,jdbcType=VARCHAR},",
          "receiver_city_id = #{receiverCityId,jdbcType=INTEGER},",
          "receiver_city_name = #{receiverCityName,jdbcType=VARCHAR},",
          "receiver_area_id = #{receiverAreaId,jdbcType=INTEGER},",
          "receiver_area_name = #{receiverAreaName,jdbcType=VARCHAR},",
          "receiver_address = #{receiverAddress,jdbcType=VARCHAR},",
          "receiver_name = #{receiverName,jdbcType=VARCHAR},",
          "receiver_mobile = #{receiverMobile,jdbcType=VARCHAR},",
          "receiver_tele = #{receiverTele,jdbcType=VARCHAR},",
          "receiver_address_id = #{receiverAddressId,jdbcType=INTEGER},",
          "receive_time = #{receiveTime,jdbcType=TIMESTAMP},",
          "deliver_time = #{deliverTime,jdbcType=TIMESTAMP},",
          "deliver_time_limit = #{deliverTimeLimit,jdbcType=INTEGER},",
          "remind_deliver_count = #{remindDeliverCount,jdbcType=INTEGER},",
          "express_id = #{expressId,jdbcType=INTEGER},",
          "express_name = #{expressName,jdbcType=VARCHAR},",
          "express_no = #{expressNo,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(OdOrder record);
}