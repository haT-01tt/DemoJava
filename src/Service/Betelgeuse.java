package Service;

@FunctionalInterface
public interface Betelgeuse<T extends Sirius, V> {
    T calculate (V a, V b);

}
