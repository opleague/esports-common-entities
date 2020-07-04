package com.esports.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import lombok.Data;
@Data

@Entity(name = "user_wallet")
public class WalletEntity extends ParentEntity {
	
	@Column(nullable = false,unique = true)
	private Long userId;
	
	@Column( name = "user_amount")
	private Double useramount;
	
	@Column(name = "bonus_amount")
	private Double bonusamount;
	@Column(name = "bonus_expiry")
	private Date bonusExpiry;
	
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
