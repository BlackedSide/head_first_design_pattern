package command_pattern.client;

import command_pattern.command.GarageDoorCloseCommand;
import command_pattern.command.GarageDoorOpenCommand;
import command_pattern.command.LightOffCommand;
import command_pattern.command.LightOnCommand;
import command_pattern.invoker.SimpleRemoteControl;
import command_pattern.thing.GarageDoor;
import command_pattern.thing.Light;

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
