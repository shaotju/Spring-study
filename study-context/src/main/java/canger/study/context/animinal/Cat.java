package canger.study.context.animinal;



public class Cat {
    private String nickName;
    private Food food;
    private Class<?> clazz;
    public Cat() {
        System.out.println("Cat init");
    }

    public void setName(String name){
        nickName = name;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Food getFood() {
        return food;
    }

    public Class<?> getClazz() {
        return clazz;
    }

    public void setClazz(Class<?> clazz) {
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "nickName='" + nickName + '\'' +
                ", food=" + food +
                ", clazz=" + clazz +
                '}';
    }
}
