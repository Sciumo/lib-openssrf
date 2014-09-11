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
package us.gov.dod.standard.ssrf._3_0.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ListCUT.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;simpleType name="ListCUT"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S25"> &lt;enumeration
 * value="Request Temporary"/> &lt;enumeration value="Request Permanent"/>
 * &lt;enumeration value="Approved Temporary"/> &lt;enumeration value="Approved
 * Permanent"/> &lt;enumeration value="Cancelled/Rejected"/> &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListCUT")
@XmlEnum
public enum ListCUT {

  @XmlEnumValue("Request Temporary")
  REQUEST___TEMPORARY("Request Temporary"),
  @XmlEnumValue("Request Permanent")
  REQUEST___PERMANENT("Request Permanent"),
  @XmlEnumValue("Approved Temporary")
  APPROVED___TEMPORARY("Approved Temporary"),
  @XmlEnumValue("Approved Permanent")
  APPROVED___PERMANENT("Approved Permanent"),
  @XmlEnumValue("Cancelled/Rejected")
  CANCELLED___REJECTED("Cancelled/Rejected");
  private final String value;

  ListCUT(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCUT fromValue(String v) {
    for (ListCUT c : ListCUT.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}