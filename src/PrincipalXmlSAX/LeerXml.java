package PrincipalXmlSAX;

import java.io.IOException;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

/**
 *
 * @author 2dama
 */
public class LeerXml {
    XMLReader readerXML;
    TicketHandler miLibroHandler;

    public LeerXml() throws SAXException {
        this.readerXML = XMLReaderFactory.createXMLReader();
        this.miLibroHandler = new TicketHandler();
        readerXML.setContentHandler(miLibroHandler);
    }
    
    public void leerXML() throws IOException, SAXException{
        readerXML.parse(new InputSource("ArchivosXML\\facturacion.xml"));
        
        
    }
    
    
}
