package com.esports.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import com.esports.bean.EsportRequestBean;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "esport")
@Data
@NoArgsConstructor
public class EsportEntity extends ParentEntity  {
	
	private static final long serialVersionUID = 29081L;
	
	
	private String name;
	private String displayName;
	private String shortName;
	private String description;
	private String iconUrl;
	
	public EsportEntity(EsportRequestBean esportBean) {
		this.name = esportBean.getName();
		this.description= esportBean.getDescription();
		this.displayName =  esportBean.getDisplayName();
		this.shortName =  esportBean.getShortName();
		this.iconUrl =  esportBean.getIconUrl();
	}

	@PrePersist
    void beforeCreate() {
        this.createdAt = new Date();
        this.updatedAt = new Date();
    }

    @PreUpdate
    void beforeUpdate() {
    	this.updatedAt = new Date();
    }    
}
