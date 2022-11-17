// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.venafi;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.venafi.SshConfigArgs;
import com.pulumi.venafi.Utilities;
import com.pulumi.venafi.inputs.SshConfigState;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides access to retrieve configuration from SSH certificate issuance template from *Venafi Trust Protection Platform*.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="venafi:index/sshConfig:SshConfig")
public class SshConfig extends com.pulumi.resources.CustomResource {
    /**
     * (Optional, string) The template&#39;s CA public key.
     * 
     */
    @Export(name="caPublicKey", type=String.class, parameters={})
    private Output<String> caPublicKey;

    /**
     * @return (Optional, string) The template&#39;s CA public key.
     * 
     */
    public Output<String> caPublicKey() {
        return this.caPublicKey;
    }
    /**
     * (Optional, set of strings) A list of user names exported from the template.
     * 
     */
    @Export(name="principals", type=List.class, parameters={String.class})
    private Output<List<String>> principals;

    /**
     * @return (Optional, set of strings) A list of user names exported from the template.
     * 
     */
    public Output<List<String>> principals() {
        return this.principals;
    }
    /**
     * The SSH certificate issuing template.
     * 
     */
    @Export(name="template", type=String.class, parameters={})
    private Output<String> template;

    /**
     * @return The SSH certificate issuing template.
     * 
     */
    public Output<String> template() {
        return this.template;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SshConfig(String name) {
        this(name, SshConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SshConfig(String name, SshConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SshConfig(String name, SshConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("venafi:index/sshConfig:SshConfig", name, args == null ? SshConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SshConfig(String name, Output<String> id, @Nullable SshConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("venafi:index/sshConfig:SshConfig", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static SshConfig get(String name, Output<String> id, @Nullable SshConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SshConfig(name, id, state, options);
    }
}
