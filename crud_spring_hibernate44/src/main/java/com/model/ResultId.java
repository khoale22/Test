package com.model;
// Generated Aug 7, 2018 10:17:20 PM by Hibernate Tools 5.1.8.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ResultId generated by hbm2java
 */
@Embeddable
public class ResultId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7649959360178962941L;
	private String userId;
	private String subjectId;

	public ResultId() {
	}

	public ResultId(String userId, String subjectId) {
		this.userId = userId;
		this.subjectId = subjectId;
	}

	@Column(name = "user_id", nullable = false, length = 45)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "subject_id", nullable = false, length = 45)
	public String getSubjectId() {
		return this.subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ResultId))
			return false;
		ResultId castOther = (ResultId) other;

		return ((this.getUserId() == castOther.getUserId()) || (this.getUserId() != null
				&& castOther.getUserId() != null && this.getUserId().equals(castOther.getUserId())))
				&& ((this.getSubjectId() == castOther.getSubjectId()) || (this.getSubjectId() != null
						&& castOther.getSubjectId() != null && this.getSubjectId().equals(castOther.getSubjectId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getUserId() == null ? 0 : this.getUserId().hashCode());
		result = 37 * result + (getSubjectId() == null ? 0 : this.getSubjectId().hashCode());
		return result;
	}

}