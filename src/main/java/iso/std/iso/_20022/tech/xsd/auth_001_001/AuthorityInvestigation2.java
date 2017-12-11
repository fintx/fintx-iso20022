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
 * <p>AuthorityInvestigation2 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AuthorityInvestigation2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}AuthorityRequestType1"/>
 *         &lt;element name="InvstgtdRoles" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}InvestigatedParties1Choice"/>
 *         &lt;element name="AddtlInvstgtdPties" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}InvestigatedParties1Choice" minOccurs="0"/>
 *         &lt;element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}Max500Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorityInvestigation2", propOrder = {
    "tp",
    "invstgtdRoles",
    "addtlInvstgtdPties",
    "addtlInf"
})
public class AuthorityInvestigation2 {

    @XmlElement(name = "Tp", required = true)
    protected AuthorityRequestType1 tp;
    @XmlElement(name = "InvstgtdRoles", required = true)
    protected InvestigatedParties1Choice invstgtdRoles;
    @XmlElement(name = "AddtlInvstgtdPties")
    protected InvestigatedParties1Choice addtlInvstgtdPties;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * 获取tp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AuthorityRequestType1 }
     *     
     */
    public AuthorityRequestType1 getTp() {
        return tp;
    }

    /**
     * 设置tp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorityRequestType1 }
     *     
     */
    public void setTp(AuthorityRequestType1 value) {
        this.tp = value;
    }

    /**
     * 获取invstgtdRoles属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InvestigatedParties1Choice }
     *     
     */
    public InvestigatedParties1Choice getInvstgtdRoles() {
        return invstgtdRoles;
    }

    /**
     * 设置invstgtdRoles属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigatedParties1Choice }
     *     
     */
    public void setInvstgtdRoles(InvestigatedParties1Choice value) {
        this.invstgtdRoles = value;
    }

    /**
     * 获取addtlInvstgtdPties属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InvestigatedParties1Choice }
     *     
     */
    public InvestigatedParties1Choice getAddtlInvstgtdPties() {
        return addtlInvstgtdPties;
    }

    /**
     * 设置addtlInvstgtdPties属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigatedParties1Choice }
     *     
     */
    public void setAddtlInvstgtdPties(InvestigatedParties1Choice value) {
        this.addtlInvstgtdPties = value;
    }

    /**
     * 获取addtlInf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * 设置addtlInf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlInf(String value) {
        this.addtlInf = value;
    }

}
