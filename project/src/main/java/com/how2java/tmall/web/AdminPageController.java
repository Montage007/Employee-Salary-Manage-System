package com.how2java.tmall.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminPageController {
    @GetMapping(value = "/admin")
    public String admin(){
        return "redirect:admin_department_list";
    }
    @GetMapping(value = "/admin_department_list")
    public String listDepartment(){
        return "admin/listDepartment";
    }
}