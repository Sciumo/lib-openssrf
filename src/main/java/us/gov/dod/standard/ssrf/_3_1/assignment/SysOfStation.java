package us.gov.dod.standard.ssrf._3_1.assignment;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.Assignment;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * SysOfStation defines the name of the system that this assignment belongs and
 * whether or not the assignment provides assets to or uses another assignment
 * resources. It also describes linkages to or from other datasets.
 * <p>
 * Element of {@link Assignment}
 * <p>
 * Example:
 * <pre>
 * &lt;SysOfStation&gt;
 *   &lt;SysName cls="U"&gt;BALTIMORE LMR SYSTEM&lt;/SysName&gt;
 * &lt;/SysOfStation&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SysOfStation", propOrder = {
  "sysName",
  "numStations"
})
public class SysOfStation {

  /**
   * SysName - System Name (Optional)    * <p>
   * The name of the system to which the frequency assignment belongs. A system
   * is considered two or more equipment having a common property, usually
   * geographic, administrative, functional, or operational in nature.
   * <p>
   * Format is S30
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SysName", required = false)
  private S30 sysName;
  /**
   * NumStations - Number of Stations (Optional)    * <p>
   * The total number of stations associated with the Assignment.    * <p>
   * Format is UN(9)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NumStations", required = false)
  private UN9 numStations;

  /**
   * Get the name of the system to which the frequency assignment belongs. A
   * system is considered two or more equipment having a common property,
   * usually geographic, administrative, functional, or operational in nature..
   * <p>
   * @return a {@link S30} instance
   * @since 3.1.0
   */
  public S30 getSysName() {
    return sysName;
  }

  /**
   * Set the name of the system to which the frequency assignment belongs. A
   * system is considered two or more equipment having a common property,
   * usually geographic, administrative, functional, or operational in nature..
   * <p>
   * @param value a {@link S30} instance
   * @since 3.1.0
   */
  public void setSysName(S30 value) {
    this.sysName = value;
  }

  /**
   * Determine if the SysName is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSysName() {
    return (this.sysName != null ? this.sysName.isSetValue() : false);
  }

  /**
   * Get the total number of stations associated with the Assignment. .
   * <p>
   * @return a {@link UN9} instance
   * @since 3.1.0
   */
  public UN9 getNumStations() {
    return numStations;
  }

  /**
   * Set the total number of stations associated with the Assignment. .
   * <p>
   * @param value a {@link UN9} instance
   * @since 3.1.0
   */
  public void setNumStations(UN9 value) {
    this.numStations = value;
  }

  /**
   * Determine if the NumStations is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumStations() {
    return (this.numStations != null ? this.numStations.isSetValue() : false);
  }

  /**
   * Set the name of the system to which the frequency assignment belongs. A
   * system is considered two or more equipment having a common property,
   * usually geographic, administrative, functional, or operational in nature.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current SysOfStation object instance.
   * @since 3.1.0
   */
  public SysOfStation withSysName(String value) {
    setSysName(new S30(value));
    return this;
  }

  /**
   * Set the total number of stations associated with the Assignment.    * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current SysOfStation object instance.
   * @since 3.1.0
   */
  public SysOfStation withNumStations(Integer value) {
    setNumStations(new UN9(value));
    return this;
  }

  /**
   * Get a string representation of this SysOfStation instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "SysOfStation {"
           + (numStations != null ? "\n numStations [" + numStations + "]" : "")
           + (sysName != null ? "\n sysName [" + sysName + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link SysOfStation} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
