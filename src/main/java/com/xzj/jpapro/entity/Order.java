

/**
 * @author: zhxue
 * @version: 1.0
 * @since 2017-03-11
 */
package com.xzj.jpapro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "eside_order")
public  class Order    {

     	@Id
		@GeneratedValue
		@Column(name = "id"  )
	    private java.lang.Long  id ;
     
        	
		@Column(name = "order_id" )
		private java.lang.Long  orderId;
         	
		@Column(name = "order_type" )
		private java.lang.Integer  orderType;
         	
		@Column(name = "order_status" )
		private java.lang.Integer  orderStatus;
         	
		@Column(name = "delivery_status" )
		private java.lang.Integer  deliveryStatus;
         	
		@Column(name = "settle_json" )
		private java.lang.String  settleJson;
         	
		@Column(name = "settle_user_type" )
		private java.lang.Integer  settleUserType;
         	
		@Column(name = "settle_user_id" )
		private java.lang.Long  settleUserId;
         	
		@Column(name = "store_id" )
		private java.lang.Long  storeId;
         	
		@Column(name = "user_id" )
		private java.lang.Long  userId;
         	
		@Column(name = "user_name" )
		private java.lang.String  userName;
         	
		@Column(name = "money_json" )
		private java.lang.String  moneyJson;
         	
		@Column(name = "real_amount" )
		private java.lang.Long  realAmount;
         	
		@Column(name = "pay_way" )
		private java.lang.Integer  payWay;
         	
		@Column(name = "book_type" )
		private java.lang.Integer  bookType;
         	
		@Column(name = "estimate_get_time" )
		private java.util.Date  estimateGetTime;
         	
		@Column(name = "delivery_json" )
		private java.lang.String  deliveryJson;
         	
		@Column(name = "good_json" )
		private java.lang.String  goodJson;
         	
		@Column(name = "good_price" )
		private java.lang.Long  goodPrice;
         	
		@Column(name = "order_remark" )
		private java.lang.String  orderRemark;
         	
		@Column(name = "accepter_name" )
		private java.lang.String  accepterName;
         	
		@Column(name = "accepter_phone" )
		private java.lang.String  accepterPhone;
         	
		@Column(name = "accepter_json" )
		private java.lang.String  accepterJson;
         	
		@Column(name = "accepter_city" )
		private java.lang.Integer  accepterCity;
         	
		@Column(name = "sender_name" )
		private java.lang.String  senderName;
         	
		@Column(name = "sender_phone" )
		private java.lang.String  senderPhone;
         	
		@Column(name = "sender_json" )
		private java.lang.String  senderJson;
         	
		@Column(name = "sender_city" )
		private java.lang.Integer  senderCity;
         	
		@Column(name = "shipment_code" )
		private java.lang.String  shipmentCode;
         	
		@Column(name = "package_id" )
		private java.lang.Integer  packageId;
         	
		@Column(name = "send_distance" )
		private java.lang.Integer  sendDistance;
         	
		@Column(name = "created_at" )
		private java.util.Date  createdAt;
         	
		@Column(name = "pay_time" )
		private java.util.Date  payTime;
         	
		@Column(name = "updated_at" )
		private java.util.Date  updatedAt;
     

	 	// "主键ID"

		public java.lang.Long  getId  () {
		   		return this.id;
		}
	 
            
        public java.lang.Long  getOrderId  () {
					return orderId;
		}
	        
        public java.lang.Integer  getOrderType  () {
					return orderType;
		}
	        
        public java.lang.Integer  getOrderStatus  () {
					return orderStatus;
		}
	        
        public java.lang.Integer  getDeliveryStatus  () {
					return deliveryStatus;
		}
	        
        public java.lang.String  getSettleJson  () {
					return settleJson;
		}
	        
        public java.lang.Integer  getSettleUserType  () {
					return settleUserType;
		}
	        
        public java.lang.Long  getSettleUserId  () {
					return settleUserId;
		}
	        
        public java.lang.Long  getStoreId  () {
					return storeId;
		}
	        
        public java.lang.Long  getUserId  () {
					return userId;
		}
	        
        public java.lang.String  getUserName  () {
					return userName;
		}
	        
        public java.lang.String  getMoneyJson  () {
					return moneyJson;
		}
	        
