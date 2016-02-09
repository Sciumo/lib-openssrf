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
package us.gov.dod.standard.ssrf._3_1.ssreply;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_1.Common;
import us.gov.dod.standard.ssrf._3_1.Location;
import us.gov.dod.standard.ssrf._3_1.SSReply;
import us.gov.dod.standard.ssrf._3_1.Satellite;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.Serial;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_1.ssrequest.Stage;

/**
 * StageLocation defines locations where the equipment or system is allowed or
 * forbidden from use.
 * <p>
 * Element of {@link SSReply}, {@link Stage}
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StageLocation", propOrder = {
  "locSatRef",
  "excluded"
})
public class StageLocation {

  /**
   * LocSatRef - Location or Satellite Reference (Required)
   * <p>
   * The serial of a Location or satellite.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LocSatRef", required = true)
  private Serial locSatRef;
  /**
   * Excluded - Shape is Excluded (Optional)
   * <p>
   * "Yes" to indicate that the shape is to be excluded from the set. If
   * omitted, a "No" SHOULD be assumed by processing applications, meaning that
   * the shape is included by default.
   * <p>
   * Format is L:CBO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Excluded", required = false)
  private TString excluded;

  /**
   * Get the serial of a Location or satellite..
   * <p>
   * @return a {@link Serial} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getLocSat()} instead.
   */
  @Deprecated
  public Serial getLocSatRef() {
    return locSatRef;
  }

  /**
   * Set the serial of a Location or satellite..
   * <p>
   * @param value a {@link Serial} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setLocSat(Common)} instead.
   */
  @Deprecated
  public void setLocSatRef(Serial value) {
    this.locSatRef = value;
  }

  /**
   * Determine if the LocSatRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLocSatRef() {
    return (this.locSatRef != null ? this.locSatRef.isSetValue() : false);
  }

  /**
   * Get "Yes" to indicate that the shape is to be excluded from the set. If
   * omitted, a "No" SHOULD be assumed by processing applications, meaning that
   * the shape is included by default..
   * <p>
   * @return the Excluded value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getExcluded() {
    return excluded;
  }

  /**
   * Set "Yes" to indicate that the shape is to be excluded from the set. If
   * omitted, a "No" SHOULD be assumed by processing applications, meaning that
   * the shape is included by default..
   * <p>
   * @param value the Excluded value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setExcluded(TString value) {
    this.excluded = value;
  }

  /**
   * Determine if the Excluded is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetExcluded() {
    return (this.excluded != null ? this.excluded.isSetValue() : false);
  }

  /**
   * Set the serial of a Location or satellite.
   * <p>
   * @param value An instances of type {@link Serial}.
   * @return The current StageLocation object instance.
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withLocSat(Common)} instead.
   */
  @Deprecated
  public StageLocation withLocSatRef(Serial value) {
    setLocSatRef(value);
    return this;
  }

  /**
   * Set "Yes" to indicate that the shape is to be excluded from the set. If
   * omitted, a "No" SHOULD be assumed by processing applications, meaning that
   * the shape is included by default.
   * <p>
   * @param value An instances of type {@link ListCBO}.
   * @return The current StageLocation object instance.
   * @since 3.1.0
   */
  public StageLocation withExcluded(ListCBO value) {
    setExcluded(new TString(value.value()));
    return this;
  }

  /**
   * Get a string representation of this StageLocation instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "\n  StageLocation {"
           + (excluded != null ? " excluded [" + excluded + "]" : "")
           + (locSatRef != null ? " locSatRef [" + locSatRef + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link StageLocation} requires {@link Serial LocSatRef}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetLocSatRef();
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * LocSatRef - Location or Satellite Reference (Required)
   * <p>
   * The serial of a Location or satellite.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Common<?> locSat;

  /**
   * Get the serial of a Location or satellite..
   * <p>
   * @return a {@link Common} instance
   * @since 3.1.0
   */
  public Common<?> getLocSat() {
    return locSat;
  }

  /**
   * Determine if the locSat field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLocSat() {
    return this.locSat != null;
  }

  /**
   * Set the serial of a Location or satellite.
   * <p>
   * @param value An instances of type {@link Common<?>}.
   * @return The current StageLocation object instance.
   * @since 3.1.0
   */
  public StageLocation withLocSat(Common<?> value) {
    this.locSat = value;
    return this;
  }

  /**
   * Update the SSRF data type references in this StageLocation record.
   * <p>
   * This method builds the exported {@link #locSatRef} field with values from
   * the transient {@link #locSat} field. This method should typically be called
   * after the StageLocation is configured and (optionally) before exporting an
   * SSRF message.
   * <p>
   * @since 3.1.0
   */
  public void prepare() {
    this.locSatRef = locSat != null ? locSat.getSerial() : this.locSatRef;
  }

  /**
   * Update the SSRF data type references in this StageLocation record after
   * loading from XML.
   * <p>
   * This method builds the transient {@link #locSat} with values from the
   * imported {@link #locSatRef} field. This method should typically be called
   * after the StageLocation is imported from XML. * @param root the SSRF root
   * instance.
   * <p>
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
    if (locSatRef == null || !locSatRef.isSetValue()) {
      return;
    }
    for (Location instance : root.getLocation()) {
      if (locSatRef.equals(instance.getSerial())) {
        locSat = instance;
        return;
      }
    }
    for (Satellite instance : root.getSatellite()) {
      if (locSatRef.equals(instance.getSerial())) {
        locSat = instance;
        return;
      }
    }
  }//</editor-fold>

}
