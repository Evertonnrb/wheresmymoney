package com.wheresmymoney.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/wheresmymoney")
public class ExpenseController {

    @RequestMapping("/novo")
    public ModelAndView register(){
        ModelAndView mv = new ModelAndView("CadastrarDespesa");
        return mv;
    }

}
