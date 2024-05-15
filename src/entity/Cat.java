package entity;
import Service.Animal;
import dto.CatDTO;

import java.util.List;

public class Cat extends Animal<Cat, CatDTO> {
    private String name;
    private String age;
    private String personShow;

    public Cat() {
    }

    public Cat(String name, String age, String personShow) {
        this.name = name;
        this.age = age;
        this.personShow = personShow;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPersonShow() {
        return personShow;
    }

    public void setPersonShow(String personShow) {
        this.personShow = personShow;
    }

    @Override
    public String toString() {
        return "Cat: " +
                "name = " + name + '\'' +
                ", age = " + age + '\'' +
                ", personShow = " + personShow;
    }
    public Cat(CatDTO dto){
        this.age = dto.getAge();
        this.name = dto.getName();
        this.personShow = dto.getPersonShow();
    }
    @Override
    public Cat convertDTO(CatDTO dto) {
        return new Cat(dto.getAge(), dto.getName(), dto.getPersonShow());
    }

    @Override
    public void showInformation(Cat entity) {
        System.out.println(entity);
    }

    @Override
    public List<Cat> getAllInformation() {

        return null;
    }
}
