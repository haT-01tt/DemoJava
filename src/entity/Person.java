package entity;

import javax.xml.namespace.QName;

public class Person {
   public Person(String s, int i){
        ++pid;
        name = s;
        age = i;
    }
     public static int pid;
    public int age;
    public String name;
}
