package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dto.OrderDetail;
import com.shop.frame.MyService;
import com.shop.mapper.OrderDetailMapper;

@Service
public class OrderDetailService implements MyService<Integer, OrderDetail>{
	@Autowired
	OrderDetailMapper mapper;

	@Override
	public void register(OrderDetail v) throws Exception {
		mapper.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(OrderDetail v) throws Exception {
		mapper.update(v);
		
	}

	@Override
	public OrderDetail get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<OrderDetail> get() throws Exception {
		return mapper.selectall();
	}
	
}
