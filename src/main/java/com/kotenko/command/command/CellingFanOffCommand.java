package com.kotenko.command.command;


import com.kotenko.command.devices.CellingFan;

public class CellingFanOffCommand implements Command{

    private final CellingFan cellingFan;

    public CellingFanOffCommand(CellingFan cellingFan) {
        this.cellingFan = cellingFan;
    }

    @Override
    public void execute() {
        cellingFan.off();
    }

    @Override
    public void undo() {
        cellingFan.low();
    }
}
