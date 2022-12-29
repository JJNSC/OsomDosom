package com.shop.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Item {
	private int item_no;
	private int cate_no;
	private String name;
	private int price;
	private String desc;
	private Date item_rdate;
}
