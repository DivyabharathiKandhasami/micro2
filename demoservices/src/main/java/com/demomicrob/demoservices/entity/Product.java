package com.demomicrob.demoservices.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pro1")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "proid")
	private Long id;
	
	@Column(name="pro-name")
	private String name;
	
	@Column(name="description")
	 private String description;
	
	@Column(name="quantity")
	 private double quantity;
	
	@Column(name="brand")
	 private String brand;


}
