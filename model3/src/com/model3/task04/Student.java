package com.model3.task04;

import java.util.Scanner;

/**
 * 其中学生的信息有：学号、姓名、年龄。
 */
public class Student {
    Integer number;

    String name;

    int age;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(Integer number, String name, int age) {
        this.number = number;
        this.name = name;
        this.age = age;
    }

    public Student() {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学生的姓名");
        this.name=sc.nextLine();
        System.out.println("请输入学生的年龄");
        this.age=sc.nextInt();
        System.out.println("请输入学生的学号");
        this.number=sc.nextInt();
    }

    public Student(Integer number) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学生的姓名");
        this.name=sc.nextLine();
        System.out.println("请输入学生的年龄");
        this.age=sc.nextInt();
        this.number=number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }



}
