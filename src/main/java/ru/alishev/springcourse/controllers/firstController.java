package ru.alishev.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//теперь до всех методов надо идти через указанный путь. Например /first/hello
//актуально и для использования пути до метода в коде, и для строки браузера. Теперь путь до страницы - http://localhost:8080/first/hello
@RequestMapping("/first")
public class firstController {
    @GetMapping("/hello")
    public String helloPage() { return "first/hello"; } //здесь first - это навзание папки, не путать с first в маппинге класса!

    @GetMapping("/goodbye")
    public String goodbyePage() { return "first/goodbye"; }
}
