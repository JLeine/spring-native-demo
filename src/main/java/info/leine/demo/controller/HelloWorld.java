package info.leine.demo.controller;

import info.leine.demo.record.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
  @RequestMapping(value = "/api/helloWorld/{foo}", produces = "application/json")
  public Person helloWorld(@PathVariable String foo){
    return new Person(foo);
  }
}
