package com.university.DepartmentsAndLectors.command.resolver;

import com.university.DepartmentsAndLectors.command.Command;
import com.university.DepartmentsAndLectors.command.exception.CommandNotFoundException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommandResolver {

    private final List<Command> commands;

    @Autowired
    public CommandResolver(List<Command> commands) {
        this.commands = commands;
    }

    public Command resolveCommand(String input) {
        for (Command command : commands) {
            if (command.canHandleInput(input)) {
                return command;
            }
        }
        throw new CommandNotFoundException();
    }

}
