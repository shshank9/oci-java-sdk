/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.requests;

import com.oracle.bmc.psql.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/psql/ChangeConfigurationCompartmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeConfigurationCompartmentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
public class ChangeConfigurationCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.psql.model.ChangeConfigurationCompartmentDetails> {

    /** unique Configuration identifier */
    private String configurationId;

    /** unique Configuration identifier */
    public String getConfigurationId() {
        return configurationId;
    }
    /** The information to be updated. */
    private com.oracle.bmc.psql.model.ChangeConfigurationCompartmentDetails
            changeConfigurationCompartmentDetails;

    /** The information to be updated. */
    public com.oracle.bmc.psql.model.ChangeConfigurationCompartmentDetails
            getChangeConfigurationCompartmentDetails() {
        return changeConfigurationCompartmentDetails;
    }
    /** For optimistic concurrency control. In the PUT or DELETE call */
    private String ifMatch;

    /** For optimistic concurrency control. In the PUT or DELETE call */
    public String getIfMatch() {
        return ifMatch;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** A token that uniquely identifies a request so it can be retried in case of a timeout or */
    private String opcRetryToken;

    /** A token that uniquely identifies a request so it can be retried in case of a timeout or */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.psql.model.ChangeConfigurationCompartmentDetails getBody$() {
        return changeConfigurationCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeConfigurationCompartmentRequest,
                    com.oracle.bmc.psql.model.ChangeConfigurationCompartmentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** unique Configuration identifier */
        private String configurationId = null;

        /**
         * unique Configuration identifier
         *
         * @param configurationId the value to set
         * @return this builder instance
         */
        public Builder configurationId(String configurationId) {
            this.configurationId = configurationId;
            return this;
        }

        /** The information to be updated. */
        private com.oracle.bmc.psql.model.ChangeConfigurationCompartmentDetails
                changeConfigurationCompartmentDetails = null;

        /**
         * The information to be updated.
         *
         * @param changeConfigurationCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeConfigurationCompartmentDetails(
                com.oracle.bmc.psql.model.ChangeConfigurationCompartmentDetails
                        changeConfigurationCompartmentDetails) {
            this.changeConfigurationCompartmentDetails = changeConfigurationCompartmentDetails;
            return this;
        }

        /** For optimistic concurrency control. In the PUT or DELETE call */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         *
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         *
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        public Builder copy(ChangeConfigurationCompartmentRequest o) {
            configurationId(o.getConfigurationId());
            changeConfigurationCompartmentDetails(o.getChangeConfigurationCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeConfigurationCompartmentRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeConfigurationCompartmentRequest
         */
        public ChangeConfigurationCompartmentRequest build() {
            ChangeConfigurationCompartmentRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         *
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(com.oracle.bmc.psql.model.ChangeConfigurationCompartmentDetails body) {
            changeConfigurationCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeConfigurationCompartmentRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeConfigurationCompartmentRequest
         */
        public ChangeConfigurationCompartmentRequest buildWithoutInvocationCallback() {
            ChangeConfigurationCompartmentRequest request =
                    new ChangeConfigurationCompartmentRequest();
            request.configurationId = configurationId;
            request.changeConfigurationCompartmentDetails = changeConfigurationCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ChangeConfigurationCompartmentRequest(configurationId,
            // changeConfigurationCompartmentDetails, ifMatch, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .configurationId(configurationId)
                .changeConfigurationCompartmentDetails(changeConfigurationCompartmentDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
    }

    /**
     * Return a new builder for this request object.
     *
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",configurationId=").append(String.valueOf(this.configurationId));
        sb.append(",changeConfigurationCompartmentDetails=")
                .append(String.valueOf(this.changeConfigurationCompartmentDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeConfigurationCompartmentRequest)) {
            return false;
        }

        ChangeConfigurationCompartmentRequest other = (ChangeConfigurationCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.configurationId, other.configurationId)
                && java.util.Objects.equals(
                        this.changeConfigurationCompartmentDetails,
                        other.changeConfigurationCompartmentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.configurationId == null ? 43 : this.configurationId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeConfigurationCompartmentDetails == null
                                ? 43
                                : this.changeConfigurationCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
