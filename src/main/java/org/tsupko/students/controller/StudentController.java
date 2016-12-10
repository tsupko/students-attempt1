package org.tsupko.students.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Alexander Tsupko (tsupko.alexander@yandex.ru)
 *         Copyright (c) 2016. All rights reserved.
 */
@Controller
public class StudentController {
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
