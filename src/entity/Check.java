package entity;

import java.util.Objects;

public class Check {
    private Integer age;
    private String name;

    public Check(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Check() {
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Check{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Check check = (Check) o;
        return Objects.equals(age, check.age) && Objects.equals(name, check.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
