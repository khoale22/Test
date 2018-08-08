package com.model;
// Generated Aug 7, 2018 10:17:20 PM by Hibernate Tools 5.1.8.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Result generated by hbm2java
 */
@Entity
@Table(name = "result", catalog = "trainningcrud")
public class Result implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ResultId id;
	private Subject subject;
	private User user;
	private double result;

	public Result() {
	}

	public Result(ResultId id, Subject subject, User user, double result) {
		this.id = id;
		this.subject = subject;
		this.user = user;
		this.result = result;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "userId", column = @Column(name = "user_id", nullable = false, length = 45)),
			@AttributeOverride(name = "subjectId", column = @Column(name = "subject_id", nullable = false, length = 45)) })
	public ResultId getId() {
		return this.id;
	}

	public void setId(ResultId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_id", nullable = false, insertable = false, updatable = false)
	public Subject getSubject() {
		return this.subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false, insertable = false, updatable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "result", nullable = false, precision = 22, scale = 0)
	public double getResult() {
		return this.result;
	}

	public void setResult(double result) {
		this.result = result;
	}

}