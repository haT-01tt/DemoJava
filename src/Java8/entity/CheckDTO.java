package Java8.entity;
import Java8.Function.AddDataInterface;
import Java8.Function.PredicateInterface;
import Java8.Function.SimpleService;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class CheckDTO implements AddDataInterface<CheckDTO>, SimpleService<Check, CheckDTO, EntityTwoDap>, PredicateInterface<String> {
    private Integer idDto;
    private String nameDto;
    private String descriptionDto;
    private String addressDto;

    public CheckDTO() {
    }

    public CheckDTO(Integer idDto, String nameDto, String descriptionDto, String addressDto) {
        this.idDto = idDto;
        this.nameDto = nameDto;
        this.descriptionDto = descriptionDto;
        this.addressDto = addressDto;
    }

    public Integer getIdDto() {
        return idDto;
    }

    public void setIdDto(Integer idDto) {
        this.idDto = idDto;
    }

    public String getNameDto() {
        return nameDto;
    }

    public void setNameDto(String nameDto) {
        this.nameDto = nameDto;
    }

    public String getDescriptionDto() {
        return descriptionDto;
    }

    public void setDescriptionDto(String descriptionDto) {
        this.descriptionDto = descriptionDto;
    }

    public String getAddressDto() {
        return addressDto;
    }

    public void setAddressDto(String addressDto) {
        this.addressDto = addressDto;
    }

    @Override
    public String toString() {
        return "CheckDTO -> {  " +
                "idDto: " + idDto +
                ", nameDto: " + nameDto +
                ", descriptionDto: " + descriptionDto +
                ", addressDto: " + addressDto + " }";
    }
    @Override
    public Function<Check, CheckDTO> convert() {
        return entity -> {
            CheckDTO dto = new CheckDTO();
            dto.setIdDto(entity.getId());
            dto.setNameDto(entity.getName());
            dto.setDescriptionDto(entity.getDescription());
            dto.setAddressDto("League of Legends");
            return dto;
        };
    }

    @Override
    public CheckDTO addDataObject() {
        return new CheckDTO(1, "Alani","Fox", "League of Legends");
    }

    @Override
    public String checkToString(String str) {
        if(str.isEmpty()) return "String is empty";
        return str;
    }

    @Override
    public boolean checkString(String string) {
        if(string.isEmpty()) return false;
        return true;
    }
    public <T> Predicate<T> checkString123(Predicate<T> predicate, T str){
        if(predicate.test(str)){
            return  v -> v.equals(str);
        }
        return Objects::isNull;
    }
}
