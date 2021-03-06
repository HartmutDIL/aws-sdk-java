/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetContactList" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetContactListResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the contact list.
     * </p>
     */
    private String contactListName;
    /**
     * <p>
     * An interest group, theme, or label within a list. A contact list can have multiple topics.
     * </p>
     */
    private java.util.List<Topic> topics;
    /**
     * <p>
     * A description of what the contact list is about.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A timestamp noting when the contact list was created.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * A timestamp noting the last time the contact list was updated.
     * </p>
     */
    private java.util.Date lastUpdatedTimestamp;
    /**
     * <p>
     * The tags associated with a contact list.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the contact list.
     * </p>
     * 
     * @param contactListName
     *        The name of the contact list.
     */

    public void setContactListName(String contactListName) {
        this.contactListName = contactListName;
    }

    /**
     * <p>
     * The name of the contact list.
     * </p>
     * 
     * @return The name of the contact list.
     */

    public String getContactListName() {
        return this.contactListName;
    }

    /**
     * <p>
     * The name of the contact list.
     * </p>
     * 
     * @param contactListName
     *        The name of the contact list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContactListResult withContactListName(String contactListName) {
        setContactListName(contactListName);
        return this;
    }

    /**
     * <p>
     * An interest group, theme, or label within a list. A contact list can have multiple topics.
     * </p>
     * 
     * @return An interest group, theme, or label within a list. A contact list can have multiple topics.
     */

    public java.util.List<Topic> getTopics() {
        return topics;
    }

    /**
     * <p>
     * An interest group, theme, or label within a list. A contact list can have multiple topics.
     * </p>
     * 
     * @param topics
     *        An interest group, theme, or label within a list. A contact list can have multiple topics.
     */

    public void setTopics(java.util.Collection<Topic> topics) {
        if (topics == null) {
            this.topics = null;
            return;
        }

        this.topics = new java.util.ArrayList<Topic>(topics);
    }

    /**
     * <p>
     * An interest group, theme, or label within a list. A contact list can have multiple topics.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTopics(java.util.Collection)} or {@link #withTopics(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param topics
     *        An interest group, theme, or label within a list. A contact list can have multiple topics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContactListResult withTopics(Topic... topics) {
        if (this.topics == null) {
            setTopics(new java.util.ArrayList<Topic>(topics.length));
        }
        for (Topic ele : topics) {
            this.topics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An interest group, theme, or label within a list. A contact list can have multiple topics.
     * </p>
     * 
     * @param topics
     *        An interest group, theme, or label within a list. A contact list can have multiple topics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContactListResult withTopics(java.util.Collection<Topic> topics) {
        setTopics(topics);
        return this;
    }

    /**
     * <p>
     * A description of what the contact list is about.
     * </p>
     * 
     * @param description
     *        A description of what the contact list is about.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of what the contact list is about.
     * </p>
     * 
     * @return A description of what the contact list is about.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of what the contact list is about.
     * </p>
     * 
     * @param description
     *        A description of what the contact list is about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContactListResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A timestamp noting when the contact list was created.
     * </p>
     * 
     * @param createdTimestamp
     *        A timestamp noting when the contact list was created.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * A timestamp noting when the contact list was created.
     * </p>
     * 
     * @return A timestamp noting when the contact list was created.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * A timestamp noting when the contact list was created.
     * </p>
     * 
     * @param createdTimestamp
     *        A timestamp noting when the contact list was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContactListResult withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * A timestamp noting the last time the contact list was updated.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        A timestamp noting the last time the contact list was updated.
     */

    public void setLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    /**
     * <p>
     * A timestamp noting the last time the contact list was updated.
     * </p>
     * 
     * @return A timestamp noting the last time the contact list was updated.
     */

    public java.util.Date getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    /**
     * <p>
     * A timestamp noting the last time the contact list was updated.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        A timestamp noting the last time the contact list was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContactListResult withLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        setLastUpdatedTimestamp(lastUpdatedTimestamp);
        return this;
    }

    /**
     * <p>
     * The tags associated with a contact list.
     * </p>
     * 
     * @return The tags associated with a contact list.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags associated with a contact list.
     * </p>
     * 
     * @param tags
     *        The tags associated with a contact list.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags associated with a contact list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags associated with a contact list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContactListResult withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags associated with a contact list.
     * </p>
     * 
     * @param tags
     *        The tags associated with a contact list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContactListResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getContactListName() != null)
            sb.append("ContactListName: ").append(getContactListName()).append(",");
        if (getTopics() != null)
            sb.append("Topics: ").append(getTopics()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getLastUpdatedTimestamp() != null)
            sb.append("LastUpdatedTimestamp: ").append(getLastUpdatedTimestamp()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetContactListResult == false)
            return false;
        GetContactListResult other = (GetContactListResult) obj;
        if (other.getContactListName() == null ^ this.getContactListName() == null)
            return false;
        if (other.getContactListName() != null && other.getContactListName().equals(this.getContactListName()) == false)
            return false;
        if (other.getTopics() == null ^ this.getTopics() == null)
            return false;
        if (other.getTopics() != null && other.getTopics().equals(this.getTopics()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getLastUpdatedTimestamp() == null ^ this.getLastUpdatedTimestamp() == null)
            return false;
        if (other.getLastUpdatedTimestamp() != null && other.getLastUpdatedTimestamp().equals(this.getLastUpdatedTimestamp()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContactListName() == null) ? 0 : getContactListName().hashCode());
        hashCode = prime * hashCode + ((getTopics() == null) ? 0 : getTopics().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTimestamp() == null) ? 0 : getLastUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public GetContactListResult clone() {
        try {
            return (GetContactListResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
