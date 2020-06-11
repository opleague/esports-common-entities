package com.esports.bean;

import com.esports.entities.TeamEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class TeamResponseBean extends ResponseBean {
	
	public TeamResponseBean(TeamEntity teamEntity) {
		super(teamEntity);
		this.id =  teamEntity.getId();
		this.name = teamEntity.getName();
		this.displayName =  teamEntity.getDisplayName();
		this.shortName = teamEntity.getShortName();
		this.esportId = teamEntity.getEsportId();
		this.description = teamEntity.getDescription();
		this.imageUrl = teamEntity.getImageUrl();
	}
	private long id;
	private String name;
	private String displayName;
	private String shortName;
	private Long esportId;
	private String esportName;
	private String description;
	private String imageUrl;
}
