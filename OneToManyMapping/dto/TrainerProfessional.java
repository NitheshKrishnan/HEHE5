package edu.jspiders.onetomanymapping.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="trainer_professional")
public class TrainerProfessional 
{
	@Id
	@Column(name="emp_id")
	private int empId;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="gender")
	private String gender;
	@Column(name="designation")
	private String designation;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="trainer_emp_id")
	private List<Batches> batches;
	
	public void addBatch(Batches batch)
	{
		if(batches == null)
			batches = new ArrayList<Batches>();
		
		batches.add(batch);
	}
	
	public TrainerProfessional() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}

	public TrainerProfessional(int empId, String firstName, String lastName, String gender, String designation) 
	{
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.designation = designation;
	}

	public List<Batches> getBatches() {
		return batches;
	}

	public void setBatches(List<Batches> batches) {
		this.batches = batches;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "TrainerProfessional [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", gender=" + gender + ", designation=" + designation;
	}
}
