package com.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Ship {
	private int ship_no;
	private int cust_no;
	private String ship_name;
	private String ship_addr;
	private String ship_tel;
}
