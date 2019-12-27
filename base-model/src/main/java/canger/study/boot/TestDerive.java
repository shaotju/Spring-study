package canger.study.boot;

public class TestDerive {
    public static void main(String[] args) {
        System.out.println(BaseInterface.getName());
        System.out.println(Base.getName());
        System.out.println(Derived.getName());
    }
}

interface BaseInterface{
    static String getName(){
        return "BaseInterface";
    }
}

class Base implements BaseInterface{
    public static String getName(){
        return "Base";
    }
}


class Derived extends Base{
    public static String getName(){
        return "Derived";
    }
}