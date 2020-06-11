package com.esports.bean;

import java.util.Set;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class TeamRequestBean {
	private long id;
	@NotBlank
	private String name;
	private String displayName;
	private String shortName;
	@NotEmpty
	private Set<Long> players;
	@NotNull
	private Long esportId;
	private String description;
	private String imageUrl;

}
