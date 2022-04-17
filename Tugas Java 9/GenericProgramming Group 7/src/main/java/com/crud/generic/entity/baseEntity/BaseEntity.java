package com.crud.generic.entity.baseEntity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int no;
	
	private String id;
	
	private String studentName;	
	
	private String gender;
	

	public BaseEntity() {
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getstudentName() {
		return studentName;
	}

	public void setstudentName(String StudentName) {
		this.studentName = StudentName;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String Gender) {
		this.gender = Gender;
	}

}
