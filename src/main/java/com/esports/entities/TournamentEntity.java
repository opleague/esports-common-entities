package com.esports.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import com.esports.bean.TournamentRequestBean;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "tournament")
@Data
@NoArgsConstructor
public class TournamentEntity extends ParentEntity  {
	
	private static final long serialVersionUID = 29081L;
	
	
	private String name;
	private String displayName;
	private String shortName;
	private String description;
	private String iconUrl;
	private long esportId;
	private Date startTime;
	private Date endTime;
	public TournamentEntity(TournamentRequestBean tournamentRequestBean) {
		this.name = tournamentRequestBean.getName();
		this.description= tournamentRequestBean.getDescription();
		this.displayName =  tournamentRequestBean.getDisplayName();
		this.shortName =  tournamentRequestBean.getShortName();
		this.iconUrl =  tournamentRequestBean.getIconUrl();
		this.esportId = tournamentRequestBean.getEsportId();
		this.startTime = new Date(tournamentRequestBean.getStartTime());
		this.endTime = new Date(tournamentRequestBean.getEndTime());
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
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TournamentEntity )) return false;
        return id != null && id.equals(((TournamentEntity) o).getId());
    }
 
    @Override
    public int hashCode() {
        return 31+this.id.intValue();
    }
}
