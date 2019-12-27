package canger.study.lookup;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("command")
@Scope("prototype")
public class Command {
    private int state;
    public void execute(){
        System.out.println(toString() + ": execute command");
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
