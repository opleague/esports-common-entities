package com.esports.bean;

import com.esports.entities.ContestEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class ContestResponseBean extends ResponseBean {
	
	public ContestResponseBean(ContestEntity contestEntity) {
		super(contestEntity);
		this.id =  contestEntity.getId();
		this.name = contestEntity.getName();
		this.winningAmount = contestEntity.getWinningAmount();
		this.spots = contestEntity.getSpots();
		this.NumberOfwinners = contestEntity.getNumberOfWinners();
		this.entryFee =  contestEntity.getEntryFee();
	}
	private String name;
	private double winningAmount;
	private int spots;
	private int NumberOfwinners;
	private double entryFee;
}
