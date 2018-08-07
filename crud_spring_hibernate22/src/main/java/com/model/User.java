package com.model;
// Generated Aug 7, 2018 10:17:20 PM by Hibernate Tools 5.1.8.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", catalog = "trainningcrud")
public class User implements java.io.Serializable {

	private String userId;
	private Role role;
	private String userName;
	private String userTelephone;
	private String userAddress;
	private String userPass;
	private Set<Result> results = new HashSet<Result>(0);

	public User() {
	}

	public User(String userId, Role role, String userName, String userTelephone, String userAddress, String userPass) {
		this.userId = userId;
		this.role = role;
		this.userName = userName;
		this.userTelephone = userTelephone;
		this.userAddress = userAddress;
		this.userPass = userPass;
	}

	public User(String userId, Role role, String userName, String userTelephone, String userAddress, String userPass,
			Set<Result> results) {
		this.userId = userId;
		this.role = role;
		this.userName = userName;
		this.userTelephone = userTelephone;
		this.userAddress = userAddress;
		this.userPass = userPass;
		this.results = results;
	}

	@Id

	@Column(name = "user_id", unique = true, nullable = false, length = 50)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "role_id", nullable = false)
	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Column(name = "user_name", nullable = false, length = 45)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "user_telephone", nullable = false, length = 45)
	public String getUserTelephone() {
		return this.userTelephone;
	}

	public void setUserTelephone(String userTelephone) {
		this.userTelephone = userTelephone;
	}

	@Column(name = "user_address", nullable = false, length = 45)
	public String getUserAddress() {
		return this.userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	@Column(name = "user_pass", nullable = false, length = 45)
	public String getUserPass() {
		return this.userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Result> getResults() {
		return this.results;
	}

	public void setResults(Set<Result> results) {
		this.results = results;
	}

}
