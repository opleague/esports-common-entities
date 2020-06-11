package com.esports.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity(name="team_match")
public class MatchTeamEntity extends ParentEntity{

	private static final long serialVersionUID = 29088L;
	@ManyToOne(fetch = FetchType.LAZY)
	private MatchEntity match;
	@ManyToOne(fetch = FetchType.LAZY)
	private TeamEntity team;
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MatchTeamEntity )) return false;
        return id != null && id.equals(((MatchTeamEntity) o).getId());
    }
 
    @Override
    public int hashCode() {
        return 31 ;
    }
}
