package com.expenseTracker.service;

import java.util.List;

import com.expenseTracker.model.Expense;

public interface ExpenseTrackerService {

	List<Expense> findAll();
	
	List<Expense> findByItem(String item);
	void deleteExpense(Long id);
	
	void save(Expense expense);
	
}
