//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.12.11 时间 11:40:11 PM CST 
//


package iso.std.iso._20022.tech.xsd.auth_001_001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PartyIdentification43 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PartyIdentification43">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}Max140Text" minOccurs="0"/>
 *         &lt;element name="PstlAdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}PostalAddress6" minOccurs="0"/>
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}Party11Choice" minOccurs="0"/>
 *         &lt;element name="CtryOfRes" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}CountryCode" minOccurs="0"/>
 *         &lt;element name="CtctDtls" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}ContactDetails2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification43", propOrder = {
    "nm",
    "pstlAdr",
    "id",
    "ctryOfRes",
    "ctctDtls"
})
public class PartyIdentification43 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "PstlAdr")
    protected PostalAddress6 pstlAdr;
    @XmlElement(name = "Id")
    protected Party11Choice id;
    @XmlElement(name = "CtryOfRes")
    protected String ctryOfRes;
    @XmlElement(name = "CtctDtls")
    protected ContactDetails2 ctctDtls;

    /**
     * 获取nm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * 设置nm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * 获取pstlAdr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress6 }
     *     
     */
    public PostalAddress6 getPstlAdr() {
        return pstlAdr;
    }

    /**
     * 设置pstlAdr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress6 }
     *     
     */
    public void setPstlAdr(PostalAddress6 value) {
        this.pstlAdr = value;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Party11Choice }
     *     
     */
    public Party11Choice getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Party11Choice }
     *     
     */
    public void setId(Party11Choice value) {
        this.id = value;
    }

    /**
     * 获取ctryOfRes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfRes() {
        return ctryOfRes;
    }

    /**
     * 设置ctryOfRes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtryOfRes(String value) {
        this.ctryOfRes = value;
    }

    /**
     * 获取ctctDtls属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ContactDetails2 }
     *     
     */
    public ContactDetails2 getCtctDtls() {
        return ctctDtls;
    }

    /**
     * 设置ctctDtls属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDetails2 }
     *     
     */
    public void setCtctDtls(ContactDetails2 value) {
        this.ctctDtls = value;
    }

}
