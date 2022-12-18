/*
package foxandhounds.service.command.impl;

import foxandhounds.model.GameState;
import foxandhounds.service.command.Command;
import foxandhounds.xmlsave.UserSaveRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SaveCommand implements Command{
    private static final Logger LOGGER = LoggerFactory.getLogger(SaveCommand.class);
    private static final String SAVE_COMMAND ="save";

    private UserSaveRepository userSaveRepository;
    private GameState gameState;

    public SaveCommand(UserSaveRepository userSaveRepository, GameState gameState) {
        this.userSaveRepository = userSaveRepository;
        this.gameState = gameState;
    }
    @Override
    public boolean canProcess(String input){return SAVE_COMMAND.equals(input);}

    @Override
    public void process(String input){
        LOGGER.debug("Jatek mentesi parancs meghivva.");
        userSaveRepository.save(gameState.getMapVO());
        LOGGER.info("A jatek mentese sikeres.");
    }
}
 */
