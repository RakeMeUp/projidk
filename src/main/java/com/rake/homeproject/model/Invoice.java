package com.rake.homeproject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Invoice {
	@Id
	@GeneratedValue
	private int id;
	private LocalDate dateOfCreation;
	private LocalDate dateOfEnd;
	private String item;
	private String comment;
	private int price;

    @ManyToOne
    @JoinColumn(name = "buyer")
    private User buyer;
}