package com.shop.dto;
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
public class Order {
	private int order_no;
	private int cust_no;
	private String payment;
	private int totalprice;
	private String arder_date; 
	
}
