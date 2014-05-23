//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.26 at 08:03:14 AM EDT 
//


package ca.twokeys.xml.pkcs5;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PBKDF2ParameterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PBKDF2ParameterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Salt">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="Specified" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *                   &lt;element name="OtherSource" type="{http://www.rsasecurity.com/rsalabs/pkcs/schemas/pkcs-5v2-0#}SaltAlgorithmIdentifierType"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="IterationCount" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="KeyLength" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="PRF" type="{http://www.rsasecurity.com/rsalabs/pkcs/schemas/pkcs-5v2-0#}PRFAlgorithmIdentifierType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PBKDF2ParameterType", propOrder = {
    "salt",
    "iterationCount",
    "keyLength",
    "prf"
})
public class PBKDF2ParameterType {

    @XmlElement(name = "Salt", required = true)
    protected PBKDF2ParameterType.Salt salt;
    @XmlElement(name = "IterationCount", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger iterationCount;
    @XmlElement(name = "KeyLength")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger keyLength;
    @XmlElement(name = "PRF", required = true)
    protected PRFAlgorithmIdentifierType prf;

    /**
     * Gets the value of the salt property.
     * 
     * @return
     *     possible object is
     *     {@link PBKDF2ParameterType.Salt }
     *     
     */
    public PBKDF2ParameterType.Salt getSalt() {
        return salt;
    }

    /**
     * Sets the value of the salt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PBKDF2ParameterType.Salt }
     *     
     */
    public void setSalt(PBKDF2ParameterType.Salt value) {
        this.salt = value;
    }

    /**
     * Gets the value of the iterationCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIterationCount() {
        return iterationCount;
    }

    /**
     * Sets the value of the iterationCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIterationCount(BigInteger value) {
        this.iterationCount = value;
    }

    /**
     * Gets the value of the keyLength property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getKeyLength() {
        return keyLength;
    }

    /**
     * Sets the value of the keyLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setKeyLength(BigInteger value) {
        this.keyLength = value;
    }

    /**
     * Gets the value of the prf property.
     * 
     * @return
     *     possible object is
     *     {@link PRFAlgorithmIdentifierType }
     *     
     */
    public PRFAlgorithmIdentifierType getPRF() {
        return prf;
    }

    /**
     * Sets the value of the prf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRFAlgorithmIdentifierType }
     *     
     */
    public void setPRF(PRFAlgorithmIdentifierType value) {
        this.prf = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="Specified" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
     *         &lt;element name="OtherSource" type="{http://www.rsasecurity.com/rsalabs/pkcs/schemas/pkcs-5v2-0#}SaltAlgorithmIdentifierType"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "specified",
        "otherSource"
    })
    public static class Salt {

        @XmlElement(name = "Specified")
        protected byte[] specified;
        @XmlElement(name = "OtherSource")
        protected SaltAlgorithmIdentifierType otherSource;

        /**
         * Gets the value of the specified property.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getSpecified() {
            return specified;
        }

        /**
         * Sets the value of the specified property.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         */
        public void setSpecified(byte[] value) {
            this.specified = value;
        }

        /**
         * Gets the value of the otherSource property.
         * 
         * @return
         *     possible object is
         *     {@link SaltAlgorithmIdentifierType }
         *     
         */
        public SaltAlgorithmIdentifierType getOtherSource() {
            return otherSource;
        }

        /**
         * Sets the value of the otherSource property.
         * 
         * @param value
         *     allowed object is
         *     {@link SaltAlgorithmIdentifierType }
         *     
         */
        public void setOtherSource(SaltAlgorithmIdentifierType value) {
            this.otherSource = value;
        }

    }

}