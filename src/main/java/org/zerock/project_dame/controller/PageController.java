package org.zerock.project_dame.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("mainContent", "/contents/main");
        return "layout";
    }

    @GetMapping("/testInfo")
    public String otherPage(Model model) {
        model.addAttribute("mainContent", "contents/testInfo");
        return "layout";
    }
}
