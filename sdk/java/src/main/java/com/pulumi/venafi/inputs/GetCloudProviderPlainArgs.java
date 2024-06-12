// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.venafi.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetCloudProviderPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudProviderPlainArgs Empty = new GetCloudProviderPlainArgs();

    /**
     * Name of the Cloud Provider to look up.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the Cloud Provider to look up.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetCloudProviderPlainArgs() {}

    private GetCloudProviderPlainArgs(GetCloudProviderPlainArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudProviderPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudProviderPlainArgs $;

        public Builder() {
            $ = new GetCloudProviderPlainArgs();
        }

        public Builder(GetCloudProviderPlainArgs defaults) {
            $ = new GetCloudProviderPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the Cloud Provider to look up.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetCloudProviderPlainArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetCloudProviderPlainArgs", "name");
            }
            return $;
        }
    }

}
