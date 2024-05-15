package Ver1;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Stack<T> {
    private List<T> elements;
    private test test;

    public test getTest() {
        return test;
    }

    public void setTest(test test) {
        this.test = test;
    }

    public Stack() {
        elements = new ArrayList<>();
    }

    public List<T> getElements() {
        return elements;
    }

    public void setElements(List<T> elements) {
        this.elements = elements;
    }

    public void push(T element) {
        elements.add(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Ver1.Stack is empty");
        }
        return elements.remove(elements.size() - 1);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }
}
