package com.tenji.controller;

import com.tenji.entity.Employee;
import com.tenji.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Controller
public class SalesListController {
    @RequestMapping(path = "/salesList")
    public String salesList(){
        return"salesList";
    }


}

