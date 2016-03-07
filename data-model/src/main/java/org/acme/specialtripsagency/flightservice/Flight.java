
package org.acme.specialtripsagency.flightservice;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carrier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="flight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ratePerPerson" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="startCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="targetCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="travelDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "carrier",
    "flight",
    "ratePerPerson",
    "startCity",
    "targetCity",
    "travelDate"
})
@XmlRootElement(name = "Flight")
public class Flight
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String carrier;
    protected int flight;
    @XmlElement(required = true)
    protected BigDecimal ratePerPerson;
    @XmlElement(required = true)
    protected String startCity;
    @XmlElement(required = true)
    protected String targetCity;
    @XmlElement(required = true)
    protected String travelDate;

    /**
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrier(String value) {
        this.carrier = value;
    }

    /**
     * Gets the value of the flight property.
     * 
     */
    public int getFlight() {
        return flight;
    }

    /**
     * Sets the value of the flight property.
     * 
     */
    public void setFlight(int value) {
        this.flight = value;
    }

    /**
     * Gets the value of the ratePerPerson property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRatePerPerson() {
        return ratePerPerson;
    }

    /**
     * Sets the value of the ratePerPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRatePerPerson(BigDecimal value) {
        this.ratePerPerson = value;
    }

    /**
     * Gets the value of the startCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartCity() {
        return startCity;
    }

    /**
     * Sets the value of the startCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartCity(String value) {
        this.startCity = value;
    }

    /**
     * Gets the value of the targetCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetCity() {
        return targetCity;
    }

    /**
     * Sets the value of the targetCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetCity(String value) {
        this.targetCity = value;
    }

    /**
     * Gets the value of the travelDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelDate() {
        return travelDate;
    }

    /**
     * Sets the value of the travelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelDate(String value) {
        this.travelDate = value;
    }

}