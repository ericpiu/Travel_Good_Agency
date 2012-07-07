
package ws.helperservice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3.1-hudson-749-SNAPSHOT
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "HelperServiceService", targetNamespace = "urn://helperservice.ws", wsdlLocation = "file:/C:/Users/FarihaMuna/Documents/NetBeansProjects/HelperService/src/conf/xml-resources/web-services/HelperService/wsdl/HelperService.wsdl")
public class HelperServiceService
    extends Service
{

    private final static URL HELPERSERVICESERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(ws.helperservice.HelperServiceService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = ws.helperservice.HelperServiceService.class.getResource(".");
            url = new URL(baseUrl, "file:/C:/Users/FarihaMuna/Documents/NetBeansProjects/HelperService/src/conf/xml-resources/web-services/HelperService/wsdl/HelperService.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/C:/Users/FarihaMuna/Documents/NetBeansProjects/HelperService/src/conf/xml-resources/web-services/HelperService/wsdl/HelperService.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        HELPERSERVICESERVICE_WSDL_LOCATION = url;
    }

    public HelperServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelperServiceService() {
        super(HELPERSERVICESERVICE_WSDL_LOCATION, new QName("urn://helperservice.ws", "HelperServiceService"));
    }

    /**
     * 
     * @return
     *     returns HelperServicePortType
     */
    @WebEndpoint(name = "HelperServicePort")
    public HelperServicePortType getHelperServicePort() {
        return super.getPort(new QName("urn://helperservice.ws", "HelperServicePort"), HelperServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelperServicePortType
     */
    @WebEndpoint(name = "HelperServicePort")
    public HelperServicePortType getHelperServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("urn://helperservice.ws", "HelperServicePort"), HelperServicePortType.class, features);
    }

}
