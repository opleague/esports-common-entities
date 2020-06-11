package com.esports.bean;

import java.util.List;
import lombok.Data;

@Data
public class MatchRequestBean {
	private long id;

	private String name;
	private int matchNumber;
	private String matchMap;
	private long startTime;
	private long endTime;
	private String displayName;
	private String shortName;
	private List<Long> teams;
	private List<Long> contests;
	private List<Long> tournaments;
	private double totalCredits;
	private int days;
	private int weeks;
}
