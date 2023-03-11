package com.hu.entity;

import lombok.*;

@Data

@NoArgsConstructor
@AllArgsConstructor

public class User {
    int uid;
    String name;
    String sex;
    int age;
}
