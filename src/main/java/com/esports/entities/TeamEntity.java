package com.esports.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import com.esports.bean.TeamRequestBean;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "team")
@Data
@NoArgsConstructor
public class TeamEntity extends ParentEntity  {
	
	private static final long serialVersionUID = 29086L;	
	
	private String name;
	private String displayName;
	private String shortName;
	private String imageUrl;
	private String description;	
	private long esportId;
	@OneToMany(mappedBy = "team",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true)
	private Set<MatchTeamEntity> matchTeam = new HashSet<>();
	public TeamEntity(TeamRequestBean teamBean) {
		this.name = teamBean.getName();
		this.displayName =  teamBean.getDisplayName();
		this.shortName = teamBean.getShortName();
		this.imageUrl = teamBean.getImageUrl();
		this.description =teamBean.getDescription();
		this.esportId = teamBean.getEsportId();
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
