/**
 * @author: zhxue
 * @version: 1L
 * @since 2017-03-08
 */
package com.xzj.jpapro.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xzj.jpapro.dao.OrderDao;
import com.xzj.jpapro.entity.Order;


@Service("orderService")
public class OrderService extends BaseService<Order>{
	private static final Log logger = LogFactory.getLog(OrderService.class);

	@Autowired
	private OrderDao orderDao;
	
	public List<Order> findbyObj(Order order) throws IllegalArgumentException, IllegalAccessException{
		List<Order> orders = getListByObj(order);
		logger.info(orders);
		return orders;
	}
	
	public Order findbyId(long id){
		return orderDao.findById(id);
	}
}
