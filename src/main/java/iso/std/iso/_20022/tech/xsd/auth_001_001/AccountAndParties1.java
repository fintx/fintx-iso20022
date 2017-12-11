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
 * <p>AccountAndParties1 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AccountAndParties1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}CashAccount25"/>
 *         &lt;element name="InvstgtdPties" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}InvestigatedParties1Choice"/>
 *         &lt;element name="AuthrtyReqTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}AuthorityRequestType1" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountAndParties1", propOrder = {
    "id",
    "invstgtdPties",
    "authrtyReqTp"
})
public class AccountAndParties1 {

    @XmlElement(name = "Id", required = true)
    protected CashAccount25 id;
    @XmlElement(name = "InvstgtdPties", required = true)
    protected InvestigatedParties1Choice invstgtdPties;
    @XmlElement(name = "AuthrtyReqTp", required = true)
    protected List<AuthorityRequestType1> authrtyReqTp;

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CashAccount25 }
     *     
     */
    public CashAccount25 getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount25 }
     *     
     */
    public void setId(CashAccount25 value) {
        this.id = value;
    }

    /**
     * 获取invstgtdPties属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InvestigatedParties1Choice }
     *     
     */
    public InvestigatedParties1Choice getInvstgtdPties() {
        return invstgtdPties;
    }

    /**
     * 设置invstgtdPties属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigatedParties1Choice }
     *     
     */
    public void setInvstgtdPties(InvestigatedParties1Choice value) {
        this.invstgtdPties = value;
    }

    /**
     * Gets the value of the authrtyReqTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authrtyReqTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthrtyReqTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthorityRequestType1 }
     * 
     * 
     */
    public List<AuthorityRequestType1> getAuthrtyReqTp() {
        if (authrtyReqTp == null) {
            authrtyReqTp = new ArrayList<AuthorityRequestType1>();
        }
        return this.authrtyReqTp;
    }

}
