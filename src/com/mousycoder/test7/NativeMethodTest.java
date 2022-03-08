package com.mousycoder.test7;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/25 8:49 PM
 */
public class NativeMethodTest {

    public static void main(String[] args) {

        Set<User> userSet = new HashSet<>();
        userSet.add(new User(11, "jack"));
        userSet.add(new User(12, "jack1"));
        userSet.add(new User(13, "jack2"));
        userSet.add(new User(14, "jack3"));
        userSet.add(new User(11, "jack"));
        userSet.add(new User(11, "jack1"));

        System.out.println(userSet);


    }
}

class User {
    private int age;
    private String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    //    @Override
//    public int hashCode() {
//        return Objects.hash(age, name);
//    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (obj == null || getClass() != obj.getClass()) return false;
//
//        User user = (User) obj;
//
//        return age == user.age && name.equals(user.name);
//    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}