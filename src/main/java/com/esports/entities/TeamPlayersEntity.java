package com.esports.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity(name = "team_players")
@Table(uniqueConstraints={
	    @UniqueConstraint(columnNames = {"playerId", "teamId"})
	})
public class TeamPlayersEntity extends ParentEntity{
	private static final long serialVersionUID = 29087L;
	private Long playerId;
	private Long teamId;	
}
