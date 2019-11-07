package edu.jspiders.onetomanymapping.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="batches")
public class Batches
{
	@Id
	@Column(name="batch_code")
	private String batchCode;
	@Column(name="subject_name")
	private String subjectName;
	
	public Batches() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}

	public Batches(String batchCode, String subjectName) 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created using arg-constructor");
		
		this.batchCode = batchCode;
		this.subjectName = subjectName;
	}

	public String getBatchCode() {
		return batchCode;
	}

	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	@Override
	public String toString() {
		return "Batches [batchCode=" + batchCode + ", subjectName=" + subjectName + "]";
	}
}