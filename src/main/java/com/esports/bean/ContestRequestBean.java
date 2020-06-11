package com.esports.bean;

import lombok.Data;

@Data
public class ContestRequestBean {
	private long id;
	private String name;
	private double winningAmount;
	private int spots; // spots
	private int NumberOfwinners;
	private double entryFee;
}
