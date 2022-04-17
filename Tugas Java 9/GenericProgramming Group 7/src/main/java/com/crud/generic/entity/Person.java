package com.crud.generic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.crud.generic.entity.baseEntity.BaseEntity;

@Entity
@Table(name = "person")
public class Person extends BaseEntity{
	
	@Column(name = "major", nullable = false, length = 200)
	private String major;
	
	

	public Person() {
		super();		
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

}
