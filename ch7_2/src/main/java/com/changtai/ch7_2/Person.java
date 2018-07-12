package com.changtai.ch7_2;

/**
 * @Auther: zhaoct
 * @Date: 2018-07-12 20:20
 * @Description:
 */
public class Person {

    private String name;

    private Integer age;

    public Person(){

    }

    public Person(String name, Integer age){
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
