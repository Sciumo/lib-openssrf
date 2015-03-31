package us.gov.dod.standard.ssrf._3_1.multiple;

import java.util.*;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_1.*;
import us.gov.dod.standard.ssrf._3_1.assignment.Configuration;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * RxRef contains the reference of a Receiver, and optionnally some of its
 * RxModes and the associated Antennas and AntMode.
 * <p>
 * Element of {@link Configuration}
 * <p>
 * Sub-Elements are {@link RxAntModeRef}, {@link RxModeRef}
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RxRef", propOrder = {
  "serial",
  "rxModeRef",
  "rxAntModeRef"
})
public class RxRef {

  /**
   * Serial - Receiver Serial (Required)    * <p>
   * The identifier of the related Receiver used in this configuration. The same
   * receiver can be referenced in different RxRef elements in order to properly
   * group receiver modes with antenna modes.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Serial", required = true)
  private Serial serial;
  /**
   * RxModeRef (Optional)
   * <p>
   * RxModeRef references a RxMode of the receiver used in a specific
   * configuration.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RxModeRef", nillable = true)
  private Set<RxModeRef> rxModeRef;
  /**
   * RxAntModeRef (Optional)
   * <p>
   * RxAntModeRef contains references to the Antenna and its AntMode, used to
   * construct a Receiver Configuration.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RxAntModeRef")
  private Set<RxAntModeRef> rxAntModeRef;

  /**
   * Get the identifier of the related Receiver used in this configuration. The
   * same receiver can be referenced in different RxRef elements in order to
   * properly group receiver modes with antenna modes..
   * <p>
   * @return a {@link Serial} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getReceiver()} instead.
   */
  @Deprecated
  public Serial getSerial() {
    return serial;
  }

  /**
   * Set the identifier of the related Receiver used in this configuration. The
   * same receiver can be referenced in different RxRef elements in order to
   * properly group receiver modes with antenna modes..
   * <p>
   * @param value a {@link Serial} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setReceiver(Receiver)} instead.
   */
  @Deprecated
  public void setSerial(Serial value) {
    this.serial = value;
  }

  /**
   * Determine if the Serial is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSerial() {
    return (this.serial != null ? this.serial.isSetValue() : false);
  }

  /**
   * Get the RxModeRef
   * <p>
   * Complex element RxModeRef references a RxMode of the receiver used in a
   * specific configuration..
   * <p>
   * @return a {@link RxModeRef} instance
   * @since 3.1.0
   */
  public Set<RxModeRef> getRxModeRef() {
    if (rxModeRef == null) {
      rxModeRef = new HashSet<>();
    }
    return this.rxModeRef;
  }

  /**
   * Determine if the RxModeRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRxModeRef() {
    return ((this.rxModeRef != null) && (!this.rxModeRef.isEmpty()));
  }

  /**
   * Clear the RxModeRef field. This sets the field to null.
   */
  public void unsetRxModeRef() {
    this.rxModeRef = null;
  }

  /**
   * Get the RxAntModeRef
   * <p>
   * Complex element RxAntModeRef contains references to the Antenna and its
   * AntMode, used to construct a Receiver Configuration..
   * <p>
   * @return a {@link RxAntModeRef} instance
   * @since 3.1.0
   */
  public Set<RxAntModeRef> getRxAntModeRef() {
    if (rxAntModeRef == null) {
      rxAntModeRef = new HashSet<>();
    }
    return this.rxAntModeRef;
  }

  /**
   * Determine if the RxAntModeRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRxAntModeRef() {
    return ((this.rxAntModeRef != null) && (!this.rxAntModeRef.isEmpty()));
  }

  /**
   * Clear the RxAntModeRef field. This sets the field to null.
   */
  public void unsetRxAntModeRef() {
    this.rxAntModeRef = null;
  }

  /**
   * Set the identifier of the related Receiver used in this configuration. The
   * same receiver can be referenced in different RxRef elements in order to
   * properly group receiver modes with antenna modes.
   * <p>
   * @param value An instances of type {@link Serial}.
   * @return The current RxRef object instance.
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withReceiver(Receiver)} instead.
   */
  @Deprecated
  public RxRef withSerial(Serial value) {
    setSerial(value);
    return this;
  }

