package edu.jspiders.springhibernateproject.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_info")
public class Employee 
{
	@Id
	@Column(name="emp_id")
	private String empId;
	@Column(name="password")
	private String password;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="gender")
	private String gender;
	@Column(name="salary")
	private double salary;
	@Column(name="experience")
	private double experience;
	
	public Employee() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}

	public Employee(String empId, String password, String firstName, String lastName, String gender, double salary,
			double experience) 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
		this.empId = empId;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.salary = salary;
		this.experience = experience;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getExperience() {
		return experience;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", password=" + password + ", firstName=" + firstName + ", lastName="
				+ lastName + ", gender=" + gender + ", salary=" + salary + ", experience=" + experience + "]";
	}
}