package com.kotenko.command.command;


import com.kotenko.command.devices.CellingFan;

public class CellingFanOnCommand implements Command {
    private final CellingFan cellingFan;

    public CellingFanOnCommand(CellingFan cellingFan) {
        this.cellingFan = cellingFan;
    }

    @Override
    public void execute() {
        cellingFan.low();
    }

    @Override
    public void undo() {
        cellingFan.off();
    }
}