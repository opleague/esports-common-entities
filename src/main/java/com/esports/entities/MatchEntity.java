package com.esports.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import com.esports.bean.MatchRequestBean;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "matches")
@Data
@NoArgsConstructor
public class MatchEntity extends ParentEntity  {
	
	private static final long serialVersionUID = 290810L;	
	
	private String name;
	private int matchNumber;
	private String matchMap;
	private Date startTime;
	private Date endTime;
	private Long tournamentId;
	private double credits;
	
	@OneToMany(mappedBy = "match",
        cascade = CascadeType.ALL,
        orphanRemoval = true)
	private Set<MatchTeamEntity> matchTeam = new HashSet<>();
	
	@OneToMany(mappedBy = "match",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true)
	private Set<MatchContestEntity> matchcontest = new HashSet<>();
	
	public MatchEntity(MatchRequestBean matchRequestBean) {
		this.name = matchRequestBean.getName();
		this.matchNumber =matchRequestBean.getMatchNumber();
		this.matchMap = matchRequestBean.getMatchMap();
		this.startTime = new Date(matchRequestBean.getStartTime());
		this.endTime = new Date(matchRequestBean.getEndTime());	
		this.tournamentId = matchRequestBean.getTournaments().get(0);
		this.credits = matchRequestBean.getTotalCredits();
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
