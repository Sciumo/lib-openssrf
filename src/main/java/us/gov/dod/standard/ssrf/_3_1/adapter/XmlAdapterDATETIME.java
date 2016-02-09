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

/**
 * SSRF DateTime type adapter.
 *
 * @author Jesse Caulfield
 */
public class XmlAdapterDATETIME extends AXmlAdapterCalendar {

  /**
   * "yyyy-MM-dd'T'HH:mm:ss.SSSZ". The DateTime pattern.
   * <p>
   * DT is a date / time value formatted in 20 to 24 characters as
   * YYYY-MM-DDThh:mm:ss[.ddd]Z (year-
   * month-day"T"hours:minutes:seconds.milliseconds"Z"), where the milliseconds
   * part is optional. This format is compliant with the W3C Recommendation on
   * XML Schema.
   */
  private static final String PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

  public XmlAdapterDATETIME() {
    super(PATTERN);
  }

}