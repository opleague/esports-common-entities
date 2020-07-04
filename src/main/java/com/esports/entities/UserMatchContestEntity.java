package com.esports.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import lombok.Data;

@Entity(name = "user_match_contest")
@Data
public class UserMatchContestEntity extends ParentEntity{
	private long userId;
	private long matchContestId;
	private long userTeamId;
	@Column(columnDefinition = "varchar(20) not null default 'RECEIVED'")
	private String status;
	
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