  /**
   * Set the RxModeRef
   * <p>
   * Complex element RxModeRef references a RxMode of the receiver used in a
   * specific configuration.
   * <p>
   * @param values One or more instances of type {@link RxModeRef...}.
   * @return The current RxRef object instance.
   * @since 3.1.0
   */
  public RxRef withRxModeRef(RxModeRef... values) {
    if (values != null) {
      getRxModeRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the RxModeRef
   * <p>
   * Complex element RxModeRef references a RxMode of the receiver used in a
   * specific configuration.
   * <p>
   * @param values A collection of {@link RxModeRef} instances
   * @return The current RxRef object instance.
   * @since 3.1.0
   */
  public RxRef withRxModeRef(Collection<RxModeRef> values) {
    if (values != null) {
      getRxModeRef().addAll(values);
    }
    return this;
  }

  /**
   * Set the RxAntModeRef
   * <p>
   * Complex element RxAntModeRef contains references to the Antenna and its
   * AntMode, used to construct a Receiver Configuration.
   * <p>
   * @param values One or more instances of type {@link RxAntModeRef...}.
   * @return The current RxRef object instance.
   * @since 3.1.0
   */
  public RxRef withRxAntModeRef(RxAntModeRef... values) {
    if (values != null) {
      getRxAntModeRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the RxAntModeRef
   * <p>
   * Complex element RxAntModeRef contains references to the Antenna and its
   * AntMode, used to construct a Receiver Configuration.
   * <p>
   * @param values A collection of {@link RxAntModeRef} instances
   * @return The current RxRef object instance.
   * @since 3.1.0
   */
  public RxRef withRxAntModeRef(Collection<RxAntModeRef> values) {
    if (values != null) {
      getRxAntModeRef().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this RxRef instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "RxRef {"
           + (rxAntModeRef != null ? "\n rxAntModeRef [" + rxAntModeRef + "]" : "")
           + (rxModeRef != null ? "\n rxModeRef [" + rxModeRef + "]" : "")
           + (serial != null ? "\n serial [" + serial + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link RxRef} requires {@link Serial Serial}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetSerial();
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * Serial - Receiver Serial (Required)    * <p>
   * The identifier of the related Receiver used in this configuration. The same
   * receiver can be referenced in different RxRef elements in order to properly
   * group receiver modes with antenna modes.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Receiver receiver;

  /**
   * Get the identifier of the related Receiver used in this configuration. The
   * same receiver can be referenced in different RxRef elements in order to
   * properly group receiver modes with antenna modes..
   * <p>
   * @return a {@link Receiver} instance
   * @since 3.1.0
   */
  public Receiver getReceiver() {
    return receiver;
  }

  /**
   * Determine if the receiver field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetReceiver() {
    return this.receiver != null;
  }

  /**
   * Set the identifier of the related Receiver used in this configuration. The
   * same receiver can be referenced in different RxRef elements in order to
   * properly group receiver modes with antenna modes.
   * <p>
   * @param value An instances of type {@link Receiver}.
   * @return The current RxRef object instance.
   * @since 3.1.0
   */
  public RxRef withReceiver(Receiver value) {
    this.receiver = value;
    return this;
  }

  /**
   * Update the SSRF data type references in this RxRef record.
   * <p>
   * This method builds the exported {@link #serial} field with values from the
   * transient {@link #receiver} field. This method should typically be called
   * after the RxRef is configured and (optionally) before exporting an SSRF
   * message.
   * <p>
   * @since 3.1.0
   */
  public void prepare() {
    this.serial = receiver != null ? receiver.getSerial() : null;
  }

  /**
   * Update the SSRF data type references in this RxRef record after loading
   * from XML.
   * <p>
   * This method builds the transient {@link #receiver} with values from the
   * imported {@link #serial} field. This method should typically be called
   * after the RxRef is imported from XML. * @param root the SSRF root instance.
   * <p>
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
    if (serial == null || !serial.isSetValue()) {
      return;
    }
    for (Receiver instance : root.getReceiver()) {
      if (serial.equals(instance.getSerial())) {
        receiver = instance;
        return;
      }
    }
  }//</editor-fold>

}
