package org.zerock.project_dame.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class MainController {

    @GetMapping("/question")
    public String question(Model model) {
        return "main/question"; // Thymeleaf를 사용하여 resources/templates/main/question.html을 렌더링
    }
}
