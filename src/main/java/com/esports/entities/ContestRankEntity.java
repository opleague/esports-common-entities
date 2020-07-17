package com.esports.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "contest_rank")
@Data
@NoArgsConstructor
public class ContestRankEntity extends ParentEntity  {
	
	private static final long serialVersionUID = 29085L;	
	@OneToOne
	private ContestEntity contestEntity;
	private int ranks;
	private double prize;
	
	public ContestRankEntity(int rank, double prize) {
		this.ranks = rank;
		this.prize = prize;
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
