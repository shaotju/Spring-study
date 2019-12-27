package canger.study.context.animinal;


public class Dog {
    private static int counter = 0;
    private String name;
    public Dog() {
        counter++;
        System.out.println("Dog init " + counter);
    }

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
