package Ver1;

import Service.Betelgeuse;
import Service.Impl.SiriusImpl;
import Service.Sirius;
import dto.CatDTO;
import dto.DogDTO;

import javax.xml.transform.Source;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {


    public static void main(String[] args) {

        // Sử dụng method references
        Betelgeuse betelgeuse = SiriusImpl::new;
        // Gọi đến method calculate
        // toString được viết lại 1 method khác có tham số truyền vào
        System.out.println(betelgeuse.calculate(5.1, 5.2).toString(5.1, 5.2));
        // Đây là 1 ví dụ về phương thức mặc định cho interface
        // Việc getSumDouble
        Sirius sirius = new SiriusImpl();
        // getSumDouble có thể thấy không cần Override trong SiriusImpl
        System.out.println(sirius.getSumDouble(1.2,1.3));
        new Thread(() -> System.out.println("Hello World")).start();
    }

    public static <T> void getPrint(T a) {
        System.out.println(a);
    }
    public static <T extends Number> Integer getSumAll(T a, T b, String d) {
         return switch (d) {
            case "+" -> a.intValue() + b.intValue();
            case "-" -> a.intValue() - b.intValue();
            case "*" -> a.intValue() * b.intValue();
            case "/" -> a.intValue() / b.intValue();
            default -> throw new IllegalStateException("Unexpected value: " + d);
        };
    }

    public static String randomString(int i) {
        return switch (i) {
            case 0: yield "+";
            case 1: yield "-";
            case 2: yield "*";
            case 3: yield "/";
            default: throw new IllegalStateException("Unexpected value: " + i);
        };
    }

    public static <T extends Number> Double getSumDouble(T a, T b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends String> void getString(T a) {
        System.out.println(a);
    }


    public static CatDTO insertCat() {

        return new CatDTO(
                "Owl, australian masked",
                "1",
                "Sound: Meow, Four Foot, Eat: FISH");
    }

    public static DogDTO insertDog() {
        return new DogDTO("Weaver, white-browed sparrow",
                "2",
                "Sound: Gau, Four Foot, Eat: Rice");
    }
}
