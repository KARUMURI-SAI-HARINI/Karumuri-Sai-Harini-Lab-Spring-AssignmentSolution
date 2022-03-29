package com.greatLearning.studentManagement.entity;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;


@Entity
@Table(name="users")
@Data
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Long id;
	@Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(
			name="user_roles",
			joinColumns = @JoinColumn(name = "user_id"),
			inverseJoinColumns = @JoinColumn(name = "role_id")
			)
	
	private List<Role> role = new ArrayList<>();

	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<org.apache.catalina.Role> getRoles() {
		// TODO Auto-generated method stub
		return null;
	}

	

	

}
