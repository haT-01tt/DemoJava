package Ver1;

import dto.CatDTO;

import java.util.function.Supplier;

public class CheckVar {
    public static void main(String[] args) {
        CatDTO catDTO = new CatDTO("MEO", "1", "GAUGAU");

        Supplier<String> getAge = CatDTO::getAge;
        System.out.println(getAge.get());
    }
}
