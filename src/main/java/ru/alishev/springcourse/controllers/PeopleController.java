package ru.alishev.springcourse.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.alishev.springcourse.dao.PersonDAO;

@Controller
@RequestMapping("/people")
public class PeopleController {
    //хотел передавать @Autowired непосредственно в атрибут, но СР порекомендовала так, @Autowired ниже можно даже удалить (хз почему так?)
//    private final PersonDAO personDAO;
//
//    @Autowired
//    public PeopleController(PersonDAO personDAO) {
//        this.personDAO = personDAO;
//    }

    @GetMapping("")
    public String index(Model model) {
//        //Получим всех людей из DAO и передадим на отображение в представление
//        model.addAttribute("people", personDAO.index());
        return "people/index";
//        return null;
    }

//    @GetMapping("/{id}")
//    public String show(@PathVariable("id") int id, Model model) {
////        return null;
////        //Получим одного человека по id из DAO и передадим на отображение в представление
//        model.addAttribute("person", personDAO.show(id));
//        return "people/show";
//    }

}
