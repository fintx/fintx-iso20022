//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.12.11 时间 11:40:11 PM CST 
//


package iso.std.iso._20022.tech.xsd.auth_001_001;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SearchCriteria1Choice complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SearchCriteria1Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Acct" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}AccountAndParties1"/>
 *         &lt;element name="CstmrId" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}CustomerIdentification1"/>
 *         &lt;element name="PmtInstrm" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}PaymentInstrumentType1"/>
 *         &lt;element name="OrgnlTxNb" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}RequestType1" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchCriteria1Choice", propOrder = {
    "acct",
    "cstmrId",
    "pmtInstrm",
    "orgnlTxNb"
})
public class SearchCriteria1Choice {

    @XmlElement(name = "Acct")
    protected AccountAndParties1 acct;
    @XmlElement(name = "CstmrId")
    protected CustomerIdentification1 cstmrId;
    @XmlElement(name = "PmtInstrm")
    protected PaymentInstrumentType1 pmtInstrm;
    @XmlElement(name = "OrgnlTxNb")
    protected List<RequestType1> orgnlTxNb;

    /**
     * 获取acct属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AccountAndParties1 }
     *     
     */
    public AccountAndParties1 getAcct() {
        return acct;
    }

    /**
     * 设置acct属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AccountAndParties1 }
     *     
     */
    public void setAcct(AccountAndParties1 value) {
        this.acct = value;
    }

    /**
     * 获取cstmrId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomerIdentification1 }
     *     
     */
    public CustomerIdentification1 getCstmrId() {
        return cstmrId;
    }

    /**
     * 设置cstmrId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerIdentification1 }
     *     
     */
    public void setCstmrId(CustomerIdentification1 value) {
        this.cstmrId = value;
    }

    /**
     * 获取pmtInstrm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrumentType1 }
     *     
     */
    public PaymentInstrumentType1 getPmtInstrm() {
        return pmtInstrm;
    }

    /**
     * 设置pmtInstrm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrumentType1 }
     *     
     */
    public void setPmtInstrm(PaymentInstrumentType1 value) {
        this.pmtInstrm = value;
    }

    /**
     * Gets the value of the orgnlTxNb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orgnlTxNb property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgnlTxNb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestType1 }
     * 
     * 
     */
    public List<RequestType1> getOrgnlTxNb() {
        if (orgnlTxNb == null) {
            orgnlTxNb = new ArrayList<RequestType1>();
        }
        return this.orgnlTxNb;
    }

}
