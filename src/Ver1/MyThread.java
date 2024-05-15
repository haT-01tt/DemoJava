package Ver1;

public class MyThread extends Thread {
    public void run() {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++;
        }
        move(count);
    }
    private Stack stack;

    public Stack getStack() {
        return stack;
    }

    public void setStack(Stack stack) {
        this.stack = stack;
    }

    private void move(int count){
        System.out.println("Can Ngoc Duc " + count);
    }
}
