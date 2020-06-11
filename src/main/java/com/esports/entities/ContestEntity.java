package com.esports.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import com.esports.bean.ContestRequestBean;
import com.esports.bean.MatchRequestBean;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "contest")
@Data
@NoArgsConstructor
public class ContestEntity extends ParentEntity  {
	
	private static final long serialVersionUID = 29085L;	
	
	private String name;
	private double winningAmount;
	private int spots;
	private int NumberOfWinners;
	private double entryFee;
	
	@OneToMany(mappedBy = "contest",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true)
	private Set<MatchContestEntity> matchcontest = new HashSet<>();
	
	public ContestEntity(ContestRequestBean contestBean) {
		this.name = contestBean.getName();
		this.winningAmount = contestBean.getWinningAmount();
		this.spots = contestBean.getSpots();
		this.NumberOfWinners = contestBean.getNumberOfwinners();	
		this.entryFee = contestBean.getEntryFee();
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
