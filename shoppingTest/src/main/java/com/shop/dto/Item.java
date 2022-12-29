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
public class Item{
	private int item_no;
	private int cate_no;
	private String  item_name;
	private int item_price ;
	private String item_explain;
	private Date item_rdate;
	
	public Item(int item_no, int cate_no, String  item_name, int item_price ) {
		super();
		this.item_no = item_no;
		this.cate_no = cate_no;
		this. item_name =  item_name;
		this.item_price  = item_price;
	}
		
}
