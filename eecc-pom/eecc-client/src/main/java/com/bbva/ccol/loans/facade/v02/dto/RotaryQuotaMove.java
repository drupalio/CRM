
package com.bbva.ccol.loans.facade.v02.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RotaryQuotaMove complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RotaryQuotaMove">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operation" type="{urn:com:bbva:czic:dto:net}Operation" minOccurs="0"/>
 *         &lt;element name="concept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="value" type="{urn:com:bbva:czic:dto:net}money" minOccurs="0"/>
 *         &lt;element name="deb" type="{urn:com:bbva:czic:dto:net}Balance" minOccurs="0"/>
 *         &lt;element name="numberOfQuotas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="remainingQuotas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RotaryQuotaMove", propOrder = {
    "id",
    "operation",
    "concept",
    "transactionDate",
    "status",
    "value",
    "deb",
    "numberOfQuotas",
    "remainingQuotas"
})
public class RotaryQuotaMove {

    protected String id;
    protected Operation operation;
    protected String concept;
    protected String transactionDate;
    protected String status;
    protected Money value;
    protected Balance deb;
    protected Integer numberOfQuotas;
    protected Integer remainingQuotas;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link Operation }
     *     
     */
    public Operation getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operation }
     *     
     */
    public void setOperation(Operation value) {
        this.operation = value;
    }

    /**
     * Gets the value of the concept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConcept() {
        return concept;
    }

    /**
     * Sets the value of the concept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConcept(String value) {
        this.concept = value;
    }

    /**
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionDate(String value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setValue(Money value) {
        this.value = value;
    }

    /**
     * Gets the value of the deb property.
     * 
     * @return
     *     possible object is
     *     {@link Balance }
     *     
     */
    public Balance getDeb() {
        return deb;
    }

    /**
     * Sets the value of the deb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Balance }
     *     
     */
    public void setDeb(Balance value) {
        this.deb = value;
    }

    /**
     * Gets the value of the numberOfQuotas property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfQuotas() {
        return numberOfQuotas;
    }

    /**
     * Sets the value of the numberOfQuotas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfQuotas(Integer value) {
        this.numberOfQuotas = value;
    }

    /**
     * Gets the value of the remainingQuotas property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRemainingQuotas() {
        return remainingQuotas;
    }

    /**
     * Sets the value of the remainingQuotas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRemainingQuotas(Integer value) {
        this.remainingQuotas = value;
    }

}
