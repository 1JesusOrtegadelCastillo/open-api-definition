package com.example.crudfeature.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@Getter
@Setter
public class Employee {

    private int id;
    private String name;
    private String lastName;
    private int age;

}
