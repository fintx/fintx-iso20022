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
 * <p>CashAccount25 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CashAccount25">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}AccountIdentification4Choice"/>
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}CashAccountType2Choice" minOccurs="0"/>
 *         &lt;element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         &lt;element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}Max70Text" minOccurs="0"/>
 *         &lt;element name="Ownr" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}PartyIdentification43" minOccurs="0"/>
 *         &lt;element name="Svcr" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}BranchAndFinancialInstitutionIdentification5" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashAccount25", propOrder = {
    "id",
    "tp",
    "ccy",
    "nm",
    "ownr",
    "svcr"
})
public class CashAccount25 {

    @XmlElement(name = "Id", required = true)
    protected AccountIdentification4Choice id;
    @XmlElement(name = "Tp")
    protected CashAccountType2Choice tp;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Ownr")
    protected PartyIdentification43 ownr;
    @XmlElement(name = "Svcr")
    protected BranchAndFinancialInstitutionIdentification5 svcr;

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public void setId(AccountIdentification4Choice value) {
        this.id = value;
    }

    /**
     * 获取tp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CashAccountType2Choice }
     *     
     */
    public CashAccountType2Choice getTp() {
        return tp;
    }

    /**
     * 设置tp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountType2Choice }
     *     
     */
    public void setTp(CashAccountType2Choice value) {
        this.tp = value;
    }

    /**
     * 获取ccy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * 设置ccy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

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
     * 获取ownr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getOwnr() {
        return ownr;
    }

    /**
     * 设置ownr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public void setOwnr(PartyIdentification43 value) {
        this.ownr = value;
    }

    /**
     * 获取svcr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification5 getSvcr() {
        return svcr;
    }

    /**
     * 设置svcr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public void setSvcr(BranchAndFinancialInstitutionIdentification5 value) {
        this.svcr = value;
    }

}
