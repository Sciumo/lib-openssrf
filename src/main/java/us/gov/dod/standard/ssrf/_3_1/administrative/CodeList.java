package us.gov.dod.standard.ssrf._3_1.administrative;

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.Administrative;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCAC;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCAO;

/**
 * CodeList contains the actions necessary to create or delete a code entry in a
 * given Code List.
 * <p>
 * Element of {@link Administrative}
 * <p>
 * Sub-Element is {@link Code}
 * <p>
 * Example:
 * <pre>
 * &lt;CodeList&gt;
 *   &lt;Action cls="U"&gt;Add Code&lt;/Action&gt;
 *   &lt;CodeListCode cls="U"&gt;CAS&lt;/CodeListCode&gt;
 *   &lt;EffectiveDate cls="U"&gt;2011-12-25&lt;/EffectiveDate&gt;
 *   &lt;Code&gt;
 *     &lt;Value cls="U"&gt;Jerking&lt;/Value&gt;
 *     &lt;Description cls="U"&gt;Moving wildly in all directions&lt;/Description&gt;
 *   &lt;/Code&gt;
 * &lt;/CodeList&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeList", propOrder = {
  "action",
  "codeListCode",
  "effectiveDate",
  "description",
  "origin",
  "code"
})
public class CodeList {

  /**
   * Action - Action Required (Required)    * <p>
   * The intended type of modification to the given code list.
   * <p>
   * Format is L:CAC
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Action", required = true)
  private TString action;
  /**
   * CodeListCode - Code List 3-letter Code (Required)    * <p>
   * The three-letter code of an existing Code List to be modified, or an unused
   * three-letter code in the case of the creation of a new Code List.
   * <p>
   * Format is US(3)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "CodeListCode", required = true)
  private US3 codeListCode;
  /**
   * EffectiveDate - Effective Date (Required)    * <p>
   * The date by which the dataset is to be operational or effective.
   * <p>
   * Format is Date
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "EffectiveDate", required = true)
  private D effectiveDate;
  /**
   * Description - New Code List Description (Optional)    * <p>
   * The description of the intended contents of new code list, and the
   * element(s) where it will be used.
   * <p>
   * Format is Memo
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Description", required = false)
  private MEMO description;
  /**
   * Origin - Originating Country/Body (Optional)    * <p>
   * The country or organisation which is using the modified or new code.
   * <p>
   * Format is L:CAO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Origin", required = false)
  private TString origin;
  /**
   * CodeListCode - Code List 3-letter Code (Required)    * <p>
   * The three-letter code of an existing Code List to be modified, or an unused
   * three-letter code in the case of the creation of a new Code List.
   * <p>
   * Format is US(3)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Code")
  private Set<Code> code;

  /**
   * Get the intended type of modification to the given code list..
   * <p>
   * @return the Action value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getAction() {
    return action;
  }

  /**
   * Set the intended type of modification to the given code list..
   * <p>
   * @param value the Action value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setAction(TString value) {
    this.action = value;
  }

  /**
   * Determine if the Action is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAction() {
    return (this.action != null ? this.action.isSetValue() : false);
  }

  /**
   * Get the three-letter code of an existing Code List to be modified, or an
   * unused three-letter code in the case of the creation of a new Code List..
   * <p>
   * @return a {@link US3} instance
   * @since 3.1.0
   */
  public US3 getCodeListCode() {
    return codeListCode;
  }

  /**
   * Set the three-letter code of an existing Code List to be modified, or an
   * unused three-letter code in the case of the creation of a new Code List..
   * <p>
   * @param value a {@link US3} instance
   * @since 3.1.0
   */
  public void setCodeListCode(US3 value) {
    this.codeListCode = value;
  }

  /**
   * Determine if the CodeListCode is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCodeListCode() {
    return (this.codeListCode != null ? this.codeListCode.isSetValue() : false);
  }

  /**
   * Get the date by which the dataset is to be operational or effective..
   * <p>
   * @return a {@link D} instance
   * @since 3.1.0
   */
  public D getEffectiveDate() {
    return effectiveDate;
  }

  /**
   * Set the date by which the dataset is to be operational or effective..
   * <p>
   * @param value a {@link D} instance
   * @since 3.1.0
   */
  public void setEffectiveDate(D value) {
    this.effectiveDate = value;
  }

  /**
   * Determine if the EffectiveDate is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEffectiveDate() {
    return (this.effectiveDate != null ? this.effectiveDate.isSetValue() : false);
  }

  /**
   * Get the description of the intended contents of new code list, and the
   * element(s) where it will be used..
   * <p>
   * @return a {@link MEMO} instance
   * @since 3.1.0
   */
  public MEMO getDescription() {
    return description;
  }

  /**
   * Set the description of the intended contents of new code list, and the
   * element(s) where it will be used..
   * <p>
   * @param value a {@link MEMO} instance
   * @since 3.1.0
   */
  public void setDescription(MEMO value) {
    this.description = value;
  }

  /**
   * Determine if the Description is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDescription() {
    return (this.description != null ? this.description.isSetValue() : false);
  }

  /**
   * Get the country or organisation which is using the modified or new code..
   * <p>
   * @return the Origin value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getOrigin() {
    return origin;
  }

  /**
   * Set the country or organisation which is using the modified or new code..
   * <p>
   * @param value the Origin value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setOrigin(TString value) {
    this.origin = value;
  }

  /**
   * Determine if the Origin is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOrigin() {
    return (this.origin != null ? this.origin.isSetValue() : false);
  }

  /**
   * Get the three-letter code of an existing Code List to be modified, or an
   * unused three-letter code in the case of the creation of a new Code List..
   * <p>
   * @return a {@link Code} instance
   * @since 3.1.0
   */
  public Set<Code> getCode() {
    if (code == null) {
      code = new HashSet<>();
    }
    return this.code;
  }

  /**
   * Determine if the Code is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCode() {
    return ((this.code != null) && (!this.code.isEmpty()));
  }

  /**
   * Clear the Code field. This sets the field to null.
   */
  public void unsetCode() {
    this.code = null;
  }

  /**
   * Set the intended type of modification to the given code list.
   * <p>
   * @param value An instances of type {@link ListCAC}.
   * @return The current CodeList object instance.
   * @since 3.1.0
   */
  public CodeList withAction(ListCAC value) {
    setAction(new TString(value.value()));
    return this;
  }

  /**
   * Set the three-letter code of an existing Code List to be modified, or an
   * unused three-letter code in the case of the creation of a new Code List.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current CodeList object instance.
   * @since 3.1.0
   */
  public CodeList withCodeListCode(String value) {
    setCodeListCode(new US3(value));
    return this;
  }

  /**
   * Set the date by which the dataset is to be operational or effective.
   * <p>
   * @param value An instances of type {@link Calendar}.
   * @return The current CodeList object instance.
   * @since 3.1.0
   */
  public CodeList withEffectiveDate(Calendar value) {
    setEffectiveDate(new D(value));
    return this;
  }

  /**
   * Set the date by which the dataset is to be operational or effective.
   * <p>
   * @param value An instances of type {@link Date}.
   * @return The current CodeList object instance.
   * @since 3.1.0
   */
  public CodeList withEffectiveDate(Date value) {
    setEffectiveDate(new D(value));
    return this;
  }

  /**
   * Set the description of the intended contents of new code list, and the
   * element(s) where it will be used.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current CodeList object instance.
   * @since 3.1.0
   */
  public CodeList withDescription(String value) {
    setDescription(new MEMO(value));
    return this;
  }

  /**
   * Set the country or organisation which is using the modified or new code.
   * <p>
   * @param value An instances of type {@link ListCAO}.
   * @return The current CodeList object instance.
   * @since 3.1.0
   */
  public CodeList withOrigin(ListCAO value) {
    setOrigin(new TString(value.value()));
    return this;
  }

  /**
   * Set the three-letter code of an existing Code List to be modified, or an
   * unused three-letter code in the case of the creation of a new Code List.
   * <p>
   * @param values One or more instances of type {@link Code...}.
   * @return The current CodeList object instance.
   * @since 3.1.0
   */
  public CodeList withCode(Code... values) {
    if (values != null) {
      getCode().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the three-letter code of an existing Code List to be modified, or an
   * unused three-letter code in the case of the creation of a new Code List.
   * <p>
   * @param values A collection of {@link Code} instances
   * @return The current CodeList object instance.
   * @since 3.1.0
   */
  public CodeList withCode(Collection<Code> values) {
    if (values != null) {
      getCode().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this CodeList instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "CodeList {"
           + (action != null ? "\n action [" + action + "]" : "")
           + (code != null ? "\n code [" + code + "]" : "")
           + (codeListCode != null ? "\n codeListCode [" + codeListCode + "]" : "")
           + (description != null ? "\n description [" + description + "]" : "")
           + (effectiveDate != null ? "\n effectiveDate [" + effectiveDate + "]" : "")
           + (origin != null ? "\n origin [" + origin + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link CodeList} requires
   * {@link TString Action}, {@link US3 CodeListCode}, {@link D EffectiveDate}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetAction() && isSetCodeListCode() && isSetEffectiveDate();
  }

}
