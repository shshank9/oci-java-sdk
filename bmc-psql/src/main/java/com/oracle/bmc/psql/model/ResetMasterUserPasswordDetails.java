/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * Password detail that will be used to reset the DbSystem's master user. They are not visible on
 * any subsequent operation, such as GET /dbSystems/{dbSystemId}. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ResetMasterUserPasswordDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ResetMasterUserPasswordDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"passwordDetails"})
    public ResetMasterUserPasswordDetails(PasswordDetails passwordDetails) {
        super();
        this.passwordDetails = passwordDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("passwordDetails")
        private PasswordDetails passwordDetails;

        public Builder passwordDetails(PasswordDetails passwordDetails) {
            this.passwordDetails = passwordDetails;
            this.__explicitlySet__.add("passwordDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResetMasterUserPasswordDetails build() {
            ResetMasterUserPasswordDetails model =
                    new ResetMasterUserPasswordDetails(this.passwordDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResetMasterUserPasswordDetails model) {
            if (model.wasPropertyExplicitlySet("passwordDetails")) {
                this.passwordDetails(model.getPasswordDetails());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @com.fasterxml.jackson.annotation.JsonProperty("passwordDetails")
    private final PasswordDetails passwordDetails;

    public PasswordDetails getPasswordDetails() {
        return passwordDetails;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ResetMasterUserPasswordDetails(");
        sb.append("super=").append(super.toString());
        sb.append("passwordDetails=").append(String.valueOf(this.passwordDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResetMasterUserPasswordDetails)) {
            return false;
        }

        ResetMasterUserPasswordDetails other = (ResetMasterUserPasswordDetails) o;
        return java.util.Objects.equals(this.passwordDetails, other.passwordDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.passwordDetails == null ? 43 : this.passwordDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
