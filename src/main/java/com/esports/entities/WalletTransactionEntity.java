package com.esports.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.hibernate.annotations.CollectionId;

import lombok.Data;

@Data
@Entity(name = "wallet_transaction")
public class WalletTransactionEntity extends ParentEntity  {
	
	@Column(columnDefinition = "varchar(20)" , nullable = false)
	private String source;
	
	@Column(columnDefinition = "varchar(10)" , nullable = false, name = "transaction_type")
	private String transactionType;
	
	@Column(nullable = false)
	private double amount;
	
	@Column(nullable = false)
	private Long userId;
	
	@Column(name = "transaction_id")
	private Long transactionId; 
	
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
