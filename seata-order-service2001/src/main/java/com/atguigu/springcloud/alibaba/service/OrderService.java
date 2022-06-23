
package com.atguigu.springcloud.alibaba.service;

import com.atguigu.springcloud.alibaba.domain.Order;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @auther lzm
 * @create 2022
 */
public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);
}


