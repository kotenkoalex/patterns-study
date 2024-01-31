package com.kotenko.command;

import com.kotenko.command.command.*;
import com.kotenko.command.devices.CellingFan;
import com.kotenko.command.devices.GarageDoor;
import com.kotenko.command.devices.Light;
import com.kotenko.command.devices.Stereo;

public class RemoteLoader {
    public static void main(String[] args) {
//        SimpleRemoteControl remote = new SimpleRemoteControl();
//        Light light = new Light();
//        LightOnCommand lightOnCommand = new LightOnCommand(light);
//        remote.setSlot(lightOnCommand);
//        remote.buttonWasPressed();

//        RemoteControl remoteControl = new RemoteControl();

        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen Light");
        CellingFan cellingFan = new CellingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand lightLivingRoomOnCommand = new LightOnCommand(livingRoomLight);
        LightOnCommand lightKitchenRoomOnCommand = new LightOnCommand(kitchenLight);
        CellingFanOnCommand cellingFanLivingRoomOnCommand = new CellingFanOnCommand(cellingFan);
        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
        StereoOnWithCDCommand stereoOnWithCDLivingRoomCommand = new StereoOnWithCDCommand(stereo);

        LightOffCommand lightLivingRoomOffCommand = new LightOffCommand(livingRoomLight);
        LightOffCommand lightKitchenRoomOffCommand = new LightOffCommand(kitchenLight);
        CellingFanOffCommand cellingFanLivingRoomOffCommand = new CellingFanOffCommand(cellingFan);
        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);
        StereoOffWithCDCommand stereoOffWithCDLivingRoomCommand = new StereoOffWithCDCommand(stereo);

        remoteControl.setCommand(0, lightLivingRoomOnCommand, lightLivingRoomOffCommand);
        remoteControl.setCommand(1, lightKitchenRoomOnCommand, lightKitchenRoomOffCommand);
        remoteControl.setCommand(2, cellingFanLivingRoomOnCommand, cellingFanLivingRoomOffCommand);
        remoteControl.setCommand(3, garageDoorUpCommand, garageDoorDownCommand);
        remoteControl.setCommand(4, stereoOnWithCDLivingRoomCommand, stereoOffWithCDLivingRoomCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(3);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(4);
        remoteControl.undoButtonWasPushed();
    }
}
