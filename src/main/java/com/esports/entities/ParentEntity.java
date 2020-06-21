package com.esports.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import lombok.Data;

@Data
@MappedSuperclass
public class ParentEntity implements Serializable{
	
	static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	
	@Column(nullable = false)
	protected Date createdAt;

	@Column(nullable = false)
	protected Date updatedAt;
	
	protected String createdBy;
	
	protected String updatedBy;
	
	protected boolean active=true;
	
	@Version
    private Integer version;
}
