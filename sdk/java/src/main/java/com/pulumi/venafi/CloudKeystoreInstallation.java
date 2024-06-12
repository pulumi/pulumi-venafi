// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.venafi;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.venafi.CloudKeystoreInstallationArgs;
import com.pulumi.venafi.Utilities;
import com.pulumi.venafi.inputs.CloudKeystoreInstallationState;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provisions a certificate from Venafi Control Plane&#39;s inventory to any of the supported Cloud Providers: Amazon
 * Certificate Manager, Azure KeyVault or Google Certificate Manager. Exports the ID of the provisioned certificate:
 * certificate name for AKV and GCM or ARN for ACM.
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
 * import com.pulumi.venafi.CloudKeystoreInstallation;
 * import com.pulumi.venafi.CloudKeystoreInstallationArgs;
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
 *         // Provision a certificate to cloud keystore with static values
 *         var ckInstallationExampleById = new CloudKeystoreInstallation("ckInstallationExampleById", CloudKeystoreInstallationArgs.builder()
 *             .cloudKeystoreId("e48897d0-2762-11ef-198k-79ac590dd358")
 *             .certificateId("1877af16-2762-11ef-8fab-cc123456ff7")
 *             .cloudCertificateName("com-terraform-example-com")
 *             .build());
 * 
 *         // Provision a certificate to cloud keystore
 *         var ckInstallationExample = new CloudKeystoreInstallation("ckInstallationExample", CloudKeystoreInstallationArgs.builder()
 *             .cloudKeystoreId(ckExample.id())
 *             .certificateId(certificateExample.certificateId())
 *             .cloudCertificateName(certificateExample.commonName())
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
 * Using `pulumi import`, import a Machine Identity from Venafi Control Plane using their ID. For example:
 * 
 * console
 * 
 * ```sh
 * $ pulumi import venafi:index/cloudKeystoreInstallation:CloudKeystoreInstallation example 2155bd32-2234-22ac-7cfd-ff1198845aa2
 * ```
 * 
 */
@ResourceType(type="venafi:index/cloudKeystoreInstallation:CloudKeystoreInstallation")
public class CloudKeystoreInstallation extends com.pulumi.resources.CustomResource {
    /**
     * ARN of the AWS certificate. Use it to provision the VCP certificate to an existing ACM certificate, instead of a new one. Only valid for ACM keystores.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> arn;

    /**
     * @return ARN of the AWS certificate. Use it to provision the VCP certificate to an existing ACM certificate, instead of a new one. Only valid for ACM keystores.
     * 
     */
    public Output<Optional<String>> arn() {
        return Codegen.optional(this.arn);
    }
    /**
     * ID of the certificate to be provisioned to the given `keystore_id`.
     * 
     */
    @Export(name="certificateId", refs={String.class}, tree="[0]")
    private Output<String> certificateId;

    /**
     * @return ID of the certificate to be provisioned to the given `keystore_id`.
     * 
     */
    public Output<String> certificateId() {
        return this.certificateId;
    }
    /**
     * ID of the certificate after it has been provisioned to the cloud keystore
     * 
     */
    @Export(name="cloudCertificateId", refs={String.class}, tree="[0]")
    private Output<String> cloudCertificateId;

    /**
     * @return ID of the certificate after it has been provisioned to the cloud keystore
     * 
     */
    public Output<String> cloudCertificateId() {
        return this.cloudCertificateId;
    }
    /**
     * Metadata of the certificate after it has been provisioned to the cloud keystore
     * 
     */
    @Export(name="cloudCertificateMetadata", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> cloudCertificateMetadata;

    /**
     * @return Metadata of the certificate after it has been provisioned to the cloud keystore
     * 
     */
    public Output<Map<String,String>> cloudCertificateMetadata() {
        return this.cloudCertificateMetadata;
    }
    /**
     * Name for the provisioned certificate in the keystore. If the name already exists, the provisioning will replace the previous certificate with the one from `certificate_id`. Only valid for AKV and GCM keystores.
     * 
     */
    @Export(name="cloudCertificateName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> cloudCertificateName;

    /**
     * @return Name for the provisioned certificate in the keystore. If the name already exists, the provisioning will replace the previous certificate with the one from `certificate_id`. Only valid for AKV and GCM keystores.
     * 
     */
    public Output<Optional<String>> cloudCertificateName() {
        return Codegen.optional(this.cloudCertificateName);
    }
    /**
     * ID of the cloud keystore where the certificate will be provisioned.
     * 
     */
    @Export(name="cloudKeystoreId", refs={String.class}, tree="[0]")
    private Output<String> cloudKeystoreId;

    /**
     * @return ID of the cloud keystore where the certificate will be provisioned.
     * 
     */
    public Output<String> cloudKeystoreId() {
        return this.cloudKeystoreId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CloudKeystoreInstallation(String name) {
        this(name, CloudKeystoreInstallationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CloudKeystoreInstallation(String name, CloudKeystoreInstallationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CloudKeystoreInstallation(String name, CloudKeystoreInstallationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("venafi:index/cloudKeystoreInstallation:CloudKeystoreInstallation", name, args == null ? CloudKeystoreInstallationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CloudKeystoreInstallation(String name, Output<String> id, @Nullable CloudKeystoreInstallationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("venafi:index/cloudKeystoreInstallation:CloudKeystoreInstallation", name, state, makeResourceOptions(options, id));
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
    public static CloudKeystoreInstallation get(String name, Output<String> id, @Nullable CloudKeystoreInstallationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CloudKeystoreInstallation(name, id, state, options);
    }
}
