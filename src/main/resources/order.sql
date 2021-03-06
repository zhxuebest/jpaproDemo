CREATE TABLE `eside_order` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `order_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '订单号',
  `order_type` int(11) NOT NULL DEFAULT '0' COMMENT '订单类别',
  `order_status` int(11) NOT NULL DEFAULT '0' COMMENT '订单状态',
  `delivery_status` int(11) NOT NULL DEFAULT '0' COMMENT '子状态 运单状态',
  `settle_json` varchar(1024) NOT NULL DEFAULT '' COMMENT '终结信息:settle info, reason, remark,user_id',
  `settle_user_type` int(11) NOT NULL DEFAULT '0' COMMENT '终结人类型',
  `settle_user_id` int(11) NOT NULL DEFAULT '0' COMMENT '终结人ID',
  `store_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '商户ID',
  `user_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '用户ID',
  `user_name` varchar(255) NOT NULL DEFAULT '' COMMENT '用户名',
  `money_json` varchar(1024) NOT NULL DEFAULT '' COMMENT '费用相关',
  `real_amount` bigint(20) NOT NULL DEFAULT '0' COMMENT '用户支付',
  `pay_way` int(11) NOT NULL DEFAULT '0' COMMENT '支付方式',
  `book_type` int(11) NOT NULL DEFAULT '0' COMMENT '是否预定,0:非预定,1:预定',
  `estimate_get_time` datetime NOT NULL DEFAULT '1970-01-01 08:00:01' COMMENT '预计取件时间',
  `delivery_json` varchar(1024) NOT NULL DEFAULT '' COMMENT '配送各种信息',
  `good_json` varchar(1024) NOT NULL DEFAULT '' COMMENT '货物相关',
  `good_price` bigint(20) NOT NULL DEFAULT '0' COMMENT '货品价格',
  `order_remark` varchar(255) NOT NULL DEFAULT '' COMMENT '订单备注',
  `accepter_name` varchar(50) NOT NULL DEFAULT '' COMMENT '收件人姓名',
  `accepter_phone` varchar(50) NOT NULL DEFAULT '' COMMENT '收件人电话',
  `accepter_json` varchar(1024) NOT NULL DEFAULT '' COMMENT '收件人相关',
  `accepter_city` int(11) NOT NULL DEFAULT '0' COMMENT '收件人城市ID',
  `sender_name` varchar(50) NOT NULL DEFAULT '' COMMENT '寄件人姓名',
  `sender_phone` varchar(50) NOT NULL DEFAULT '' COMMENT '寄件人电话',
  `sender_json` varchar(1024) NOT NULL DEFAULT '' COMMENT '寄件人相关信息',
  `sender_city` int(11) NOT NULL DEFAULT '0' COMMENT '寄件人城市ID',
  `shipment_code` varchar(50) NOT NULL DEFAULT '' COMMENT '收货码',
  `package_id` int(11) NOT NULL DEFAULT '0' COMMENT '标品ID',
  `send_distance` int(11) NOT NULL DEFAULT '0' COMMENT '配送距离',
  `after_refund` int(11) NOT NULL DEFAULT '0' COMMENT '售后退单标志',
  `ext` varchar(1024) NOT NULL DEFAULT '' COMMENT '预留扩展字段',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更改时间',
  `pay_time` timestamp NULL DEFAULT '1970-01-01 08:00:01' COMMENT '订单支付成功时间',
  PRIMARY KEY (`id`),
  KEY `ix_order_id` (`order_id`),
  KEY `ix_store_id` (`store_id`),
  KEY `ix_settle_user_id` (`settle_user_id`),
  KEY `ix_user_id` (`user_id`),
  KEY `ix_sender_city` (`sender_city`),
  KEY `ix_package_id` (`package_id`),
  KEY `ix_accepter_phone` (`accepter_phone`),
  KEY `ix_sender_phone` (`sender_phone`),
  KEY `ix_created_at` (`created_at`),
  KEY `ix_updated_at` (`updated_at`),
  KEY `ix_drc_check_time` (`drc_check_time`)
) ENGINE=InnoDB AUTO_INCREMENT=1177 DEFAULT CHARSET=utf8 COMMENT='订单表 '