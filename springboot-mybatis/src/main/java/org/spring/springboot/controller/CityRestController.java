package org.spring.springboot.controller;

import org.spring.springboot.dao.OrdersCustomMapper;
import org.spring.springboot.domain.*;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by bysocket on 07/02/2017.
 */
@RestController
public class CityRestController {

    @Autowired
    private CityService cityService;

    @Autowired
    private OrdersCustomMapper ordersCustomMapper;

    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
    public City findOneCity(@RequestParam(value = "cityName", required = true) String cityName) {
            return cityService.findCityByName(cityName);
    }

    /*
    * 一对一查询 返回resultType
    * */
    @RequestMapping(value = "api/findOrder",method = RequestMethod.GET)
    public List<OrdersCustom> findOrdersUser() {
        return ordersCustomMapper.findOrdersUser();
    }

    /*
     * 一对一查询  返回resultMap
     * */
    @RequestMapping(value = "api/findOrderResultMap",method = RequestMethod.GET)
    public List<Orders> findOrdersUserResultMap() {
        return ordersCustomMapper.findOrderUserResultMap();
    }

    /*
    * 一对多查询 返回ResultMap
    * */
    @RequestMapping(value = "api/findOrdersAndOrderDetailResultMap",method = RequestMethod.GET)
    public List<OrderDetail> findOrdersAndOrderDetailResultMap() {
        return ordersCustomMapper.findOrdersAndOrderDetailResultMap();
    }

    /*
     * 多对多对多查询 返回ResultMap test
     * */
    @RequestMapping(value = "api/findUserAndItemsResultMap",method = RequestMethod.GET)
    public List<User> findUserAndItemsResultMap() {
        return ordersCustomMapper.findUserAndItemsResultMap();
    }

}
