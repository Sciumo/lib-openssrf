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
package us.gov.dod.standard.ssrf._3_1;

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.allotment.POCInformation;
import us.gov.dod.standard.ssrf._3_1.allotment.Project;
import us.gov.dod.standard.ssrf._3_1.antenna.Nomenclature;
import us.gov.dod.standard.ssrf._3_1.assignment.Configuration;
import us.gov.dod.standard.ssrf._3_1.assignment.StatusLog;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCSG;
import us.gov.dod.standard.ssrf._3_1.ssrequest.*;

/**
 * SSRequest contains all parameters describing the system and its usage, for
 * which Spectrum Supportability is being requested.
 * <p>
 * Sub-Elements are
 * {@link Configuration}, {@link DiagramEndpoint}, {@link DiagramLine}, {@link HostNation}, {@link Nomenclature}, {@link POCInformation}, {@link Project}, {@link RelatedSupportability}, {@link Stage}, {@link StatusLog}, {@link Time}, {@link Trunking}
 * <p>
 * Example:
 * <pre>
 * &lt;SSRequest cls="U"&gt;
 *   &lt;Serial cls="U"&gt;USA::SR:123&lt;/Serial&gt;
 *   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;Title cls="U"&gt;MIDS LVT&lt;/Title&gt;
 *   &lt;Configuration&gt;
 *     &lt;ConfigID cls="U"&gt;LOW VOLUME&lt;/ConfigID&gt;
 *     &lt;TxRef&gt;
 *       &lt;Serial cls="U"&gt;USA::TX:555&lt;/Serial&gt;
 *     &lt;/TxRef&gt;
 *   &lt;/Configuration&gt;
 * &lt;/SSRequest&gt;
 * </pre>
 *
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SSRequest", propOrder = {
  "title",
  "currentStage",
  "requirement",
  "emergency",
  "numMobileUnits",
  "numAreaUnits",
  "numCositedUnits",
  "applicationDate",
  "dateResponseRequired",
  "replacementInfo",
  "applicationSPSNumber",
  "coordinationNum",
  "infoTransferRequirement",
  "initialCost",
  "initialCostDesc",
  "ituWaiver",
  "ntiaCoordinationRequired",
  "ntiaSpaceData",
  "operInvIntent",
  "originatingAgency",
  "requestType",
  "relatedAnalysisAndTestData",
  "sysRelationEssential",
  "tspr",
  "wartimeUse",
  "project",
  "stage",
  "nomenclature",
  "pocInformation",
  "relatedSupportability",
  "hostNation",
  "time",
  "diagramEndpoint",
  "diagramLine",
  "configuration",
  "statusLog",
  "trunking"
})
public class SSRequest extends Common<SSRequest> {

  /**
   * Title - Application Title (Required)
   * <p>
   * The title of the Spectrum Supportability application. Each application
   * title should be unique.
   * <p>
   * Format is S100
   *
   * @since 3.1.0
   */
  @XmlElement(name = "Title", required = true)
  private S100 title;
  /**
   * CurrentStage - Current Stage (Optional)
   * <p>
   * The current stage of the system.
   * <p>
   * Format is L:CSG
   *
   * @since 3.1.0
   */
  @XmlElement(name = "CurrentStage", required = false)
  private TString currentStage;
  /**
   * Requirement - Requirement Description (Optional)
   * <p>
   * A description of the types and forms of information to be transmitted or
   * received. The requirement should describe: - The general purpose of the
   * system (e.g., in the PATRIOT system: this is an anti-missile, anti-aircraft
   * system to protect fixed facilities); - Each significant capability of the
   * system (e.g., in the PATRIOT system: search, acquisition and tracking
   * radar, TT&C, C2 links, etc); - Any related supportability documents should
   * be listed in the ExtReferenceRef element.
   * <p>
   * Format is Memo
   *
   * @since 3.1.0
   */
  @XmlElement(name = "Requirement", required = false)
  private MEMO requirement;
  /**
   * Emergency - Emergency Indicator (Optional)
   * <p>
   * "Yes" if the system may be used in a case of emergency.
   * <p>
   * Format is L:CBO
   *
   * @since 3.1.0
   */
  @XmlElement(name = "Emergency", required = false)
  private TString emergency;
  /**
   * NumMobileUnits - Number of Mobile Units (Optional)
   * <p>
   * The number of mobile units. These units do not necessarily operate
   * simultaneously in the same electromagnetic environment.
   * <p>
   * Format is UN(9)
   * <p>
   * Attribute group NumUnits (Optional)
   *
   * @since 3.1.0
   */
  @XmlElement(name = "NumMobileUnits", required = false)
  private UN9 numMobileUnits;
  /**
   * NumAreaUnits - Number of Units in Area (Optional)
   * <p>
   * The maximum number of units (equipment) that will be operating
   * simultaneously in the same area of operation. An area is generally defined
   * as a country. enter the number of land mobile stations, ship stations, and
   * transportable stations associated with the current Assignment or SSRequest
   * dataset. Within an Assignment (but not under SSRequest), the number entered
   * shall represent either the exact number of stations or a range of numbers
   * as follows: Number of Stations Enter 1-10 10 11-30 30 31-100 100 101-300
   * 300 301-1000 1000 1001-3000 3000 3001-10000 10000 Above 10000 Nearest 10000
   * If the exact number is to be recorded, and it is 10, 30, 100, 300, 1000,
   * 3000, or a multiple of 10000, add one to the number to distinguish it from
   * a figure that represents a range of numbers.
   * <p>
   * Format is UN(9)
   * <p>
   * Attribute group NumUnits (Optional)
   *
   * @since 3.1.0
   */
  @XmlElement(name = "NumAreaUnits", required = false)
  private UN9 numAreaUnits;
  /**
   * NumCositedUnits - Number of Cosited Units (Optional)
   * <p>
   * The maximum number of units (equipment) that will be operating
   * simultaneously in the same cosite environment. A cosite situation occurs
   * when several antennas are within the near field of each other.
   * <p>
   * Format is UN(9)
   * <p>
   * Attribute group NumUnits (Optional)
   *
   * @since 3.1.0
   */
  @XmlElement(name = "NumCositedUnits", required = false)
  private UN9 numCositedUnits;
  /**
   * ApplicationDate - Application Date (Optional)
   * <p>
   * The date on which the application will be submitted to the appropriate
   * spectrum management office.
   * <p>
   * Format is Date
   *
   * @since 3.1.0
   */
  @XmlElement(name = "ApplicationDate", required = false)
  private D applicationDate;
  /**
   * DateResponseRequired - Date Response Required (Optional)
   * <p>
   * The date by which the frequency assignment or Spectrum Supportability Reply
   * is required by the user in order to complete necessary advanced operation
   * coordination.
   * <p>
   * Format is Date
   *
   * @since 3.1.0
   */
  @XmlElement(name = "DateResponseRequired", required = false)
  private D dateResponseRequired;
  /**
   * ReplacementInfo - Replacement Info (Optional)
   * <p>
   * The name of the systems that are likely to be replaced by this system.
   * <p>
   * Format is Memo
   *
   * @since 3.1.0
   */
  @XmlElement(name = "ReplacementInfo", required = false)
  private MEMO replacementInfo;
  /**
   * US:ApplicationSPSNumber - Application SPS Number (Optional)
   * <p>
   * The application Spectrum Planning Subcommittee (SPS) document identifier
   * assigned by NTIA. This is not the same as the Certification of Spectrum
   * Support SPS number.
   * <p>
   * Format is S11
   *
   * @since 3.1.0
   */
  @XmlElement(name = "ApplicationSPSNumber", required = false)
  private S11 applicationSPSNumber;
  /**
   * US:CoordinationNum - Coordination Number (Optional)
   * <p>
   * The US Military Communications-Electronics Board (MCEB) identifier assigned
   * to the equipment or system. (e.g., J/F 12/12345). An SSRequest coordination
   * number usually ends with an even digit (e.g., /2, /4), while an SSReply
   * coordination number usually ends with an odd digit (e.g., /3, /5). When
   * certifying equipment, both SSRequest and SSReply SHOULD have a coordination
   * number.
   * <p>
   * Format is S15
   *
   * @since 3.1.0
   */
  @XmlElement(name = "CoordinationNum", required = false)
  private S15 coordinationNum;
  /**
   * US:InfoTransferRequirement - Info Transfer Requirement (Optional)
   * <p>
   * The required character rates, data rates, and circuit quality/reliability
   * of the system.
   * <p>
   * Format is Memo
   *
   * @since 3.1.0
   */
  @XmlElement(name = "InfoTransferRequirement", required = false)
  private MEMO infoTransferRequirement;
  /**
   * US:InitialCost - Initial Cost (Optional)
   * <p>
   * The estimated initial cost, in US dollars, of the system/equipment.
   * <p>
   * Format is S70
   *
   * @since 3.1.0
   */
  @XmlElement(name = "InitialCost", required = false)
  private S70 initialCost;
  /**
   * US:InitialCostDesc - Initial Cost Description (Optional)
   * <p>
   * The explanation of how the estimated initial cost for the system was
   * calculated.
   * <p>
   * Format is Memo
   *
   * @since 3.1.0
   */
  @XmlElement(name = "InitialCostDesc", required = false)
  private MEMO initialCostDesc;
  /**
   * US:ITUWaiver - ITU Waiver (Optional)
   * <p>
   * If this is a satellite system that is exempt from submitting notification
   * to the Radiocommunication Bureau.
   * <p>
   * Format is L:CBO
   *
   * @since 3.1.0
   */
  @XmlElement(name = "ITUWaiver", required = false)
  private TString ituWaiver;
  /**
   * US:NTIACoordinationRequired - NTIA Coordination Required (Optional)
   * <p>
   * If this application requires coordination with the National Authority for
   * approval. For US records, the National Authority is NTIA and this should be
   * Yes, unless the record does not require coordination with NTIA for
   * approval.
   * <p>
   * Format is L:CBO
   *
   * @since 3.1.0
   */
  @XmlElement(name = "NTIACoordinationRequired", required = false)
  private TString ntiaCoordinationRequired;
  /**
   * US:NTIASpaceData - NTIA Space Data (Optional)
   * <p>
   * The Space and terrestrial information as defined by section 10.8 of the
   * NTIA Manual and not captured in other more specific data fields.
   * <p>
   * Format is Memo
   *
   * @since 3.1.0
   */
  @XmlElement(name = "NTIASpaceData", required = false)
  private MEMO ntiaSpaceData;
  /**
   * US:OperInvIntent - Operational Inventory Intent (Optional)
   * <p>
   * If the system is intended for the DoD operational inventory.
   * <p>
   * Format is L:CBO
   *
   * @since 3.1.0
   */
  @XmlElement(name = "OperInvIntent", required = false)
  private TString operInvIntent;
  /**
   * US:OriginatingAgency - Originating Agency (Optional)
   * <p>
   * The agency that originated the application.
   * <p>
   * Format is S80
   *
   * @since 3.1.0
   */
  @XmlElement(name = "OriginatingAgency", required = false)
  private S80 originatingAgency;
  /**
   * US:RequestType - Request Type (Optional)
   * <p>
   * The request type. Possible values may include, but are not limited to, DoD
   * Certification, NTIA Certification, and Foreign Coordination.
   * <p>
   * Format is S50
   *
   * @since 3.1.0
   */
  @XmlElement(name = "RequestType", required = false)
  private S50 requestType;
  /**
   * In Data Item RelatedAnalysisAndTestData (US), describe electromagnetic
   * compatibility studies, testing or analyses relevant to this system,
   * including documents currently in progress. Use the ExtReference attribute
   * of this element as appropriate.
   *
   * @since 3.1.0
   */
  @XmlElement(name = "RelatedAnalysisAndTestData", required = false)
  private MEMO relatedAnalysisAndTestData;

  @XmlElement(name = "SysRelationEssential", required = false)
  private MEMO sysRelationEssential;
  /**
   * US:TSPR - TSPR (Optional)
   * <p>
   * The telecommunications service priority applicable to a spectrum-dependent
   * radiocommunications system intended to be used in direct support of a
   * national emergency declared under Section 706 of the Communications Act of
   * 1934, as amended.
   * <p>
   * Format is S10
   *
   * @since 3.1.0
   */
  @XmlElement(name = "TSPR", required = false)
  private S10 tspr;
  /**
   * US:WartimeUse - Wartime Use (Optional)
   * <p>
   * If the system is used in a wartime environment.
   * <p>
   * Format is L:CBO
   *
   * @since 3.1.0
   */
  @XmlElement(name = "WartimeUse", required = false)
  private TString wartimeUse;
  /**
   * Project (Optional)
   * <p>
   * Project provides the Project, OPLAN, COMPLAN or Exercise name, or any other
   * project name associated to the dataset.
   *
   * @since 3.1.0
   */
  @XmlElement(name = "Project")
  private Set<Project> project;
  /**
   * CurrentStage - Current Stage (Optional)
   * <p>
   * The current stage of the system.
   * <p>
   * Format is L:CSG
   *
   * @since 3.1.0
   */
  @XmlElement(name = "Stage")
  private Set<Stage> stage;
  /**
   * Nomenclature (Optional)
   * <p>
   * Nomenclature identifies either the standard military, government,
   * nomenclature or the commercial model number of an equipment. Each device or
   * group of devices may have several types of nomenclatures, e.g. both a
   * military nomenclature and a commercial model number.
   *
   * @since 3.1.0
   */
  @XmlElement(name = "Nomenclature")
  private Set<Nomenclature> nomenclature;
  /**
   * POCInformation (Optional)
   * <p>
   * POCInformation contains a reference to a Contact, Organisation or Role
   * dataset.
   *
   * @since 3.1.0
   */
  @XmlElement(name = "POCInformation")
  private Set<POCInformation> pocInformation;
  /**
   * RelatedSupportability (Optional)
   * <p>
   * RelatedSupportability refers to a SSRequest with which the current dataset
   * has a dependency.
   *
   * @since 3.1.0
   */
  @XmlElement(name = "RelatedSupportability")
  private Set<RelatedSupportability> relatedSupportability;
  /**
   * HostNation (Optional)
   * <p>
   * HostNation indicates the host nations from which supportability is
   * requested. If a SSRequest received by NATO has no HostNation entry, it will
   * be assumed that this SSRequest is for all NATO Nations plus AUS and NZL (in
   * accordance with the FMSC agreement).
   *
   * @since 3.1.0
   */
  @XmlElement(name = "HostNation", nillable = true)
  private Set<HostNation> hostNation;
  /**
   * US:WartimeUse - Wartime Use (Optional)
   * <p>
   * If the system is used in a wartime environment.
   * <p>
   * Format is L:CBO
   *
   * @since 3.1.0
   */
  @XmlElement(name = "Time")
  private Set<Time> time;
  /**
   * DiagramEndpoint (Optional)
   * <p>
   * DiagramEndpoint defines an instance of an icon on the diagram.
   *
   * @since 3.1.0
   */
  @XmlElement(name = "DiagramEndpoint")
  private Set<DiagramEndpoint> diagramEndpoint;
  /**
   * DiagramLine (Optional)
   * <p>
   * DiagramLine defines a line between two endpoints on the diagram.
   *
   * @since 3.1.0
   */
  @XmlElement(name = "DiagramLine")
  private Set<DiagramLine> diagramLine;
  /**
   * Configuration (Optional)
   * <p>
   * Configuration identifies each operational configuration that is required in
   * a SSRequest, granted by a Host Nation in a SSReply, or authorised in a
   * frequency Assignment or Allotment dataset. It also identifies the
   * functional use of the assigned frequency at a particular transmitting
   * station.
   * <p>
   * Divergence from SMADEF: Mandatory [1..n] when exchanging with NATO /
   *
   * @since 3.1.0
   */
  @XmlElement(name = "Configuration")
  private Set<Configuration> configuration;
  /**
   * US:StatusLog (Optional)
   * <p>
   * StatusLog (US) contains the transactional processing information related to
   * spectrum supportability requests.
   *
   * @since 3.1.0
   */
  @XmlElement(name = "StatusLog")
  private Set<StatusLog> statusLog;
  /**
   * US:Trunking (Optional)
   * <p>
   * Trunking (US) defines Radiotelephony using standard land mobile principles
   * where multiple baseband signals are bounded within one physical channel.
   *
   * @since 3.1.0
   */
  @XmlElement(name = "Trunking")
  private Trunking trunking;

  /**
   * No arg constructor. Initializes the Common required fields.
   */
  public SSRequest() {
    super();
  }

  /**
   * Get the title of the Spectrum Supportability application. Each application
   * title should be unique..
   *
   * @return a {@link S100} instance
   * @since 3.1.0
   */
  public S100 getTitle() {
    return title;
  }

  /**
   * Set the title of the Spectrum Supportability application. Each application
   * title should be unique..
   *
   * @param value a {@link S100} instance
   * @since 3.1.0
   */
  public void setTitle(S100 value) {
    this.title = value;
  }

  /**
   * Determine if the Title is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTitle() {
    return (this.title != null ? this.title.isSetValue() : false);
  }

  /**
   * Get the current stage of the system..
   *
   * @return the CurrentStage value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getCurrentStage() {
    return currentStage;
  }

  /**
   * Set the current stage of the system..
   *
   * @param value the CurrentStage value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setCurrentStage(TString value) {
    this.currentStage = value;
  }

  /**
   * Determine if the CurrentStage is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCurrentStage() {
    return (this.currentStage != null ? this.currentStage.isSetValue() : false);
  }

  /**
   * Get a description of the types and forms of information to be transmitted
   * or received. The requirement should describe: - The general purpose of the
   * system (e.g., in the PATRIOT system: this is an anti-missile, anti-aircraft
   * system to protect fixed facilities); - Each significant capability of the
   * system (e.g., in the PATRIOT system: search, acquisition and tracking
   * radar, TT&C, C2 links, etc); - Any related supportability documents should
   * be listed in the ExtReferenceRef element..
   *
   * @return a {@link MEMO} instance
   * @since 3.1.0
   */
  public MEMO getRequirement() {
    return requirement;
  }

  /**
   * Set a description of the types and forms of information to be transmitted
   * or received. The requirement should describe: - The general purpose of the
   * system (e.g., in the PATRIOT system: this is an anti-missile, anti-aircraft
   * system to protect fixed facilities); - Each significant capability of the
   * system (e.g., in the PATRIOT system: search, acquisition and tracking
   * radar, TT&C, C2 links, etc); - Any related supportability documents should
   * be listed in the ExtReferenceRef element..
   *
   * @param value a {@link MEMO} instance
   * @since 3.1.0
   */
  public void setRequirement(MEMO value) {
    this.requirement = value;
  }

  /**
   * Determine if the Requirement is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRequirement() {
    return (this.requirement != null ? this.requirement.isSetValue() : false);
  }

  /**
   * Get "Yes" if the system may be used in a case of emergency..
   *
   * @return the Emergency value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getEmergency() {
    return emergency;
  }

  /**
   * Set "Yes" if the system may be used in a case of emergency..
   *
   * @param value the Emergency value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setEmergency(TString value) {
    this.emergency = value;
  }

  /**
   * Determine if the Emergency is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEmergency() {
    return (this.emergency != null ? this.emergency.isSetValue() : false);
  }

  /**
   * Get the number of mobile units. These units do not necessarily operate
   * simultaneously in the same electromagnetic environment..
   *
   * @return a {@link UN9} instance
   * @since 3.1.0
   */
  public UN9 getNumMobileUnits() {
    return numMobileUnits;
  }

  /**
   * Set the number of mobile units. These units do not necessarily operate
   * simultaneously in the same electromagnetic environment..
   *
   * @param value a {@link UN9} instance
   * @since 3.1.0
   */
  public void setNumMobileUnits(UN9 value) {
    this.numMobileUnits = value;
  }

  /**
   * Determine if the NumMobileUnits is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumMobileUnits() {
    return (this.numMobileUnits != null ? this.numMobileUnits.isSetValue() : false);
  }

  /**
   * Get the maximum number of units (equipment) that will be operating
   * simultaneously in the same area of operation. An area is generally defined
   * as a country. enter the number of land mobile stations, ship stations, and
   * transportable stations associated with the current Assignment or SSRequest
   * dataset. Within an Assignment (but not under SSRequest), the number entered
   * shall represent either the exact number of stations or a range of numbers
   * as follows: Number of Stations Enter 1-10 10 11-30 30 31-100 100 101-300
   * 300 301-1000 1000 1001-3000 3000 3001-10000 10000 Above 10000 Nearest 10000
   * If the exact number is to be recorded, and it is 10, 30, 100, 300, 1000,
   * 3000, or a multiple of 10000, add one to the number to distinguish it from
   * a figure that represents a range of numbers..
   *
   * @return a {@link UN9} instance
   * @since 3.1.0
   */
  public UN9 getNumAreaUnits() {
    return numAreaUnits;
  }

  /**
   * Set the maximum number of units (equipment) that will be operating
   * simultaneously in the same area of operation. An area is generally defined
   * as a country. enter the number of land mobile stations, ship stations, and
   * transportable stations associated with the current Assignment or SSRequest
   * dataset. Within an Assignment (but not under SSRequest), the number entered
   * shall represent either the exact number of stations or a range of numbers
   * as follows: Number of Stations Enter 1-10 10 11-30 30 31-100 100 101-300
   * 300 301-1000 1000 1001-3000 3000 3001-10000 10000 Above 10000 Nearest 10000
   * If the exact number is to be recorded, and it is 10, 30, 100, 300, 1000,
   * 3000, or a multiple of 10000, add one to the number to distinguish it from
   * a figure that represents a range of numbers..
   *
   * @param value a {@link UN9} instance
   * @since 3.1.0
   */
  public void setNumAreaUnits(UN9 value) {
    this.numAreaUnits = value;
  }

  /**
   * Determine if the NumAreaUnits is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumAreaUnits() {
    return (this.numAreaUnits != null ? this.numAreaUnits.isSetValue() : false);
  }

  /**
   * Get the maximum number of units (equipment) that will be operating
   * simultaneously in the same cosite environment. A cosite situation occurs
   * when several antennas are within the near field of each other..
   *
   * @return a {@link UN9} instance
   * @since 3.1.0
   */
  public UN9 getNumCositedUnits() {
    return numCositedUnits;
  }

  /**
   * Set the maximum number of units (equipment) that will be operating
   * simultaneously in the same cosite environment. A cosite situation occurs
   * when several antennas are within the near field of each other..
   *
   * @param value a {@link UN9} instance
   * @since 3.1.0
   */
  public void setNumCositedUnits(UN9 value) {
    this.numCositedUnits = value;
  }

  /**
   * Determine if the NumCositedUnits is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumCositedUnits() {
    return (this.numCositedUnits != null ? this.numCositedUnits.isSetValue() : false);
  }

  /**
   * Get the date on which the application will be submitted to the appropriate
   * spectrum management office..
   *
   * @return a {@link D} instance
   * @since 3.1.0
   */
  public D getApplicationDate() {
    return applicationDate;
  }

  /**
   * Set the date on which the application will be submitted to the appropriate
   * spectrum management office..
   *
   * @param value a {@link D} instance
   * @since 3.1.0
   */
  public void setApplicationDate(D value) {
    this.applicationDate = value;
  }

  /**
   * Determine if the ApplicationDate is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetApplicationDate() {
    return (this.applicationDate != null ? this.applicationDate.isSetValue() : false);
  }

  /**
   * Get the date by which the frequency assignment or Spectrum Supportability
   * Reply is required by the user in order to complete necessary advanced
   * operation coordination..
   *
   * @return a {@link D} instance
   * @since 3.1.0
   */
  public D getDateResponseRequired() {
    return dateResponseRequired;
  }

  /**
   * Set the date by which the frequency assignment or Spectrum Supportability
   * Reply is required by the user in order to complete necessary advanced
   * operation coordination..
   *
   * @param value a {@link D} instance
   * @since 3.1.0
   */
  public void setDateResponseRequired(D value) {
    this.dateResponseRequired = value;
  }

  /**
   * Determine if the DateResponseRequired is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDateResponseRequired() {
    return (this.dateResponseRequired != null ? this.dateResponseRequired.isSetValue() : false);
  }

  /**
   * Get the name of the systems that are likely to be replaced by this system..
   *
   * @return a {@link MEMO} instance
   * @since 3.1.0
   */
  public MEMO getReplacementInfo() {
    return replacementInfo;
  }

  /**
   * Set the name of the systems that are likely to be replaced by this system..
   *
   * @param value a {@link MEMO} instance
   * @since 3.1.0
   */
  public void setReplacementInfo(MEMO value) {
    this.replacementInfo = value;
  }

  /**
   * Determine if the ReplacementInfo is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetReplacementInfo() {
    return (this.replacementInfo != null ? this.replacementInfo.isSetValue() : false);
  }

  /**
   * Get the application Spectrum Planning Subcommittee (SPS) document
   * identifier assigned by NTIA. This is not the same as the Certification of
   * Spectrum Support SPS number..
   *
   * @return a {@link S11} instance
   * @since 3.1.0
   */
  public S11 getApplicationSPSNumber() {
    return applicationSPSNumber;
  }

  /**
   * Set the application Spectrum Planning Subcommittee (SPS) document
   * identifier assigned by NTIA. This is not the same as the Certification of
   * Spectrum Support SPS number..
   *
   * @param value a {@link S11} instance
   * @since 3.1.0
   */
  public void setApplicationSPSNumber(S11 value) {
    this.applicationSPSNumber = value;
  }

  /**
   * Determine if the ApplicationSPSNumber is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetApplicationSPSNumber() {
    return (this.applicationSPSNumber != null ? this.applicationSPSNumber.isSetValue() : false);
  }

  /**
   * Get the US Military Communications-Electronics Board (MCEB) identifier
   * assigned to the equipment or system. (e.g., J/F 12/12345). An SSRequest
   * coordination number usually ends with an even digit (e.g., /2, /4), while
   * an SSReply coordination number usually ends with an odd digit (e.g., /3,
   * /5). When certifying equipment, both SSRequest and SSReply SHOULD have a
   * coordination number..
   *
   * @return a {@link S15} instance
   * @since 3.1.0
   */
  public S15 getCoordinationNum() {
    return coordinationNum;
  }

  /**
   * Set the US Military Communications-Electronics Board (MCEB) identifier
   * assigned to the equipment or system. (e.g., J/F 12/12345). An SSRequest
   * coordination number usually ends with an even digit (e.g., /2, /4), while
   * an SSReply coordination number usually ends with an odd digit (e.g., /3,
   * /5). When certifying equipment, both SSRequest and SSReply SHOULD have a
   * coordination number..
   *
   * @param value a {@link S15} instance
   * @since 3.1.0
   */
  public void setCoordinationNum(S15 value) {
    this.coordinationNum = value;
  }

  /**
   * Determine if the CoordinationNum is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCoordinationNum() {
    return (this.coordinationNum != null ? this.coordinationNum.isSetValue() : false);
  }

  /**
   * Get the required character rates, data rates, and circuit
   * quality/reliability of the system..
   *
   * @return a {@link MEMO} instance
   * @since 3.1.0
   */
  public MEMO getInfoTransferRequirement() {
    return infoTransferRequirement;
  }

  /**
   * Set the required character rates, data rates, and circuit
   * quality/reliability of the system..
   *
   * @param value a {@link MEMO} instance
   * @since 3.1.0
   */
  public void setInfoTransferRequirement(MEMO value) {
    this.infoTransferRequirement = value;
  }

  /**
   * Determine if the InfoTransferRequirement is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetInfoTransferRequirement() {
    return (this.infoTransferRequirement != null ? this.infoTransferRequirement.isSetValue() : false);
  }

  /**
   * Get the estimated initial cost, in US dollars, of the system/equipment..
   *
   * @return a {@link S70} instance
   * @since 3.1.0
   */
  public S70 getInitialCost() {
    return initialCost;
  }

  /**
   * Set the estimated initial cost, in US dollars, of the system/equipment..
   *
   * @param value a {@link S70} instance
   * @since 3.1.0
   */
  public void setInitialCost(S70 value) {
    this.initialCost = value;
  }

  /**
   * Determine if the InitialCost is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetInitialCost() {
    return (this.initialCost != null ? this.initialCost.isSetValue() : false);
  }

  /**
   * Get the explanation of how the estimated initial cost for the system was
   * calculated..
   *
   * @return a {@link MEMO} instance
   * @since 3.1.0
   */
  public MEMO getInitialCostDesc() {
    return initialCostDesc;
  }

  /**
   * Set the explanation of how the estimated initial cost for the system was
   * calculated..
   *
   * @param value a {@link MEMO} instance
   * @since 3.1.0
   */
  public void setInitialCostDesc(MEMO value) {
    this.initialCostDesc = value;
  }

  /**
   * Determine if the InitialCostDesc is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetInitialCostDesc() {
    return (this.initialCostDesc != null ? this.initialCostDesc.isSetValue() : false);
  }

  /**
   * Get if this is a satellite system that is exempt from submitting
   * notification to the Radiocommunication Bureau..
   *
   * @return the ITUWaiver value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getITUWaiver() {
    return ituWaiver;
  }

  /**
   * Set if this is a satellite system that is exempt from submitting
   * notification to the Radiocommunication Bureau..
   *
   * @param value the ITUWaiver value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setITUWaiver(TString value) {
    this.ituWaiver = value;
  }

  /**
   * Determine if the ITUWaiver is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetITUWaiver() {
    return (this.ituWaiver != null ? this.ituWaiver.isSetValue() : false);
  }

  /**
   * Get if this application requires coordination with the National Authority
   * for approval. For US records, the National Authority is NTIA and this
   * should be Yes, unless the record does not require coordination with NTIA
   * for approval..
   *
   * @return the NTIACoordinationRequired value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getNTIACoordinationRequired() {
    return ntiaCoordinationRequired;
  }

  /**
   * Set if this application requires coordination with the National Authority
   * for approval. For US records, the National Authority is NTIA and this
   * should be Yes, unless the record does not require coordination with NTIA
   * for approval..
   *
   * @param value the NTIACoordinationRequired value in a {@link TString} data
   *              type
   * @since 3.1.0
   */
  public void setNTIACoordinationRequired(TString value) {
    this.ntiaCoordinationRequired = value;
  }

  /**
   * Determine if the NTIACoordinationRequired is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNTIACoordinationRequired() {
    return (this.ntiaCoordinationRequired != null ? this.ntiaCoordinationRequired.isSetValue() : false);
  }

  /**
   * Get the Space and terrestrial information as defined by section 10.8 of the
   * NTIA Manual and not captured in other more specific data fields..
   *
   * @return a {@link MEMO} instance
   * @since 3.1.0
   */
  public MEMO getNTIASpaceData() {
    return ntiaSpaceData;
  }

  /**
   * Set the Space and terrestrial information as defined by section 10.8 of the
   * NTIA Manual and not captured in other more specific data fields..
   *
   * @param value a {@link MEMO} instance
   * @since 3.1.0
   */
  public void setNTIASpaceData(MEMO value) {
    this.ntiaSpaceData = value;
  }

  /**
   * Determine if the NTIASpaceData is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNTIASpaceData() {
    return (this.ntiaSpaceData != null ? this.ntiaSpaceData.isSetValue() : false);
  }

  /**
   * Get if the system is intended for the DoD operational inventory..
   *
   * @return the OperInvIntent value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getOperInvIntent() {
    return operInvIntent;
  }

  /**
   * Set if the system is intended for the DoD operational inventory..
   *
   * @param value the OperInvIntent value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setOperInvIntent(TString value) {
    this.operInvIntent = value;
  }

  /**
   * Determine if the OperInvIntent is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOperInvIntent() {
    return (this.operInvIntent != null ? this.operInvIntent.isSetValue() : false);
  }

  /**
   * Get the agency that originated the application..
   *
   * @return a {@link S80} instance
   * @since 3.1.0
   */
  public S80 getOriginatingAgency() {
    return originatingAgency;
  }

  /**
   * Set the agency that originated the application..
   *
   * @param value a {@link S80} instance
   * @since 3.1.0
   */
  public void setOriginatingAgency(S80 value) {
    this.originatingAgency = value;
  }

  /**
   * Determine if the OriginatingAgency is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOriginatingAgency() {
    return (this.originatingAgency != null ? this.originatingAgency.isSetValue() : false);
  }

  /**
   * Get the request type. Possible values may include, but are not limited to,
   * DoD Certification, NTIA Certification, and Foreign Coordination..
   *
   * @return a {@link S50} instance
   * @since 3.1.0
   */
  public S50 getRequestType() {
    return requestType;
  }

  /**
   * Set the request type. Possible values may include, but are not limited to,
   * DoD Certification, NTIA Certification, and Foreign Coordination..
   *
   * @param value a {@link S50} instance
   * @since 3.1.0
   */
  public void setRequestType(S50 value) {
    this.requestType = value;
  }

  /**
   * Determine if the RequestType is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRequestType() {
    return (this.requestType != null ? this.requestType.isSetValue() : false);
  }

  /**
   * Get In Data Item RelatedAnalysisAndTestData (US), describe electromagnetic
   * compatibility studies, testing or analyses relevant to this system,
   * including documents currently in progress. Use the ExtReference attribute
   * of this element as appropriate..
   *
   * @return a {@link MEMO} instance
   * @since 3.1.0
   */
  public MEMO getRelatedAnalysisAndTestData() {
    return relatedAnalysisAndTestData;
  }

  /**
   * Set In Data Item RelatedAnalysisAndTestData (US), describe electromagnetic
   * compatibility studies, testing or analyses relevant to this system,
   * including documents currently in progress. Use the ExtReference attribute
   * of this element as appropriate..
   *
   * @param value a {@link MEMO} instance
   * @since 3.1.0
   */
  public void setRelatedAnalysisAndTestData(MEMO value) {
    this.relatedAnalysisAndTestData = value;
  }

  /**
   * Determine if the RelatedAnalysisAndTestData is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRelatedAnalysisAndTestData() {
    return (this.relatedAnalysisAndTestData != null ? this.relatedAnalysisAndTestData.isSetValue() : false);
  }

  /**
   * Get .
   *
   * @return a {@link MEMO} instance
   * @since 3.1.0
   */
  public MEMO getSysRelationEssential() {
    return sysRelationEssential;
  }

  /**
   * Set .
   *
   * @param value a {@link MEMO} instance
   * @since 3.1.0
   */
  public void setSysRelationEssential(MEMO value) {
    this.sysRelationEssential = value;
  }

  /**
   * Determine if the SysRelationEssential is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSysRelationEssential() {
    return (this.sysRelationEssential != null ? this.sysRelationEssential.isSetValue() : false);
  }

  /**
   * Get the telecommunications service priority applicable to a
   * spectrum-dependent radiocommunications system intended to be used in direct
   * support of a national emergency declared under Section 706 of the
   * Communications Act of 1934, as amended..
   *
   * @return a {@link S10} instance
   * @since 3.1.0
   */
  public S10 getTSPR() {
    return tspr;
  }

  /**
   * Set the telecommunications service priority applicable to a
   * spectrum-dependent radiocommunications system intended to be used in direct
   * support of a national emergency declared under Section 706 of the
   * Communications Act of 1934, as amended..
   *
   * @param value a {@link S10} instance
   * @since 3.1.0
   */
  public void setTSPR(S10 value) {
    this.tspr = value;
  }

  /**
   * Determine if the TSPR is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTSPR() {
    return (this.tspr != null ? this.tspr.isSetValue() : false);
  }

  /**
   * Get if the system is used in a wartime environment..
   *
   * @return the WartimeUse value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getWartimeUse() {
    return wartimeUse;
  }

  /**
   * Set if the system is used in a wartime environment..
   *
   * @param value the WartimeUse value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setWartimeUse(TString value) {
    this.wartimeUse = value;
  }

  /**
   * Determine if the WartimeUse is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetWartimeUse() {
    return (this.wartimeUse != null ? this.wartimeUse.isSetValue() : false);
  }

  /**
   * Get the Project
   * <p>
   * Complex element Project provides the Project, OPLAN, COMPLAN or Exercise
   * name, or any other project name associated to the dataset..
   *
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
   *
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
   * Get the current stage of the system..
   *
   * @return a {@link Stage} instance
   * @since 3.1.0
   */
  public Set<Stage> getStage() {
    if (stage == null) {
      stage = new HashSet<>();
    }
    return this.stage;
  }

  /**
   * Determine if the Stage is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStage() {
    return ((this.stage != null) && (!this.stage.isEmpty()));
  }

  /**
   * Clear the Stage field. This sets the field to null.
   */
  public void unsetStage() {
    this.stage = null;
  }

  /**
   * Get the Nomenclature
   * <p>
   * Complex element Nomenclature identifies either the standard military,
   * government, nomenclature or the commercial model number of an equipment.
   * Each device or group of devices may have several types of nomenclatures,
   * e.g. both a military nomenclature and a commercial model number..
   *
   * @return a {@link Nomenclature} instance
   * @since 3.1.0
   */
  public Set<Nomenclature> getNomenclature() {
    if (nomenclature == null) {
      nomenclature = new HashSet<>();
    }
    return this.nomenclature;
  }

  /**
   * Determine if the Nomenclature is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNomenclature() {
    return ((this.nomenclature != null) && (!this.nomenclature.isEmpty()));
  }

  /**
   * Clear the Nomenclature field. This sets the field to null.
   */
  public void unsetNomenclature() {
    this.nomenclature = null;
  }

  /**
   * Get the POCInformation
   * <p>
   * Complex element POCInformation contains a reference to a Contact,
   * Organisation or Role dataset..
   *
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
   *
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
   * Get the RelatedSupportability
   * <p>
   * Complex element RelatedSupportability refers to a SSRequest with which the
   * current dataset has a dependency..
   *
   * @return a {@link RelatedSupportability} instance
   * @since 3.1.0
   */
  public Set<RelatedSupportability> getRelatedSupportability() {
    if (relatedSupportability == null) {
      relatedSupportability = new HashSet<>();
    }
    return this.relatedSupportability;
  }

  /**
   * Determine if the RelatedSupportability is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRelatedSupportability() {
    return ((this.relatedSupportability != null) && (!this.relatedSupportability.isEmpty()));
  }

  /**
   * Clear the RelatedSupportability field. This sets the field to null.
   */
  public void unsetRelatedSupportability() {
    this.relatedSupportability = null;
  }

  /**
   * Get the HostNation
   * <p>
   * Complex element HostNation indicates the host nations from which
   * supportability is requested. If a SSRequest received by NATO has no
   * HostNation entry, it will be assumed that this SSRequest is for all NATO
   * Nations plus AUS and NZL (in accordance with the FMSC agreement)..
   *
   * @return a {@link HostNation} instance
   * @since 3.1.0
   */
  public Set<HostNation> getHostNation() {
    if (hostNation == null) {
      hostNation = new HashSet<>();
    }
    return this.hostNation;
  }

  /**
   * Determine if the HostNation is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetHostNation() {
    return ((this.hostNation != null) && (!this.hostNation.isEmpty()));
  }

  /**
   * Clear the HostNation field. This sets the field to null.
   */
  public void unsetHostNation() {
    this.hostNation = null;
  }

  /**
   * Get if the system is used in a wartime environment..
   *
   * @return a {@link Time} instance
   * @since 3.1.0
   */
  public Set<Time> getTime() {
    if (time == null) {
      time = new HashSet<>();
    }
    return this.time;
  }

  /**
   * Determine if the Time is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTime() {
    return ((this.time != null) && (!this.time.isEmpty()));
  }

  /**
   * Clear the Time field. This sets the field to null.
   */
  public void unsetTime() {
    this.time = null;
  }

  /**
   * Get the DiagramEndpoint
   * <p>
   * Complex element DiagramEndpoint defines an instance of an icon on the
   * diagram..
   *
   * @return a {@link DiagramEndpoint} instance
   * @since 3.1.0
   */
  public Set<DiagramEndpoint> getDiagramEndpoint() {
    if (diagramEndpoint == null) {
      diagramEndpoint = new HashSet<>();
    }
    return this.diagramEndpoint;
  }

  /**
   * Determine if the DiagramEndpoint is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDiagramEndpoint() {
    return ((this.diagramEndpoint != null) && (!this.diagramEndpoint.isEmpty()));
  }

  /**
   * Clear the DiagramEndpoint field. This sets the field to null.
   */
  public void unsetDiagramEndpoint() {
    this.diagramEndpoint = null;
  }

  /**
   * Get the DiagramLine
   * <p>
   * Complex element DiagramLine defines a line between two endpoints on the
   * diagram..
   *
   * @return a {@link DiagramLine} instance
   * @since 3.1.0
   */
  public Set<DiagramLine> getDiagramLine() {
    if (diagramLine == null) {
      diagramLine = new HashSet<>();
    }
    return this.diagramLine;
  }

  /**
   * Determine if the DiagramLine is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDiagramLine() {
    return ((this.diagramLine != null) && (!this.diagramLine.isEmpty()));
  }

  /**
   * Clear the DiagramLine field. This sets the field to null.
   */
  public void unsetDiagramLine() {
    this.diagramLine = null;
  }

  /**
   * Get the Configuration
   * <p>
   * Complex element Configuration identifies each operational configuration
   * that is required in a SSRequest, granted by a Host Nation in a SSReply, or
   * authorised in a frequency Assignment or Allotment dataset. It also
   * identifies the functional use of the assigned frequency at a particular
   * transmitting station..
   *
   * @return a {@link Configuration} instance
   * @since 3.1.0
   */
  public Set<Configuration> getConfiguration() {
    if (configuration == null) {
      configuration = new HashSet<>();
    }
    return this.configuration;
  }

  /**
   * Determine if the Configuration is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetConfiguration() {
    return ((this.configuration != null) && (!this.configuration.isEmpty()));
  }

  /**
   * Clear the Configuration field. This sets the field to null.
   */
  public void unsetConfiguration() {
    this.configuration = null;
  }

  /**
   * Get the US:StatusLog
   * <p>
   * Complex element StatusLog (US) contains the transactional processing
   * information related to spectrum supportability requests..
   *
   * @return a {@link StatusLog} instance
   * @since 3.1.0
   */
  public Set<StatusLog> getStatusLog() {
    if (statusLog == null) {
      statusLog = new HashSet<>();
    }
    return this.statusLog;
  }

  /**
   * Determine if the StatusLog is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStatusLog() {
    return ((this.statusLog != null) && (!this.statusLog.isEmpty()));
  }

  /**
   * Clear the StatusLog field. This sets the field to null.
   */
  public void unsetStatusLog() {
    this.statusLog = null;
  }

  /**
   * Get the US:Trunking
   * <p>
   * Complex element Trunking (US) defines Radiotelephony using standard land
   * mobile principles where multiple baseband signals are bounded within one
   * physical channel..
   *
   * @return the Trunking value in a {@link Trunking} data type
   * @since 3.1.0
   */
  public Trunking getTrunking() {
    return trunking;
  }

  /**
   * Set the US:Trunking
   * <p>
   * Complex element Trunking (US) defines Radiotelephony using standard land
   * mobile principles where multiple baseband signals are bounded within one
   * physical channel..
   *
   * @param value the Trunking value in a {@link Trunking} data type
   * @since 3.1.0
   */
  public void setTrunking(Trunking value) {
    this.trunking = value;
  }

  /**
   * Determine if the Trunking is configured.
   * <p>
   * If configured this method also inspects the {@link Trunking} wrapped value.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTrunking() {
    return (this.trunking != null ? this.trunking.isSet() : false);
  }

  /**
   * Set the title of the Spectrum Supportability application. Each application
   * title should be unique.
   *
   * @param value An instances of type {@link String}.
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withTitle(String value) {
    setTitle(new S100(value));
    return this;
  }

  /**
   * Set the current stage of the system.
   *
   * @param value An instances of type {@link ListCSG}.
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withCurrentStage(ListCSG value) {
    setCurrentStage(new TString(value.value()));
    return this;
  }

  /**
   * Set a description of the types and forms of information to be transmitted
   * or received. The requirement should describe: - The general purpose of the
   * system (e.g., in the PATRIOT system: this is an anti-missile, anti-aircraft
   * system to protect fixed facilities); - Each significant capability of the
   * system (e.g., in the PATRIOT system: search, acquisition and tracking
   * radar, TT&C, C2 links, etc); - Any related supportability documents should
   * be listed in the ExtReferenceRef element.
   *
   * @param value An instances of type {@link String}.
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withRequirement(String value) {
    setRequirement(new MEMO(value));
    return this;
  }

  /**
   * Set "Yes" if the system may be used in a case of emergency.
   *
   * @param value An instances of type {@link ListCBO}.
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withEmergency(ListCBO value) {
    setEmergency(new TString(value.value()));
    return this;
  }

  /**
   * Set the number of mobile units. These units do not necessarily operate
   * simultaneously in the same electromagnetic environment.
   *
   * @param value An instances of type {@link Integer}.
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withNumMobileUnits(Integer value) {
    setNumMobileUnits(new UN9(value));
    return this;
  }

  /**
   * Set the maximum number of units (equipment) that will be operating
   * simultaneously in the same area of operation. An area is generally defined
   * as a country. enter the number of land mobile stations, ship stations, and
   * transportable stations associated with the current Assignment or SSRequest
   * dataset. Within an Assignment (but not under SSRequest), the number entered
   * shall represent either the exact number of stations or a range of numbers
   * as follows: Number of Stations Enter 1-10 10 11-30 30 31-100 100 101-300
   * 300 301-1000 1000 1001-3000 3000 3001-10000 10000 Above 10000 Nearest 10000
   * If the exact number is to be recorded, and it is 10, 30, 100, 300, 1000,
   * 3000, or a multiple of 10000, add one to the number to distinguish it from
   * a figure that represents a range of numbers.
   *
   * @param value An instances of type {@link Integer}.
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withNumAreaUnits(Integer value) {
    setNumAreaUnits(new UN9(value));
    return this;
  }

  /**
   * Set the maximum number of units (equipment) that will be operating
   * simultaneously in the same cosite environment. A cosite situation occurs
   * when several antennas are within the near field of each other.
   *
   * @param value An instances of type {@link Integer}.
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withNumCositedUnits(Integer value) {
    setNumCositedUnits(new UN9(value));
    return this;
  }

  /**
   * Set the date on which the application will be submitted to the appropriate
   * spectrum management office.
   *
   * @param value An instances of type {@link Calendar}.
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withApplicationDate(Calendar value) {
    setApplicationDate(new D(value));
    return this;
  }

  /**
   * Set the date on which the application will be submitted to the appropriate
   * spectrum management office.
   *
   * @param value An instances of type {@link Date}.
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withApplicationDate(Date value) {
    setApplicationDate(new D(value));
    return this;
  }

  /**
   * Set the date by which the frequency assignment or Spectrum Supportability
   * Reply is required by the user in order to complete necessary advanced
   * operation coordination.
   *
   * @param value An instances of type {@link Calendar}.
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withDateResponseRequired(Calendar value) {
    setDateResponseRequired(new D(value));
    return this;
  }

  /**
   * Set the date by which the frequency assignment or Spectrum Supportability
   * Reply is required by the user in order to complete necessary advanced
   * operation coordination.
   *
   * @param value An instances of type {@link Date}.
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withDateResponseRequired(Date value) {
    setDateResponseRequired(new D(value));
    return this;
  }

  /**
   * Set the name of the systems that are likely to be replaced by this system.
   *
   * @param value An instances of type {@link String}.
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withReplacementInfo(String value) {
    setReplacementInfo(new MEMO(value));
    return this;
  }

  /**
   * Set the application Spectrum Planning Subcommittee (SPS) document
   * identifier assigned by NTIA. This is not the same as the Certification of
   * Spectrum Support SPS number.
   *
   * @param value An instances of type {@link String}.
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withApplicationSPSNumber(String value) {
    setApplicationSPSNumber(new S11(value));
    return this;
  }

  /**
   * Set the US Military Communications-Electronics Board (MCEB) identifier
   * assigned to the equipment or system. (e.g., J/F 12/12345). An SSRequest
   * coordination number usually ends with an even digit (e.g., /2, /4), while
   * an SSReply coordination number usually ends with an odd digit (e.g., /3,
   * /5). When certifying equipment, both SSRequest and SSReply SHOULD have a
   * coordination number.
   *
   * @param value An instances of type {@link String}.
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withCoordinationNum(String value) {
    setCoordinationNum(new S15(value));
    return this;
  }

  /**
   * Set the required character rates, data rates, and circuit
   * quality/reliability of the system.
   *
   * @param value An instances of type {@link String}.
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withInfoTransferRequirement(String value) {
    setInfoTransferRequirement(new MEMO(value));
    return this;
  }

  /**
   * Set the estimated initial cost, in US dollars, of the system/equipment.
   *
   * @param value An instances of type {@link String}.
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withInitialCost(String value) {
    setInitialCost(new S70(value));
    return this;
  }

  /**
   * Set the explanation of how the estimated initial cost for the system was
   * calculated.
   *
   * @param value An instances of type {@link String}.
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withInitialCostDesc(String value) {
    setInitialCostDesc(new MEMO(value));
    return this;
  }

  /**
   * Set if this is a satellite system that is exempt from submitting
   * notification to the Radiocommunication Bureau.
   *
   * @param value An instances of type {@link ListCBO}.
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withITUWaiver(ListCBO value) {
    setITUWaiver(new TString(value.value()));
    return this;
  }

  /**
   * Set if this application requires coordination with the National Authority
   * for approval. For US records, the National Authority is NTIA and this
   * should be Yes, unless the record does not require coordination with NTIA
   * for approval.
   *
   * @param value An instances of type {@link ListCBO}.
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withNTIACoordinationRequired(ListCBO value) {
    setNTIACoordinationRequired(new TString(value.value()));
    return this;
  }

  /**
   * Set the Space and terrestrial information as defined by section 10.8 of the
   * NTIA Manual and not captured in other more specific data fields.
   *
   * @param value An instances of type {@link String}.
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withNTIASpaceData(String value) {
    setNTIASpaceData(new MEMO(value));
    return this;
  }

  /**
   * Set if the system is intended for the DoD operational inventory.
   *
   * @param value An instances of type {@link ListCBO}.
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withOperInvIntent(ListCBO value) {
    setOperInvIntent(new TString(value.value()));
    return this;
  }

  /**
   * Set the agency that originated the application.
   *
   * @param value An instances of type {@link String}.
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withOriginatingAgency(String value) {
    setOriginatingAgency(new S80(value));
    return this;
  }

  /**
   * Set the request type. Possible values may include, but are not limited to,
   * DoD Certification, NTIA Certification, and Foreign Coordination.
   *
   * @param value An instances of type {@link String}.
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withRequestType(String value) {
    setRequestType(new S50(value));
    return this;
  }

  /**
   * Set In Data Item RelatedAnalysisAndTestData (US), describe electromagnetic
   * compatibility studies, testing or analyses relevant to this system,
   * including documents currently in progress. Use the ExtReference attribute
   * of this element as appropriate.
   *
   * @param value An instances of type {@link String}.
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withRelatedAnalysisAndTestData(String value) {
    setRelatedAnalysisAndTestData(new MEMO(value));
    return this;
  }

  /**
   * Set
   *
   * @param value An instances of type {@link String}.
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withSysRelationEssential(String value) {
    setSysRelationEssential(new MEMO(value));
    return this;
  }

  /**
   * Set the telecommunications service priority applicable to a
   * spectrum-dependent radiocommunications system intended to be used in direct
   * support of a national emergency declared under Section 706 of the
   * Communications Act of 1934, as amended.
   *
   * @param value An instances of type {@link String}.
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withTSPR(String value) {
    setTSPR(new S10(value));
    return this;
  }

  /**
   * Set if the system is used in a wartime environment.
   *
   * @param value An instances of type {@link ListCBO}.
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withWartimeUse(ListCBO value) {
    setWartimeUse(new TString(value.value()));
    return this;
  }

  /**
   * Set the Project
   * <p>
   * Complex element Project provides the Project, OPLAN, COMPLAN or Exercise
   * name, or any other project name associated to the dataset.
   *
   * @param values One or more instances of type {@link Project...}.
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withProject(Project... values) {
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
   *
   * @param values A collection of {@link Project} instances
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withProject(Collection<Project> values) {
    if (values != null) {
      getProject().addAll(values);
    }
    return this;
  }

  /**
   * Set the current stage of the system.
   *
   * @param values One or more instances of type {@link Stage...}.
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withStage(Stage... values) {
    if (values != null) {
      getStage().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the current stage of the system.
   *
   * @param values A collection of {@link Stage} instances
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withStage(Collection<Stage> values) {
    if (values != null) {
      getStage().addAll(values);
    }
    return this;
  }

  /**
   * Set the Nomenclature
   * <p>
   * Complex element Nomenclature identifies either the standard military,
   * government, nomenclature or the commercial model number of an equipment.
   * Each device or group of devices may have several types of nomenclatures,
   * e.g. both a military nomenclature and a commercial model number.
   *
   * @param values One or more instances of type {@link Nomenclature...}.
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withNomenclature(Nomenclature... values) {
    if (values != null) {
      getNomenclature().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Nomenclature
   * <p>
   * Complex element Nomenclature identifies either the standard military,
   * government, nomenclature or the commercial model number of an equipment.
   * Each device or group of devices may have several types of nomenclatures,
   * e.g. both a military nomenclature and a commercial model number.
   *
   * @param values A collection of {@link Nomenclature} instances
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withNomenclature(Collection<Nomenclature> values) {
    if (values != null) {
      getNomenclature().addAll(values);
    }
    return this;
  }

  /**
   * Set the POCInformation
   * <p>
   * Complex element POCInformation contains a reference to a Contact,
   * Organisation or Role dataset.
   *
   * @param values One or more instances of type {@link POCInformation...}.
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withPOCInformation(POCInformation... values) {
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
   *
   * @param values A collection of {@link POCInformation} instances
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withPOCInformation(Collection<POCInformation> values) {
    if (values != null) {
      getPOCInformation().addAll(values);
    }
    return this;
  }

  /**
   * Set the RelatedSupportability
   * <p>
   * Complex element RelatedSupportability refers to a SSRequest with which the
   * current dataset has a dependency.
   *
   * @param values One or more instances of type
   *               {@link RelatedSupportability...}.
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withRelatedSupportability(RelatedSupportability... values) {
    if (values != null) {
      getRelatedSupportability().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the RelatedSupportability
   * <p>
   * Complex element RelatedSupportability refers to a SSRequest with which the
   * current dataset has a dependency.
   *
   * @param values A collection of {@link RelatedSupportability} instances
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withRelatedSupportability(Collection<RelatedSupportability> values) {
    if (values != null) {
      getRelatedSupportability().addAll(values);
    }
    return this;
  }

  /**
   * Set the HostNation
   * <p>
   * Complex element HostNation indicates the host nations from which
   * supportability is requested. If a SSRequest received by NATO has no
   * HostNation entry, it will be assumed that this SSRequest is for all NATO
   * Nations plus AUS and NZL (in accordance with the FMSC agreement).
   *
   * @param values One or more instances of type {@link HostNation...}.
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withHostNation(HostNation... values) {
    if (values != null) {
      getHostNation().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the HostNation
   * <p>
   * Complex element HostNation indicates the host nations from which
   * supportability is requested. If a SSRequest received by NATO has no
   * HostNation entry, it will be assumed that this SSRequest is for all NATO
   * Nations plus AUS and NZL (in accordance with the FMSC agreement).
   *
   * @param values A collection of {@link HostNation} instances
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withHostNation(Collection<HostNation> values) {
    if (values != null) {
      getHostNation().addAll(values);
    }
    return this;
  }

  /**
   * Set if the system is used in a wartime environment.
   *
   * @param values One or more instances of type {@link Time...}.
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withTime(Time... values) {
    if (values != null) {
      getTime().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set if the system is used in a wartime environment.
   *
   * @param values A collection of {@link Time} instances
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withTime(Collection<Time> values) {
    if (values != null) {
      getTime().addAll(values);
    }
    return this;
  }

  /**
   * Set the DiagramEndpoint
   * <p>
   * Complex element DiagramEndpoint defines an instance of an icon on the
   * diagram.
   *
   * @param values One or more instances of type {@link DiagramEndpoint...}.
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withDiagramEndpoint(DiagramEndpoint... values) {
    if (values != null) {
      getDiagramEndpoint().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the DiagramEndpoint
   * <p>
   * Complex element DiagramEndpoint defines an instance of an icon on the
   * diagram.
   *
   * @param values A collection of {@link DiagramEndpoint} instances
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withDiagramEndpoint(Collection<DiagramEndpoint> values) {
    if (values != null) {
      getDiagramEndpoint().addAll(values);
    }
    return this;
  }

  /**
   * Set the DiagramLine
   * <p>
   * Complex element DiagramLine defines a line between two endpoints on the
   * diagram.
   *
   * @param values One or more instances of type {@link DiagramLine...}.
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withDiagramLine(DiagramLine... values) {
    if (values != null) {
      getDiagramLine().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the DiagramLine
   * <p>
   * Complex element DiagramLine defines a line between two endpoints on the
   * diagram.
   *
   * @param values A collection of {@link DiagramLine} instances
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withDiagramLine(Collection<DiagramLine> values) {
    if (values != null) {
      getDiagramLine().addAll(values);
    }
    return this;
  }

  /**
   * Set the Configuration
   * <p>
   * Complex element Configuration identifies each operational configuration
   * that is required in a SSRequest, granted by a Host Nation in a SSReply, or
   * authorised in a frequency Assignment or Allotment dataset. It also
   * identifies the functional use of the assigned frequency at a particular
   * transmitting station.
   *
   * @param values One or more instances of type {@link Configuration...}.
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withConfiguration(Configuration... values) {
    if (values != null) {
      getConfiguration().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Configuration
   * <p>
   * Complex element Configuration identifies each operational configuration
   * that is required in a SSRequest, granted by a Host Nation in a SSReply, or
   * authorised in a frequency Assignment or Allotment dataset. It also
   * identifies the functional use of the assigned frequency at a particular
   * transmitting station.
   *
   * @param values A collection of {@link Configuration} instances
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withConfiguration(Collection<Configuration> values) {
    if (values != null) {
      getConfiguration().addAll(values);
    }
    return this;
  }

  /**
   * Set the US:StatusLog
   * <p>
   * Complex element StatusLog (US) contains the transactional processing
   * information related to spectrum supportability requests.
   *
   * @param values One or more instances of type {@link StatusLog...}.
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withStatusLog(StatusLog... values) {
    if (values != null) {
      getStatusLog().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the US:StatusLog
   * <p>
   * Complex element StatusLog (US) contains the transactional processing
   * information related to spectrum supportability requests.
   *
   * @param values A collection of {@link StatusLog} instances
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withStatusLog(Collection<StatusLog> values) {
    if (values != null) {
      getStatusLog().addAll(values);
    }
    return this;
  }

  /**
   * Set the US:Trunking
   * <p>
   * Complex element Trunking (US) defines Radiotelephony using standard land
   * mobile principles where multiple baseband signals are bounded within one
   * physical channel.
   *
   * @param value An instances of type {@link Trunking}.
   * @return The current SSRequest object instance.
   * @since 3.1.0
   */
  public SSRequest withTrunking(Trunking value) {
    return this;
  }

  /**
   * Get a string representation of this SSRequest instance configuration.
   *
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "\n  SSRequest {"
           + (applicationDate != null ? " applicationDate [" + applicationDate + "]" : "")
           + (applicationSPSNumber != null ? " applicationSPSNumber [" + applicationSPSNumber + "]" : "")
           + (configuration != null ? " configuration [" + configuration + "]" : "")
           + (coordinationNum != null ? " coordinationNum [" + coordinationNum + "]" : "")
           + (currentStage != null ? " currentStage [" + currentStage + "]" : "")
           + (dateResponseRequired != null ? " dateResponseRequired [" + dateResponseRequired + "]" : "")
           + (diagramEndpoint != null ? " diagramEndpoint [" + diagramEndpoint + "]" : "")
           + (diagramLine != null ? " diagramLine [" + diagramLine + "]" : "")
           + (emergency != null ? " emergency [" + emergency + "]" : "")
           + (hostNation != null ? " hostNation [" + hostNation + "]" : "")
           + (infoTransferRequirement != null ? " infoTransferRequirement [" + infoTransferRequirement + "]" : "")
           + (initialCost != null ? " initialCost [" + initialCost + "]" : "")
           + (initialCostDesc != null ? " initialCostDesc [" + initialCostDesc + "]" : "")
           + (ituWaiver != null ? " ituWaiver [" + ituWaiver + "]" : "")
           + (nomenclature != null ? " nomenclature [" + nomenclature + "]" : "")
           + (ntiaCoordinationRequired != null ? " ntiaCoordinationRequired [" + ntiaCoordinationRequired + "]" : "")
           + (ntiaSpaceData != null ? " ntiaSpaceData [" + ntiaSpaceData + "]" : "")
           + (numAreaUnits != null ? " numAreaUnits [" + numAreaUnits + "]" : "")
           + (numCositedUnits != null ? " numCositedUnits [" + numCositedUnits + "]" : "")
           + (numMobileUnits != null ? " numMobileUnits [" + numMobileUnits + "]" : "")
           + (operInvIntent != null ? " operInvIntent [" + operInvIntent + "]" : "")
           + (originatingAgency != null ? " originatingAgency [" + originatingAgency + "]" : "")
           + (pocInformation != null ? " pocInformation [" + pocInformation + "]" : "")
           + (project != null ? " project [" + project + "]" : "")
           + (relatedAnalysisAndTestData != null ? " relatedAnalysisAndTestData [" + relatedAnalysisAndTestData + "]" : "")
           + (relatedSupportability != null ? " relatedSupportability [" + relatedSupportability + "]" : "")
           + (replacementInfo != null ? " replacementInfo [" + replacementInfo + "]" : "")
           + (requestType != null ? " requestType [" + requestType + "]" : "")
           + (requirement != null ? " requirement [" + requirement + "]" : "")
           + (stage != null ? " stage [" + stage + "]" : "")
           + (statusLog != null ? " statusLog [" + statusLog + "]" : "")
           + (sysRelationEssential != null ? " sysRelationEssential [" + sysRelationEssential + "]" : "")
           + (time != null ? " time [" + time + "]" : "")
           + (title != null ? " title [" + title + "]" : "")
           + (trunking != null ? " trunking [" + trunking + "]" : "")
           + (tspr != null ? " tspr [" + tspr + "]" : "")
           + (wartimeUse != null ? " wartimeUse [" + wartimeUse + "]" : "")
           + super.toString();
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link SSRequest} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and {@link S100 Title}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   *
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetTitle();
  }

}
