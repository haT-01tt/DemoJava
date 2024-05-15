package Service.Impl;

import Service.Sirius;

public class SiriusImpl implements Sirius {
    public SiriusImpl() {
        super();
    }
    public SiriusImpl(Object obj, Object obj1) {
        super();
    }
    @Override
    public Double calculate(Double a, Double b) {
        return a + b;
    }
    @Override
    public String toString(Double a, Double b){
        return String.valueOf(a + b);
    }
}
