package Java8.entity;

import Java8.Function.SimpleService;

import java.util.function.BiFunction;

public class EntityTwoDap extends Check implements SimpleService<CheckDTO, Check, EntityTwoDap>{

    private String addressTwoDap;

    public EntityTwoDap() {
    }

    public EntityTwoDap(Integer id, String name, String description, String addressTwoDap) {
        super(id, name, description);
        this.addressTwoDap = addressTwoDap;
    }

    public String getAddressTwoDap() {
        return addressTwoDap;
    }

    public void setAddressTwoDap(String addressTwoDap) {
        this.addressTwoDap = addressTwoDap;
    }

    @Override
    public BiFunction<CheckDTO, Check, EntityTwoDap> convertTwoDap(){
        return (checkDTO, check) -> {
            EntityTwoDap entityTwoDap = new EntityTwoDap();
            entityTwoDap.setId(check.getId());
            entityTwoDap.setName(check.getName());
            entityTwoDap.setDescription(check.getDescription());
            entityTwoDap.setAddressTwoDap(checkDTO.getAddressDto());
            return entityTwoDap;
        };
    }

    @Override
    public String toString() {
        super.toString();
        return "EntityTwoDap -> (" + super.getId() + ", " + super.getName() + ", " + super.getDescription() + ", " +
                "addressTwoDap: " + addressTwoDap +
                ')';
    }
}
