package foxandhounds.service.command.impl;

import foxandhounds.model.GameState;
import foxandhounds.service.command.Command;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExitCommand implements Command {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExitCommand.class);
    private static final String exit_command = "exit";
    private final GameState gameState;

    public ExitCommand(GameState gameState) {
        this.gameState = gameState;
    }


    @Override
    public boolean canProcess(String input) {
        return exit_command.equals(input);
    }

    @Override
    public void process(String input) {
        LOGGER.info("Exiting game");
        gameState.setUserExit(true);
    }
}
