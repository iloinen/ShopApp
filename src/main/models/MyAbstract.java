package main.models;

public abstract class MyAbstract {

    public static void main(String[] args) {

        // ANONYM INNER CLASS
        MyAbstract abstractClass = new MyAbstract() {
            @Override
            public void sayGoodbye() {
                System.out.println("Byeeeeee");
            }
        };
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    public int sum(int x, int y) {
        return x + y;
    }

    public abstract void sayGoodbye();

}
