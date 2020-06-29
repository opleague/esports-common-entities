package com.esports.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import lombok.Data;

@Data
@Entity(name = "match_stats")
public class MatchStatsEntity extends ParentEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6247277860395921590L;
	@Column(nullable = false, name = "match_id")
	private Long matchId;
	@Column(nullable = false, name = "team_id")
	private Long teamId;
	@Column(nullable = false, name = "player_id")
	private Long playerId;
	@Column(nullable = false)
	private int count;
	@Column(nullable = false)
	private double points;
	@Column(nullable = false, name = "attack_Type_id")
	private int typeId;
	
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
