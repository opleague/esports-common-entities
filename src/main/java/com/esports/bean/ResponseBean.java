package com.esports.bean;

import java.util.Date;

import com.esports.entities.ContestEntity;
import com.esports.entities.EsportEntity;
import com.esports.entities.MatchEntity;
import com.esports.entities.PlayerEntity;
import com.esports.entities.TeamEntity;
import com.esports.entities.TournamentEntity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResponseBean {
	
	protected long id;
	protected Date createdAt;
	protected Date updatedAt;
	protected String createdBy;
	protected String updatedBy;
	protected boolean active;
	public ResponseBean(EsportEntity esportEntity) {
		this.createdAt = esportEntity.getCreatedAt();
		this.updatedAt = esportEntity.getUpdatedAt();
		this.createdBy = esportEntity.getCreatedBy();
		this.updatedBy = esportEntity.getUpdatedBy();
		this.active = esportEntity.isActive();	
	}
	public ResponseBean(TournamentEntity tournamentEntity) {
		this.createdAt = tournamentEntity.getCreatedAt();
		this.updatedAt = tournamentEntity.getUpdatedAt();
		this.createdBy = tournamentEntity.getCreatedBy();
		this.updatedBy = tournamentEntity.getUpdatedBy();
		this.active = tournamentEntity.isActive();
	}
	public ResponseBean(PlayerEntity playerEntity) {
		this.createdAt = playerEntity.getCreatedAt();
		this.updatedAt = playerEntity.getUpdatedAt();
		this.createdBy = playerEntity.getCreatedBy();
		this.updatedBy = playerEntity.getUpdatedBy();
		this.active = playerEntity.isActive();
	}
	public ResponseBean(MatchEntity matchEntity) {
		this.createdAt = matchEntity.getCreatedAt();
		this.updatedAt = matchEntity.getUpdatedAt();
		this.createdBy = matchEntity.getCreatedBy();
		this.updatedBy = matchEntity.getUpdatedBy();
		this.active = matchEntity.isActive();
	}
	public ResponseBean(ContestEntity contestEntity) {
		this.createdAt = contestEntity.getCreatedAt();
		this.updatedAt = contestEntity.getUpdatedAt();
		this.createdBy = contestEntity.getCreatedBy();
		this.updatedBy = contestEntity.getUpdatedBy();
		this.active = contestEntity.isActive();
	}
	public ResponseBean(TeamEntity teamEntity) {
		this.createdAt = teamEntity.getCreatedAt();
		this.updatedAt = teamEntity.getUpdatedAt();
		this.createdBy = teamEntity.getCreatedBy();
		this.updatedBy = teamEntity.getUpdatedBy();
		this.active = teamEntity.isActive();
	}
}
