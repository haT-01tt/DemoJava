package Service;

public interface Sirius {

    Double calculate(Double a, Double b);

    default Double getSumDouble(Double a, Double b){
        return a * b;
    }
    String toString(Double a, Double b);

}
