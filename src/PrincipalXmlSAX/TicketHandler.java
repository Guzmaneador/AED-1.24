package PrincipalXmlSAX;

import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author 2dama
 */
public class TicketHandler extends DefaultHandler {
    private ArrayList<Ticket> listaTickets;
    private Ticket ticketActual;
    private StringBuilder textoEtiqueta;
    
    @Override
    public void startDocument() throws SAXException {
        listaTickets = new ArrayList<>();
        textoEtiqueta = new StringBuilder();
        
    };
    
    @Override
    public void startElement(String uri, String localName, String name, Attributes attributes)throws SAXException {
        
    };
    
    @Override
    public void endElement(String uri, String localName, String name)throws SAXException {
        
    };
    
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException{
        textoEtiqueta.setLength(0);
        if(this.ticketActual !=null){
            textoEtiqueta.append(ch,start,length);
        }
    }
    
}
