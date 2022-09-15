package com.university.DepartmentsAndLectors.command;

public interface Command {

    void handle(String input);

    String getCommandString();

    boolean canHandleInput(String input);
}
