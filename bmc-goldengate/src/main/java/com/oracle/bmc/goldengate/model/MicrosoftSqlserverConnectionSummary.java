/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Summary of the Microsoft SQL Server Connection. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MicrosoftSqlserverConnectionSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "connectionType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MicrosoftSqlserverConnectionSummary extends ConnectionSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private Connection.LifecycleState lifecycleState;

        public Builder lifecycleState(Connection.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            this.__explicitlySet__.add("vaultId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyId")
        private String keyId;

        public Builder keyId(String keyId) {
            this.keyId = keyId;
            this.__explicitlySet__.add("keyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ingressIps")
        private java.util.List<IngressIpDetails> ingressIps;

        public Builder ingressIps(java.util.List<IngressIpDetails> ingressIps) {
            this.ingressIps = ingressIps;
            this.__explicitlySet__.add("ingressIps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /** The Microsoft SQL Server technology type. */
        @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
        private MicrosoftSqlserverConnection.TechnologyType technologyType;

        /**
         * The Microsoft SQL Server technology type.
         *
         * @param technologyType the value to set
         * @return this builder
         */
        public Builder technologyType(MicrosoftSqlserverConnection.TechnologyType technologyType) {
            this.technologyType = technologyType;
            this.__explicitlySet__.add("technologyType");
            return this;
        }
        /** The name of the database. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
        private String databaseName;

        /**
         * The name of the database.
         *
         * @param databaseName the value to set
         * @return this builder
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            this.__explicitlySet__.add("databaseName");
            return this;
        }
        /** The name or address of a host. */
        @com.fasterxml.jackson.annotation.JsonProperty("host")
        private String host;

        /**
         * The name or address of a host.
         *
         * @param host the value to set
         * @return this builder
         */
        public Builder host(String host) {
            this.host = host;
            this.__explicitlySet__.add("host");
            return this;
        }
        /** The port of an endpoint usually specified for a connection. */
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * The port of an endpoint usually specified for a connection.
         *
         * @param port the value to set
         * @return this builder
         */
        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }
        /**
         * The username Oracle GoldenGate uses to connect to the Microsoft SQL Server. This username
         * must already exist and be available by the Microsoft SQL Server to be connected to.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("username")
        private String username;

        /**
         * The username Oracle GoldenGate uses to connect to the Microsoft SQL Server. This username
         * must already exist and be available by the Microsoft SQL Server to be connected to.
         *
         * @param username the value to set
         * @return this builder
         */
        public Builder username(String username) {
            this.username = username;
            this.__explicitlySet__.add("username");
            return this;
        }
        /**
         * An array of name-value pair attribute entries. Used as additional parameters in
         * connection string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalAttributes")
        private java.util.List<NameValuePair> additionalAttributes;

        /**
         * An array of name-value pair attribute entries. Used as additional parameters in
         * connection string.
         *
         * @param additionalAttributes the value to set
         * @return this builder
         */
        public Builder additionalAttributes(java.util.List<NameValuePair> additionalAttributes) {
            this.additionalAttributes = additionalAttributes;
            this.__explicitlySet__.add("additionalAttributes");
            return this;
        }
        /** Security Type for Microsoft SQL Server. */
        @com.fasterxml.jackson.annotation.JsonProperty("securityProtocol")
        private MicrosoftSqlserverConnection.SecurityProtocol securityProtocol;

        /**
         * Security Type for Microsoft SQL Server.
         *
         * @param securityProtocol the value to set
         * @return this builder
         */
        public Builder securityProtocol(
                MicrosoftSqlserverConnection.SecurityProtocol securityProtocol) {
            this.securityProtocol = securityProtocol;
            this.__explicitlySet__.add("securityProtocol");
            return this;
        }
        /**
         * Database Certificate - The base64 encoded content of a .pem or .crt file. containing the
         * server public key (for 1-way SSL).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sslCa")
        private String sslCa;

        /**
         * Database Certificate - The base64 encoded content of a .pem or .crt file. containing the
         * server public key (for 1-way SSL).
         *
         * @param sslCa the value to set
         * @return this builder
         */
        public Builder sslCa(String sslCa) {
            this.sslCa = sslCa;
            this.__explicitlySet__.add("sslCa");
            return this;
        }
        /**
         * If set to true, the driver validates the certificate that is sent by the database server.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldValidateServerCertificate")
        private Boolean shouldValidateServerCertificate;

        /**
         * If set to true, the driver validates the certificate that is sent by the database server.
         *
         * @param shouldValidateServerCertificate the value to set
         * @return this builder
         */
        public Builder shouldValidateServerCertificate(Boolean shouldValidateServerCertificate) {
            this.shouldValidateServerCertificate = shouldValidateServerCertificate;
            this.__explicitlySet__.add("shouldValidateServerCertificate");
            return this;
        }
        /**
         * The private IP address of the connection's endpoint in the customer's VCN, typically a
         * database endpoint or a big data endpoint (e.g. Kafka bootstrap server). In case the
         * privateIp is provided, the subnetId must also be provided. In case the privateIp (and the
         * subnetId) is not provided it is assumed the datasource is publicly accessible. In case
         * the connection is accessible only privately, the lack of privateIp will result in not
         * being able to access the connection.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("privateIp")
        private String privateIp;

        /**
         * The private IP address of the connection's endpoint in the customer's VCN, typically a
         * database endpoint or a big data endpoint (e.g. Kafka bootstrap server). In case the
         * privateIp is provided, the subnetId must also be provided. In case the privateIp (and the
         * subnetId) is not provided it is assumed the datasource is publicly accessible. In case
         * the connection is accessible only privately, the lack of privateIp will result in not
         * being able to access the connection.
         *
         * @param privateIp the value to set
         * @return this builder
         */
        public Builder privateIp(String privateIp) {
            this.privateIp = privateIp;
            this.__explicitlySet__.add("privateIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MicrosoftSqlserverConnectionSummary build() {
            MicrosoftSqlserverConnectionSummary model =
                    new MicrosoftSqlserverConnectionSummary(
                            this.id,
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeCreated,
                            this.timeUpdated,
                            this.vaultId,
                            this.keyId,
                            this.ingressIps,
                            this.nsgIds,
                            this.subnetId,
                            this.technologyType,
                            this.databaseName,
                            this.host,
                            this.port,
                            this.username,
                            this.additionalAttributes,
                            this.securityProtocol,
                            this.sslCa,
                            this.shouldValidateServerCertificate,
                            this.privateIp);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MicrosoftSqlserverConnectionSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("vaultId")) {
                this.vaultId(model.getVaultId());
            }
            if (model.wasPropertyExplicitlySet("keyId")) {
                this.keyId(model.getKeyId());
            }
            if (model.wasPropertyExplicitlySet("ingressIps")) {
                this.ingressIps(model.getIngressIps());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("technologyType")) {
                this.technologyType(model.getTechnologyType());
            }
            if (model.wasPropertyExplicitlySet("databaseName")) {
                this.databaseName(model.getDatabaseName());
            }
            if (model.wasPropertyExplicitlySet("host")) {
                this.host(model.getHost());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
            }
            if (model.wasPropertyExplicitlySet("username")) {
                this.username(model.getUsername());
            }
            if (model.wasPropertyExplicitlySet("additionalAttributes")) {
                this.additionalAttributes(model.getAdditionalAttributes());
            }
            if (model.wasPropertyExplicitlySet("securityProtocol")) {
                this.securityProtocol(model.getSecurityProtocol());
            }
            if (model.wasPropertyExplicitlySet("sslCa")) {
                this.sslCa(model.getSslCa());
            }
            if (model.wasPropertyExplicitlySet("shouldValidateServerCertificate")) {
                this.shouldValidateServerCertificate(model.getShouldValidateServerCertificate());
            }
            if (model.wasPropertyExplicitlySet("privateIp")) {
                this.privateIp(model.getPrivateIp());
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
    public MicrosoftSqlserverConnectionSummary(
            String id,
            String displayName,
            String description,
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            Connection.LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String vaultId,
            String keyId,
            java.util.List<IngressIpDetails> ingressIps,
            java.util.List<String> nsgIds,
            String subnetId,
            MicrosoftSqlserverConnection.TechnologyType technologyType,
            String databaseName,
            String host,
            Integer port,
            String username,
            java.util.List<NameValuePair> additionalAttributes,
            MicrosoftSqlserverConnection.SecurityProtocol securityProtocol,
            String sslCa,
            Boolean shouldValidateServerCertificate,
            String privateIp) {
        super(
                id,
                displayName,
                description,
                compartmentId,
                freeformTags,
                definedTags,
                systemTags,
                lifecycleState,
                lifecycleDetails,
                timeCreated,
                timeUpdated,
                vaultId,
                keyId,
                ingressIps,
                nsgIds,
                subnetId);
        this.technologyType = technologyType;
        this.databaseName = databaseName;
        this.host = host;
        this.port = port;
        this.username = username;
        this.additionalAttributes = additionalAttributes;
        this.securityProtocol = securityProtocol;
        this.sslCa = sslCa;
        this.shouldValidateServerCertificate = shouldValidateServerCertificate;
        this.privateIp = privateIp;
    }

    /** The Microsoft SQL Server technology type. */
    @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
    private final MicrosoftSqlserverConnection.TechnologyType technologyType;

    /**
     * The Microsoft SQL Server technology type.
     *
     * @return the value
     */
    public MicrosoftSqlserverConnection.TechnologyType getTechnologyType() {
        return technologyType;
    }

    /** The name of the database. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
    private final String databaseName;

    /**
     * The name of the database.
     *
     * @return the value
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /** The name or address of a host. */
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    private final String host;

    /**
     * The name or address of a host.
     *
     * @return the value
     */
    public String getHost() {
        return host;
    }

    /** The port of an endpoint usually specified for a connection. */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * The port of an endpoint usually specified for a connection.
     *
     * @return the value
     */
    public Integer getPort() {
        return port;
    }

    /**
     * The username Oracle GoldenGate uses to connect to the Microsoft SQL Server. This username
     * must already exist and be available by the Microsoft SQL Server to be connected to.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    private final String username;

    /**
     * The username Oracle GoldenGate uses to connect to the Microsoft SQL Server. This username
     * must already exist and be available by the Microsoft SQL Server to be connected to.
     *
     * @return the value
     */
    public String getUsername() {
        return username;
    }

    /**
     * An array of name-value pair attribute entries. Used as additional parameters in connection
     * string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalAttributes")
    private final java.util.List<NameValuePair> additionalAttributes;

    /**
     * An array of name-value pair attribute entries. Used as additional parameters in connection
     * string.
     *
     * @return the value
     */
    public java.util.List<NameValuePair> getAdditionalAttributes() {
        return additionalAttributes;
    }

    /** Security Type for Microsoft SQL Server. */
    @com.fasterxml.jackson.annotation.JsonProperty("securityProtocol")
    private final MicrosoftSqlserverConnection.SecurityProtocol securityProtocol;

    /**
     * Security Type for Microsoft SQL Server.
     *
     * @return the value
     */
    public MicrosoftSqlserverConnection.SecurityProtocol getSecurityProtocol() {
        return securityProtocol;
    }

    /**
     * Database Certificate - The base64 encoded content of a .pem or .crt file. containing the
     * server public key (for 1-way SSL).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sslCa")
    private final String sslCa;

    /**
     * Database Certificate - The base64 encoded content of a .pem or .crt file. containing the
     * server public key (for 1-way SSL).
     *
     * @return the value
     */
    public String getSslCa() {
        return sslCa;
    }

    /** If set to true, the driver validates the certificate that is sent by the database server. */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldValidateServerCertificate")
    private final Boolean shouldValidateServerCertificate;

    /**
     * If set to true, the driver validates the certificate that is sent by the database server.
     *
     * @return the value
     */
    public Boolean getShouldValidateServerCertificate() {
        return shouldValidateServerCertificate;
    }

    /**
     * The private IP address of the connection's endpoint in the customer's VCN, typically a
     * database endpoint or a big data endpoint (e.g. Kafka bootstrap server). In case the privateIp
     * is provided, the subnetId must also be provided. In case the privateIp (and the subnetId) is
     * not provided it is assumed the datasource is publicly accessible. In case the connection is
     * accessible only privately, the lack of privateIp will result in not being able to access the
     * connection.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privateIp")
    private final String privateIp;

    /**
     * The private IP address of the connection's endpoint in the customer's VCN, typically a
     * database endpoint or a big data endpoint (e.g. Kafka bootstrap server). In case the privateIp
     * is provided, the subnetId must also be provided. In case the privateIp (and the subnetId) is
     * not provided it is assumed the datasource is publicly accessible. In case the connection is
     * accessible only privately, the lack of privateIp will result in not being able to access the
     * connection.
     *
     * @return the value
     */
    public String getPrivateIp() {
        return privateIp;
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
        sb.append("MicrosoftSqlserverConnectionSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", technologyType=").append(String.valueOf(this.technologyType));
        sb.append(", databaseName=").append(String.valueOf(this.databaseName));
        sb.append(", host=").append(String.valueOf(this.host));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", username=").append(String.valueOf(this.username));
        sb.append(", additionalAttributes=").append(String.valueOf(this.additionalAttributes));
        sb.append(", securityProtocol=").append(String.valueOf(this.securityProtocol));
        sb.append(", sslCa=").append(String.valueOf(this.sslCa));
        sb.append(", shouldValidateServerCertificate=")
                .append(String.valueOf(this.shouldValidateServerCertificate));
        sb.append(", privateIp=").append(String.valueOf(this.privateIp));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MicrosoftSqlserverConnectionSummary)) {
            return false;
        }

        MicrosoftSqlserverConnectionSummary other = (MicrosoftSqlserverConnectionSummary) o;
        return java.util.Objects.equals(this.technologyType, other.technologyType)
                && java.util.Objects.equals(this.databaseName, other.databaseName)
                && java.util.Objects.equals(this.host, other.host)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.username, other.username)
                && java.util.Objects.equals(this.additionalAttributes, other.additionalAttributes)
                && java.util.Objects.equals(this.securityProtocol, other.securityProtocol)
                && java.util.Objects.equals(this.sslCa, other.sslCa)
                && java.util.Objects.equals(
                        this.shouldValidateServerCertificate, other.shouldValidateServerCertificate)
                && java.util.Objects.equals(this.privateIp, other.privateIp)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.technologyType == null ? 43 : this.technologyType.hashCode());
        result = (result * PRIME) + (this.databaseName == null ? 43 : this.databaseName.hashCode());
        result = (result * PRIME) + (this.host == null ? 43 : this.host.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result = (result * PRIME) + (this.username == null ? 43 : this.username.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalAttributes == null
                                ? 43
                                : this.additionalAttributes.hashCode());
        result =
                (result * PRIME)
                        + (this.securityProtocol == null ? 43 : this.securityProtocol.hashCode());
        result = (result * PRIME) + (this.sslCa == null ? 43 : this.sslCa.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldValidateServerCertificate == null
                                ? 43
                                : this.shouldValidateServerCertificate.hashCode());
        result = (result * PRIME) + (this.privateIp == null ? 43 : this.privateIp.hashCode());
        return result;
    }
}
