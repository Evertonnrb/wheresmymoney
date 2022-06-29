package com.wheresmymoney.repository;

import com.wheresmymoney.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRespository extends JpaRepository<Expense, Integer> {
}
