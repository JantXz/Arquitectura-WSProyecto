import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPMessage;

public class ConsumirServicio {
    public static void main(String[] args) {
        try {
            // Establecer la URL del servicio web y el nombre de la operación a llamar
            String url = "http://localhost/WSCliente/WSClientes.asmx";
            String namespace = "http://servicioweb.com/";
            String operation = "InsertarCliente";

            // Crear una conexión a la fábrica de mensajes SOAP
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();

            // Crear una solicitud SOAP vacía
            MessageFactory messageFactory = MessageFactory.newInstance();
            SOAPMessage soapMessage = messageFactory.createMessage();

            // Crear el cuerpo del mensaje SOAP
            SOAPBody soapBody = soapMessage.getSOAPBody();

            // Agregar el elemento de operación al cuerpo del mensaje SOAP
            QName bodyName = new QName(namespace, operation);
            SOAPElement bodyElement = soapBody.addChildElement(bodyName);

            // Agregar los parámetros de la operación al elemento de operación
            QName name1 = new QName(namespace, "Parametro1");
            SOAPElement symbol1 = bodyElement.addChildElement(name1);
            symbol1.setValue("Valor1");

            QName name2 = new QName(namespace, "Parametro2");
            SOAPElement symbol2 = bodyElement.addChildElement(name2);
            symbol2.setValue("Valor2");

            // Enviar la solicitud SOAP al servicio web y recibir la respuesta
            URL endpoint = new URL(url);
            SOAPMessage response = soapConnection.call(soapMessage, endpoint);

            // Procesar la respuesta del servicio web
            // ...

            // Cerrar la conexión a la fábrica de mensajes SOAP
            soapConnection.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
