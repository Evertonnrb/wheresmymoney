package com.wheresmymoney.model;

import com.wheresmymoney.model.enuns.TypeExpense;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
public class Expense extends GenericId {
    @Column(length = 128)
    private String description;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    private Date dateExpense;

    @NumberFormat(pattern = "#,##0.00")
    private BigDecimal amount;

    @NumberFormat(pattern = "#,##0.00")
    private BigDecimal tax;

    private TypeExpense typeExpense;
}
