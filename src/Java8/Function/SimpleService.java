package Java8.Function;

import java.util.function.BiFunction;
import java.util.function.Function;

public interface SimpleService<K, V, E> {
    Function<K, V> convert();

    default BiFunction<K, V, E> convertTwoDap(){
        return (k, v) -> {
            return null;
        };
    }
}
