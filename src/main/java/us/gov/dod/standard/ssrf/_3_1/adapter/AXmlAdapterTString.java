/*
 * Copyright 2015 Key Bridge LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package us.gov.dod.standard.ssrf._3_1.adapter;

import java.util.Locale;
import java.util.regex.Pattern;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.TString;

/**
 * Abstract String type XmlAdapter.
 * <p>
 * The maximum and minimum string lengths are identified in the constructor.
 * <p>
 * Sx is a character string of x characters maximum, USx is a Uppercase
 * character string of x characters maximum (the attribute accepts only upper
 * case characters).
 * <p>
 * This abstract adapter converts between a {@link java.lang.String} and a
 * {@link String}.
 *
 * @author Jesse Caulfield
 */
public abstract class AXmlAdapterTString extends XmlAdapter<String, TString> {

  /**
   * "XmlAdapter". The standard adapter name prefix. This is used when
   * constructing an error message.
   */
  private static final String NAME_PREFIX = "XmlAdapter";

  /**
   * The minimum string length.
   */
  private final Integer minLength;
  /**
   * The maximum string length.
   */
  private final Integer maxLength;
  /**
   * Indicator that the string should be converted to upper case. If FALSE then
   * the string is passed un-converted (mixed-case).
   */
  private final Boolean upperCase;
  /**
   * The REGEX pattern that the string must conform to.
   */
  private final String pattern;

  public AXmlAdapterTString(Integer minLength, Integer maxLength) {
    this.minLength = minLength;
    this.maxLength = maxLength;
    this.upperCase = false;
    this.pattern = null;
  }

  public AXmlAdapterTString(Integer minLength, Integer maxLength, String pattern) {
    this.minLength = minLength;
    this.maxLength = maxLength;
    this.upperCase = false;
    this.pattern = pattern;
  }

  public AXmlAdapterTString(Integer minLength, Integer maxLength, boolean upperCase, String pattern) {
    this.minLength = minLength;
    this.maxLength = maxLength;
    this.upperCase = upperCase;
    this.pattern = pattern;
  }

  /**
   * Convert a bound type to a value type.
   * <p>
   * This is called when converting an object to XML.
   *
   * @param v The value to be converted. Can be null.
   * @return the converted value
   * @throws Exception if there's an error during the conversion. The caller is
   *                   responsible for reporting the error to the user through
   *                   ValidationEventHandler.
   */
  @Override
  public String marshal(TString v) throws Exception {
    return convert(v.getValue());
  }

  /**
   * Convert a value type to a bound type.
   * <p>
   * This is called with converting XML to an object.
   *
   * @param v The value to be converted. Can be null.
   * @return the converted value
   * @throws Exception if there's an error during the conversion. The caller is
   *                   responsible for reporting the error to the user through
   *                   ValidationEventHandler.
   */
  @Override
  public TString unmarshal(String v) throws Exception {
    return new TString(convert(v));
  }

  /**
   * Internal method to perform the validation.
   *
   * @param v The value to be converted. Can be null.
   * @return the converted value
   * @throws Exception if there's an error during the conversion. The caller is
   *                   responsible for reporting the error to the user through
   *                   ValidationEventHandler.
   */
  private String convert(String v) throws Exception {
    if (v == null) {
      return null;
    }
    if (minLength != null && v.length() < minLength) {
      throw new Exception("String length violation " + this.getClass().getSimpleName().replace(NAME_PREFIX, "") + " [" + minLength + "-" + maxLength + "]" + " with length = " + v.length() + ".");
    }
    if (maxLength != null && v.length() > maxLength) {
      throw new Exception("String length violation " + this.getClass().getSimpleName().replace(NAME_PREFIX, "") + " [" + minLength + "-" + maxLength + "]" + " with length = " + v.length() + ".");
    }
    /**
     * If the string length is valid then validate the pattern if applicable.
     */
    if (pattern != null) {
      if (!Pattern.compile(pattern).matcher(v).find()) {
        throw new Exception("String pattern violation " + this.getClass().getSimpleName().replace(NAME_PREFIX, "") + " [" + pattern + "] for \"" + v + "\".");
      }
    }
    /**
     * Convert to upper case if indicated.
     */
    return upperCase ? v.toUpperCase(Locale.getDefault()) : v;
  }

  /**
   * Get the maximum string length.
   *
   * @return the maximum string length.
   */
  public Integer getMaxLength() {
    return maxLength;
  }

  /**
   * Get the minimum string length.
   *
   * @return the minimum string length.
   */
  public Integer getMinLength() {
    return minLength;
  }

}
