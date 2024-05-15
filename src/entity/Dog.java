package entity;

import Service.Animal;
import dto.DogDTO;

import java.util.List;

public class Dog extends Animal<Dog, DogDTO> {
    private String nameDog;
    private String ageDog;
    private String personShowDog;

    public Dog() {
    }

    public Dog(String name, String ageDog, String personShowDog) {
        this.nameDog = name;
        this.ageDog = ageDog;
        this.personShowDog = personShowDog;
    }

    public String getNameDog() {
        return nameDog;
    }

    public void setNameDog(String nameDog) {
        this.nameDog = nameDog;
    }

    public String getAgeDog() {
        return ageDog;
    }

    public void setAgeDog(String ageDog) {
        this.ageDog = ageDog;
    }

    public String getPersonShowDog() {
        return personShowDog;
    }

    public void setPersonShowDog(String personShowDog) {
        this.personShowDog = personShowDog;
    }

    @Override
    public String toString() {
        return "Dog: " +
                "name = " + nameDog + '\'' +
                ", age = " + ageDog + '\'' +
                ", personShow = " + personShowDog;
    }

    @Override
    public Dog convertDTO(DogDTO dto) {
        return new Dog(dto.getNameDog(), dto.getAgeDog(), dto.getPersonShowDog());
    }

    @Override
    public void showInformation(Dog entity) {
        System.out.println(entity);
    }

    @Override
    public List<Dog> getAllInformation() {
        return null;
    }
}

