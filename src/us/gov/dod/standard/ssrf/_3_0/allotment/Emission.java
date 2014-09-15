/* 
 * The MIT License
 *
 * Copyright 2014 Jesse Caulfield <jesse@caulfield.org>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package us.gov.dod.standard.ssrf._3_0.allotment;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TDecimal;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;

/**
 * <p>
 * Java class for Emission complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="Emission">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmsClass" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TEmsDes" minOccurs="0"/>
 *         &lt;element name="NecessaryBw" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/>
 *         &lt;element name="Power" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TdBW" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Emission", propOrder = {
  "emsClass",
  "necessaryBw",
  "power"
})
public class Emission {

  @XmlElement(name = "EmsClass", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterEMSDES.class)
  private TString emsClass;
  @XmlElement(name = "NecessaryBw", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal necessaryBw;
  @XmlElement(name = "Power", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDBW.class)
  private TDecimal power;

  /**
   * Gets the value of the emsClass property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getEmsClass() {
    return emsClass;
  }

  /**
   * Sets the value of the emsClass property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setEmsClass(TString value) {
    this.emsClass = value;
  }

  public boolean isSetEmsClass() {
    return (this.emsClass != null);
  }

  /**
   * Gets the value of the necessaryBw property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getNecessaryBw() {
    return necessaryBw;
  }

  /**
   * Sets the value of the necessaryBw property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setNecessaryBw(TDecimal value) {
    this.necessaryBw = value;
  }

  public boolean isSetNecessaryBw() {
    return (this.necessaryBw != null);
  }

  /**
   * Gets the value of the power property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getPower() {
    return power;
  }

  /**
   * Sets the value of the power property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setPower(TDecimal value) {
    this.power = value;
  }

  public boolean isSetPower() {
    return (this.power != null);
  }

  public Emission withEmsClass(String value) {
    setEmsClass(new TString(value));
    return this;
  }

  public Emission withNecessaryBw(Double value) {
    setNecessaryBw(new TDecimal(value));
    return this;
  }

  public Emission withPower(Double value) {
    setPower(new TDecimal(value));
    return this;
  }

}