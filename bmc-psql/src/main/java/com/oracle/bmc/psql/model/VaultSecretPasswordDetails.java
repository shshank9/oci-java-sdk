/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * Secret details for the DbSystem password. <br>
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
        builder = VaultSecretPasswordDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "passwordType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class VaultSecretPasswordDetails extends PasswordDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of secret where the password is stored. */
        @com.fasterxml.jackson.annotation.JsonProperty("secretId")
        private String secretId;

        /**
         * The OCID of secret where the password is stored.
         *
         * @param secretId the value to set
         * @return this builder
         */
        public Builder secretId(String secretId) {
            this.secretId = secretId;
            this.__explicitlySet__.add("secretId");
            return this;
        }
        /** The secret version where the password is stored. */
        @com.fasterxml.jackson.annotation.JsonProperty("secretVersion")
        private String secretVersion;

        /**
         * The secret version where the password is stored.
         *
         * @param secretVersion the value to set
         * @return this builder
         */
        public Builder secretVersion(String secretVersion) {
            this.secretVersion = secretVersion;
            this.__explicitlySet__.add("secretVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VaultSecretPasswordDetails build() {
            VaultSecretPasswordDetails model =
                    new VaultSecretPasswordDetails(this.secretId, this.secretVersion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VaultSecretPasswordDetails model) {
            if (model.wasPropertyExplicitlySet("secretId")) {
                this.secretId(model.getSecretId());
            }
            if (model.wasPropertyExplicitlySet("secretVersion")) {
                this.secretVersion(model.getSecretVersion());
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

    @Deprecated
    public VaultSecretPasswordDetails(String secretId, String secretVersion) {
        super();
        this.secretId = secretId;
        this.secretVersion = secretVersion;
    }

    /** The OCID of secret where the password is stored. */
    @com.fasterxml.jackson.annotation.JsonProperty("secretId")
    private final String secretId;

    /**
     * The OCID of secret where the password is stored.
     *
     * @return the value
     */
    public String getSecretId() {
        return secretId;
    }

    /** The secret version where the password is stored. */
    @com.fasterxml.jackson.annotation.JsonProperty("secretVersion")
    private final String secretVersion;

    /**
     * The secret version where the password is stored.
     *
     * @return the value
     */
    public String getSecretVersion() {
        return secretVersion;
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
        sb.append("VaultSecretPasswordDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", secretId=").append(String.valueOf(this.secretId));
        sb.append(", secretVersion=").append(String.valueOf(this.secretVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VaultSecretPasswordDetails)) {
            return false;
        }

        VaultSecretPasswordDetails other = (VaultSecretPasswordDetails) o;
        return java.util.Objects.equals(this.secretId, other.secretId)
                && java.util.Objects.equals(this.secretVersion, other.secretVersion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.secretId == null ? 43 : this.secretId.hashCode());
        result =
                (result * PRIME)
                        + (this.secretVersion == null ? 43 : this.secretVersion.hashCode());
        return result;
    }
}
