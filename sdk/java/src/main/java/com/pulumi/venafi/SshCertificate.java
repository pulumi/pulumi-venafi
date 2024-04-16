// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.venafi;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.venafi.SshCertificateArgs;
import com.pulumi.venafi.Utilities;
import com.pulumi.venafi.inputs.SshCertificateState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides access to request and retrieve SSH certificates from *Venafi Trust Protection Platform*.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.venafi.SshCertificate;
 * import com.pulumi.venafi.SshCertificateArgs;
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
 *         var sshCert = new SshCertificate(&#34;sshCert&#34;, SshCertificateArgs.builder()        
 *             .keyId(&#34;my-first-ssh-certificate&#34;)
 *             .keyPassphrase(&#34;passw0rd&#34;)
 *             .keySize(3072)
 *             .principals(&#34;seamus&#34;)
 *             .publicKeyMethod(&#34;local&#34;)
 *             .template(&#34;Sample SSH CA&#34;)
 *             .validHours(24)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="venafi:index/sshCertificate:SshCertificate")
public class SshCertificate extends com.pulumi.resources.CustomResource {
    /**
     * The issued SSH certificate.
     * 
     */
    @Export(name="certificate", refs={String.class}, tree="[0]")
    private Output<String> certificate;

    /**
     * @return The issued SSH certificate.
     * 
     */
    public Output<String> certificate() {
        return this.certificate;
    }
    /**
     * Indicates whether the SSH certificate is for client or server authentication.
     * 
     */
    @Export(name="certificateType", refs={String.class}, tree="[0]")
    private Output<String> certificateType;

    /**
     * @return Indicates whether the SSH certificate is for client or server authentication.
     * 
     */
    public Output<String> certificateType() {
        return this.certificateType;
    }
    /**
     * A list of one or more valid IP or CIDR destination hosts where the
     * certificate will authenticate.
     * 
     */
    @Export(name="destinationAddresses", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> destinationAddresses;

    /**
     * @return A list of one or more valid IP or CIDR destination hosts where the
     * certificate will authenticate.
     * 
     */
    public Output<Optional<List<String>>> destinationAddresses() {
        return Codegen.optional(this.destinationAddresses);
    }
    /**
     * A list of key-value pairs that contain certificate extensions from the CA
     * template for client certificates. Allowed values (case-sensitive): `permit-X11-forwarding`, `permit-agent-forwarding`,
     * `permit-port-forwarding`, `permit-pty`, `permit-user-rc`.
     * 
     */
    @Export(name="extensions", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> extensions;

    /**
     * @return A list of key-value pairs that contain certificate extensions from the CA
     * template for client certificates. Allowed values (case-sensitive): `permit-X11-forwarding`, `permit-agent-forwarding`,
     * `permit-port-forwarding`, `permit-pty`, `permit-user-rc`.
     * 
     */
    public Output<Optional<List<String>>> extensions() {
        return Codegen.optional(this.extensions);
    }
    /**
     * The DN of the policy folder where the SSH certificate object will be created.
     * 
     */
    @Export(name="folder", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> folder;

    /**
     * @return The DN of the policy folder where the SSH certificate object will be created.
     * 
     */
    public Output<Optional<String>> folder() {
        return Codegen.optional(this.folder);
    }
    /**
     * A command to run after successful login.
     * 
     */
    @Export(name="forceCommand", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> forceCommand;

    /**
     * @return A command to run after successful login.
     * 
     */
    public Output<Optional<String>> forceCommand() {
        return Codegen.optional(this.forceCommand);
    }
    /**
     * The identifier of the requested SSH certificate.
     * 
     */
    @Export(name="keyId", refs={String.class}, tree="[0]")
    private Output<String> keyId;

    /**
     * @return The identifier of the requested SSH certificate.
     * 
     */
    public Output<String> keyId() {
        return this.keyId;
    }
    /**
     * Passphrase for encrypting the private key.
     * 
     */
    @Export(name="keyPassphrase", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> keyPassphrase;

    /**
     * @return Passphrase for encrypting the private key.
     * 
     */
    public Output<Optional<String>> keyPassphrase() {
        return Codegen.optional(this.keyPassphrase);
    }
    /**
     * Number of bits to use when creating a key pair. (e.g. `3072`).
     * 
     */
    @Export(name="keySize", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> keySize;

    /**
     * @return Number of bits to use when creating a key pair. (e.g. `3072`).
     * 
     */
    public Output<Optional<Integer>> keySize() {
        return Codegen.optional(this.keySize);
    }
    /**
     * The friendly name of the SSH certificate object. When not specified the `key_id`
     * is used for the friendly name. If the object already exists the old certificate is archived and the CA issues a new
     * certificate.
     * 
     */
    @Export(name="objectName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> objectName;

    /**
     * @return The friendly name of the SSH certificate object. When not specified the `key_id`
     * is used for the friendly name. If the object already exists the old certificate is archived and the CA issues a new
     * certificate.
     * 
     */
    public Output<Optional<String>> objectName() {
        return Codegen.optional(this.objectName);
    }
    /**
     * [DEPRECATED] - (Optional, set of strings) Use &#34;principals&#34; instead. A list of usernames for whom the
     * requested certificate will be valid.
     * 
     * @deprecated
     * This will be removed in the future. Use &#34;principals&#34; instead
     * 
     */
    @Deprecated /* This will be removed in the future. Use ""principals"" instead */
    @Export(name="principal", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> principal;

    /**
     * @return [DEPRECATED] - (Optional, set of strings) Use &#34;principals&#34; instead. A list of usernames for whom the
     * requested certificate will be valid.
     * 
     */
    public Output<Optional<List<String>>> principal() {
        return Codegen.optional(this.principal);
    }
    /**
     * A list of usernames for whom the requested certificate will be valid.
     * 
     */
    @Export(name="principals", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> principals;

    /**
     * @return A list of usernames for whom the requested certificate will be valid.
     * 
     */
    public Output<Optional<List<String>>> principals() {
        return Codegen.optional(this.principals);
    }
    /**
     * The private key for the SSH certificate if generated by Venafi.
     * 
     */
    @Export(name="privateKey", refs={String.class}, tree="[0]")
    private Output<String> privateKey;

    /**
     * @return The private key for the SSH certificate if generated by Venafi.
     * 
     */
    public Output<String> privateKey() {
        return this.privateKey;
    }
    /**
     * The OpenSSH formatted public key that will be used to generate the SSH certificate.
     * 
     */
    @Export(name="publicKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> publicKey;

    /**
     * @return The OpenSSH formatted public key that will be used to generate the SSH certificate.
     * 
     */
    public Output<Optional<String>> publicKey() {
        return Codegen.optional(this.publicKey);
    }
    /**
     * The SHA256 fingerprint of the SSH certificate&#39;s public key.
     * 
     */
    @Export(name="publicKeyFingerprint", refs={String.class}, tree="[0]")
    private Output<String> publicKeyFingerprint;

    /**
     * @return The SHA256 fingerprint of the SSH certificate&#39;s public key.
     * 
     */
    public Output<String> publicKeyFingerprint() {
        return this.publicKeyFingerprint;
    }
    /**
     * Specifies whether the public key will be `local` (default), `file` or
     * `service` generated.
     * 
     */
    @Export(name="publicKeyMethod", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> publicKeyMethod;

    /**
     * @return Specifies whether the public key will be `local` (default), `file` or
     * `service` generated.
     * 
     */
    public Output<Optional<String>> publicKeyMethod() {
        return Codegen.optional(this.publicKeyMethod);
    }
    /**
     * The serial number of the SSH certificate.
     * 
     */
    @Export(name="serial", refs={String.class}, tree="[0]")
    private Output<String> serial;

    /**
     * @return The serial number of the SSH certificate.
     * 
     */
    public Output<String> serial() {
        return this.serial;
    }
    /**
     * The SHA256 fingerprint of the CA that signed the SSH certificate.
     * 
     */
    @Export(name="signingCa", refs={String.class}, tree="[0]")
    private Output<String> signingCa;

    /**
     * @return The SHA256 fingerprint of the CA that signed the SSH certificate.
     * 
     */
    public Output<String> signingCa() {
        return this.signingCa;
    }
    /**
     * A list of one or more valid IP or CIDR addresses that can use the SSH
     * certificate.
     * 
     */
    @Export(name="sourceAddresses", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> sourceAddresses;

    /**
     * @return A list of one or more valid IP or CIDR addresses that can use the SSH
     * certificate.
     * 
     */
    public Output<Optional<List<String>>> sourceAddresses() {
        return Codegen.optional(this.sourceAddresses);
    }
    /**
     * The SSH certificate issuing template.
     * 
     */
    @Export(name="template", refs={String.class}, tree="[0]")
    private Output<String> template;

    /**
     * @return The SSH certificate issuing template.
     * 
     */
    public Output<String> template() {
        return this.template;
    }
    /**
     * The date the SSH certificate was issued.
     * 
     */
    @Export(name="validFrom", refs={String.class}, tree="[0]")
    private Output<String> validFrom;

    /**
     * @return The date the SSH certificate was issued.
     * 
     */
    public Output<String> validFrom() {
        return this.validFrom;
    }
    /**
     * Desired number of hours for which the certificate will be valid.
     * 
     */
    @Export(name="validHours", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> validHours;

    /**
     * @return Desired number of hours for which the certificate will be valid.
     * 
     */
    public Output<Optional<Integer>> validHours() {
        return Codegen.optional(this.validHours);
    }
    /**
     * The date the SSH certificate will expire.
     * 
     */
    @Export(name="validTo", refs={String.class}, tree="[0]")
    private Output<String> validTo;

    /**
     * @return The date the SSH certificate will expire.
     * 
     */
    public Output<String> validTo() {
        return this.validTo;
    }
    /**
     * Specifies whether the private key will use Windows/DOS style line breaks.
     * 
     */
    @Export(name="windows", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> windows;

    /**
     * @return Specifies whether the private key will use Windows/DOS style line breaks.
     * 
     */
    public Output<Optional<Boolean>> windows() {
        return Codegen.optional(this.windows);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SshCertificate(String name) {
        this(name, SshCertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SshCertificate(String name, SshCertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SshCertificate(String name, SshCertificateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("venafi:index/sshCertificate:SshCertificate", name, args == null ? SshCertificateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SshCertificate(String name, Output<String> id, @Nullable SshCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("venafi:index/sshCertificate:SshCertificate", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "keyPassphrase"
            ))
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
    public static SshCertificate get(String name, Output<String> id, @Nullable SshCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SshCertificate(name, id, state, options);
    }
}
