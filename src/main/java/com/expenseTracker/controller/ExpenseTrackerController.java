package com.expenseTracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.expenseTracker.model.Expense;
import com.expenseTracker.service.ExpenseTrackerService;



@Controller
@RequestMapping("/expense")
public class ExpenseTrackerController {
	
	@Autowired
	private ExpenseTrackerService service;
	
	@PostMapping(path = "/add")
	public ResponseEntity<?> addExpense(@RequestParam String item, @RequestParam String description, @RequestParam float amount) {
		Expense e = new Expense(item, amount, description);
		
		service.save(e);
		return new ResponseEntity("Expense has been saved successfully", HttpStatus.OK);
	}

	@GetMapping(path = "/all")
	public ResponseEntity<?> getAll() {
		// This returns a JSON or XML with the users
		List<Expense> list =  service.findAll();
		
		return new ResponseEntity(list, HttpStatus.OK);
	}

//	@DeleteMapping
//	public void deleteExpense(@RequestParam("id") String id) {
//		service.deleteExpense(id);
//	}
}
