package dto;

public class CatDTO {
    private String name;
    private static String age;
    private String personShow;

    public CatDTO() {
    }

    public CatDTO(String name, String age, String personShow) {
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

    public static String getAge() {
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
}
