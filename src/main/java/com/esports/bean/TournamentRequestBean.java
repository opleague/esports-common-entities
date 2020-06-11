package com.esports.bean;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TournamentRequestBean {
	private long id;
	@NotBlank(message = "name is required")
	private String name;
	private String displayName;
	private String shortName;
	private String description;
	private String iconUrl;
	@NotNull
	private Long esportId;
	private Long startTime;
	private Long endTime;
}
