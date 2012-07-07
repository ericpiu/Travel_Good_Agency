
package ws.helperservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import ws.travelgood.types.FlightInfo;
import ws.travelgood.types.FlightList;
import ws.travelgood.types.Hotel;
import ws.travelgood.types.Itinerary;
import ws.travelgood.types.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3.1-hudson-749-SNAPSHOT
 * Generated source version: 2.1
 * 
 */
@WebService(name = "HelperServicePortType", targetNamespace = "urn://helperservice.ws")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelperServicePortType {


    /**
     * 
     * @param sessionID
     * @return
     *     returns ws.travelgood.types.Itinerary
     */
    @WebMethod
    @WebResult(name = "Itinerary", partName = "Itinerary")
    public Itinerary getItinerary(
        @WebParam(name = "SessionID", partName = "SessionID")
        String sessionID);

    /**
     * 
     * @param flightInfo
     * @param sessionID
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "Status", partName = "Status")
    public String addFlightToItinerary(
        @WebParam(name = "FlightInfo", partName = "FlightInfo")
        FlightInfo flightInfo,
        @WebParam(name = "SessionID", partName = "SessionID")
        String sessionID);

    /**
     * 
     * @param sessionID
     * @param hotel
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "Status", partName = "Status")
    public String addHotelToItinerary(
        @WebParam(name = "SessionID", partName = "SessionID")
        String sessionID,
        @WebParam(name = "Hotel", partName = "Hotel")
        Hotel hotel);

    /**
     * 
     * @param list2
     * @param list1
     * @return
     *     returns ws.travelgood.types.FlightList
     */
    @WebMethod
    @WebResult(name = "FlightList", partName = "FlightList")
    public FlightList mergeFlightList(
        @WebParam(name = "List1", partName = "List1")
        FlightList list1,
        @WebParam(name = "List2", partName = "List2")
        FlightList list2);

    /**
     * 
     * @param input
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "SessionID", partName = "SessionID")
    public String startPlanning(
        @WebParam(name = "input", partName = "input")
        String input);

}
