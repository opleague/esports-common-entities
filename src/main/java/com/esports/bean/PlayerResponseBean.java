package com.esports.bean;

import com.esports.entities.PlayerEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class PlayerResponseBean extends ResponseBean {
	
	public PlayerResponseBean(PlayerEntity playerEntity) {
		super(playerEntity);
		this.id =  playerEntity.getId();
		this.name = playerEntity.getName();
		this.displayName =  playerEntity.getDisplayName();
		this.iconUrl = playerEntity.getImageUrl();
		this.credits = playerEntity.getCredits();
	}
	private String name;
	private String displayName;
	private String iconUrl;
	private double credits;
	private String roleName;
}
