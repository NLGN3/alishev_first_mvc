package ru.alishev.springcourse.dao;

import org.springframework.stereotype.Component;
import ru.alishev.springcourse.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> people;

     {
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_COUNT, "Tom"));
        people.add(new Person(++PEOPLE_COUNT, "Bob"));
        people.add(new Person(++PEOPLE_COUNT, "Mike"));
        people.add(new Person(++PEOPLE_COUNT, "Katy"));
    }

    public List<Person> index() {
         return people;
    }

    public Person show(int id) {
//         for (int i = 0; i < people.size(); i++) {
//             if (people.get(i).getId() == id) {
//                 return people.get(i);
//             }
//         };

         return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }
}
