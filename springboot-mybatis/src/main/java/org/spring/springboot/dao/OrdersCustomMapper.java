package org.spring.springboot.dao;

import org.spring.springboot.domain.OrderDetail;
import org.spring.springboot.domain.Orders;
import org.spring.springboot.domain.OrdersCustom;
import org.spring.springboot.domain.User;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrdersCustomMapper {
    public List<OrdersCustom> findOrdersUser();

    public List<Orders> findOrderUserResultMap();

    public List<OrderDetail> findOrdersAndOrderDetailResultMap();

    public List<User> findUserAndItemsResultMap();
}
