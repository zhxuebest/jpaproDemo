/**
 * @author: zhxue
 * @version: 1.0
 * @since 2017-03-07
 */

package com.xzj.jpapro.web;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xzj.jpapro.entity.Order;
import com.xzj.jpapro.service.OrderService;

@Controller
@RequestMapping("/order")

public class OrderController {

	private final Log logger = LogFactory.getLog(this.getClass());

	@Resource(name = "orderService")
	private OrderService orderService;
	
	@RequestMapping(value = "/getOrders", method = RequestMethod.POST, headers="Accept=application/json")
	public @ResponseBody List<Order> getOrders(@RequestBody Order order) throws IllegalArgumentException, IllegalAccessException {		

		return orderService.findbyObj(order);
	}
	
	@RequestMapping(value = "/getByid", method = RequestMethod.GET)
	public @ResponseBody Order getByid(@RequestParam(value="id") Long id) throws IllegalArgumentException, IllegalAccessException {		

		return orderService.findbyId(id);
	}
}
