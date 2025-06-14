/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UpdateSqlFirewallPolicyExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateSqlFirewallPolicyRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class UpdateSqlFirewallPolicyRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datasafe.model.UpdateSqlFirewallPolicyDetails> {

    /** The OCID of the SQL firewall policy resource. */
    private String sqlFirewallPolicyId;

    /** The OCID of the SQL firewall policy resource. */
    public String getSqlFirewallPolicyId() {
        return sqlFirewallPolicyId;
    }
    /** Details to update the SQL firewall policy. */
    private com.oracle.bmc.datasafe.model.UpdateSqlFirewallPolicyDetails
            updateSqlFirewallPolicyDetails;

    /** Details to update the SQL firewall policy. */
    public com.oracle.bmc.datasafe.model.UpdateSqlFirewallPolicyDetails
            getUpdateSqlFirewallPolicyDetails() {
        return updateSqlFirewallPolicyDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
     * if-match parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
     * if-match parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.datasafe.model.UpdateSqlFirewallPolicyDetails getBody$() {
        return updateSqlFirewallPolicyDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateSqlFirewallPolicyRequest,
                    com.oracle.bmc.datasafe.model.UpdateSqlFirewallPolicyDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the SQL firewall policy resource. */
        private String sqlFirewallPolicyId = null;

        /**
         * The OCID of the SQL firewall policy resource.
         *
         * @param sqlFirewallPolicyId the value to set
         * @return this builder instance
         */
        public Builder sqlFirewallPolicyId(String sqlFirewallPolicyId) {
            this.sqlFirewallPolicyId = sqlFirewallPolicyId;
            return this;
        }

        /** Details to update the SQL firewall policy. */
        private com.oracle.bmc.datasafe.model.UpdateSqlFirewallPolicyDetails
                updateSqlFirewallPolicyDetails = null;

        /**
         * Details to update the SQL firewall policy.
         *
         * @param updateSqlFirewallPolicyDetails the value to set
         * @return this builder instance
         */
        public Builder updateSqlFirewallPolicyDetails(
                com.oracle.bmc.datasafe.model.UpdateSqlFirewallPolicyDetails
                        updateSqlFirewallPolicyDetails) {
            this.updateSqlFirewallPolicyDetails = updateSqlFirewallPolicyDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * if-match parameter to the value of the etag from a previous GET or POST response for that
         * resource. The resource will be updated or deleted only if the etag you provide matches
         * the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * if-match parameter to the value of the etag from a previous GET or POST response for that
         * resource. The resource will be updated or deleted only if the etag you provide matches
         * the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /** Unique identifier for the request. */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
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
        public Builder copy(UpdateSqlFirewallPolicyRequest o) {
            sqlFirewallPolicyId(o.getSqlFirewallPolicyId());
            updateSqlFirewallPolicyDetails(o.getUpdateSqlFirewallPolicyDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateSqlFirewallPolicyRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateSqlFirewallPolicyRequest
         */
        public UpdateSqlFirewallPolicyRequest build() {
            UpdateSqlFirewallPolicyRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.datasafe.model.UpdateSqlFirewallPolicyDetails body) {
            updateSqlFirewallPolicyDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateSqlFirewallPolicyRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateSqlFirewallPolicyRequest
         */
        public UpdateSqlFirewallPolicyRequest buildWithoutInvocationCallback() {
            UpdateSqlFirewallPolicyRequest request = new UpdateSqlFirewallPolicyRequest();
            request.sqlFirewallPolicyId = sqlFirewallPolicyId;
            request.updateSqlFirewallPolicyDetails = updateSqlFirewallPolicyDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateSqlFirewallPolicyRequest(sqlFirewallPolicyId,
            // updateSqlFirewallPolicyDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .sqlFirewallPolicyId(sqlFirewallPolicyId)
                .updateSqlFirewallPolicyDetails(updateSqlFirewallPolicyDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId);
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
        sb.append(",sqlFirewallPolicyId=").append(String.valueOf(this.sqlFirewallPolicyId));
        sb.append(",updateSqlFirewallPolicyDetails=")
                .append(String.valueOf(this.updateSqlFirewallPolicyDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateSqlFirewallPolicyRequest)) {
            return false;
        }

        UpdateSqlFirewallPolicyRequest other = (UpdateSqlFirewallPolicyRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.sqlFirewallPolicyId, other.sqlFirewallPolicyId)
                && java.util.Objects.equals(
                        this.updateSqlFirewallPolicyDetails, other.updateSqlFirewallPolicyDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.sqlFirewallPolicyId == null
                                ? 43
                                : this.sqlFirewallPolicyId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateSqlFirewallPolicyDetails == null
                                ? 43
                                : this.updateSqlFirewallPolicyDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
