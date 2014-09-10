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
package us.gov.dod.standard.ssrf._3_0.enumerate;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ListCFD.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;simpleType name="ListCFD"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S25"> &lt;enumeration
 * value="Location-Home"/> &lt;enumeration value="Location-Current"/>
 * &lt;enumeration value="Location-Planned"/> &lt;enumeration value="Operating
 * Area-Current"/> &lt;enumeration value="Operating Area-Planned"/>
 * &lt;enumeration value="Route-Current"/> &lt;enumeration
 * value="Route-Planned"/> &lt;enumeration value="Other"/> &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListCFD")
@XmlEnum
public enum ListCFD {

  /**
   * Home location of the force element
   * <p>
   */
  @XmlEnumValue("Location-Home")
  LOCATION___HOME("Location-Home"),
  /**
   * Physical location of the force element
   * <p>
   */
  @XmlEnumValue("Location-Current")
  LOCATION___CURRENT("Location-Current"),
  /**
   * Planned location of the force element
   * <p>
   */
  @XmlEnumValue("Location-Planned")
  LOCATION___PLANNED("Location-Planned"),
  /**
   * Operating area of the force element (typically a polygon / AOR)
   * <p>
   */
  @XmlEnumValue("Operating Area-Current")
  OPERATING___AREA___CURRENT("Operating Area-Current"),
  /**
   * Planned operating area
   * <p>
   */
  @XmlEnumValue("Operating Area-Planned")
  OPERATING___AREA___PLANNED("Operating Area-Planned"),
  /**
   * Current route
   * <p>
   */
  @XmlEnumValue("Route-Current")
  ROUTE___CURRENT("Route-Current"),
  /**
   * Planned route
   * <p>
   */
  @XmlEnumValue("Route-Planned")
  ROUTE___PLANNED("Route-Planned"),
  /**
   * Other
   * <p>
   */
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListCFD(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCFD fromValue(String v) {
    for (ListCFD c : ListCFD.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}