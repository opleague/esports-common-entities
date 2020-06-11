package com.esports.bean;

import java.util.List;

import com.esports.entities.MatchEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class MatchResponseBean extends ResponseBean {
	
	public MatchResponseBean(MatchEntity matchEntity) {
		super(matchEntity);
		this.id =  matchEntity.getId();
		this.name = matchEntity.getName();
	}
	private String name;
	private String iconUrl;
	private List<String> teamNames;
	private String tournamentName;
}
