
package echowithfault;

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
 * JAX-WS RI 2.1.4-b01-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "echoWithFaultService", targetNamespace = "urn:echowithfault", wsdlLocation = "http://localhost:8070/EchoWithFault/echoWithFaultService?wsdl")
public class EchoWithFaultService
    extends Service
{

    private final static URL ECHOWITHFAULTSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(echowithfault.EchoWithFaultService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = echowithfault.EchoWithFaultService.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8070/EchoWithFault/echoWithFaultService?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8070/EchoWithFault/echoWithFaultService?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        ECHOWITHFAULTSERVICE_WSDL_LOCATION = url;
    }

    public EchoWithFaultService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EchoWithFaultService() {
        super(ECHOWITHFAULTSERVICE_WSDL_LOCATION, new QName("urn:echowithfault", "echoWithFaultService"));
    }

    /**
     * 
     * @return
     *     returns EchoWithFaultPortType
     */
    @WebEndpoint(name = "echoWithFaultPort")
    public EchoWithFaultPortType getEchoWithFaultPort() {
        return super.getPort(new QName("urn:echowithfault", "echoWithFaultPort"), EchoWithFaultPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EchoWithFaultPortType
     */
    @WebEndpoint(name = "echoWithFaultPort")
    public EchoWithFaultPortType getEchoWithFaultPort(WebServiceFeature... features) {
        return super.getPort(new QName("urn:echowithfault", "echoWithFaultPort"), EchoWithFaultPortType.class, features);
    }

}
