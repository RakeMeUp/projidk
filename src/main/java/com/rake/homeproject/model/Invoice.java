package com.rake.homeproject.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "invoice")
public class Invoice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	@JoinColumn(name = "buyer")
	private UserDTO buyer;

	@Column(name = "date_of_creation", nullable = false)
	private LocalDate dateOfCreation;

	@Column(name = "date_of_end", nullable = false)
	private LocalDate dateOfEnd;

	@Column(nullable = false)
	private String item;

	@Column(nullable = false)
	private String comment;

	@Column(nullable = false)
	private int price;

	// Constructors, getters, and setters
}
