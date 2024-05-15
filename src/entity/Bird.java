package entity;

public class Bird {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Bird{" + "count=" + count + '}';
    }
}
