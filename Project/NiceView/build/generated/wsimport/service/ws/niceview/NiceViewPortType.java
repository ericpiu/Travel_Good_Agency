
package ws.niceview;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import ws.niceview.types.CreditCardInfoType;
import ws.niceview.types.ObjectFactory;
import ws.niceview.types.SearchHotel;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3.1-hudson-749-SNAPSHOT
 * Generated source version: 2.1
 * 
 */
@WebService(name = "NiceViewPortType", targetNamespace = "urn://niceview.ws")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface NiceViewPortType {


    /**
     * 
     * @param sessionID
     * @param searchInfo
     */
    @WebMethod
    @Oneway
    public void getHotels(
        @WebParam(name = "searchInfo", partName = "searchInfo")
        SearchHotel searchInfo,
        @WebParam(name = "sessionID", partName = "sessionID")
        String sessionID);

    /**
     * 
     * @param bookingNum
     * @param creditCardInfo
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "bookingStatus", partName = "bookingStatus")
    public boolean bookHotel(
        @WebParam(name = "bookingNum", partName = "bookingNum")
        String bookingNum,
        @WebParam(name = "creditCardInfo", partName = "creditCardInfo")
        CreditCardInfoType creditCardInfo);

    /**
     * 
     * @param bookingNum
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "cancelStatus", partName = "cancelStatus")
    public boolean cancelHotel(
        @WebParam(name = "bookingNum", partName = "bookingNum")
        String bookingNum);

}
