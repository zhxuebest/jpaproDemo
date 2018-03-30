/**
 * @author: zhxue
 * @version: 1.0
 * @since 2017-03-08
 */
package com.xzj.jpapro.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xzj.jpapro.entity.Order;

public interface OrderDao extends JpaRepository<Order, java.lang.Long> {

	Order findById(Long id);

}
