package com.wheresmymoney.controller;

import com.wheresmymoney.model.Expense;
import com.wheresmymoney.model.enuns.TypeExpense;
import com.wheresmymoney.repository.ExpenseRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import static java.util.Arrays.asList;

@Controller
@RequestMapping("/wheresmymoney")
public class ExpenseController {

    @Autowired
    private ExpenseRespository respository;

    @RequestMapping("/novo")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("CadastrarDespesa");
        return mv;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView register(Expense expense){
        respository.save(expense);
        ModelAndView mv = new ModelAndView("CadastrarDespesa");
        mv.addObject("msg","Despesa cadastrada ;.)");
        return mv;
    }

    @ModelAttribute("typeAvaliable")
    public List typeAvaliable(){
        return asList(TypeExpense.values());
    }

}
