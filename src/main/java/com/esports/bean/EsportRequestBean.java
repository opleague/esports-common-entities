package com.esports.bean;

import lombok.Data;

@Data
public class EsportRequestBean {
	private long id;
	private String name;
	private String displayName;
	private String shortName;
	private String description;
	private String iconUrl;
}
