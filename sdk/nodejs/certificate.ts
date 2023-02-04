// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export class Certificate extends pulumi.CustomResource {
    /**
     * Get an existing Certificate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CertificateState, opts?: pulumi.CustomResourceOptions): Certificate {
        return new Certificate(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'venafi:index/certificate:Certificate';

    /**
     * Returns true if the given object is an instance of Certificate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Certificate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Certificate.__pulumiType;
    }

    /**
     * Key encryption algorithm, either `RSA` or `ECDSA`.
     * Defaults to `RSA`.
     */
    public readonly algorithm!: pulumi.Output<string | undefined>;
    /**
     * The X509 certificate in PEM format.
     */
    public /*out*/ readonly certificate!: pulumi.Output<string>;
    public readonly certificateDn!: pulumi.Output<string>;
    /**
     * The trust chain of X509 certificate authority certificates in PEM format
     * concatenated together.
     */
    public /*out*/ readonly chain!: pulumi.Output<string>;
    /**
     * The common name of the certificate.
     */
    public readonly commonName!: pulumi.Output<string>;
    /**
     * Whether key-pair generation will be `local` or `service` generated. Default is `local`.
     */
    public readonly csrOrigin!: pulumi.Output<string | undefined>;
    public readonly csrPem!: pulumi.Output<string>;
    /**
     * Collection of Custom Field name-value pairs to
     * assign to the certificate.
     */
    public readonly customFields!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * ECDSA curve to use when generating a key
     */
    public readonly ecdsaCurve!: pulumi.Output<string | undefined>;
    /**
     * Number of hours before certificate expiry
     * to request a new certificate.  Defaults to `168`.
     */
    public readonly expirationWindow!: pulumi.Output<number | undefined>;
    /**
     * Used with validDays to indicate the target
     * issuer when using Trust Protection Platform.  Relevant values are: "DigiCert",
     * "Entrust", and "Microsoft".
     */
    public readonly issuerHint!: pulumi.Output<string | undefined>;
    /**
     * The password used to encrypt the private key.
     */
    public readonly keyPassword!: pulumi.Output<string | undefined>;
    /**
     * Use to specify a name for the new certificate object that will be created and placed in a policy. Only valid for TPP.
     */
    public readonly nickname!: pulumi.Output<string | undefined>;
    public readonly pkcs12!: pulumi.Output<string>;
    /**
     * The private key in PEM format.
     */
    public readonly privateKeyPem!: pulumi.Output<string>;
    /**
     * Number of bits to use when generating an RSA key.
     * Applies when `algorithm=RSA`.  Defaults to `2048`.
     */
    public readonly rsaBits!: pulumi.Output<number | undefined>;
    /**
     * List of DNS names to use as alternative
     * subjects of the certificate.
     */
    public readonly sanDns!: pulumi.Output<string[] | undefined>;
    /**
     * List of email addresses to use as
     * alternative subjects of the certificate.
     */
    public readonly sanEmails!: pulumi.Output<string[] | undefined>;
    /**
     * List of IP addresses to use as alternative
     * subjects of the certificate.
     */
    public readonly sanIps!: pulumi.Output<string[] | undefined>;
    /**
     * List of Uniform Resource Identifiers (URIs) to use as alternative
     * subjects of the certificate.
     */
    public readonly sanUris!: pulumi.Output<string[] | undefined>;
    /**
     * Desired number of days for which the new
     * certificate will be valid.
     */
    public readonly validDays!: pulumi.Output<number | undefined>;

    /**
     * Create a Certificate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CertificateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CertificateArgs | CertificateState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CertificateState | undefined;
            resourceInputs["algorithm"] = state ? state.algorithm : undefined;
            resourceInputs["certificate"] = state ? state.certificate : undefined;
            resourceInputs["certificateDn"] = state ? state.certificateDn : undefined;
            resourceInputs["chain"] = state ? state.chain : undefined;
            resourceInputs["commonName"] = state ? state.commonName : undefined;
            resourceInputs["csrOrigin"] = state ? state.csrOrigin : undefined;
            resourceInputs["csrPem"] = state ? state.csrPem : undefined;
            resourceInputs["customFields"] = state ? state.customFields : undefined;
            resourceInputs["ecdsaCurve"] = state ? state.ecdsaCurve : undefined;
            resourceInputs["expirationWindow"] = state ? state.expirationWindow : undefined;
            resourceInputs["issuerHint"] = state ? state.issuerHint : undefined;
            resourceInputs["keyPassword"] = state ? state.keyPassword : undefined;
            resourceInputs["nickname"] = state ? state.nickname : undefined;
            resourceInputs["pkcs12"] = state ? state.pkcs12 : undefined;
            resourceInputs["privateKeyPem"] = state ? state.privateKeyPem : undefined;
            resourceInputs["rsaBits"] = state ? state.rsaBits : undefined;
            resourceInputs["sanDns"] = state ? state.sanDns : undefined;
            resourceInputs["sanEmails"] = state ? state.sanEmails : undefined;
            resourceInputs["sanIps"] = state ? state.sanIps : undefined;
            resourceInputs["sanUris"] = state ? state.sanUris : undefined;
            resourceInputs["validDays"] = state ? state.validDays : undefined;
        } else {
            const args = argsOrState as CertificateArgs | undefined;
            if ((!args || args.commonName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'commonName'");
            }
            resourceInputs["algorithm"] = args ? args.algorithm : undefined;
            resourceInputs["certificateDn"] = args ? args.certificateDn : undefined;
            resourceInputs["commonName"] = args ? args.commonName : undefined;
            resourceInputs["csrOrigin"] = args ? args.csrOrigin : undefined;
            resourceInputs["csrPem"] = args ? args.csrPem : undefined;
            resourceInputs["customFields"] = args ? args.customFields : undefined;
            resourceInputs["ecdsaCurve"] = args ? args.ecdsaCurve : undefined;
            resourceInputs["expirationWindow"] = args ? args.expirationWindow : undefined;
            resourceInputs["issuerHint"] = args ? args.issuerHint : undefined;
            resourceInputs["keyPassword"] = args?.keyPassword ? pulumi.secret(args.keyPassword) : undefined;
            resourceInputs["nickname"] = args ? args.nickname : undefined;
            resourceInputs["pkcs12"] = args ? args.pkcs12 : undefined;
            resourceInputs["privateKeyPem"] = args?.privateKeyPem ? pulumi.secret(args.privateKeyPem) : undefined;
            resourceInputs["rsaBits"] = args ? args.rsaBits : undefined;
            resourceInputs["sanDns"] = args ? args.sanDns : undefined;
            resourceInputs["sanEmails"] = args ? args.sanEmails : undefined;
            resourceInputs["sanIps"] = args ? args.sanIps : undefined;
            resourceInputs["sanUris"] = args ? args.sanUris : undefined;
            resourceInputs["validDays"] = args ? args.validDays : undefined;
            resourceInputs["certificate"] = undefined /*out*/;
            resourceInputs["chain"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["keyPassword", "privateKeyPem"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Certificate.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Certificate resources.
 */
export interface CertificateState {
    /**
     * Key encryption algorithm, either `RSA` or `ECDSA`.
     * Defaults to `RSA`.
     */
    algorithm?: pulumi.Input<string>;
    /**
     * The X509 certificate in PEM format.
     */
    certificate?: pulumi.Input<string>;
    certificateDn?: pulumi.Input<string>;
    /**
     * The trust chain of X509 certificate authority certificates in PEM format
     * concatenated together.
     */
    chain?: pulumi.Input<string>;
    /**
     * The common name of the certificate.
     */
    commonName?: pulumi.Input<string>;
    /**
     * Whether key-pair generation will be `local` or `service` generated. Default is `local`.
     */
    csrOrigin?: pulumi.Input<string>;
    csrPem?: pulumi.Input<string>;
    /**
     * Collection of Custom Field name-value pairs to
     * assign to the certificate.
     */
    customFields?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * ECDSA curve to use when generating a key
     */
    ecdsaCurve?: pulumi.Input<string>;
    /**
     * Number of hours before certificate expiry
     * to request a new certificate.  Defaults to `168`.
     */
    expirationWindow?: pulumi.Input<number>;
    /**
     * Used with validDays to indicate the target
     * issuer when using Trust Protection Platform.  Relevant values are: "DigiCert",
     * "Entrust", and "Microsoft".
     */
    issuerHint?: pulumi.Input<string>;
    /**
     * The password used to encrypt the private key.
     */
    keyPassword?: pulumi.Input<string>;
    /**
     * Use to specify a name for the new certificate object that will be created and placed in a policy. Only valid for TPP.
     */
    nickname?: pulumi.Input<string>;
    pkcs12?: pulumi.Input<string>;
    /**
     * The private key in PEM format.
     */
    privateKeyPem?: pulumi.Input<string>;
    /**
     * Number of bits to use when generating an RSA key.
     * Applies when `algorithm=RSA`.  Defaults to `2048`.
     */
    rsaBits?: pulumi.Input<number>;
    /**
     * List of DNS names to use as alternative
     * subjects of the certificate.
     */
    sanDns?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of email addresses to use as
     * alternative subjects of the certificate.
     */
    sanEmails?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of IP addresses to use as alternative
     * subjects of the certificate.
     */
    sanIps?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of Uniform Resource Identifiers (URIs) to use as alternative
     * subjects of the certificate.
     */
    sanUris?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Desired number of days for which the new
     * certificate will be valid.
     */
    validDays?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a Certificate resource.
 */
export interface CertificateArgs {
    /**
     * Key encryption algorithm, either `RSA` or `ECDSA`.
     * Defaults to `RSA`.
     */
    algorithm?: pulumi.Input<string>;
    certificateDn?: pulumi.Input<string>;
    /**
     * The common name of the certificate.
     */
    commonName: pulumi.Input<string>;
    /**
     * Whether key-pair generation will be `local` or `service` generated. Default is `local`.
     */
    csrOrigin?: pulumi.Input<string>;
    csrPem?: pulumi.Input<string>;
    /**
     * Collection of Custom Field name-value pairs to
     * assign to the certificate.
     */
    customFields?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * ECDSA curve to use when generating a key
     */
    ecdsaCurve?: pulumi.Input<string>;
    /**
     * Number of hours before certificate expiry
     * to request a new certificate.  Defaults to `168`.
     */
    expirationWindow?: pulumi.Input<number>;
    /**
     * Used with validDays to indicate the target
     * issuer when using Trust Protection Platform.  Relevant values are: "DigiCert",
     * "Entrust", and "Microsoft".
     */
    issuerHint?: pulumi.Input<string>;
    /**
     * The password used to encrypt the private key.
     */
    keyPassword?: pulumi.Input<string>;
    /**
     * Use to specify a name for the new certificate object that will be created and placed in a policy. Only valid for TPP.
     */
    nickname?: pulumi.Input<string>;
    pkcs12?: pulumi.Input<string>;
    /**
     * The private key in PEM format.
     */
    privateKeyPem?: pulumi.Input<string>;
    /**
     * Number of bits to use when generating an RSA key.
     * Applies when `algorithm=RSA`.  Defaults to `2048`.
     */
    rsaBits?: pulumi.Input<number>;
    /**
     * List of DNS names to use as alternative
     * subjects of the certificate.
     */
    sanDns?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of email addresses to use as
     * alternative subjects of the certificate.
     */
    sanEmails?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of IP addresses to use as alternative
     * subjects of the certificate.
     */
    sanIps?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of Uniform Resource Identifiers (URIs) to use as alternative
     * subjects of the certificate.
     */
    sanUris?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Desired number of days for which the new
     * certificate will be valid.
     */
    validDays?: pulumi.Input<number>;
}
