package com.esports.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import com.esports.bean.ContestRequestBean;
import com.esports.bean.MatchRequestBean;

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
