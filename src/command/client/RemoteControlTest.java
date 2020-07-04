package command.client;

import command.command.GarageDoorCloseCommand;
import command.command.GarageDoorOpenCommand;
import command.command.LightOffCommand;
import command.command.LightOnCommand;
import command.invoker.SimpleRemoteControl;
import command.thing.GarageDoor;
import command.thing.Light;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();

        Light light = new Light();
        GarageDoor door = new GarageDoor();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(door);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(door);

        remoteControl.setCommand(lightOnCommand);
        remoteControl.buttonPress();
        remoteControl.undoPress();

        remoteControl.setCommand(garageDoorOpenCommand);
        remoteControl.buttonPress();
        remoteControl.setCommand(garageDoorCloseCommand);
        remoteControl.buttonPress();
        remoteControl.undoPress();
    }
}
