/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.requests;

import com.oracle.bmc.psql.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/psql/ChangeDbSystemCompartmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeDbSystemCompartmentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
public class ChangeDbSystemCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.psql.model.ChangeDbSystemCompartmentDetails> {

    /** unique DbSystem identifier */
    private String dbSystemId;

    /** unique DbSystem identifier */
    public String getDbSystemId() {
        return dbSystemId;
    }
    /** The information to be updated. */
    private com.oracle.bmc.psql.model.ChangeDbSystemCompartmentDetails
            changeDbSystemCompartmentDetails;

    /** The information to be updated. */
    public com.oracle.bmc.psql.model.ChangeDbSystemCompartmentDetails
            getChangeDbSystemCompartmentDetails() {
        return changeDbSystemCompartmentDetails;
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
    public com.oracle.bmc.psql.model.ChangeDbSystemCompartmentDetails getBody$() {
        return changeDbSystemCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeDbSystemCompartmentRequest,
                    com.oracle.bmc.psql.model.ChangeDbSystemCompartmentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** unique DbSystem identifier */
        private String dbSystemId = null;

        /**
         * unique DbSystem identifier
         *
         * @param dbSystemId the value to set
         * @return this builder instance
         */
        public Builder dbSystemId(String dbSystemId) {
            this.dbSystemId = dbSystemId;
            return this;
        }

        /** The information to be updated. */
        private com.oracle.bmc.psql.model.ChangeDbSystemCompartmentDetails
                changeDbSystemCompartmentDetails = null;

        /**
         * The information to be updated.
         *
         * @param changeDbSystemCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeDbSystemCompartmentDetails(
                com.oracle.bmc.psql.model.ChangeDbSystemCompartmentDetails
                        changeDbSystemCompartmentDetails) {
            this.changeDbSystemCompartmentDetails = changeDbSystemCompartmentDetails;
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
        public Builder copy(ChangeDbSystemCompartmentRequest o) {
            dbSystemId(o.getDbSystemId());
            changeDbSystemCompartmentDetails(o.getChangeDbSystemCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeDbSystemCompartmentRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeDbSystemCompartmentRequest
         */
        public ChangeDbSystemCompartmentRequest build() {
            ChangeDbSystemCompartmentRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.psql.model.ChangeDbSystemCompartmentDetails body) {
            changeDbSystemCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeDbSystemCompartmentRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeDbSystemCompartmentRequest
         */
        public ChangeDbSystemCompartmentRequest buildWithoutInvocationCallback() {
            ChangeDbSystemCompartmentRequest request = new ChangeDbSystemCompartmentRequest();
            request.dbSystemId = dbSystemId;
            request.changeDbSystemCompartmentDetails = changeDbSystemCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ChangeDbSystemCompartmentRequest(dbSystemId, changeDbSystemCompartmentDetails,
            // ifMatch, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .dbSystemId(dbSystemId)
                .changeDbSystemCompartmentDetails(changeDbSystemCompartmentDetails)
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
        sb.append(",dbSystemId=").append(String.valueOf(this.dbSystemId));
        sb.append(",changeDbSystemCompartmentDetails=")
                .append(String.valueOf(this.changeDbSystemCompartmentDetails));
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
        if (!(o instanceof ChangeDbSystemCompartmentRequest)) {
            return false;
        }

        ChangeDbSystemCompartmentRequest other = (ChangeDbSystemCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.dbSystemId, other.dbSystemId)
                && java.util.Objects.equals(
                        this.changeDbSystemCompartmentDetails,
                        other.changeDbSystemCompartmentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.dbSystemId == null ? 43 : this.dbSystemId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeDbSystemCompartmentDetails == null
                                ? 43
                                : this.changeDbSystemCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
