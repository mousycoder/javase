package com.mousycoder.test6;

import java.util.*;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/24 9:13 PM
 */
public class Test9 {

    public static void main(String[] args) {
//
//        Set<Student> studentSet = new TreeSet<>();
//
//        studentSet.add(new Student("jack", 32));
//        studentSet.add(new Student("tom", 22));
//        studentSet.add(new Student("mary", 35));
//        studentSet.add(new Student("tim", 11));
//        studentSet.add(new Student("tony", 49));
//        studentSet.add(new Student("dd", 30));


        List<Student> studentSet = new ArrayList<>();

        studentSet.add(new Student("jack", 32));
        studentSet.add(new Student("tom", 22));
        studentSet.add(new Student("mary", 35));
        studentSet.add(new Student("tim", 11));
        studentSet.add(new Student("tony", 49));
        studentSet.add(new Student("dd", 30));

        Collections.sort(studentSet);

        System.out.println(studentSet);

    }
}

class Student  implements Comparable{
    private int age;

    private String name;

    public void setAge(int age) {
        this.age = age;

    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +

                "age=" + age +

                ", name='" + name + '\'' +

                '}';

    }

    @Override
    public int compareTo(Object o) {

        if (o instanceof Student) {
            Student student = (Student) o;
            return this.age - student.age;
        }
        return 0;
    }

}
