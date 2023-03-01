// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.venafi;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.venafi.CertificateArgs;
import com.pulumi.venafi.Utilities;
import com.pulumi.venafi.inputs.CertificateState;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * The `venafi_certificate` resource supports the Terraform [import](https://www.terraform.io/docs/cli/import/index.html) method. The `import_id` is composed by an `id` which is different for each platform, a comma (,) and the `key-password`. The `id` for each platform is**TPP:** The `nickname` of the certificate, which represents the name of the certificate object in TPP. Internally we built the `pickup_id` using the `zone` defined at the provider block. **VaaS:** The `pickup-id`.
 * 
 * ```sh
 *  $ pulumi import venafi:index/certificate:Certificate &lt;resource_name&gt;&#34; &#34;&lt;id&gt;,&lt;key-password&gt;&#34;
 * ```
 * 
 *  Example (assuming our resource name is `imported_certificate`)hcl resource &#34;venafi_certificate&#34; &#34;imported_certificate&#34; {} **TPP:**
 * 
 * ```sh
 *  $ pulumi import venafi:index/certificate:Certificate imported_certificate&#34; &#34;tpp.venafi.example,my_key_password&#34;
 * ```
 * 
 *  **VaaS:**
 * 
 * ```sh
 *  $ pulumi import venafi:index/certificate:Certificate imported_certificate&#34; &#34;xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx,my_key_password&#34;
 * ```
 * 
 */
@ResourceType(type="venafi:index/certificate:Certificate")
public class Certificate extends com.pulumi.resources.CustomResource {
    /**
     * Key encryption algorithm, either RSA or ECDSA.
     * Defaults to &#34;RSA&#34;.
     * 
     */
    @Export(name="algorithm", type=String.class, parameters={})
    private Output</* @Nullable */ String> algorithm;

    /**
     * @return Key encryption algorithm, either RSA or ECDSA.
     * Defaults to &#34;RSA&#34;.
     * 
     */
    public Output<Optional<String>> algorithm() {
        return Codegen.optional(this.algorithm);
    }
    /**
     * The X509 certificate in PEM format.
     * 
     */
    @Export(name="certificate", type=String.class, parameters={})
    private Output<String> certificate;

    /**
     * @return The X509 certificate in PEM format.
     * 
     */
    public Output<String> certificate() {
        return this.certificate;
    }
    @Export(name="certificateDn", type=String.class, parameters={})
    private Output<String> certificateDn;

    public Output<String> certificateDn() {
        return this.certificateDn;
    }
    /**
     * The trust chain of X509 certificate authority certificates in PEM format
     * concatenated together.
     * 
     */
    @Export(name="chain", type=String.class, parameters={})
    private Output<String> chain;

    /**
     * @return The trust chain of X509 certificate authority certificates in PEM format
     * concatenated together.
     * 
     */
    public Output<String> chain() {
        return this.chain;
    }
    /**
     * The common name of the certificate.
     * 
     */
    @Export(name="commonName", type=String.class, parameters={})
    private Output<String> commonName;

    /**
     * @return The common name of the certificate.
     * 
     */
    public Output<String> commonName() {
        return this.commonName;
    }
    /**
     * Whether key-pair generation will be `local` or `service` generated. Default is `local`.
     * 
     */
    @Export(name="csrOrigin", type=String.class, parameters={})
    private Output</* @Nullable */ String> csrOrigin;

    /**
     * @return Whether key-pair generation will be `local` or `service` generated. Default is `local`.
     * 
     */
    public Output<Optional<String>> csrOrigin() {
        return Codegen.optional(this.csrOrigin);
    }
    @Export(name="csrPem", type=String.class, parameters={})
    private Output<String> csrPem;

    public Output<String> csrPem() {
        return this.csrPem;
    }
    /**
     * Collection of Custom Field name-value pairs to
     * assign to the certificate.
     * 
     */
    @Export(name="customFields", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> customFields;

    /**
     * @return Collection of Custom Field name-value pairs to
     * assign to the certificate.
     * 
     */
    public Output<Optional<Map<String,String>>> customFields() {
        return Codegen.optional(this.customFields);
    }
    /**
     * ECDSA curve to use when generating a key
     * 
     */
    @Export(name="ecdsaCurve", type=String.class, parameters={})
    private Output</* @Nullable */ String> ecdsaCurve;

    /**
     * @return ECDSA curve to use when generating a key
     * 
     */
    public Output<Optional<String>> ecdsaCurve() {
        return Codegen.optional(this.ecdsaCurve);
    }
    /**
     * Number of hours before certificate expiry
     * to request a new certificate.  Defaults to `168`.
     * 
     */
    @Export(name="expirationWindow", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> expirationWindow;

    /**
     * @return Number of hours before certificate expiry
     * to request a new certificate.  Defaults to `168`.
     * 
     */
    public Output<Optional<Integer>> expirationWindow() {
        return Codegen.optional(this.expirationWindow);
    }
    /**
     * Used with valid_days to indicate the target
     * issuer when using Trust Protection Platform.  Relevant values are: &#34;DigiCert&#34;,
     * &#34;Entrust&#34;, and &#34;Microsoft&#34;.
     * 
     */
    @Export(name="issuerHint", type=String.class, parameters={})
    private Output</* @Nullable */ String> issuerHint;

    /**
     * @return Used with valid_days to indicate the target
     * issuer when using Trust Protection Platform.  Relevant values are: &#34;DigiCert&#34;,
     * &#34;Entrust&#34;, and &#34;Microsoft&#34;.
     * 
     */
    public Output<Optional<String>> issuerHint() {
        return Codegen.optional(this.issuerHint);
    }
    /**
     * The password used to encrypt the private key.
     * 
     */
    @Export(name="keyPassword", type=String.class, parameters={})
    private Output</* @Nullable */ String> keyPassword;

    /**
     * @return The password used to encrypt the private key.
     * 
     */
    public Output<Optional<String>> keyPassword() {
        return Codegen.optional(this.keyPassword);
    }
    /**
     * Use to specify a name for the new certificate object that will be created and placed in a policy. Only valid for TPP.
     * 
     */
    @Export(name="nickname", type=String.class, parameters={})
    private Output</* @Nullable */ String> nickname;

    /**
     * @return Use to specify a name for the new certificate object that will be created and placed in a policy. Only valid for TPP.
     * 
     */
    public Output<Optional<String>> nickname() {
        return Codegen.optional(this.nickname);
    }
    @Export(name="pkcs12", type=String.class, parameters={})
    private Output<String> pkcs12;

    public Output<String> pkcs12() {
        return this.pkcs12;
    }
    /**
     * The private key in PEM format.
     * 
     */
    @Export(name="privateKeyPem", type=String.class, parameters={})
    private Output<String> privateKeyPem;

    /**
     * @return The private key in PEM format.
     * 
     */
    public Output<String> privateKeyPem() {
        return this.privateKeyPem;
    }
    /**
     * Number of bits to use when generating an RSA key.
     * Applies when algorithm=RSA.  Defaults to 2048.
     * 
     */
    @Export(name="rsaBits", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> rsaBits;

    /**
     * @return Number of bits to use when generating an RSA key.
     * Applies when algorithm=RSA.  Defaults to 2048.
     * 
     */
    public Output<Optional<Integer>> rsaBits() {
        return Codegen.optional(this.rsaBits);
    }
    /**
     * List of DNS names to use as alternative
     * subjects of the certificate.
     * 
     */
    @Export(name="sanDns", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> sanDns;

    /**
     * @return List of DNS names to use as alternative
     * subjects of the certificate.
     * 
     */
    public Output<Optional<List<String>>> sanDns() {
        return Codegen.optional(this.sanDns);
    }
    /**
     * List of email addresses to use as
     * alternative subjects of the certificate.
     * 
     */
    @Export(name="sanEmails", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> sanEmails;

    /**
     * @return List of email addresses to use as
     * alternative subjects of the certificate.
     * 
     */
    public Output<Optional<List<String>>> sanEmails() {
        return Codegen.optional(this.sanEmails);
    }
    /**
     * List of IP addresses to use as alternative
     * subjects of the certificate.
     * 
     */
    @Export(name="sanIps", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> sanIps;

    /**
     * @return List of IP addresses to use as alternative
     * subjects of the certificate.
     * 
     */
    public Output<Optional<List<String>>> sanIps() {
        return Codegen.optional(this.sanIps);
    }
    /**
     * List of Uniform Resource Identifiers (URIs) to use as alternative
     * subjects of the certificate.
     * 
     */
    @Export(name="sanUris", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> sanUris;

    /**
     * @return List of Uniform Resource Identifiers (URIs) to use as alternative
     * subjects of the certificate.
     * 
     */
    public Output<Optional<List<String>>> sanUris() {
        return Codegen.optional(this.sanUris);
    }
    /**
     * Desired number of days for which the new
     * certificate will be valid.
     * 
     */
    @Export(name="validDays", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> validDays;

    /**
     * @return Desired number of days for which the new
     * certificate will be valid.
     * 
     */
    public Output<Optional<Integer>> validDays() {
        return Codegen.optional(this.validDays);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Certificate(String name) {
        this(name, CertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Certificate(String name, CertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Certificate(String name, CertificateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("venafi:index/certificate:Certificate", name, args == null ? CertificateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Certificate(String name, Output<String> id, @Nullable CertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("venafi:index/certificate:Certificate", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "keyPassword",
                "privateKeyPem"
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
    public static Certificate get(String name, Output<String> id, @Nullable CertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Certificate(name, id, state, options);
    }
}
