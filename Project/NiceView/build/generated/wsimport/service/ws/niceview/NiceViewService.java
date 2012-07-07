
package ws.niceview;

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
@WebServiceClient(name = "NiceViewService", targetNamespace = "urn://niceview.ws", wsdlLocation = "file:/C:/Users/FarihaMuna/Documents/NetBeansProjects/NiceView/src/conf/xml-resources/web-services/NiceView/wsdl/NiceView.wsdl")
public class NiceViewService
    extends Service
{

    private final static URL NICEVIEWSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(ws.niceview.NiceViewService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = ws.niceview.NiceViewService.class.getResource(".");
            url = new URL(baseUrl, "file:/C:/Users/FarihaMuna/Documents/NetBeansProjects/NiceView/src/conf/xml-resources/web-services/NiceView/wsdl/NiceView.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/C:/Users/FarihaMuna/Documents/NetBeansProjects/NiceView/src/conf/xml-resources/web-services/NiceView/wsdl/NiceView.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        NICEVIEWSERVICE_WSDL_LOCATION = url;
    }

    public NiceViewService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public NiceViewService() {
        super(NICEVIEWSERVICE_WSDL_LOCATION, new QName("urn://niceview.ws", "NiceViewService"));
    }

    /**
     * 
     * @return
     *     returns NiceViewPortType
     */
    @WebEndpoint(name = "NiceViewPort")
    public NiceViewPortType getNiceViewPort() {
        return super.getPort(new QName("urn://niceview.ws", "NiceViewPort"), NiceViewPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns NiceViewPortType
     */
    @WebEndpoint(name = "NiceViewPort")
    public NiceViewPortType getNiceViewPort(WebServiceFeature... features) {
        return super.getPort(new QName("urn://niceview.ws", "NiceViewPort"), NiceViewPortType.class, features);
    }

}
