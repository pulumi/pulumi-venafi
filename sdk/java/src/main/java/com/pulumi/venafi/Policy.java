// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.venafi;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.venafi.PolicyArgs;
import com.pulumi.venafi.Utilities;
import com.pulumi.venafi.inputs.PolicyState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides access to read and write certificate policy in Venafi. This can be used to define a new policy (folder in
 * *Trust Protection Platform*; application and issuing template in *Venafi Control Plane*).
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.venafi.Policy;
 * import com.pulumi.venafi.PolicyArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var internalPolicy = new Policy("internalPolicy", PolicyArgs.builder()
 *             .zone("My Business App\\Enterprise Trusted Certs")
 *             .policySpecification(StdFunctions.file(FileArgs.builder()
 *                 .input("/path-to/internal-policy.json")
 *                 .build()).result())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * The `venafi_policy` resource supports the Terraform import method.
 * 
 * When used, the `zone` and `policy_specification` resource arguments are not required since the zone is a required
 * 
 * parameter of the import method and the policy specification is populated from the existing infrastructure. Policy that
 * 
 * is successfully imported is also output to a file named after the zone that was specified.
 * 
 * hcl
 * 
 * resource &#34;venafi_policy&#34; &#34;existing_policy&#34; {}
 * 
 * ```sh
 * $ pulumi import venafi:index/policy:Policy existing_policy&#34; &#34;My Business App\\Enterprise Trusted Certs&#34;
 * ```
 * 
 */
@ResourceType(type="venafi:index/policy:Policy")
public class Policy extends com.pulumi.resources.CustomResource {
    /**
     * The JSON-formatted certificate policy specification as documented
     * [here](https://github.com/Venafi/vcert/blob/master/README-POLICY-SPEC.md). Typically read from a file using the `file`
     * function.
     * 
     */
    @Export(name="policySpecification", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> policySpecification;

    /**
     * @return The JSON-formatted certificate policy specification as documented
     * [here](https://github.com/Venafi/vcert/blob/master/README-POLICY-SPEC.md). Typically read from a file using the `file`
     * function.
     * 
     */
    public Output<Optional<String>> policySpecification() {
        return Codegen.optional(this.policySpecification);
    }
    /**
     * The *Trust Protection Plaform* policy folder or *Venafi Control Plane* application and
     * issuing template.
     * 
     */
    @Export(name="zone", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> zone;

    /**
     * @return The *Trust Protection Plaform* policy folder or *Venafi Control Plane* application and
     * issuing template.
     * 
     */
    public Output<Optional<String>> zone() {
        return Codegen.optional(this.zone);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Policy(java.lang.String name) {
        this(name, PolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Policy(java.lang.String name, @Nullable PolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Policy(java.lang.String name, @Nullable PolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("venafi:index/policy:Policy", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Policy(java.lang.String name, Output<java.lang.String> id, @Nullable PolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("venafi:index/policy:Policy", name, state, makeResourceOptions(options, id), false);
    }

    private static PolicyArgs makeArgs(@Nullable PolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? PolicyArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static Policy get(java.lang.String name, Output<java.lang.String> id, @Nullable PolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Policy(name, id, state, options);
    }
}
