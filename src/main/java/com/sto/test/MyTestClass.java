package com.sto.test;

import com.google.common.collect.Lists;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MyTestClass {

    public static void main(String[] args) {
        printTest();

    }

    private static void printTest() {
        System.out.println("my program is starting...................");
        System.out.println("i am test idea");
        Arrays.asList(12, 13, 15).stream().forEach(ele -> {
            System.out.println(ele);
        });
        if (CollectionUtils.isNotEmpty(Lists.newArrayList())) {
            System.out.println("test");
        }
    }

    private String username;


    private Integer age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
//    public static void main(String[] args) {
//        SpringApplication.run(MyTestClass.class, args);
//    }
}
