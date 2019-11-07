package edu.jspiders.manytoonemapping.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="feedback")
public class Feedbacks 
{
	@Id
	@Column(name="feedback_id")
	private int feedbackId;
	@Column(name="feedback")
	private String feedback;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="batches_batch_code")
	private Batches batch;
	
	public Feedbacks() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}

	public Feedbacks(int feedbackId, String feedback)
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created using arg-constructor");
		
		this.feedbackId = feedbackId;
		this.feedback = feedback;
	}
	
	public Batches getBatch() {
		return batch;
	}

	public void setBatch(Batches batch) {
		this.batch = batch;
	}

	public int getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	@Override
	public String toString() {
		return "Feedbacks [feedbackId=" + feedbackId + ", feedback=" + feedback + "]";
	}
}