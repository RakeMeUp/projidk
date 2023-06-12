package com.rake.homeproject.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@Table(name = "userDTO")
public class UserDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NonNull
	@Column(nullable = false)
	private String name;
	@NonNull
	@Column(nullable = false, unique = true)
	private String username;
	@NonNull
	@Column(nullable = false)
	private String password;

	@Column(name = "date_of_joining")
	private LocalDate dateOfJoining;

	@ManyToOne
	@JoinColumn(name = "role_name")
	private UserRole role;

}
