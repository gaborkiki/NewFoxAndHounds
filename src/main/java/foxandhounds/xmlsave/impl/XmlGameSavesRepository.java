/*
package foxandhounds.xmlsave.impl;

import foxandhounds.model.MapVO;
import foxandhounds.xmlsave.PersistableMapVO;
import foxandhounds.xmlsave.UserSaveRepository;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class XmlGameSavesRepository implements UserSaveRepository{
    private static final Logger LOGGER = LoggerFactory.getLogger(XmlGameSavesRepository.class);

    private final Marshaller marshaller;
    private final Unmarshaller unmarshaller;

    public XmlGameSavesRepository(Marshaller marshaller, Unmarshaller unmarshaller) {
        this.marshaller = marshaller;
        this.unmarshaller = unmarshaller;
    }

    @Override
    public void save(MapVO mapVO){
        try{
            PersistableMapVO persistableMapVO = new PersistableMapVO(mapVO.getNumberofrows(),
                    mapVO.getNumberofcolumns(), mapVO.getValues(),mapVO.getEndrow(), mapVO.getFoxposition(), mapVO.getHoundposition());

            marshaller.marshal(persistableMapVO, new File("state.xml"));
        }catch (JAXBException e){
            LOGGER.error("Hiba a mentes soran!", e);
            throw new RuntimeException("Nem sikerult menteni.", e);
        }
    }

    @Override
    public MapVO load(){
        try{
            PersistableMapVO persistableMapVO = (PersistableMapVO) unmarshaller.unmarshal(new File("state.xml"));

            return new MapVO(persistableMapVO.getNumberofrows(), persistableMapVO.getNumberofcolumns(),
                    persistableMapVO.getValues(), persistableMapVO.getEndrow(),persistableMapVO.getFoxposition(),persistableMapVO.getHoundposition());
        }catch (JAXBException e){
            LOGGER.error("Hiba a betoltes soran!", e);
            throw new RuntimeException("Nem sikerult betolteni.", e);
        }
    }
}
 */
