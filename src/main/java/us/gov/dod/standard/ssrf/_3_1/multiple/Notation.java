/* 
 * Copyright 2014 Key Bridge Global LLC.
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
package us.gov.dod.standard.ssrf._3_1.multiple;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.antenna.UsingCountries;
import us.gov.dod.standard.ssrf._3_1.assignment.Configuration;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCEN;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListUNT;

/**
 * Notation contains the electronic identification for a pulsed or non-pulsed
 * electromagnetic emission. It includes but is not limited to Communications
 * Emitter Notation (CENOT) and Electronic Intelligence Notation (ELNOT).
 * <p>
 * Element of {@link Configuration}
 * <p>
 * Sub-Elements are
 * {@link NotationTimeline}, {@link PotentialVictims}, {@link UsingCountries}
 * <p>
 * Example:
 * <pre>
 * &lt;Notation&gt;
 *   &lt;Code cls="U"&gt;869812&lt;/Code&gt;
 *   &lt;Type cls="U"&gt;ELNOT&lt;/Type&gt;
 *   &lt;Status cls="U"&gt;Active&lt;/Status&gt;
 *   &lt;NotationTimeline&gt;
 *     &lt;Code cls="U"&gt;869812&lt;/Code&gt;
 *     &lt;Status cls="U"&gt;Active&lt;/Status&gt;
 *     &lt;StatusChangeDateTime cls="U"&gt;2014-12-25T01:23:001Z&lt;/StatusChangeDateTime&gt;
 *     &lt;Type cls="U"&gt;ELNOT&lt;/Type&gt;
 *   &lt;/NotationTimeline&gt;
 *   &lt;PotentialVictims&gt;
 *     &lt;Type cls="U"&gt;ELNOT&lt;/Type&gt;
 *     &lt;VictimName cls="U"&gt;Target 478&lt;/VictimName&gt;
 *     &lt;VictimNotation cls="U"&gt;B000Z&lt;/VictimNotation&gt;
 *   &lt;/PotentialVictims&gt;
 *   &lt;UsingCountries&gt;
 *     &lt;CountryName cls="U"&gt;USA&lt;/CountryName&gt;
 *     &lt;Role cls="U"&gt;Source&lt;/Role&gt;
 *   &lt;/UsingCountries&gt;
 * &lt;/Notation&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Notation", propOrder = {
  "code",
  "type",
  "status",
  "notationTimeline",
  "potentialVictims",
  "usingCountries"
})
public class Notation {

  /**
   * US:Code - Notation Code (Required)
   * <p>
   * An alphanumeric combination that is used to identify a particular
   * Notation/Signal.
   * <p>
   * Format is US(20)
   */
  @XmlElement(name = "Code", required = true)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterUS20.class)
  private TString code;
  /**
   * US:Type - Notation Type (Optional)
   * <p>
   * The type of Notation.
   * <p>
   * Format is L:CEN
   */
  @XmlElement(name = "Type", required = true)
  private TString type;
  /**
   * US:Status - Notation Status (Optional)
   * <p>
   * The status of the future, prior, or associated, Notation.
   * <p>
   * Format is L:UNT
   */
  @XmlElement(name = "Status", required = false)
  private TString status;
  /**
   * US:NotationTimeline (Optional)
   * <p>
   * NotationTimeline (US) provides history information for a specific notation
   * or signal.
   */
  @XmlElement(name = "NotationTimeline")
  private Set<NotationTimeline> notationTimeline;
  /**
   * US:PotentialVictims (Optional)
   * <p>
   * PotentialVictims (US) contains the names of systems, or the Notations of
   * signals, which may be affected by the subject Notation/Signal.
   */
  @XmlElement(name = "PotentialVictims")
  private Set<PotentialVictims> potentialVictims;
  /**
   * US:UsingCountries (Optional)
   * <p>
   * UsingCountries (US) describes the countries that manufacture (Producing),
   * supply (Source), and use (Using) the Notation.
   */
  @XmlElement(name = "UsingCountries")
  private Set<UsingCountries> usingCountries;

  /**
   * Get an alphanumeric combination that is used to identify a particular
   * Notation/Signal.
   * <p>
   * @return the Code value in a {@link TString} data type
   */
  public TString getCode() {
    return code;
  }

  /**
   * Set an alphanumeric combination that is used to identify a particular
   * Notation/Signal.
   * <p>
   * @param value the Code value in a {@link TString} data type
   */
  public void setCode(TString value) {
    this.code = value;
  }

  /**
   * Determine if the Code is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCode() {
    return (this.code != null ? this.code.isSetValue() : false);
  }

  /**
   * Get the type of Notation.
   * <p>
   * @return the Type value in a {@link TString} data type
   */
  public TString getType() {
    return type;
  }

  /**
   * Set the type of Notation.
   * <p>
   * @param value the Type value in a {@link TString} data type
   */
  public void setType(TString value) {
    this.type = value;
  }

  /**
   * Determine if the Type is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetType() {
    return (this.type != null ? this.type.isSetValue() : false);
  }

  /**
   * Get the status of the future, prior, or associated, Notation.
   * <p>
   * @return the Status value in a {@link TString} data type
   */
  public TString getStatus() {
    return status;
  }

  /**
   * Set the status of the future, prior, or associated, Notation.
   * <p>
   * @param value the Status value in a {@link TString} data type
   */
  public void setStatus(TString value) {
    this.status = value;
  }

  /**
   * Determine if the Status is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStatus() {
    return (this.status != null ? this.status.isSetValue() : false);
  }

  /**
   * Get the US:NotationTimeline
   * <p>
   * Complex element NotationTimeline (US) provides history information for a
   * specific notation or signal.
   * <p>
   * @return a non-null but possibly empty list of {@link NotationTimeline}
   *         instances
   */
  public Set<NotationTimeline> getNotationTimeline() {
    if (notationTimeline == null) {
      notationTimeline = new HashSet<>();
    }
    return this.notationTimeline;
  }

  /**
   * Determine if the NotationTimeline is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNotationTimeline() {
    return ((this.notationTimeline != null) && (!this.notationTimeline.isEmpty()));
  }

  /**
   * Clear the NotationTimeline field. This sets the field to null.
   */
  public void unsetNotationTimeline() {
    this.notationTimeline = null;
  }

  /**
   * Get the US:PotentialVictims
   * <p>
   * Complex element PotentialVictims (US) contains the names of systems, or the
   * Notations of signals, which may be affected by the subject Notation/Signal.
   * <p>
   * @return a non-null but possibly empty list of {@link PotentialVictims}
   *         instances
   */
  public Set<PotentialVictims> getPotentialVictims() {
    if (potentialVictims == null) {
      potentialVictims = new HashSet<>();
    }
    return this.potentialVictims;
  }

  /**
   * Determine if the PotentialVictims is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPotentialVictims() {
    return ((this.potentialVictims != null) && (!this.potentialVictims.isEmpty()));
  }

  /**
   * Clear the PotentialVictims field. This sets the field to null.
   */
  public void unsetPotentialVictims() {
    this.potentialVictims = null;
  }

  /**
   * Get the US:UsingCountries
   * <p>
   * Complex element UsingCountries (US) describes the countries that
   * manufacture (Producing), supply (Source), and use (Using) the Notation.
   * <p>
   * @return a non-null but possibly empty list of {@link UsingCountries}
   *         instances
   */
  public Set<UsingCountries> getUsingCountries() {
    if (usingCountries == null) {
      usingCountries = new HashSet<>();
    }
    return this.usingCountries;
  }

  /**
   * Determine if the UsingCountries is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetUsingCountries() {
    return ((this.usingCountries != null) && (!this.usingCountries.isEmpty()));
  }

  /**
   * Clear the UsingCountries field. This sets the field to null.
   */
  public void unsetUsingCountries() {
    this.usingCountries = null;
  }

  /**
   * Set an alphanumeric combination that is used to identify a particular
   * Notation/Signal.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Notation object instance
   */
  public Notation withCode(String value) {
    setCode(new TString(value));
    return this;
  }

  /**
   * Set the type of Notation.
   * <p>
   * @param value An instances of type {@link ListCEN}
   * @return The current Notation object instance
   */
  public Notation withType(ListCEN value) {
    setType(new TString(value.value()));
    return this;
  }

  /**
   * Set the status of the future, prior, or associated, Notation.
   * <p>
   * @param value An instances of type {@link ListUNT}
   * @return The current Notation object instance
   */
  public Notation withStatus(ListUNT value) {
    setStatus(new TString(value.value()));
    return this;
  }

  /**
   * Set the US:NotationTimeline
   * <p>
   * Complex element NotationTimeline (US) provides history information for a
   * specific notation or signal.
   * <p>
   * @param values One or more instances of type {@link NotationTimeline}
   * @return The current Notation object instance
   */
  public Notation withNotationTimeline(NotationTimeline... values) {
    if (values != null) {
      getNotationTimeline().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the US:NotationTimeline
   * <p>
   * Complex element NotationTimeline (US) provides history information for a
   * specific notation or signal.
   * <p>
   * @param values A collection of {@link NotationTimeline} instances
   * @return The current Notation object instance
   */
  public Notation withNotationTimeline(Set<NotationTimeline> values) {
    if (values != null) {
      getNotationTimeline().addAll(values);
    }
    return this;
  }

  /**
   * Set the US:PotentialVictims
   * <p>
   * Complex element PotentialVictims (US) contains the names of systems, or the
   * Notations of signals, which may be affected by the subject Notation/Signal.
   * <p>
   * @param values One or more instances of type {@link PotentialVictims}
   * @return The current Notation object instance
   */
  public Notation withPotentialVictims(PotentialVictims... values) {
    if (values != null) {
      getPotentialVictims().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the US:PotentialVictims
   * <p>
   * Complex element PotentialVictims (US) contains the names of systems, or the
   * Notations of signals, which may be affected by the subject Notation/Signal.
   * <p>
   * @param values A collection of {@link PotentialVictims} instances
   * @return The current Notation object instance
   */
  public Notation withPotentialVictims(Set<PotentialVictims> values) {
    if (values != null) {
      getPotentialVictims().addAll(values);
    }
    return this;
  }

  /**
   * Set the US:UsingCountries
   * <p>
   * Complex element UsingCountries (US) describes the countries that
   * manufacture (Producing), supply (Source), and use (Using) the Notation.
   * <p>
   * @param values One or more instances of type {@link UsingCountries}
   * @return The current Notation object instance
   */
  public Notation withUsingCountries(UsingCountries... values) {
    if (values != null) {
      getUsingCountries().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the US:UsingCountries
   * <p>
   * Complex element UsingCountries (US) describes the countries that
   * manufacture (Producing), supply (Source), and use (Using) the Notation.
   * <p>
   * @param values A collection of {@link UsingCountries} instances
   * @return The current Notation object instance
   */
  public Notation withUsingCountries(Set<UsingCountries> values) {
    if (values != null) {
      getUsingCountries().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this Notation instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Notation {"
      + (notationTimeline != null ? " notationTimeline [" + notationTimeline + "]" : "")
      + (potentialVictims != null ? " potentialVictims [" + potentialVictims + "]" : "")
      + (status != null ? " status [" + status + "]" : "")
      + (usingCountries != null ? " usingCountries [" + usingCountries + "]" : "")
      + (code != null ? " code [" + code + "]" : "")
      + (type != null ? " type [" + type + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Notation} requires {@link TString Code}, {@link TString Type}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetCode() && isSetType();
  }

}
