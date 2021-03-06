
package dk.dtu.imm.fastmoney;

import javax.xml.ws.WebFault;
import dk.dtu.imm.fastmoney.types.CreditCardFaultType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3.1-hudson-749-SNAPSHOT
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "CreditCardFault", targetNamespace = "urn://types.fastmoney.imm.dtu.dk")
public class CreditCardFaultMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private CreditCardFaultType faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public CreditCardFaultMessage(String message, CreditCardFaultType faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public CreditCardFaultMessage(String message, CreditCardFaultType faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: dk.dtu.imm.fastmoney.types.CreditCardFaultType
     */
    public CreditCardFaultType getFaultInfo() {
        return faultInfo;
    }

}
