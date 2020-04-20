package com.expenseTracker.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expenseTracker.model.Expense;
import com.expenseTracker.repository.ExpenseRepository;
import com.expenseTracker.service.ExpenseTrackerService;

@Service
public class ExpenseTrackerServiceImpl implements ExpenseTrackerService {

	@Autowired
	ExpenseRepository expenseRepository;
	@Override
	public List<Expense> findAll() {
		// TODO Auto-generated method stub
		return (List<Expense>) expenseRepository.findAll();
	}

	@Override
	public List<Expense> findByItem(String item) {
		// TODO Auto-generated method stub
		return expenseRepository.findByItem(item);
	}

	@Override
	public void deleteExpense(Long id) {
		// TODO Auto-generated method stub
		expenseRepository.deleteById(id);
	}

	@Override
	public void save(Expense expense) {
		// TODO Auto-generated method stub
		expenseRepository.save(expense);
		
	}

}
