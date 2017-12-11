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
 * <p>LegalMandate1 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="LegalMandate1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Prgrph" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}Max35Text"/>
 *         &lt;element name="Dsclmr" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}Max350Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegalMandate1", propOrder = {
    "prgrph",
    "dsclmr"
})
public class LegalMandate1 {

    @XmlElement(name = "Prgrph", required = true)
    protected String prgrph;
    @XmlElement(name = "Dsclmr")
    protected String dsclmr;

    /**
     * 获取prgrph属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrgrph() {
        return prgrph;
    }

    /**
     * 设置prgrph属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrgrph(String value) {
        this.prgrph = value;
    }

    /**
     * 获取dsclmr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsclmr() {
        return dsclmr;
    }

    /**
     * 设置dsclmr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsclmr(String value) {
        this.dsclmr = value;
    }

}
