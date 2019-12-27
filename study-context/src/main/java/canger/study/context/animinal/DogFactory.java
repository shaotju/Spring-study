package canger.study.context.animinal;

public class DogFactory {
    public static Dog createDog(){
        return new Dog();
    }

    public static Dog createDog(String name){
        return new Dog(name);
    }
}
