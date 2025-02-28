package com.nt.Model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class MyExpenses {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int expnId11;
	private Date expnDate;
	private String expnCategory;
	private float expnAmt;
	private String expnDesc;
	

}
