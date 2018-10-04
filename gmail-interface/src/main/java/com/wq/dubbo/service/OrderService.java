package com.wq.dubbo.service;

import java.util.List;

import com.wq.dubbo.bean.UserAddress;

public interface OrderService {
	
	/**
	 * 初始化订单
	 * @param userId
	 */
	public List<UserAddress> initOrder(String userId);

}
