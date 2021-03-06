// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * The provider type for the venafi package. By default, resources use package-wide configuration
 * settings, however an explicit `Provider` instance may be created and passed during resource
 * construction to achieve fine-grained programmatic control over provider settings. See the
 * [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
 */
export class Provider extends pulumi.ProviderResource {
    /** @internal */
    public static readonly __pulumiType = 'venafi';

    /**
     * Returns true if the given object is an instance of Provider.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Provider {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Provider.__pulumiType;
    }


    /**
     * Create a Provider resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ProviderArgs, opts?: pulumi.ResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        {
            inputs["accessToken"] = args ? args.accessToken : undefined;
            inputs["apiKey"] = args ? args.apiKey : undefined;
            inputs["devMode"] = pulumi.output(args ? args.devMode : undefined).apply(JSON.stringify);
            inputs["tppPassword"] = args ? args.tppPassword : undefined;
            inputs["tppUsername"] = args ? args.tppUsername : undefined;
            inputs["trustBundle"] = args ? args.trustBundle : undefined;
            inputs["url"] = args ? args.url : undefined;
            inputs["zone"] = args ? args.zone : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(Provider.__pulumiType, name, inputs, opts);
    }
}

/**
 * The set of arguments for constructing a Provider resource.
 */
export interface ProviderArgs {
    /**
     * Access token for TPP, user should use this for authentication
     */
    readonly accessToken?: pulumi.Input<string>;
    /**
     * API key for Venafi Cloud. Example: 142231b7-cvb0-412e-886b-6aeght0bc93d
     */
    readonly apiKey?: pulumi.Input<string>;
    /**
     * When set to true, the resulting certificate will be issued by an ephemeral, no trust CA rather than enrolling using
     * Venafi Cloud or Platform. Useful for development and testing.
     */
    readonly devMode?: pulumi.Input<boolean>;
    /**
     * Password for WebSDK user. Example: password
     *
     * @deprecated , please use access_token instead
     */
    readonly tppPassword?: pulumi.Input<string>;
    /**
     * WebSDK user for Venafi Platform. Example: admin
     *
     * @deprecated , please use access_token instead
     */
    readonly tppUsername?: pulumi.Input<string>;
    /**
     * Use to specify a PEM-formatted file that contains certificates to be trust anchors for all communications with the
     * Venafi Web Service. Example: trust_bundle = "${file("chain.pem")}"
     */
    readonly trustBundle?: pulumi.Input<string>;
    /**
     * The Venafi Web Service URL.. Example: https://tpp.venafi.example/vedsdk
     */
    readonly url?: pulumi.Input<string>;
    /**
     * DN of the Venafi Platform policy folder or name of the Venafi Cloud zone. Example for Platform: testpolicy\\vault
     * Example for Venafi Cloud: Default
     */
    readonly zone?: pulumi.Input<string>;
}
