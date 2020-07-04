package com.esports.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "match_user_rank")
@Data
@NoArgsConstructor
public class MatchUserRankEntity extends ParentEntity  {
	
	private static final long serialVersionUID = 29085L;	
	
	@Column(name = "user_team_id", nullable = false)
	private Long userTeamId;
	@Column(name = "user_id", nullable = false)
	private Long userId;
	@Column(name = "points", nullable = false)
	private Double points;
	@Column(name = "user_rank", nullable = false)
	private Integer rank;
	@Column(name = "match_contest_id", nullable = false)
	private Long matchContestId;
	@Column(name = "contest_id", nullable = false)
	private Long contestId;
	@Column(name = "prize_money", nullable = false)
	private Double prizeMoney;
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
