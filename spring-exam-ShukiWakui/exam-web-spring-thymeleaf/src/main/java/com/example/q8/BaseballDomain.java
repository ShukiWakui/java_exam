package com.example.q8;

import java.util.Date;

public class BaseballDomain {
	private Integer id;
	private String name;
	private Date establishedDate;
	private String stadiumName;

	public BaseballDomain() {
	}

	public BaseballDomain(Integer id, String name, Date establishedDate, String stadiumName) {
		super();
		this.id = id;
		this.name = name;
		this.establishedDate = establishedDate;
		this.stadiumName = stadiumName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getEstablishedDate() {
		return establishedDate;
	}

	public void setEstablishedDate(Date establishedDate) {
		this.establishedDate = establishedDate;
	}

	public String getStadiumName() {
		return stadiumName;
	}

	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}

}
