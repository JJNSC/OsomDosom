package com.shop.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shop.dto.Cart;
import com.shop.frame.MyService;
import com.shop.mapper.CartMapper;

@Repository
@Mapper
public class CartService implements MyService<Integer, Cart>{
	
	@Autowired
	CartMapper mapper;

	@Override
	public void register(Cart v) throws Exception {
		// TODO Auto-generated method stub
		mapper.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		// TODO Auto-generated method stub
		mapper.delete(k);
	}

	@Override
	public void modify(Cart v) throws Exception {
		// TODO Auto-generated method stub
		mapper.update(v);
	}

	@Override
	public Cart get(Integer k) throws Exception {
		// TODO Auto-generated method stub
		return mapper.select(k);
	}

	@Override
	public List<Cart> get() throws Exception {
		// TODO Auto-generated method stub
		return mapper.selectall();
	}
	
	

	
}	
	
