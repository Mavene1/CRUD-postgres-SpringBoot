package com.example.backdemo.end.api;

import com.example.backdemo.end.model.Person;
import com.example.backdemo.end.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping ("api/v1/person")
@RestController
public class PersonController {
    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    private final PersonService personService;

    @PostMapping
    public void addPerson(@RequestBody Person person){
        personService.addPerson(person);
    }
}
