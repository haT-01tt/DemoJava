package Java8.entity;

import Java8.Function.AddDataInterface;
import Java8.Function.SimpleService;
import Java8.Function.StringInterface;

import java.util.List;
import java.util.function.Function;

public class Check implements StringInterface, AddDataInterface<Check>, SimpleService<CheckDTO, Check, EntityTwoDap> {
    private Integer id;
    private String name;
    private String description;
    @Override
    public String printString(String str) {
        return str;
    }
    public Check() {
    }
    public Check(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Check: " +
                "id: " + id +
                ", name: " + name  +
                ", description: " + description ;
    }
    public static Integer total(Integer a, Integer b){
        return a + b;
    }
    @Override
    public Check addDataObject(){
        return new Check(1, "Gwen", "One champ LOL");
    }
    public List<Check> addDataList(){
        return List.of(
                new Check(1, "Alani","Fox" ),
                new Check(2, "Amber","Lion" ),
                new Check(3, "Amethyst","Bear" ),
                new Check(4, "Beryl","Elephant" ),
                new Check(5, "Bianca","Squirrel " ),
                new Check(6, "Crystal","Porcupine " ),
                new Check(7, "Emerald","Raccoon " ),
                new Check(8, "Fiona","Giraffe " ),
                new Check(9, "Giada","Crocodile" )
        );
    }
    @Override
    public Function<CheckDTO, Check> convert() {
        return dto -> {
            Check entity = new Check();
            entity.setId(dto.getIdDto());
            entity.setName(dto.getNameDto());
            entity.setDescription(dto.getDescriptionDto());
            return entity;
        };
    }

}
