// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.venafi.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCloudKeystoreResult {
    private String cloudProviderId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Number of machine identities provisioned to the cloud keystore.
     * 
     */
    private Integer machineIdentitiesCount;
    private String name;
    /**
     * @return The cloud keystore type. Either `ACM`, `AKV` or `GCM`.
     * 
     */
    private String type;

    private GetCloudKeystoreResult() {}
    public String cloudProviderId() {
        return this.cloudProviderId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Number of machine identities provisioned to the cloud keystore.
     * 
     */
    public Integer machineIdentitiesCount() {
        return this.machineIdentitiesCount;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return The cloud keystore type. Either `ACM`, `AKV` or `GCM`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudKeystoreResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cloudProviderId;
        private String id;
        private Integer machineIdentitiesCount;
        private String name;
        private String type;
        public Builder() {}
        public Builder(GetCloudKeystoreResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudProviderId = defaults.cloudProviderId;
    	      this.id = defaults.id;
    	      this.machineIdentitiesCount = defaults.machineIdentitiesCount;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder cloudProviderId(String cloudProviderId) {
            if (cloudProviderId == null) {
              throw new MissingRequiredPropertyException("GetCloudKeystoreResult", "cloudProviderId");
            }
            this.cloudProviderId = cloudProviderId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetCloudKeystoreResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder machineIdentitiesCount(Integer machineIdentitiesCount) {
            if (machineIdentitiesCount == null) {
              throw new MissingRequiredPropertyException("GetCloudKeystoreResult", "machineIdentitiesCount");
            }
            this.machineIdentitiesCount = machineIdentitiesCount;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetCloudKeystoreResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetCloudKeystoreResult", "type");
            }
            this.type = type;
            return this;
        }
        public GetCloudKeystoreResult build() {
            final var _resultValue = new GetCloudKeystoreResult();
            _resultValue.cloudProviderId = cloudProviderId;
            _resultValue.id = id;
            _resultValue.machineIdentitiesCount = machineIdentitiesCount;
            _resultValue.name = name;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
