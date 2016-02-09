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
package us.gov.dod.standard.ssrf._3_1.jrfl;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_1.Allotment;
import us.gov.dod.standard.ssrf._3_1.Assignment;
import us.gov.dod.standard.ssrf._3_1.Common;
import us.gov.dod.standard.ssrf._3_1.JRFL;
import us.gov.dod.standard.ssrf._3_1.allotment.POCInformation;
import us.gov.dod.standard.ssrf._3_1.allotment.Project;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCAU;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCPC;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCTS;

/**
 * This data element defines the protection and priority codes for those nets
 * (frequencies) that are listed in the Joint Restricted Frequency List (JRFL).
 * A JRFL entry may either refer to an existing Assignment/Allotment (in this
 * case, use the sub-element AsgnAllotRef) or to an arbitrary set of frequencies
 * (in this case describe the frequency/range, its user, location and duration).
 * In the case of an arbitrary set of frequencies, if multiple organisations are
 * listed they will all use the same set of frequencies; if it is not the case,
 * split the JRFL entry into several entries.
 * <p>
 * Element of {@link JRFL}
 * <p>
 * Sub-Elements are
 * {@link JRFLEntryLocation}, {@link POCInformation}, {@link Project}
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JRFLEntry", propOrder = {
  "protectionCode",
  "priority",
  "justification",
  "approvalLevel",
  "seconds",
  "minutes",
  "hours",
  "daysOfMonth",
  "months",
  "daysOfWeek",
  "years",
  "duration",
  "asgnAllotRef",
  "freqMin",
  "freqMax",
  "bandwidth",
  "freqUse",
  "project",
  "pocInformation",
  "jrflEntryLocation"
})
public class JRFLEntry {

  /**
   * In Data Item ProtectionCode, indicate the type of JRFL entry.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ProtectionCode", required = true)
  private TString protectionCode;
  /**
   * Priority - Priority (Optional)
   * <p>
   * The assigned priority code consisting of a letter followed by a number in
   * the range A1 through Z9, with A1 being the highest priority (all Taboo nets
   * should be assigned an A1 priority code). This code is set at the local
   * command level.
   * <p>
   * Format is US2
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Priority", required = false)
  private US2 priority;
  /**
   * Justification - Justification (Required)
   * <p>
   * A description of the justification of why the JRFL entry is required, to
   * support the spectrum manager.
   * <p>
   * Format is s255
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Justification", required = true)
  private S255 justification;
  /**
   * ApprovalLevel - Approval Level (Optional)
   * <p>
   * The approval status of the JRFL entry.
   * <p>
   * Format is L:CTS
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ApprovalLevel", required = false)
  private TString approvalLevel;
  /**
   * In Data Item Seconds,enter the seconds of hour [0-59]
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Seconds", required = false)
  private MinSec seconds;
  /**
   * Minutes - Minutes (Optional)
   * <p>
   * The minutes of an hour [0-59].
   * <p>
   * Format is pattern (S40)
   * <p>
   * Attribute group TimeFrame (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Minutes", required = false)
  private MinSec minutes;
  /**
   * Hours - Hours (Optional)
   * <p>
   * The hours of a day [0-23] (UTC time).
   * <p>
   * Format is pattern (S40)
   * <p>
   * Attribute group TimeFrame (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Hours", required = false)
  private Hours hours;
  /**
   * DaysOfMonth - Days Of Month (Optional)
   * <p>
   * The day of month [1-31].
   * <p>
   * Format is pattern (S40)
   * <p>
   * Attribute group TimeFrame (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "DaysOfMonth", required = false)
  private DaysOfMonth daysOfMonth;
  /**
   * Months - Months (Optional)
   * <p>
   * The month of year [1-12].
   * <p>
   * Format is pattern (S40)
   * <p>
   * Attribute group TimeFrame (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Months", required = false)
  private Months months;
  /**
   * DaysOfWeek - Days of Week (Optional)
   * <p>
   * The weekday [0-7 where 0 and 7 are for Sunday, 1 for Monday, etc].
   * <p>
   * Format is pattern (S40)
   * <p>
   * Attribute group TimeFrame (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "DaysOfWeek", required = false)
  private DaysOfWeek daysOfWeek;
  /**
   * Years - Years (Optional)
   * <p>
   * The 4-digit year [1900..2100].
   * <p>
   * Format is pattern (S40)
   * <p>
   * Attribute group TimeFrame (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Years", required = false)
  private Years years;
  /**
   * Duration - Duration (Optional)
   * <p>
   * The number of minutes for which an event will live. Examples: possible
   * values for the Hours item: 8 one value: 08h00Z 5,6,9 multiple values:
   * 05h00Z, 06h00Z, 09h00Z 5-8 range between 05h00Z and 08h00Z inclusive star/2
   * stepped, every other hour. 00h00Z (midnight), 02h00Z, 04h00Z, etc 3-12/3
   * stepped range, every third hour: 03h00Z, 06h00Z, 09h00Z, and 12h00Z
   * Transmission for 2 minutes every 10 minutes from 9am to 5pm every weekday
   * for 2007: %lt;Minutes%gt;star/10%lt;/Minutes%gt;
   * %lt;Hours%gt;9-17%lt;/Hours%gt; %lt;DaysofWeek%gt;0-4%lt;/DaysofWeek%gt;
   * %lt;Years%gt;2007%lt;/Years%gt; %lt;Duration%gt;2%lt;/Duration%gt; On the
   * 5-minute mark, every third hour, only on days of the work week (Mon-Fri)
   * %lt;Minutes%gt;5%lt;/Minutes%gt; %lt;Hours%gt;star/3%lt;/Hours%gt;
   * %lt;DaysofWeek%gt;1-5%lt;/DaysofWeek%gt; On the 20 and 50-minute marks
   * every hour, every month except June, only on days of the work week
   * (Mon-Fri) %lt;Minutes%gt;20,50%lt;/Minutes%gt;
   * %lt;Months%gt;1-5,7-12%lt;/Months%gt;
   * %lt;DaysofWeek%gt;1-5%lt;/DaysofWeek%gt;
   * <p>
   * Format is UN(4) (min)
   * <p>
   * Attribute group TimeFrame (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Duration", required = false)
  private Duration_UN4 duration;
  /**
   * AsgnAllotRef - Assignment or Allotment Serial (Optional)
   * <p>
   * The Serial reference of the Assignment or Allotment to be protected.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be "AS
   * or AL". [XSD ERR REGEX] This data item MUST comply to the regular
   * expression: "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AsgnAllotRef", required = false)
  private Serial asgnAllotRef;
  /**
   * FreqMin - Nominal or Minimum Frequency (Optional)
   * <p>
   * The nominal frequency or minimum value of the frequency range.
   * <p>
   * Format is UN(16,9) [0..1.0E9] (MHz)
   * <p>
   * Attribute group FreqRangeGrp (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FreqMin")
  private FreqM freqMin;
  /**
   * FreqMax - Maximum Frequency (Optional)
   * <p>
   * The maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * Format is UN(16,9) [0..1.0E9] (MHz)
   * <p>
   * Attribute group FreqRangeGrp (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FreqMax", required = false)
  private FreqM freqMax;
  /**
   * Bandwidth - Bandwidth (Optional)
   * <p>
   * The width of the range (or band) of restricted frequency(s).
   * <p>
   * Format is UN(16,9) [0..1.0E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Bandwidth", required = false)
  private FreqM bandwidth;
  /**
   * FreqUse - Frequency Use (Optional)
   * <p>
   * The intended usage of the frequency.
   * <p>
   * Format is L:CAU
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FreqUse", required = false)
  private TString freqUse;
  /**
   * Project (Optional)
   * <p>
   * Project provides the Project, OPLAN, COMPLAN or Exercise name, or any other
   * project name associated to the dataset.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Project")
  private Set<Project> project;
  /**
   * POCInformation (Optional)
   * <p>
   * POCInformation contains a reference to a Contact, Organisation or Role
   * dataset.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "POCInformation")
  private Set<POCInformation> pocInformation;
  /**
   * JRFLEntryLocation (Optional)
   * <p>
   * JRFLEntryLocation defines the location where the use of a specific
   * frequency or frequency range(s) is restricted in use.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "JRFLEntryLocation")
  private Set<JRFLEntryLocation> jrflEntryLocation;

  /**
   * Get In Data Item ProtectionCode, indicate the type of JRFL entry..
   * <p>
   * @return the ProtectionCode value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getProtectionCode() {
    return protectionCode;
  }

  /**
   * Set In Data Item ProtectionCode, indicate the type of JRFL entry..
   * <p>
   * @param value the ProtectionCode value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setProtectionCode(TString value) {
    this.protectionCode = value;
  }

  /**
   * Determine if the ProtectionCode is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetProtectionCode() {
    return (this.protectionCode != null ? this.protectionCode.isSetValue() : false);
  }

  /**
   * Get the assigned priority code consisting of a letter followed by a number
   * in the range A1 through Z9, with A1 being the highest priority (all Taboo
   * nets should be assigned an A1 priority code). This code is set at the local
   * command level..
   * <p>
   * @return a {@link US2} instance
   * @since 3.1.0
   */
  public US2 getPriority() {
    return priority;
  }

  /**
   * Set the assigned priority code consisting of a letter followed by a number
   * in the range A1 through Z9, with A1 being the highest priority (all Taboo
   * nets should be assigned an A1 priority code). This code is set at the local
   * command level..
   * <p>
   * @param value a {@link US2} instance
   * @since 3.1.0
   */
  public void setPriority(US2 value) {
    this.priority = value;
  }

  /**
   * Determine if the Priority is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPriority() {
    return (this.priority != null ? this.priority.isSetValue() : false);
  }

  /**
   * Get a description of the justification of why the JRFL entry is required,
   * to support the spectrum manager..
   * <p>
   * @return a {@link S255} instance
   * @since 3.1.0
   */
  public S255 getJustification() {
    return justification;
  }

  /**
   * Set a description of the justification of why the JRFL entry is required,
   * to support the spectrum manager..
   * <p>
   * @param value a {@link S255} instance
   * @since 3.1.0
   */
  public void setJustification(S255 value) {
    this.justification = value;
  }

  /**
   * Determine if the Justification is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetJustification() {
    return (this.justification != null ? this.justification.isSetValue() : false);
  }

  /**
   * Get the approval status of the JRFL entry..
   * <p>
   * @return the ApprovalLevel value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getApprovalLevel() {
    return approvalLevel;
  }

  /**
   * Set the approval status of the JRFL entry..
   * <p>
   * @param value the ApprovalLevel value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setApprovalLevel(TString value) {
    this.approvalLevel = value;
  }

  /**
   * Determine if the ApprovalLevel is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetApprovalLevel() {
    return (this.approvalLevel != null ? this.approvalLevel.isSetValue() : false);
  }

  /**
   * Get In Data Item Seconds,enter the seconds of hour [0-59].
   * <p>
   * @return a {@link MinSec} instance
   * @since 3.1.0
   */
  public MinSec getSeconds() {
    return seconds;
  }

  /**
   * Set In Data Item Seconds,enter the seconds of hour [0-59].
   * <p>
   * @param value a {@link MinSec} instance
   * @since 3.1.0
   */
  public void setSeconds(MinSec value) {
    this.seconds = value;
  }

  /**
   * Determine if the Seconds is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSeconds() {
    return (this.seconds != null ? this.seconds.isSetValue() : false);
  }

  /**
   * Get the minutes of an hour [0-59]..
   * <p>
   * @return a {@link MinSec} instance
   * @since 3.1.0
   */
  public MinSec getMinutes() {
    return minutes;
  }

  /**
   * Set the minutes of an hour [0-59]..
   * <p>
   * @param value a {@link MinSec} instance
   * @since 3.1.0
   */
  public void setMinutes(MinSec value) {
    this.minutes = value;
  }

  /**
   * Determine if the Minutes is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMinutes() {
    return (this.minutes != null ? this.minutes.isSetValue() : false);
  }

  /**
   * Get the hours of a day [0-23] (UTC time)..
   * <p>
   * @return a {@link Hours} instance
   * @since 3.1.0
   */
  public Hours getHours() {
    return hours;
  }

  /**
   * Set the hours of a day [0-23] (UTC time)..
   * <p>
   * @param value a {@link Hours} instance
   * @since 3.1.0
   */
  public void setHours(Hours value) {
    this.hours = value;
  }

  /**
   * Determine if the Hours is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetHours() {
    return (this.hours != null ? this.hours.isSetValue() : false);
  }

  /**
   * Get the day of month [1-31]..
   * <p>
   * @return a {@link DaysOfMonth} instance
   * @since 3.1.0
   */
  public DaysOfMonth getDaysOfMonth() {
    return daysOfMonth;
  }

  /**
   * Set the day of month [1-31]..
   * <p>
   * @param value a {@link DaysOfMonth} instance
   * @since 3.1.0
   */
  public void setDaysOfMonth(DaysOfMonth value) {
    this.daysOfMonth = value;
  }

  /**
   * Determine if the DaysOfMonth is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDaysOfMonth() {
    return (this.daysOfMonth != null ? this.daysOfMonth.isSetValue() : false);
  }

  /**
   * Get the month of year [1-12]..
   * <p>
   * @return a {@link Months} instance
   * @since 3.1.0
   */
  public Months getMonths() {
    return months;
  }

  /**
   * Set the month of year [1-12]..
   * <p>
   * @param value a {@link Months} instance
   * @since 3.1.0
   */
  public void setMonths(Months value) {
    this.months = value;
  }

  /**
   * Determine if the Months is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMonths() {
    return (this.months != null ? this.months.isSetValue() : false);
  }

  /**
   * Get the weekday [0-7 where 0 and 7 are for Sunday, 1 for Monday, etc]..
   * <p>
   * @return a {@link DaysOfWeek} instance
   * @since 3.1.0
   */
  public DaysOfWeek getDaysOfWeek() {
    return daysOfWeek;
  }

  /**
   * Set the weekday [0-7 where 0 and 7 are for Sunday, 1 for Monday, etc]..
   * <p>
   * @param value a {@link DaysOfWeek} instance
   * @since 3.1.0
   */
  public void setDaysOfWeek(DaysOfWeek value) {
    this.daysOfWeek = value;
  }

  /**
   * Determine if the DaysOfWeek is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDaysOfWeek() {
    return (this.daysOfWeek != null ? this.daysOfWeek.isSetValue() : false);
  }

  /**
   * Get the 4-digit year [1900..2100]..
   * <p>
   * @return a {@link Years} instance
   * @since 3.1.0
   */
  public Years getYears() {
    return years;
  }

  /**
   * Set the 4-digit year [1900..2100]..
   * <p>
   * @param value a {@link Years} instance
   * @since 3.1.0
   */
  public void setYears(Years value) {
    this.years = value;
  }

  /**
   * Determine if the Years is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetYears() {
    return (this.years != null ? this.years.isSetValue() : false);
  }

  /**
   * Get the number of minutes for which an event will live. Examples: possible
   * values for the Hours item: 8 one value: 08h00Z 5,6,9 multiple values:
   * 05h00Z, 06h00Z, 09h00Z 5-8 range between 05h00Z and 08h00Z inclusive star/2
   * stepped, every other hour. 00h00Z (midnight), 02h00Z, 04h00Z, etc 3-12/3
   * stepped range, every third hour: 03h00Z, 06h00Z, 09h00Z, and 12h00Z
   * Transmission for 2 minutes every 10 minutes from 9am to 5pm every weekday
   * for 2007:
   * <Minutes>star/10</Minutes>
   * <Hours>9-17</Hours>
   * <DaysofWeek>0-4</DaysofWeek>
   * <Years>2007</Years>
   * <Duration>2</Duration>
   * On the 5-minute mark, every third hour, only on days of the work week
   * (Mon-Fri)
   * <Minutes>5</Minutes>
   * <Hours>star/3</Hours>
   * <DaysofWeek>1-5</DaysofWeek>
   * On the 20 and 50-minute marks every hour, every month except June, only on
   * days of the work week (Mon-Fri)
   * <Minutes>20,50</Minutes>
   * <Months>1-5,7-12</Months>
   * <DaysofWeek>1-5</DaysofWeek>.
   * <p>
   * @return a {@link Duration_UN4} instance
   * @since 3.1.0
   */
  public Duration_UN4 getDuration() {
    return duration;
  }

  /**
   * Set the number of minutes for which an event will live. Examples: possible
   * values for the Hours item: 8 one value: 08h00Z 5,6,9 multiple values:
   * 05h00Z, 06h00Z, 09h00Z 5-8 range between 05h00Z and 08h00Z inclusive star/2
   * stepped, every other hour. 00h00Z (midnight), 02h00Z, 04h00Z, etc 3-12/3
   * stepped range, every third hour: 03h00Z, 06h00Z, 09h00Z, and 12h00Z
   * Transmission for 2 minutes every 10 minutes from 9am to 5pm every weekday
   * for 2007:
   * <Minutes>star/10</Minutes>
   * <Hours>9-17</Hours>
   * <DaysofWeek>0-4</DaysofWeek>
   * <Years>2007</Years>
   * <Duration>2</Duration>
   * On the 5-minute mark, every third hour, only on days of the work week
   * (Mon-Fri)
   * <Minutes>5</Minutes>
   * <Hours>star/3</Hours>
   * <DaysofWeek>1-5</DaysofWeek>
   * On the 20 and 50-minute marks every hour, every month except June, only on
   * days of the work week (Mon-Fri)
   * <Minutes>20,50</Minutes>
   * <Months>1-5,7-12</Months>
   * <DaysofWeek>1-5</DaysofWeek>.
   * <p>
   * @param value a {@link Duration_UN4} instance
   * @since 3.1.0
   */
  public void setDuration(Duration_UN4 value) {
    this.duration = value;
  }

  /**
   * Determine if the Duration is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDuration() {
    return (this.duration != null ? this.duration.isSetValue() : false);
  }

  /**
   * Get the Serial reference of the Assignment or Allotment to be protected.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be "AS
   * or AL". [XSD ERR REGEX] This data item MUST comply to the regular
   * expression: "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}".
   * <p>
   * @return a {@link Serial} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getAssignmentAllotment()} instead.
   */
  @Deprecated
  public Serial getAsgnAllotRef() {
    return asgnAllotRef;
  }

  /**
   * Set the Serial reference of the Assignment or Allotment to be protected.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be "AS
   * or AL". [XSD ERR REGEX] This data item MUST comply to the regular
   * expression: "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}".
   * <p>
   * @param value a {@link Serial} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setAssignmentAllotment(Common)} instead.
   */
  @Deprecated
  public void setAsgnAllotRef(Serial value) {
    this.asgnAllotRef = value;
  }

  /**
   * Determine if the AsgnAllotRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAsgnAllotRef() {
    return (this.asgnAllotRef != null ? this.asgnAllotRef.isSetValue() : false);
  }

  /**
   * Get the nominal frequency or minimum value of the frequency range..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getFreqMin() {
    return freqMin;
  }

  /**
   * Set the nominal frequency or minimum value of the frequency range..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setFreqMin(FreqM value) {
    this.freqMin = value;
  }

  /**
   * Determine if the FreqMin is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqMin() {
    return (this.freqMin != null ? this.freqMin.isSetValue() : false);
  }

  /**
   * Get the maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getFreqMax() {
    return freqMax;
  }

  /**
   * Set the maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setFreqMax(FreqM value) {
    this.freqMax = value;
  }

  /**
   * Determine if the FreqMax is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqMax() {
    return (this.freqMax != null ? this.freqMax.isSetValue() : false);
  }

  /**
   * Get the width of the range (or band) of restricted frequency(s)..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getBandwidth() {
    return bandwidth;
  }

  /**
   * Set the width of the range (or band) of restricted frequency(s)..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setBandwidth(FreqM value) {
    this.bandwidth = value;
  }

  /**
   * Determine if the Bandwidth is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetBandwidth() {
    return (this.bandwidth != null ? this.bandwidth.isSetValue() : false);
  }

  /**
   * Get the intended usage of the frequency..
   * <p>
   * @return the FreqUse value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getFreqUse() {
    return freqUse;
  }

  /**
   * Set the intended usage of the frequency..
   * <p>
   * @param value the FreqUse value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setFreqUse(TString value) {
    this.freqUse = value;
  }

  /**
   * Determine if the FreqUse is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqUse() {
    return (this.freqUse != null ? this.freqUse.isSetValue() : false);
  }

  /**
   * Get the Project
   * <p>
   * Complex element Project provides the Project, OPLAN, COMPLAN or Exercise
   * name, or any other project name associated to the dataset..
   * <p>
   * @return a {@link Project} instance
   * @since 3.1.0
   */
  public Set<Project> getProject() {
    if (project == null) {
      project = new HashSet<>();
    }
    return this.project;
  }

  /**
   * Determine if the Project is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetProject() {
    return ((this.project != null) && (!this.project.isEmpty()));
  }

  /**
   * Clear the Project field. This sets the field to null.
   */
  public void unsetProject() {
    this.project = null;
  }

  /**
   * Get the POCInformation
   * <p>
   * Complex element POCInformation contains a reference to a Contact,
   * Organisation or Role dataset..
   * <p>
   * @return a {@link POCInformation} instance
   * @since 3.1.0
   */
  public Set<POCInformation> getPOCInformation() {
    if (pocInformation == null) {
      pocInformation = new HashSet<>();
    }
    return this.pocInformation;
  }

  /**
   * Determine if the POCInformation is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPOCInformation() {
    return ((this.pocInformation != null) && (!this.pocInformation.isEmpty()));
  }

  /**
   * Clear the POCInformation field. This sets the field to null.
   */
  public void unsetPOCInformation() {
    this.pocInformation = null;
  }

  /**
   * Get the JRFLEntryLocation
   * <p>
   * Complex element JRFLEntryLocation defines the location where the use of a
   * specific frequency or frequency range(s) is restricted in use..
   * <p>
   * @return a {@link JRFLEntryLocation} instance
   * @since 3.1.0
   */
  public Set<JRFLEntryLocation> getJRFLEntryLocation() {
    if (jrflEntryLocation == null) {
      jrflEntryLocation = new HashSet<>();
    }
    return this.jrflEntryLocation;
  }

  /**
   * Determine if the JRFLEntryLocation is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetJRFLEntryLocation() {
    return ((this.jrflEntryLocation != null) && (!this.jrflEntryLocation.isEmpty()));
  }

  /**
   * Clear the JRFLEntryLocation field. This sets the field to null.
   */
  public void unsetJRFLEntryLocation() {
    this.jrflEntryLocation = null;
  }

  /**
   * Set In Data Item ProtectionCode, indicate the type of JRFL entry.
   * <p>
   * @param value An instances of type {@link ListCPC}.
   * @return The current JRFLEntry object instance.
   * @since 3.1.0
   */
  public JRFLEntry withProtectionCode(ListCPC value) {
    setProtectionCode(new TString(value.value()));
    return this;
  }

  /**
   * Set the assigned priority code consisting of a letter followed by a number
   * in the range A1 through Z9, with A1 being the highest priority (all Taboo
   * nets should be assigned an A1 priority code). This code is set at the local
   * command level.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current JRFLEntry object instance.
   * @since 3.1.0
   */
  public JRFLEntry withPriority(String value) {
    setPriority(new US2(value));
    return this;
  }

  /**
   * Set a description of the justification of why the JRFL entry is required,
   * to support the spectrum manager.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current JRFLEntry object instance.
   * @since 3.1.0
   */
  public JRFLEntry withJustification(String value) {
    setJustification(new S255(value));
    return this;
  }

  /**
   * Set the approval status of the JRFL entry.
   * <p>
   * @param value An instances of type {@link ListCTS}.
   * @return The current JRFLEntry object instance.
   * @since 3.1.0
   */
  public JRFLEntry withApprovalLevel(ListCTS value) {
    setApprovalLevel(new TString(value.value()));
    return this;
  }

  /**
   * Set In Data Item Seconds,enter the seconds of hour [0-59]
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current JRFLEntry object instance.
   * @since 3.1.0
   */
  public JRFLEntry withSeconds(String value) {
    setSeconds(new MinSec(value));
    return this;
  }

  /**
   * Set the minutes of an hour [0-59].
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current JRFLEntry object instance.
   * @since 3.1.0
   */
  public JRFLEntry withMinutes(String value) {
    setMinutes(new MinSec(value));
    return this;
  }

  /**
   * Set the hours of a day [0-23] (UTC time).
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current JRFLEntry object instance.
   * @since 3.1.0
   */
  public JRFLEntry withHours(String value) {
    setHours(new Hours(value));
    return this;
  }

  /**
   * Set the day of month [1-31].
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current JRFLEntry object instance.
   * @since 3.1.0
   */
  public JRFLEntry withDaysOfMonth(String value) {
    setDaysOfMonth(new DaysOfMonth(value));
    return this;
  }

  /**
   * Set the month of year [1-12].
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current JRFLEntry object instance.
   * @since 3.1.0
   */
  public JRFLEntry withMonths(String value) {
    setMonths(new Months(value));
    return this;
  }

  /**
   * Set the weekday [0-7 where 0 and 7 are for Sunday, 1 for Monday, etc].
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current JRFLEntry object instance.
   * @since 3.1.0
   */
  public JRFLEntry withDaysOfWeek(String value) {
    setDaysOfWeek(new DaysOfWeek(value));
    return this;
  }

  /**
   * Set the 4-digit year [1900..2100].
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current JRFLEntry object instance.
   * @since 3.1.0
   */
  public JRFLEntry withYears(String value) {
    setYears(new Years(value));
    return this;
  }

  /**
   * Set the number of minutes for which an event will live. Examples: possible
   * values for the Hours item: 8 one value: 08h00Z 5,6,9 multiple values:
   * 05h00Z, 06h00Z, 09h00Z 5-8 range between 05h00Z and 08h00Z inclusive star/2
   * stepped, every other hour. 00h00Z (midnight), 02h00Z, 04h00Z, etc 3-12/3
   * stepped range, every third hour: 03h00Z, 06h00Z, 09h00Z, and 12h00Z
   * Transmission for 2 minutes every 10 minutes from 9am to 5pm every weekday
   * for 2007:
   * <Minutes>star/10</Minutes>
   * <Hours>9-17</Hours>
   * <DaysofWeek>0-4</DaysofWeek>
   * <Years>2007</Years>
   * <Duration>2</Duration>
   * On the 5-minute mark, every third hour, only on days of the work week
   * (Mon-Fri)
   * <Minutes>5</Minutes>
   * <Hours>star/3</Hours>
   * <DaysofWeek>1-5</DaysofWeek>
   * On the 20 and 50-minute marks every hour, every month except June, only on
   * days of the work week (Mon-Fri)
   * <Minutes>20,50</Minutes>
   * <Months>1-5,7-12</Months>
   * <DaysofWeek>1-5</DaysofWeek>
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current JRFLEntry object instance.
   * @since 3.1.0
   */
  public JRFLEntry withDuration(Integer value) {
    setDuration(new Duration_UN4(value));
    return this;
  }

  /**
   * Set the Serial reference of the Assignment or Allotment to be protected.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be "AS
   * or AL". [XSD ERR REGEX] This data item MUST comply to the regular
   * expression: "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"
   * <p>
   * @param value An instances of type {@link Serial}.
   * @return The current JRFLEntry object instance.
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withAssignmentAllotment(Common)} instead.
   */
  @Deprecated
  public JRFLEntry withAsgnAllotRef(Serial value) {
    setAsgnAllotRef(value);
    return this;
  }

  /**
   * Set the nominal frequency or minimum value of the frequency range.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current JRFLEntry object instance.
   * @since 3.1.0
   */
  public JRFLEntry withFreqMin(Double value) {
    setFreqMin(new FreqM(value));
    return this;
  }

  /**
   * Set the maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current JRFLEntry object instance.
   * @since 3.1.0
   */
  public JRFLEntry withFreqMax(Double value) {
    setFreqMax(new FreqM(value));
    return this;
  }

  /**
   * Set the width of the range (or band) of restricted frequency(s).
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current JRFLEntry object instance.
   * @since 3.1.0
   */
  public JRFLEntry withBandwidth(Double value) {
    setBandwidth(new FreqM(value));
    return this;
  }

  /**
   * Set the intended usage of the frequency.
   * <p>
   * @param value An instances of type {@link ListCAU}.
   * @return The current JRFLEntry object instance.
   * @since 3.1.0
   */
  public JRFLEntry withFreqUse(ListCAU value) {
    setFreqUse(new TString(value.value()));
    return this;
  }

  /**
   * Set the Project
   * <p>
   * Complex element Project provides the Project, OPLAN, COMPLAN or Exercise
   * name, or any other project name associated to the dataset.
   * <p>
   * @param values One or more instances of type {@link Project...}.
   * @return The current JRFLEntry object instance.
   * @since 3.1.0
   */
  public JRFLEntry withProject(Project... values) {
    if (values != null) {
      getProject().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Project
   * <p>
   * Complex element Project provides the Project, OPLAN, COMPLAN or Exercise
   * name, or any other project name associated to the dataset.
   * <p>
   * @param values A collection of {@link Project} instances
   * @return The current JRFLEntry object instance.
   * @since 3.1.0
   */
  public JRFLEntry withProject(Collection<Project> values) {
    if (values != null) {
      getProject().addAll(values);
    }
    return this;
  }

  /**
   * Set the POCInformation
   * <p>
   * Complex element POCInformation contains a reference to a Contact,
   * Organisation or Role dataset.
   * <p>
   * @param values One or more instances of type {@link POCInformation...}.
   * @return The current JRFLEntry object instance.
   * @since 3.1.0
   */
  public JRFLEntry withPOCInformation(POCInformation... values) {
    if (values != null) {
      getPOCInformation().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the POCInformation
   * <p>
   * Complex element POCInformation contains a reference to a Contact,
   * Organisation or Role dataset.
   * <p>
   * @param values A collection of {@link POCInformation} instances
   * @return The current JRFLEntry object instance.
   * @since 3.1.0
   */
  public JRFLEntry withPOCInformation(Collection<POCInformation> values) {
    if (values != null) {
      getPOCInformation().addAll(values);
    }
    return this;
  }

  /**
   * Set the JRFLEntryLocation
   * <p>
   * Complex element JRFLEntryLocation defines the location where the use of a
   * specific frequency or frequency range(s) is restricted in use.
   * <p>
   * @param values One or more instances of type {@link JRFLEntryLocation...}.
   * @return The current JRFLEntry object instance.
   * @since 3.1.0
   */
  public JRFLEntry withJRFLEntryLocation(JRFLEntryLocation... values) {
    if (values != null) {
      getJRFLEntryLocation().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the JRFLEntryLocation
   * <p>
   * Complex element JRFLEntryLocation defines the location where the use of a
   * specific frequency or frequency range(s) is restricted in use.
   * <p>
   * @param values A collection of {@link JRFLEntryLocation} instances
   * @return The current JRFLEntry object instance.
   * @since 3.1.0
   */
  public JRFLEntry withJRFLEntryLocation(Collection<JRFLEntryLocation> values) {
    if (values != null) {
      getJRFLEntryLocation().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this JRFLEntry instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "\n  JRFLEntry {"
           + (approvalLevel != null ? " approvalLevel [" + approvalLevel + "]" : "")
           + (asgnAllotRef != null ? " asgnAllotRef [" + asgnAllotRef + "]" : "")
           + (bandwidth != null ? " bandwidth [" + bandwidth + "]" : "")
           + (daysOfMonth != null ? " daysOfMonth [" + daysOfMonth + "]" : "")
           + (daysOfWeek != null ? " daysOfWeek [" + daysOfWeek + "]" : "")
           + (duration != null ? " duration [" + duration + "]" : "")
           + (freqMax != null ? " freqMax [" + freqMax + "]" : "")
           + (freqMin != null ? " freqMin [" + freqMin + "]" : "")
           + (freqUse != null ? " freqUse [" + freqUse + "]" : "")
           + (hours != null ? " hours [" + hours + "]" : "")
           + (jrflEntryLocation != null ? " jrflEntryLocation [" + jrflEntryLocation + "]" : "")
           + (justification != null ? " justification [" + justification + "]" : "")
           + (minutes != null ? " minutes [" + minutes + "]" : "")
           + (months != null ? " months [" + months + "]" : "")
           + (pocInformation != null ? " pocInformation [" + pocInformation + "]" : "")
           + (priority != null ? " priority [" + priority + "]" : "")
           + (project != null ? " project [" + project + "]" : "")
           + (protectionCode != null ? " protectionCode [" + protectionCode + "]" : "")
           + (seconds != null ? " seconds [" + seconds + "]" : "")
           + (years != null ? " years [" + years + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link JRFLEntry} requires
   * {@link S255 Justification}, {@link TString ProtectionCode}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetJustification() && isSetProtectionCode();
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * AsgnAllotRef - Assignment or Allotment Serial (Optional)
   * <p>
   * The Serial reference of the Assignment or Allotment to be protected.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be "AS
   * or AL". [XSD ERR REGEX] This data item MUST comply to the regular
   * expression: "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Common<?> assignmentAllotment;

  /**
   * Get the Serial reference of the Assignment or Allotment to be protected.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be "AS
   * or AL". [XSD ERR REGEX] This data item MUST comply to the regular
   * expression: "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}".
   * <p>
   * @return a {@link Common} instance
   * @since 3.1.0
   */
  public Common<?> getAssignmentAllotment() {
    return assignmentAllotment;
  }

  /**
   * Determine if the assignmentAllotment field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAssignmentAllotment() {
    return this.assignmentAllotment != null;
  }

  /**
   * Set the Serial reference of the Assignment or Allotment to be protected.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be "AS
   * or AL". [XSD ERR REGEX] This data item MUST comply to the regular
   * expression: "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"
   * <p>
   * @param value An instances of type {@link Common<?>}.
   * @return The current JRFLEntry object instance.
   * @since 3.1.0
   */
  public JRFLEntry withAssignmentAllotment(Common<?> value) {
    this.assignmentAllotment = value;
    return this;
  }

  /**
   * Update the SSRF data type references in this JRFLEntry record.
   * <p>
   * This method builds the exported {@link #asgnAllotRef} field with values
   * from the transient {@link #assignmentAllotment} field. This method should
   * typically be called after the JRFLEntry is configured and (optionally)
   * before exporting an SSRF message.
   * <p>
   * @since 3.1.0
   */
  public void prepare() {
    this.asgnAllotRef = assignmentAllotment != null ? assignmentAllotment.getSerial() : this.asgnAllotRef;
  }

  /**
   * Update the SSRF data type references in this JRFLEntry record after loading
   * from XML.
   * <p>
   * This method builds the transient {@link #assignmentAllotment} with values
   * from the imported {@link #asgnAllotRef} field. This method should typically
   * be called after the JRFLEntry is imported from XML. * @param root the SSRF
   * root instance.
   * <p>
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
    if (asgnAllotRef == null || !asgnAllotRef.isSetValue()) {
      return;
    }
    for (Assignment instance : root.getAssignment()) {
      if (asgnAllotRef.equals(instance.getSerial())) {
        assignmentAllotment = instance;
        return;
      }
    }
    for (Allotment instance : root.getAllotment()) {
      if (asgnAllotRef.equals(instance.getSerial())) {
        assignmentAllotment = instance;
        return;
      }
    }
  }//</editor-fold>

}
