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

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_1.administrative.CodeList;
import us.gov.dod.standard.ssrf._3_1.administrative.Dataset;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.Serial;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCDR;

/**
 * Data element Administrative has several usages: It can be used to inform
 * other data repositories that datasets have been deleted from a data
 * repository; It can also be used to reject an incoming dataset which cannot be
 * validated against the local repository, for example if it refers to unknown
 * datasets. Automated local data repository changes are not permitted on US
 * systems.
 * <p>
 * Sub-Elements are {@link CodeList}, {@link Dataset}
 * <p>
 * Example: Rejecting an Assignment for which the recipient does not have the
 * referenced Transmitter dataset:
 * <pre>
 * &lt;Administrative cls="U"&gt;
 *   &lt;Serial cls="U"&gt;DEU:NFA:DR:123&lt;/Serial&gt;
 *   &lt;MessageRef cls="U"&gt;DEU:NFA:MS:123&lt;/MessageRef&gt;
 *   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;Action cls="U"&gt;Missing Refs&lt;/Action&gt;
 *   &lt;Dataset&gt;
 *     &lt;Serial cls="U"&gt;USA::AS:456&lt;/Serial&gt;
 *     &lt;MissingRef cls="U"&gt;USA::TX:123&lt;/MissingRef&gt;
 *   &lt;/Dataset&gt;
 * &lt;/Administrative&gt;
 * </pre>
 *
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Administrative", propOrder = {
  "action",
  "messageRef",
  "dataset",
  "codeList"
})
public class Administrative extends Common<Administrative> {

  /**
   * Action - Action (Required)
   * <p>
   * The action which triggered the transmission, or to be performed upon
   * reception, of this dataset.
   * <p>
   * Format is L:CDR
   *
   * @since 3.1.0
   */
  @XmlElement(name = "Action", required = true)
  private TString action;
  /**
   * MessageRef - Message Reference (Optional)
   * <p>
   * The serial of the Message Dataset that is causing this response.
   * <p>
   * Format is pattern (S29)
   *
   * @since 3.1.0
   */
  @XmlElement(name = "MessageRef", required = false)
  private Serial messageRef;
  /**
   * Dataset (Optional)
   * <p>
   * Dataset is used within an Administrative transaction to specify the
   * identifier of the datasets on which the action must apply.
   *
   * @since 3.1.0
   */
  @XmlElement(name = "Dataset")
  private Set<Dataset> dataset;
  /**
   * CodeList (Optional)
   * <p>
   * CodeList contains the actions necessary to create or delete a code entry in
   * a given Code List.
   * <p>
   * CodeList and DataSet are exclusive.
   *
   * @since 3.1.0
   */
  @XmlElement(name = "CodeList")
  private Set<CodeList> codeList;

  /**
   * No arg constructor. Initializes the Common required fields.
   */
  public Administrative() {
    super();
  }

  /**
   * Get the action which triggered the transmission, or to be performed upon
   * reception, of this dataset..
   *
   * @return the Action value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getAction() {
    return action;
  }

  /**
   * Set the action which triggered the transmission, or to be performed upon
   * reception, of this dataset..
   *
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
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAction() {
    return (this.action != null ? this.action.isSetValue() : false);
  }

  /**
   * Get the serial of the Message Dataset that is causing this response..
   *
   * @return a {@link Serial} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getMessage()} instead.
   */
  @Deprecated
  public Serial getMessageRef() {
    return messageRef;
  }

  /**
   * Set the serial of the Message Dataset that is causing this response..
   *
   * @param value a {@link Serial} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setMessage(Message)} instead.
   */
  @Deprecated
  public void setMessageRef(Serial value) {
    this.messageRef = value;
  }

  /**
   * Determine if the MessageRef is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMessageRef() {
    return (this.messageRef != null ? this.messageRef.isSetValue() : false);
  }

  /**
   * Get the Dataset
   * <p>
   * Complex element Dataset is used within an Administrative transaction to
   * specify the identifier of the datasets on which the action must apply..
   *
   * @return a {@link Dataset} instance
   * @since 3.1.0
   */
  public Set<Dataset> getDataset() {
    if (dataset == null) {
      dataset = new HashSet<>();
    }
    return this.dataset;
  }

  /**
   * Determine if the Dataset is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDataset() {
    return ((this.dataset != null) && (!this.dataset.isEmpty()));
  }

  /**
   * Clear the Dataset field. This sets the field to null.
   */
  public void unsetDataset() {
    this.dataset = null;
  }

  /**
   * Get the CodeList
   * <p>
   * Complex element CodeList contains the actions necessary to create or delete
   * a code entry in a given Code List..
   *
   * @return a {@link CodeList} instance
   * @since 3.1.0
   */
  public Set<CodeList> getCodeList() {
    if (codeList == null) {
      codeList = new HashSet<>();
    }
    return this.codeList;
  }

  /**
   * Determine if the CodeList is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCodeList() {
    return ((this.codeList != null) && (!this.codeList.isEmpty()));
  }

  /**
   * Clear the CodeList field. This sets the field to null.
   */
  public void unsetCodeList() {
    this.codeList = null;
  }

  /**
   * Set the action which triggered the transmission, or to be performed upon
   * reception, of this dataset.
   *
   * @param value An instances of type {@link ListCDR}.
   * @return The current Administrative object instance.
   * @since 3.1.0
   */
  public Administrative withAction(ListCDR value) {
    setAction(new TString(value.value()));
    return this;
  }

  /**
   * Set the serial of the Message Dataset that is causing this response.
   *
   * @param value An instances of type {@link Serial}.
   * @return The current Administrative object instance.
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withMessage(Message)} instead.
   */
  @Deprecated
  public Administrative withMessageRef(Serial value) {
    setMessageRef(value);
    return this;
  }

  /**
   * Set the Dataset
   * <p>
   * Complex element Dataset is used within an Administrative transaction to
   * specify the identifier of the datasets on which the action must apply.
   *
   * @param values One or more instances of type {@link Dataset...}.
   * @return The current Administrative object instance.
   * @since 3.1.0
   */
  public Administrative withDataset(Dataset... values) {
    if (values != null) {
      getDataset().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Dataset
   * <p>
   * Complex element Dataset is used within an Administrative transaction to
   * specify the identifier of the datasets on which the action must apply.
   *
   * @param values A collection of {@link Dataset} instances
   * @return The current Administrative object instance.
   * @since 3.1.0
   */
  public Administrative withDataset(Collection<Dataset> values) {
    if (values != null) {
      getDataset().addAll(values);
    }
    return this;
  }

  /**
   * Set the CodeList
   * <p>
   * Complex element CodeList contains the actions necessary to create or delete
   * a code entry in a given Code List.
   *
   * @param values One or more instances of type {@link CodeList...}.
   * @return The current Administrative object instance.
   * @since 3.1.0
   */
  public Administrative withCodeList(CodeList... values) {
    if (values != null) {
      getCodeList().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the CodeList
   * <p>
   * Complex element CodeList contains the actions necessary to create or delete
   * a code entry in a given Code List.
   *
   * @param values A collection of {@link CodeList} instances
   * @return The current Administrative object instance.
   * @since 3.1.0
   */
  public Administrative withCodeList(Collection<CodeList> values) {
    if (values != null) {
      getCodeList().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this Administrative instance configuration.
   *
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "\n  Administrative {"
           + (action != null ? " action [" + action + "]" : "")
           + (codeList != null ? " codeList [" + codeList + "]" : "")
           + (dataset != null ? " dataset [" + dataset + "]" : "")
           + (messageRef != null ? " messageRef [" + messageRef + "]" : "")
           + super.toString();
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Administrative} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and {@link TString Action}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   *
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetAction();
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * MessageRef - Message Reference (Optional)
   * <p>
   * The serial of the Message Dataset that is causing this response.
   * <p>
   * Format is pattern (S29)
   *
   * @since 3.1.0
   */
  @XmlTransient
  private Message message;

  /**
   * Get the serial of the Message Dataset that is causing this response..
   *
   * @return a {@link Message} instance
   * @since 3.1.0
   */
  public Message getMessage() {
    return message;
  }

  /**
   * Determine if the message field is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMessage() {
    return this.message != null;
  }

  /**
   * Set the serial of the Message Dataset that is causing this response.
   *
   * @param value An instances of type {@link Message}.
   * @return The current Administrative object instance.
   * @since 3.1.0
   */
  public Administrative withMessage(Message value) {
    this.message = value;
    return this;
  }

  /**
   * Update the SSRF data type references in this Administrative record.
   * <p>
   * This method builds the exported {@link #messageRef} field with values from
   * the transient {@link #message} field. This method should typically be
   * called after the Administrative is configured and (optionally) before
   * exporting an SSRF message.
   *
   * @since 3.1.0
   */
  @Override
  public void prepare() {
    super.prepare();
    this.messageRef = message != null ? message.getSerial() : this.messageRef;
  }

  /**
   * Update the SSRF data type references in this Administrative record after
   * loading from XML.
   * <p>
   * This method builds the transient {@link #message} with values from the
   * imported {@link #messageRef} field. This method should typically be called
   * after the Administrative is imported from XML. * @param root the SSRF root
   * instance.
   *
   * @since 3.1.0
   */
  @Override
  public void postLoad(SSRF root) {
    if (messageRef == null || !messageRef.isSetValue()) {
      return;
    }
    for (Message instance : root.getMessage()) {
      if (messageRef.equals(instance.getSerial())) {
        message = instance;
        return;
      }
    }
  }//</editor-fold>

}
