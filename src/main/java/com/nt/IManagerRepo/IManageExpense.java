package com.nt.IManagerRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.Model.MyExpenses;

public interface IManageExpense extends JpaRepository<MyExpenses, Integer> {
	
	

}
