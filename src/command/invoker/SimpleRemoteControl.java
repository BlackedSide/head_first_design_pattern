package command.invoker;

import command.command.Command;

public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {}

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonPress() {
        slot.execute();
    }

    public void undoPress() {
        slot.undo();
    }
}