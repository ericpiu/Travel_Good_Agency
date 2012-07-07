
package ws.exercise03;

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
@WebServiceClient(name = "CalendarWSDLService", targetNamespace = "urn://exercise03.ws", wsdlLocation = "file:/C:/Users/FarihaMuna/Documents/NetBeansProjects/Calendar/src/conf/xml-resources/web-services/Calendar/wsdl/CalendarWSDL.wsdl")
public class CalendarWSDLService
    extends Service
{

    private final static URL CALENDARWSDLSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(ws.exercise03.CalendarWSDLService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = ws.exercise03.CalendarWSDLService.class.getResource(".");
            url = new URL(baseUrl, "file:/C:/Users/FarihaMuna/Documents/NetBeansProjects/Calendar/src/conf/xml-resources/web-services/Calendar/wsdl/CalendarWSDL.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/C:/Users/FarihaMuna/Documents/NetBeansProjects/Calendar/src/conf/xml-resources/web-services/Calendar/wsdl/CalendarWSDL.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        CALENDARWSDLSERVICE_WSDL_LOCATION = url;
    }

    public CalendarWSDLService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CalendarWSDLService() {
        super(CALENDARWSDLSERVICE_WSDL_LOCATION, new QName("urn://exercise03.ws", "CalendarWSDLService"));
    }

    /**
     * 
     * @return
     *     returns CalendarWSDLPortType
     */
    @WebEndpoint(name = "CalendarWSDLPort")
    public CalendarWSDLPortType getCalendarWSDLPort() {
        return super.getPort(new QName("urn://exercise03.ws", "CalendarWSDLPort"), CalendarWSDLPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CalendarWSDLPortType
     */
    @WebEndpoint(name = "CalendarWSDLPort")
    public CalendarWSDLPortType getCalendarWSDLPort(WebServiceFeature... features) {
        return super.getPort(new QName("urn://exercise03.ws", "CalendarWSDLPort"), CalendarWSDLPortType.class, features);
    }

}
