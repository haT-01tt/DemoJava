package dto;

public class DogDTO {
    private String nameDog;
    private String ageDog;
    private String personShowDog;

    public String getNameDog() {
        return nameDog;
    }

    public DogDTO(String nameDog, String ageDog, String personShowDog) {
        this.nameDog = nameDog;
        this.ageDog = ageDog;
        this.personShowDog = personShowDog;
    }

    public DogDTO() {
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
}
