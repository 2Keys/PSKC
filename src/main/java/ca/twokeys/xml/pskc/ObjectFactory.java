//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.26 at 08:06:15 AM EDT 
//


package ca.twokeys.xml.pskc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ca.twokeys.tv.xml.pskc package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _KeyContainer_QNAME = new QName("urn:ietf:params:xml:ns:keyprov:pskc", "KeyContainer");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ca.twokeys.tv.xml.pskc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AlgorithmParametersType }
     * 
     */
    public AlgorithmParametersType createAlgorithmParametersType() {
        return new AlgorithmParametersType();
    }

    /**
     * Create an instance of {@link KeyContainerType }
     * 
     */
    public KeyContainerType createKeyContainerType() {
        return new KeyContainerType();
    }

    /**
     * Create an instance of {@link StringDataType }
     * 
     */
    public StringDataType createStringDataType() {
        return new StringDataType();
    }

    /**
     * Create an instance of {@link PINPolicyType }
     * 
     */
    public PINPolicyType createPINPolicyType() {
        return new PINPolicyType();
    }

    /**
     * Create an instance of {@link BinaryDataType }
     * 
     */
    public BinaryDataType createBinaryDataType() {
        return new BinaryDataType();
    }

    /**
     * Create an instance of {@link LongDataType }
     * 
     */
    public LongDataType createLongDataType() {
        return new LongDataType();
    }

    /**
     * Create an instance of {@link DeviceInfoType }
     * 
     */
    public DeviceInfoType createDeviceInfoType() {
        return new DeviceInfoType();
    }

    /**
     * Create an instance of {@link KeyType }
     * 
     */
    public KeyType createKeyType() {
        return new KeyType();
    }

    /**
     * Create an instance of {@link KeyDataType }
     * 
     */
    public KeyDataType createKeyDataType() {
        return new KeyDataType();
    }

    /**
     * Create an instance of {@link IntDataType }
     * 
     */
    public IntDataType createIntDataType() {
        return new IntDataType();
    }

    /**
     * Create an instance of {@link KeyPackageType }
     * 
     */
    public KeyPackageType createKeyPackageType() {
        return new KeyPackageType();
    }

    /**
     * Create an instance of {@link CryptoModuleInfoType }
     * 
     */
    public CryptoModuleInfoType createCryptoModuleInfoType() {
        return new CryptoModuleInfoType();
    }

    /**
     * Create an instance of {@link ExtensionsType }
     * 
     */
    public ExtensionsType createExtensionsType() {
        return new ExtensionsType();
    }

    /**
     * Create an instance of {@link MACMethodType }
     * 
     */
    public MACMethodType createMACMethodType() {
        return new MACMethodType();
    }

    /**
     * Create an instance of {@link PolicyType }
     * 
     */
    public PolicyType createPolicyType() {
        return new PolicyType();
    }

    /**
     * Create an instance of {@link AlgorithmParametersType.ChallengeFormat }
     * 
     */
    public AlgorithmParametersType.ChallengeFormat createAlgorithmParametersTypeChallengeFormat() {
        return new AlgorithmParametersType.ChallengeFormat();
    }

    /**
     * Create an instance of {@link AlgorithmParametersType.ResponseFormat }
     * 
     */
    public AlgorithmParametersType.ResponseFormat createAlgorithmParametersTypeResponseFormat() {
        return new AlgorithmParametersType.ResponseFormat();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyContainerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ietf:params:xml:ns:keyprov:pskc", name = "KeyContainer")
    public JAXBElement<KeyContainerType> createKeyContainer(KeyContainerType value) {
        return new JAXBElement<KeyContainerType>(_KeyContainer_QNAME, KeyContainerType.class, null, value);
    }

}
