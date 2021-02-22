package com.ivoronline.springboot_httprequest_requestbody_json_array.controllers;

import com.ivoronline.springboot_httprequest_requestbody_json_array.entities.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
public class MyController {

  @ResponseBody
  @RequestMapping("/AddPersons")
  public String addPersons(@RequestBody List<Person> persons) {

    //GET DATA FROM PersonDTO
    String result = "";
    for (Person person : persons) {
      String  name = person.name;
      Integer age  = person.age;
      result += name + " is " + age + " years old \n";
    }

    //RETURN SOMETHING
    return result;

  }

}
