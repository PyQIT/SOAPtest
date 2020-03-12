package myPackage;

import javax.jws.WebService;

@WebService(endpointInterface = "myPackage.SOAPtest")
public class SOAPtestImpl implements SOAPtest {

    @Override
    public String helloSOAP(String name) {
        return "What's up " + name + "?";
    }
}
