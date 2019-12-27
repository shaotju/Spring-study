package canger.study.context.animinal;

public class Food {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Food{" +
                "type='" + type + '\'' +
                '}';
    }
}
