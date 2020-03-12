package myPackage;

import javax.xml.namespace.QName;
import javax.xml.ws.Endpoint;
import javax.xml.ws.Service;
import java.net.URL;

public class SOAPtestPublish {
    public static void main(String[] args) throws Exception{
        Endpoint.publish("http://localhost:8080/ws/soaptest", new SOAPtestImpl());


        URL url = new URL("http://localhost:8080/ws/soaptest/helloSOAP?wsdl");
        QName qName = new QName("http://myPackage/", "SOAPtestImplService");
        Service service = Service.create(url, qName);
        SOAPtest soaPtest = service.getPort(SOAPtest.class);
        System.out.println(soaPtest.helloSOAP("Andrew"));
    }
}
