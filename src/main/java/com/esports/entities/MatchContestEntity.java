package com.esports.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity(name="match_contest")
public class MatchContestEntity extends ParentEntity{

	private static final long serialVersionUID = 29088L;
	@ManyToOne(fetch = FetchType.LAZY)
	private MatchEntity match;
	@ManyToOne(fetch = FetchType.LAZY)
	private ContestEntity contest;
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MatchContestEntity )) return false;
        return id != null && id.equals(((MatchContestEntity) o).getId());
    }
 
    @Override
    public int hashCode() {
        return 31 ;
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