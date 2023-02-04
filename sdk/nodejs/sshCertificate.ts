// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides access to request and retrieve SSH certificates from *Venafi Trust Protection Platform*.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as venafi from "@pulumi/venafi";
 *
 * const sshCert = new venafi.SshCertificate("sshCert", {
 *     keyId: "my-first-ssh-certificate",
 *     keyPassphrase: "passw0rd",
 *     keySize: 3072,
 *     principals: ["seamus"],
 *     publicKeyMethod: "local",
 *     template: "Sample SSH CA",
 *     validHours: 24,
 * });
 * ```
 */
export class SshCertificate extends pulumi.CustomResource {
    /**
     * Get an existing SshCertificate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SshCertificateState, opts?: pulumi.CustomResourceOptions): SshCertificate {
        return new SshCertificate(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'venafi:index/sshCertificate:SshCertificate';

    /**
     * Returns true if the given object is an instance of SshCertificate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SshCertificate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SshCertificate.__pulumiType;
    }

    /**
     * The issued SSH certificate.
     */
    public /*out*/ readonly certificate!: pulumi.Output<string>;
    /**
     * Indicates whether the SSH certificate is for client or server authentication.
     */
    public /*out*/ readonly certificateType!: pulumi.Output<string>;
    /**
     * A list of one or more valid IP or CIDR destination hosts where the certificate will authenticate.
     */
    public readonly destinationAddresses!: pulumi.Output<string[] | undefined>;
    /**
     * A list of key-value pairs that contain certificate extensions from the CA template for client certificates. Allowed values (case-sensitive): *permit-X11-forwarding, permit-agent-forwarding, permit-port-forwarding, permit-pty, permit-user-rc*
     */
    public readonly extensions!: pulumi.Output<string[] | undefined>;
    /**
     * The DN of the policy folder where the SSH certificate object will be created.
     */
    public readonly folder!: pulumi.Output<string | undefined>;
    /**
     * A command to run after successful login.
     */
    public readonly forceCommand!: pulumi.Output<string | undefined>;
    /**
     * The identifier of the requested SSH certificate.
     */
    public readonly keyId!: pulumi.Output<string>;
    /**
     * Passphrase for encrypting the private key.
     */
    public readonly keyPassphrase!: pulumi.Output<string | undefined>;
    /**
     * Number of bits to use when creating a key pair. (e.g. 3072)
     */
    public readonly keySize!: pulumi.Output<number | undefined>;
    /**
     * The friendly name of the SSH certificate object. When not specified the `keyId` is used for the friendly name. If the object already exists the old certificate is archived and the CA issues a new certificate.
     */
    public readonly objectName!: pulumi.Output<string | undefined>;
    /**
     * A list of user names for whom the requested certificate will be valid.
     */
    public readonly principals!: pulumi.Output<string[] | undefined>;
    /**
     * The private key for the SSH certificate if generated by Venafi.
     */
    public /*out*/ readonly privateKey!: pulumi.Output<string>;
    /**
     * The OpenSSH formatted public key that will be used to generate the SSH certificate.
     */
    public readonly publicKey!: pulumi.Output<string | undefined>;
    /**
     * The SHA256 fingerprint of the SSH certificate's public key.
     */
    public /*out*/ readonly publicKeyFingerprint!: pulumi.Output<string>;
    /**
     * Specifies whether the public key will be "local" (default), "file" or "service" generated.
     */
    public readonly publicKeyMethod!: pulumi.Output<string | undefined>;
    /**
     * The serial number of the SSH certificate.
     */
    public /*out*/ readonly serial!: pulumi.Output<string>;
    /**
     * The SHA256 fingerprint of the CA that signed the SSH certificate.
     */
    public /*out*/ readonly signingCa!: pulumi.Output<string>;
    /**
     * A list of one or more valid IP or CIDR addresses that can use the SSH certificate.
     */
    public readonly sourceAddresses!: pulumi.Output<string[] | undefined>;
    /**
     * The SSH certificate issuing template.
     */
    public readonly template!: pulumi.Output<string>;
    /**
     * The date the SSH certificate was issued.
     */
    public /*out*/ readonly validFrom!: pulumi.Output<string>;
    /**
     * Desired number of hours for which the certificate will be valid.
     */
    public readonly validHours!: pulumi.Output<number | undefined>;
    /**
     * The date the SSH certificate will expire.
     */
    public /*out*/ readonly validTo!: pulumi.Output<string>;
    /**
     * Specifies whether the private key will use Windows/DOS style line breaks.
     */
    public readonly windows!: pulumi.Output<boolean | undefined>;

    /**
     * Create a SshCertificate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SshCertificateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SshCertificateArgs | SshCertificateState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SshCertificateState | undefined;
            resourceInputs["certificate"] = state ? state.certificate : undefined;
            resourceInputs["certificateType"] = state ? state.certificateType : undefined;
            resourceInputs["destinationAddresses"] = state ? state.destinationAddresses : undefined;
            resourceInputs["extensions"] = state ? state.extensions : undefined;
            resourceInputs["folder"] = state ? state.folder : undefined;
            resourceInputs["forceCommand"] = state ? state.forceCommand : undefined;
            resourceInputs["keyId"] = state ? state.keyId : undefined;
            resourceInputs["keyPassphrase"] = state ? state.keyPassphrase : undefined;
            resourceInputs["keySize"] = state ? state.keySize : undefined;
            resourceInputs["objectName"] = state ? state.objectName : undefined;
            resourceInputs["principals"] = state ? state.principals : undefined;
            resourceInputs["privateKey"] = state ? state.privateKey : undefined;
            resourceInputs["publicKey"] = state ? state.publicKey : undefined;
            resourceInputs["publicKeyFingerprint"] = state ? state.publicKeyFingerprint : undefined;
            resourceInputs["publicKeyMethod"] = state ? state.publicKeyMethod : undefined;
            resourceInputs["serial"] = state ? state.serial : undefined;
            resourceInputs["signingCa"] = state ? state.signingCa : undefined;
            resourceInputs["sourceAddresses"] = state ? state.sourceAddresses : undefined;
            resourceInputs["template"] = state ? state.template : undefined;
            resourceInputs["validFrom"] = state ? state.validFrom : undefined;
            resourceInputs["validHours"] = state ? state.validHours : undefined;
            resourceInputs["validTo"] = state ? state.validTo : undefined;
            resourceInputs["windows"] = state ? state.windows : undefined;
        } else {
            const args = argsOrState as SshCertificateArgs | undefined;
            if ((!args || args.keyId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'keyId'");
            }
            if ((!args || args.template === undefined) && !opts.urn) {
                throw new Error("Missing required property 'template'");
            }
            resourceInputs["destinationAddresses"] = args ? args.destinationAddresses : undefined;
            resourceInputs["extensions"] = args ? args.extensions : undefined;
            resourceInputs["folder"] = args ? args.folder : undefined;
            resourceInputs["forceCommand"] = args ? args.forceCommand : undefined;
            resourceInputs["keyId"] = args ? args.keyId : undefined;
            resourceInputs["keyPassphrase"] = args?.keyPassphrase ? pulumi.secret(args.keyPassphrase) : undefined;
            resourceInputs["keySize"] = args ? args.keySize : undefined;
            resourceInputs["objectName"] = args ? args.objectName : undefined;
            resourceInputs["principals"] = args ? args.principals : undefined;
            resourceInputs["publicKey"] = args ? args.publicKey : undefined;
            resourceInputs["publicKeyMethod"] = args ? args.publicKeyMethod : undefined;
            resourceInputs["sourceAddresses"] = args ? args.sourceAddresses : undefined;
            resourceInputs["template"] = args ? args.template : undefined;
            resourceInputs["validHours"] = args ? args.validHours : undefined;
            resourceInputs["windows"] = args ? args.windows : undefined;
            resourceInputs["certificate"] = undefined /*out*/;
            resourceInputs["certificateType"] = undefined /*out*/;
            resourceInputs["privateKey"] = undefined /*out*/;
            resourceInputs["publicKeyFingerprint"] = undefined /*out*/;
            resourceInputs["serial"] = undefined /*out*/;
            resourceInputs["signingCa"] = undefined /*out*/;
            resourceInputs["validFrom"] = undefined /*out*/;
            resourceInputs["validTo"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["keyPassphrase"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(SshCertificate.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SshCertificate resources.
 */
export interface SshCertificateState {
    /**
     * The issued SSH certificate.
     */
    certificate?: pulumi.Input<string>;
    /**
     * Indicates whether the SSH certificate is for client or server authentication.
     */
    certificateType?: pulumi.Input<string>;
    /**
     * A list of one or more valid IP or CIDR destination hosts where the certificate will authenticate.
     */
    destinationAddresses?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A list of key-value pairs that contain certificate extensions from the CA template for client certificates. Allowed values (case-sensitive): *permit-X11-forwarding, permit-agent-forwarding, permit-port-forwarding, permit-pty, permit-user-rc*
     */
    extensions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The DN of the policy folder where the SSH certificate object will be created.
     */
    folder?: pulumi.Input<string>;
    /**
     * A command to run after successful login.
     */
    forceCommand?: pulumi.Input<string>;
    /**
     * The identifier of the requested SSH certificate.
     */
    keyId?: pulumi.Input<string>;
    /**
     * Passphrase for encrypting the private key.
     */
    keyPassphrase?: pulumi.Input<string>;
    /**
     * Number of bits to use when creating a key pair. (e.g. 3072)
     */
    keySize?: pulumi.Input<number>;
    /**
     * The friendly name of the SSH certificate object. When not specified the `keyId` is used for the friendly name. If the object already exists the old certificate is archived and the CA issues a new certificate.
     */
    objectName?: pulumi.Input<string>;
    /**
     * A list of user names for whom the requested certificate will be valid.
     */
    principals?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The private key for the SSH certificate if generated by Venafi.
     */
    privateKey?: pulumi.Input<string>;
    /**
     * The OpenSSH formatted public key that will be used to generate the SSH certificate.
     */
    publicKey?: pulumi.Input<string>;
    /**
     * The SHA256 fingerprint of the SSH certificate's public key.
     */
    publicKeyFingerprint?: pulumi.Input<string>;
    /**
     * Specifies whether the public key will be "local" (default), "file" or "service" generated.
     */
    publicKeyMethod?: pulumi.Input<string>;
    /**
     * The serial number of the SSH certificate.
     */
    serial?: pulumi.Input<string>;
    /**
     * The SHA256 fingerprint of the CA that signed the SSH certificate.
     */
    signingCa?: pulumi.Input<string>;
    /**
     * A list of one or more valid IP or CIDR addresses that can use the SSH certificate.
     */
    sourceAddresses?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The SSH certificate issuing template.
     */
    template?: pulumi.Input<string>;
    /**
     * The date the SSH certificate was issued.
     */
    validFrom?: pulumi.Input<string>;
    /**
     * Desired number of hours for which the certificate will be valid.
     */
    validHours?: pulumi.Input<number>;
    /**
     * The date the SSH certificate will expire.
     */
    validTo?: pulumi.Input<string>;
    /**
     * Specifies whether the private key will use Windows/DOS style line breaks.
     */
    windows?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a SshCertificate resource.
 */
export interface SshCertificateArgs {
    /**
     * A list of one or more valid IP or CIDR destination hosts where the certificate will authenticate.
     */
    destinationAddresses?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A list of key-value pairs that contain certificate extensions from the CA template for client certificates. Allowed values (case-sensitive): *permit-X11-forwarding, permit-agent-forwarding, permit-port-forwarding, permit-pty, permit-user-rc*
     */
    extensions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The DN of the policy folder where the SSH certificate object will be created.
     */
    folder?: pulumi.Input<string>;
    /**
     * A command to run after successful login.
     */
    forceCommand?: pulumi.Input<string>;
    /**
     * The identifier of the requested SSH certificate.
     */
    keyId: pulumi.Input<string>;
    /**
     * Passphrase for encrypting the private key.
     */
    keyPassphrase?: pulumi.Input<string>;
    /**
     * Number of bits to use when creating a key pair. (e.g. 3072)
     */
    keySize?: pulumi.Input<number>;
    /**
     * The friendly name of the SSH certificate object. When not specified the `keyId` is used for the friendly name. If the object already exists the old certificate is archived and the CA issues a new certificate.
     */
    objectName?: pulumi.Input<string>;
    /**
     * A list of user names for whom the requested certificate will be valid.
     */
    principals?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The OpenSSH formatted public key that will be used to generate the SSH certificate.
     */
    publicKey?: pulumi.Input<string>;
    /**
     * Specifies whether the public key will be "local" (default), "file" or "service" generated.
     */
    publicKeyMethod?: pulumi.Input<string>;
    /**
     * A list of one or more valid IP or CIDR addresses that can use the SSH certificate.
     */
    sourceAddresses?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The SSH certificate issuing template.
     */
    template: pulumi.Input<string>;
    /**
     * Desired number of hours for which the certificate will be valid.
     */
    validHours?: pulumi.Input<number>;
    /**
     * Specifies whether the private key will use Windows/DOS style line breaks.
     */
    windows?: pulumi.Input<boolean>;
}
