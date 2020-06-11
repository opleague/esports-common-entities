package com.esports.bean;

import com.esports.entities.EsportEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class EsportResponseBean extends ResponseBean {
	
	public EsportResponseBean(EsportEntity esportEntity) {
		super(esportEntity);
		this.id =  esportEntity.getId();
		this.name = esportEntity.getName();
		this.description = esportEntity.getDescription();
		this.shortName = esportEntity.getShortName();
		this.displayName =  esportEntity.getDisplayName();
		this.iconUrl = esportEntity.getIconUrl();
	}
	private String name;
	private String displayName;
	private String shortName;
	private String description;
	private String iconUrl;
}
