package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.nt.IManagerRepo.IManageExpense;
import com.nt.Model.MyExpenses;

@org.springframework.stereotype.Service
public class Service {
	@Autowired
	private IManageExpense expenseRepo;
	public String saveExpense(MyExpenses exp) {
		
		int result=expenseRepo.save(exp).getExpnId();
		
		return result+" is saved ";
	}

}
