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
 * <p>Document complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Document">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InfReqOpng" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}InformationRequestOpeningV01"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "infReqOpng"
})
public class Document {

    @XmlElement(name = "InfReqOpng", required = true)
    protected InformationRequestOpeningV01 infReqOpng;

    /**
     * 获取infReqOpng属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InformationRequestOpeningV01 }
     *     
     */
    public InformationRequestOpeningV01 getInfReqOpng() {
        return infReqOpng;
    }

    /**
     * 设置infReqOpng属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InformationRequestOpeningV01 }
     *     
     */
    public void setInfReqOpng(InformationRequestOpeningV01 value) {
        this.infReqOpng = value;
    }

}
