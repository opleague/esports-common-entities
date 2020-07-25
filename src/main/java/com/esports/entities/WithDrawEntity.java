package com.esports.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import lombok.Data;

@Data
@Entity(name = "user_withdrawl_request")
public class WithDrawEntity extends ParentEntity{
		private double amount;
		private Long userId;
		private String requestType = "WD";// withdrawl
		private String status;
		private String txn_id;
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
