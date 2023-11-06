package ru.alishev.springcourse.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//теперь до всех методов надо идти через указанный путь. Например /first/hello
//актуально и для использования пути до метода в коде, и для строки браузера. Теперь путь до страницы - http://localhost:8080/first/hello
@RequestMapping("/first")
public class firstController {
    @GetMapping("/hello")
    //аргумент HttpServletRequest, если мы его указали, будет внедрен спрингом автоматически. Он содержит параметры запроса от браузера (
    public String helloPage(HttpServletRequest resuest) {
        String name = resuest.getParameter("name");
        String surname = resuest.getParameter("surname");

        System.out.println("Hello " + name + " " + surname);
        return "first/hello";
    } //здесь first - это название папки, не путать с first в маппинге класса!

    @GetMapping("/goodbye")
    public String goodbyePage(@RequestParam(value = "name", required = false) String name,
                              @RequestParam(value = "surname", required = false) String surname) {

        System.out.println("Hello " + name + " " + surname);
        return "first/goodbye";
    }
}
