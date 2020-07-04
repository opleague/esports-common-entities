package com.esports.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import lombok.Data;

@Entity(name = "user_team_player")
@Data
public class UserTeamPlayersEntity extends ParentEntity{
	private long playerId;
	private long userTeamId;
	private long teamId;
	@Column(nullable = false)
	private boolean leader;
	
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
