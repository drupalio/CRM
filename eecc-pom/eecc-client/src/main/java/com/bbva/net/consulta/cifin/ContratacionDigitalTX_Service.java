package com.bbva.net.consulta.cifin;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.16
 * 2016-12-26T14:27:14.551-05:00
 * Generated source version: 2.6.16
 * 
 */
@WebServiceClient(name = "ContratacionDigitalTX", 
                  wsdlLocation = "Ekip_to_Cfn.wsdl",
                  targetNamespace = "http://www.bbvanet.com.co/ContratacionDigitalTX/") 
public class ContratacionDigitalTX_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.bbvanet.com.co/ContratacionDigitalTX/", "ContratacionDigitalTX");
    public final static QName ContratacionDigitalTXSOAP = new QName("http://www.bbvanet.com.co/ContratacionDigitalTX/", "ContratacionDigitalTXSOAP");
    static {
        URL url = ContratacionDigitalTX_Service.class.getResource("Ekip_to_Cfn.wsdl");
        if (url == null) {
            url = ContratacionDigitalTX_Service.class.getClassLoader().getResource("Ekip_to_Cfn.wsdl");
        } 
        if (url == null) {
            java.util.logging.Logger.getLogger(ContratacionDigitalTX_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "Ekip_to_Cfn.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public ContratacionDigitalTX_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ContratacionDigitalTX_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ContratacionDigitalTX_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns ContratacionDigitalTX
     */
    @WebEndpoint(name = "ContratacionDigitalTXSOAP")
    public ContratacionDigitalTX getContratacionDigitalTXSOAP() {
        return super.getPort(ContratacionDigitalTXSOAP, ContratacionDigitalTX.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ContratacionDigitalTX
     */
    @WebEndpoint(name = "ContratacionDigitalTXSOAP")
    public ContratacionDigitalTX getContratacionDigitalTXSOAP(WebServiceFeature... features) {
        return super.getPort(ContratacionDigitalTXSOAP, ContratacionDigitalTX.class, features);
    }

}