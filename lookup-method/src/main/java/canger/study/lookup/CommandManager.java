package canger.study.lookup;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public abstract class CommandManager {
    public void process(int commandState) {
        Command command = createCommand();
        command.setState(commandState);
        command.execute();
        return;
    }
    @Lookup("command")
    protected abstract Command createCommand();
}
