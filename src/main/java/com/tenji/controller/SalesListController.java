package com.tenji.controller;
import com.tenji.entity.Employee;
import com.tenji.entity.Sales;
import com.tenji.service.EmployeeService;
import com.tenji.service.SalesListService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;

@Controller
public class SalesListController {

    @Autowired
    private SalesListService salesListService;

    @RequestMapping(path = "/input")
    public String findEmployeeByCd(@ModelAttribute Sales sales, Map<String, Object> model) {
        System.out.println("Start123...");

        Sales em = salesListService.findEmployeeByCd(sales.getusercd());

        ArrayList<String> output = new ArrayList<String>();
        output.add("usercd: " + em.getusercd());
        output.add("username: " + em.getusername());
        model.put("records", output);

        return "input";
    }

    @RequestMapping(path = "/salesList")
    public ModelAndView findEmployees(@ModelAttribute Sales sales ){
        System.out.println("Start123list...");

        List<Employee> emLst = salesListService.findEmployeeList(sales);
        ModelAndView mv=new ModelAndView();
        //model.addAttribute("records", emLst);
        mv.addObject("records",emLst);
        mv.setViewName("salesList.html");
        return mv;
    }
}
