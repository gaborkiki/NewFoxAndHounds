package foxandhounds.xmlsave;

import foxandhounds.model.MapVO;

/**
 * Interface a jelenlegi játék állás tárolására.
 */

public interface UserSaveRepository {

    void save (MapVO mapVO);

    MapVO load();
}