        public java.lang.Long  getRealAmount  () {
					return realAmount;
		}
	        
        public java.lang.Integer  getPayWay  () {
					return payWay;
		}
	        
        public java.lang.Integer  getBookType  () {
					return bookType;
		}
	        
        public java.util.Date  getEstimateGetTime  () {
					return estimateGetTime;
		}
	        
       
	        
        public java.lang.String getDeliveryJson() {
			return deliveryJson;
		}


		public java.lang.String  getGoodJson  () {
					return goodJson;
		}
	        
        public java.lang.Long  getGoodPrice  () {
					return goodPrice;
		}
	        
        public java.lang.String  getOrderRemark  () {
					return orderRemark;
		}
	        
        public java.lang.String  getAccepterName  () {
					return accepterName;
		}
	        
        public java.lang.String  getAccepterPhone  () {
					return accepterPhone;
		}
	        
        public java.lang.String  getAccepterJson  () {
					return accepterJson;
		}
	        
        public java.lang.Integer  getAccepterCity  () {
					return accepterCity;
		}
	        
        public java.lang.String  getSenderName  () {
					return senderName;
		}
	        
        public java.lang.String  getSenderPhone  () {
					return senderPhone;
		}
	        
        public java.lang.String  getSenderJson  () {
					return senderJson;
		}
	        
        public java.lang.Integer  getSenderCity  () {
					return senderCity;
		}
	        
        public java.lang.String  getShipmentCode  () {
					return shipmentCode;
		}
	        
        public java.lang.Integer  getPackageId  () {
					return packageId;
		}
	        
        public java.lang.Integer  getSendDistance  () {
					return sendDistance;
		}
	        
        public java.util.Date  getCreatedAt  () {
					return createdAt;
		}
	        
        public java.util.Date  getPayTime  () {
					return payTime;
		}
	        
	        
        public java.util.Date  getUpdatedAt  () {
					return updatedAt;
		}
	
	 	public void setId (java.lang.Long  id) {
		 						    this.id = id;
				
		 	}
	 
	 	public void setOrderId (java.lang.Long  orderId) {
			if(orderId == null){
				return;
			}
			this.orderId = orderId;
		}
		public void setOrderType (java.lang.Integer  orderType) {
			if(orderType == null){
				return;
			}
			this.orderType = orderType;
		}
		public void setOrderStatus (java.lang.Integer  orderStatus) {
			if(orderStatus == null){
				return;
			}
			this.orderStatus = orderStatus;
		}
		public void setDeliveryStatus (java.lang.Integer  deliveryStatus) {
			if(deliveryStatus == null){
				return;
			}
			this.deliveryStatus = deliveryStatus;
		}
		public void setSettleJson (java.lang.String  settleJson) {
			if(settleJson == null){
				return;
			}
			this.settleJson = settleJson;
		}
		public void setSettleUserType (java.lang.Integer  settleUserType) {
			if(settleUserType == null){
				return;
			}
			this.settleUserType = settleUserType;
		}
		public void setSettleUserId (java.lang.Long  settleUserId) {
			if(settleUserId == null){
				return;
			}
			this.settleUserId = settleUserId;
		}
		public void setStoreId (java.lang.Long  storeId) {
			if(storeId == null){
				return;
			}
			this.storeId = storeId;
		}
		public void setUserId (java.lang.Long  userId) {
			if(userId == null){
				return;
			}
			this.userId = userId;
		}
		public void setUserName (java.lang.String  userName) {
			if(userName == null){
				return;
			}
			this.userName = userName;
		}
		public void setMoneyJson (java.lang.String  moneyJson) {
			if(moneyJson == null){
				return;
			}
			this.moneyJson = moneyJson;
		}
		public void setRealAmount (java.lang.Long  realAmount) {
			if(realAmount == null){
				return;
			}
			this.realAmount = realAmount;
		}
		public void setPayWay (java.lang.Integer  payWay) {
			if(payWay == null){
				return;
			}
			this.payWay = payWay;
		}
		public void setBookType (java.lang.Integer  bookType) {
			if(bookType == null){
				return;
			}
			this.bookType = bookType;
		}
		public void setDeliveryJson(String deliveryJson){
			if (deliveryJson == null) {
				return;
			}
			this.deliveryJson = deliveryJson;
		}
		public void setEstimateGetTime (java.util.Date  estimateGetTime) {
			if(estimateGetTime == null){
				return;
			}
			this.estimateGetTime = estimateGetTime;
		}
		
