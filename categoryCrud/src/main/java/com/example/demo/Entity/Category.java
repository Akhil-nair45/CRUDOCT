package com.example.demo.Entity;

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
@Table(name = "Category_Table")
public class Category {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private String categoryName;
	private String categoryDesc;
	private long productId;
	
}
