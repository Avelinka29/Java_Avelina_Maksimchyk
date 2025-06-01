package by.academy.java.HW;

import java.util.Objects;

public class Cat {


    private String name="Stesha";
    private  int age=1;

    public Cat (String name, int age){
        this.name = name;
        this.age = age;
    }

    public Cat() {

    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
