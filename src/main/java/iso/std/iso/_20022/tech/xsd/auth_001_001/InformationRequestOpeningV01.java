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
 * <p>InformationRequestOpeningV01 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="InformationRequestOpeningV01">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InvstgtnId" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}Max35Text"/>
 *         &lt;element name="LglMndtBsis" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}LegalMandate1"/>
 *         &lt;element name="CnfdtltySts" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}YesNoIndicator"/>
 *         &lt;element name="DueDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}DueDate1" minOccurs="0"/>
 *         &lt;element name="InvstgtnPrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}DateOrDateTimePeriodChoice"/>
 *         &lt;element name="SchCrit" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}SearchCriteria1Choice"/>
 *         &lt;element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformationRequestOpeningV01", propOrder = {
    "invstgtnId",
    "lglMndtBsis",
    "cnfdtltySts",
    "dueDt",
    "invstgtnPrd",
    "schCrit",
    "splmtryData"
})
public class InformationRequestOpeningV01 {

    @XmlElement(name = "InvstgtnId", required = true)
    protected String invstgtnId;
    @XmlElement(name = "LglMndtBsis", required = true)
    protected LegalMandate1 lglMndtBsis;
    @XmlElement(name = "CnfdtltySts")
    protected boolean cnfdtltySts;
    @XmlElement(name = "DueDt")
    protected DueDate1 dueDt;
    @XmlElement(name = "InvstgtnPrd", required = true)
    protected DateOrDateTimePeriodChoice invstgtnPrd;
    @XmlElement(name = "SchCrit", required = true)
    protected SearchCriteria1Choice schCrit;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * 获取invstgtnId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvstgtnId() {
        return invstgtnId;
    }

    /**
     * 设置invstgtnId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvstgtnId(String value) {
        this.invstgtnId = value;
    }

    /**
     * 获取lglMndtBsis属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LegalMandate1 }
     *     
     */
    public LegalMandate1 getLglMndtBsis() {
        return lglMndtBsis;
    }

    /**
     * 设置lglMndtBsis属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LegalMandate1 }
     *     
     */
    public void setLglMndtBsis(LegalMandate1 value) {
        this.lglMndtBsis = value;
    }

    /**
     * 获取cnfdtltySts属性的值。
     * 
     */
    public boolean isCnfdtltySts() {
        return cnfdtltySts;
    }

    /**
     * 设置cnfdtltySts属性的值。
     * 
     */
    public void setCnfdtltySts(boolean value) {
        this.cnfdtltySts = value;
    }

    /**
     * 获取dueDt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DueDate1 }
     *     
     */
    public DueDate1 getDueDt() {
        return dueDt;
    }

    /**
     * 设置dueDt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DueDate1 }
     *     
     */
    public void setDueDt(DueDate1 value) {
        this.dueDt = value;
    }

    /**
     * 获取invstgtnPrd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateOrDateTimePeriodChoice }
     *     
     */
    public DateOrDateTimePeriodChoice getInvstgtnPrd() {
        return invstgtnPrd;
    }

    /**
     * 设置invstgtnPrd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateOrDateTimePeriodChoice }
     *     
     */
    public void setInvstgtnPrd(DateOrDateTimePeriodChoice value) {
        this.invstgtnPrd = value;
    }

    /**
     * 获取schCrit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteria1Choice }
     *     
     */
    public SearchCriteria1Choice getSchCrit() {
        return schCrit;
    }

    /**
     * 设置schCrit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteria1Choice }
     *     
     */
    public void setSchCrit(SearchCriteria1Choice value) {
        this.schCrit = value;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
    }

}
