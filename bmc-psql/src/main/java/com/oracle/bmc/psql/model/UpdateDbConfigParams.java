/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * Configuration for PGSQL instance. <br>
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
        builder = UpdateDbConfigParams.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateDbConfigParams
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"applyConfig", "configId"})
    public UpdateDbConfigParams(ApplyConfig applyConfig, String configId) {
        super();
        this.applyConfig = applyConfig;
        this.configId = configId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Specify whether config update requires a restart of Db instance or reload of config. Some
         * of the config changes require restart of DB instnace's to apply.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("applyConfig")
        private ApplyConfig applyConfig;

        /**
         * Specify whether config update requires a restart of Db instance or reload of config. Some
         * of the config changes require restart of DB instnace's to apply.
         *
         * @param applyConfig the value to set
         * @return this builder
         */
        public Builder applyConfig(ApplyConfig applyConfig) {
            this.applyConfig = applyConfig;
            this.__explicitlySet__.add("applyConfig");
            return this;
        }
        /** Configuration identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("configId")
        private String configId;

        /**
         * Configuration identifier
         *
         * @param configId the value to set
         * @return this builder
         */
        public Builder configId(String configId) {
            this.configId = configId;
            this.__explicitlySet__.add("configId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateDbConfigParams build() {
            UpdateDbConfigParams model = new UpdateDbConfigParams(this.applyConfig, this.configId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateDbConfigParams model) {
            if (model.wasPropertyExplicitlySet("applyConfig")) {
                this.applyConfig(model.getApplyConfig());
            }
            if (model.wasPropertyExplicitlySet("configId")) {
                this.configId(model.getConfigId());
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

    /**
     * Specify whether config update requires a restart of Db instance or reload of config. Some of
     * the config changes require restart of DB instnace's to apply.
     */
    public enum ApplyConfig implements com.oracle.bmc.http.internal.BmcEnum {
        Restart("RESTART"),
        Reload("RELOAD"),
        ;

        private final String value;
        private static java.util.Map<String, ApplyConfig> map;

        static {
            map = new java.util.HashMap<>();
            for (ApplyConfig v : ApplyConfig.values()) {
                map.put(v.getValue(), v);
            }
        }

        ApplyConfig(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ApplyConfig create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ApplyConfig: " + key);
        }
    };
    /**
     * Specify whether config update requires a restart of Db instance or reload of config. Some of
     * the config changes require restart of DB instnace's to apply.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("applyConfig")
    private final ApplyConfig applyConfig;

    /**
     * Specify whether config update requires a restart of Db instance or reload of config. Some of
     * the config changes require restart of DB instnace's to apply.
     *
     * @return the value
     */
    public ApplyConfig getApplyConfig() {
        return applyConfig;
    }

    /** Configuration identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("configId")
    private final String configId;

    /**
     * Configuration identifier
     *
     * @return the value
     */
    public String getConfigId() {
        return configId;
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
        sb.append("UpdateDbConfigParams(");
        sb.append("super=").append(super.toString());
        sb.append("applyConfig=").append(String.valueOf(this.applyConfig));
        sb.append(", configId=").append(String.valueOf(this.configId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDbConfigParams)) {
            return false;
        }

        UpdateDbConfigParams other = (UpdateDbConfigParams) o;
        return java.util.Objects.equals(this.applyConfig, other.applyConfig)
                && java.util.Objects.equals(this.configId, other.configId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.applyConfig == null ? 43 : this.applyConfig.hashCode());
        result = (result * PRIME) + (this.configId == null ? 43 : this.configId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
