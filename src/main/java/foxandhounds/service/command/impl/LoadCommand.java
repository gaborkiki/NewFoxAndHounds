/*
package foxandhounds.service.command.impl;

import foxandhounds.model.GameState;
import foxandhounds.service.command.Command;
import foxandhounds.xmlsave.UserSaveRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoadCommand implements Command{

    private static final Logger LOGGER = LoggerFactory.getLogger(LoadCommand.class);
    private static final String LOAD_COMMAND = "load";

    private UserSaveRepository userSaveRepository;
    private GameState gameState;

    public LoadCommand(UserSaveRepository userSaveRepository, GameState gameState) {
        this.userSaveRepository = userSaveRepository;
        this.gameState = gameState;
    }

    @Override
    public boolean canProcess(String input){return LOAD_COMMAND.equals(input);}

    @Override
    public void process(String input){
        LOGGER.debug("Betoltesi parancs meghivva!");
        gameState.setMapVO(userSaveRepository.load());
        LOGGER.info("Betoltes sikeres.");
    }
}
 */
