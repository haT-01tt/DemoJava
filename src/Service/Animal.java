package Service;

import java.util.List;

public abstract class Animal<T, D> {
    public abstract T convertDTO(D dto);

    public abstract void showInformation(T entity);

    public abstract List<T> getAllInformation();
}