		public void setGoodJson (java.lang.String  goodJson) {
			if(goodJson == null){
				return;
			}
			this.goodJson = goodJson;
		}
		public void setGoodPrice (java.lang.Long  goodPrice) {
			if(goodPrice == null){
				return;
			}
			this.goodPrice = goodPrice;
		}
		public void setOrderRemark (java.lang.String  orderRemark) {
			if(orderRemark == null){
				return;
			}
			this.orderRemark = orderRemark;
		}
		public void setAccepterName (java.lang.String  accepterName) {
			if(accepterName == null){
				return;
			}
			this.accepterName = accepterName;
		}
		public void setAccepterPhone (java.lang.String  accepterPhone) {
			if(accepterPhone == null){
				return;
			}
			this.accepterPhone = accepterPhone;
		}
		public void setAccepterJson (java.lang.String  accepterJson) {
			if(accepterJson == null){
				return;
			}
			this.accepterJson = accepterJson;
		}
		public void setAccepterCity (java.lang.Integer  accepterCity) {
			if(accepterCity == null){
				return;
			}
			this.accepterCity = accepterCity;
		}
		public void setSenderName (java.lang.String  senderName) {
			if(senderName == null){
				return;
			}
			this.senderName = senderName;
		}
		public void setSenderPhone (java.lang.String  senderPhone) {
			if(senderPhone == null){
				return;
			}
			this.senderPhone = senderPhone;
		}
		public void setSenderJson (java.lang.String  senderJson) {
			if(senderJson == null){
				return;
			}
			this.senderJson = senderJson;
		}
		public void setSenderCity (java.lang.Integer  senderCity) {
			if(senderCity == null){
				return;
			}
			this.senderCity = senderCity;
		}
		public void setShipmentCode (java.lang.String  shipmentCode) {
			if(shipmentCode == null){
				return;
			}
			this.shipmentCode = shipmentCode;
		}
		public void setPackageId (java.lang.Integer  packageId) {
			if(packageId == null){
				return;
			}
			this.packageId = packageId;
		}
		public void setSendDistance (java.lang.Integer  sendDistance) {
			if(sendDistance == null){
				return;
			}
			this.sendDistance = sendDistance;
		}
		public void setCreatedAt (java.util.Date  createdAt) {
			if(createdAt == null){
				return;
			}
			this.createdAt = createdAt;
		}
		public void setPayTime (java.util.Date  payTime) {
			if(payTime == null){
				return;
			}
			this.payTime = payTime;
		}
		
		public void setUpdatedAt (java.util.Date  updatedAt) {
			if(updatedAt == null){
				return;
			}
			this.updatedAt = updatedAt;
		}
	

	@Override
	public String toString() {
		return "Order{" +
				"id=" + id +
				", orderId=" + orderId +
				", orderType=" + orderType +
				", orderStatus=" + orderStatus +
				", deliveryStatus=" + deliveryStatus +
				", settleJson='" + settleJson + '\'' +
				", settleUserType=" + settleUserType +
				", settleUserId=" + settleUserId +
				", storeId=" + storeId +
				", userId=" + userId +
				", userName='" + userName + '\'' +
				", moneyJson='" + moneyJson + '\'' +
				", realAmount=" + realAmount +
				", payWay=" + payWay +
				", isBook=" + bookType +
				", estimateGetTime=" + estimateGetTime +
				", goodJson='" + goodJson + '\'' +
				", goodPrice=" + goodPrice +
				", orderRemark='" + orderRemark + '\'' +
				", accepterName='" + accepterName + '\'' +
				", accepterPhone='" + accepterPhone + '\'' +
				", accepterJson='" + accepterJson + '\'' +
				", accepterCity=" + accepterCity +
				", senderName='" + senderName + '\'' +
				", senderPhone='" + senderPhone + '\'' +
				", senderJson='" + senderJson + '\'' +
				", senderCity=" + senderCity +
				", shipmentCode='" + shipmentCode + '\'' +
				", packageId=" + packageId +
				", sendDistance=" + sendDistance +
				", createdAt=" + createdAt +
				", payTime=" + payTime +
				", updatedAt=" + updatedAt +
				'}';
	}
}