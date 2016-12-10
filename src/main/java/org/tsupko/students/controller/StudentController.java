package org.tsupko.students.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.tsupko.students.entity.Student;
import org.tsupko.students.service.DBService;

import java.util.List;

/**
 * @author Alexander Tsupko (tsupko.alexander@yandex.ru)
 *         Copyright (c) 2016. All rights reserved.
 */
@Controller
public class StudentController {
    private DBService dbService;

    @Autowired
    public void setDbService(DBService dbService) {
        this.dbService = dbService;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        List<Student> list = dbService.getAllStudents();
        model.addAttribute("list", list);
        return "list";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("add", new Student());
        return "add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@ModelAttribute(name = "add") Student student) {
        dbService.saveOrUpdate(student);
        return "redirect:/list";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model) {
        model.addAttribute("username", "Alex");
        return "login";
    }

    @RequestMapping("/welcome")
    public String getWelcomePage() {
        return "welcome";
    }

    @RequestMapping("/admin")
    public String getAdminPage() {
        return "admin";
    }
}
