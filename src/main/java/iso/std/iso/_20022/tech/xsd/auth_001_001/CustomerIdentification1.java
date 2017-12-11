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
 * <p>CustomerIdentification1 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CustomerIdentification1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Pty" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}PartyIdentification43"/>
 *         &lt;element name="AuthrtyReq" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}AuthorityInvestigation2" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerIdentification1", propOrder = {
    "pty",
    "authrtyReq"
})
public class CustomerIdentification1 {

    @XmlElement(name = "Pty", required = true)
    protected PartyIdentification43 pty;
    @XmlElement(name = "AuthrtyReq", required = true)
    protected List<AuthorityInvestigation2> authrtyReq;

    /**
     * 获取pty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getPty() {
        return pty;
    }

    /**
     * 设置pty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public void setPty(PartyIdentification43 value) {
        this.pty = value;
    }

    /**
     * Gets the value of the authrtyReq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authrtyReq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthrtyReq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthorityInvestigation2 }
     * 
     * 
     */
    public List<AuthorityInvestigation2> getAuthrtyReq() {
        if (authrtyReq == null) {
            authrtyReq = new ArrayList<AuthorityInvestigation2>();
        }
        return this.authrtyReq;
    }

}
