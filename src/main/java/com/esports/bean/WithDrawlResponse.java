package com.esports.bean;

import lombok.Data;

@Data
public class WithDrawlResponse extends ResponseBean{
	private Long userId;
	private double amount;
	private String status;
	private String requestType;
}
