package com.esports.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import com.esports.bean.ContestRequestBean;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "player_roles")
@Data
@NoArgsConstructor
public class RolesEntity extends ParentEntity  {
	
	private static final long serialVersionUID = 29085L;	
	
	private String name;
	
	public RolesEntity(ContestRequestBean contestBean) {
		this.name = contestBean.getName();
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
