package myPackage;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface SOAPtest {

    @WebMethod
    String helloSOAP(String name);
}
