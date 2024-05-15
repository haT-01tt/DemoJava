package Java8;

import Java8.Function.PredicateInterface;
import Java8.Function.StringInterface;
import Java8.entity.Check;
import Java8.entity.CheckDTO;
import Java8.entity.EntityTwoDap;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class MainInterfaceDemo {
    static Check check = new Check();
    static CheckDTO checkDTO = new CheckDTO();
    static EntityTwoDap entityTwoDap = new EntityTwoDap();
    public static void main(String[] args) {
        Double a = -1d;
        Double c = 3.2d;
        int d = 10;
        String h = "10";
        float f = 10.0f;
        char u = 'a';
        Integer ac = 123;
        StringInterface anInterface = new Check();
        StringInterface anInterface1 = str -> a + "Word";
//        System.out.println(anInterface1.printString(a));
        String hello = anInterface.printString(a + " World!").toUpperCase(Locale.ROOT);
        Function<String, String> func1 = MainInterfaceDemo::applyString;
        BiFunction<Double, Double, Double> total = MainInterfaceDemo::applyTotal;
        BiFunction<Integer, Integer, Integer> check2 = Check::total;
        System.out.println("Total is " + check2.apply(2,7));
//      Function<CheckDTO, Check> convertEntity = check::addDataObject; ;
        Predicate<String> value = v -> !v.isEmpty();
        Predicate<Integer> predicate = I -> I > 0;
        Function<Check, CheckDTO> convertEntity = checkDTO.convert();
        Function<CheckDTO, Check> checkFunction = check.convert();
        BiFunction<CheckDTO, Check, EntityTwoDap> function = entityTwoDap.convertTwoDap();
        checkPredicate(checkDTO.checkString123(value, "123"), convertEntity.apply(check.addDataObject()));
        checkPredicate(predicate, convertEntity.apply(check.addDataObject()));
        System.out.println("Predicate check is " + checkDTO.checkString123(value, "123"));


        System.out.println(function.apply(checkDTO.addDataObject(), check.addDataObject()));
        System.out.println(convertEntity.apply(check.addDataObject()));
        System.out.println(checkFunction.apply(convertEntity.apply(check.addDataObject())));
        BigDecimal number = BigDecimal.TEN;
        System.out.println(number.setScale(2));


//        System.out.println(functionCheck(d));
//        System.out.println(functionCheck(a));
//        System.out.println(functionCheck(h));
//        System.out.println(functionCheck(f));
//        System.out.println(functionCheck(u));
//        System.out.println(total.apply(a,c));
//        System.out.println(func1.apply("Tuan check "));
//        System.out.println(hello);
    }



    public static <T> T functionCheck(T a) {
        if (a instanceof Integer) return (T) ("This is Integer " + a);
        else if (a instanceof Double) return (T) ("This is Double " + a);
        else if (a instanceof String) return (T) ("This is String " + a);
        else if (a instanceof Float) return (T) ("This is Float " + a);
        else return (T) ("This is anonymous type");
    }

    private static <T extends Number> Double applyTotal(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }
    private static String applyString(String a){
        return a + "Tuan den choi";
    }
    public static <T> void checkPredicate(Predicate<T> abc, CheckDTO checkDTO){
        if(checkDTO.checkString(abc.toString())){
            System.out.println("This is String");
        }else System.out.println("This is not String");
    }
}
