package com.esports.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import com.esports.bean.PlayerRequestBean;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "player")
@Data
@NoArgsConstructor
public class PlayerEntity extends ParentEntity{
	private static final long serialVersionUID = 29083L;
	private String name;
	private String displayName;
	private String imageUrl;
	private double credits;
	
	@OneToOne
	private RolesEntity playerRolesEntity;
	
	public PlayerEntity(PlayerRequestBean playerRequestBean) {
		this.name = playerRequestBean.getName();
		this.displayName = playerRequestBean.getDisplayName();
		this.imageUrl = playerRequestBean.getIconUrl();
		this.credits = playerRequestBean.getCredits();
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
