package com.rake.homeproject.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "user_role")
public class UserRole {
	@Id
	@Column(name = "role_name")
	private String roleName;

	private String description;

	@OneToMany(mappedBy = "role")
	private List<UserDTO> users;

}
