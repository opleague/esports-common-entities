package com.esports.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import lombok.Data;

@Entity(name = "user_team")
@Data
public class UserTeamEntity extends ParentEntity{
	private long userId;
	private String name;
	
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
