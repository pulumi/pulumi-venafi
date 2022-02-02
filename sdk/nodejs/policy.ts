// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides access to read and write certificate policy in Venafi. This can be used
 * to define a new policy (folder in *Trust Protection Platform*; application
 * and/or issuing template in *Venafi as a Service*).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as venafi from "@pulumi/venafi";
 * import * from "fs";
 *
 * const internalPolicy = new venafi.Policy("internalPolicy", {
 *     zone: "My Business App\\Enterprise Trusted Certs",
 *     policySpecification: fs.readFileSync("/path-to/internal-policy.json"),
 * });
 * ```
 *
 * ## Import
 *
 * The `venafi_policy` resource supports the Terraform [import](https://www.terraform.io/docs/cli/import/index.html) method.
 *
 * When used, the `zone` and `policy_specification` resource arguments are not required since the zone is a required parameter of the import method and the policy specification is populated from the existing infrastructure. Policy that is successfully imported is also output to a file named after the zone that was specified. hcl resource "venafi_policy" "existing_policy" {}
 *
 * ```sh
 *  $ pulumi import venafi:index/policy:Policy existing_policy" "My Business App\\Enterprise Trusted Certs"
 * ```
 */
export class Policy extends pulumi.CustomResource {
    /**
     * Get an existing Policy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PolicyState, opts?: pulumi.CustomResourceOptions): Policy {
        return new Policy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'venafi:index/policy:Policy';

    /**
     * Returns true if the given object is an instance of Policy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Policy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Policy.__pulumiType;
    }

    /**
     * The JSON-formatted certificate policy
     * specification.  Typically read from a file using the `file` function.
     */
    public readonly policySpecification!: pulumi.Output<string | undefined>;
    /**
     * The *Trust Protection Plaform* policy folder or
     * *Venafi as a Service* application and issuing template.
     */
    public readonly zone!: pulumi.Output<string | undefined>;

    /**
     * Create a Policy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: PolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PolicyArgs | PolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PolicyState | undefined;
            resourceInputs["policySpecification"] = state ? state.policySpecification : undefined;
            resourceInputs["zone"] = state ? state.zone : undefined;
        } else {
            const args = argsOrState as PolicyArgs | undefined;
            resourceInputs["policySpecification"] = args ? args.policySpecification : undefined;
            resourceInputs["zone"] = args ? args.zone : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Policy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Policy resources.
 */
export interface PolicyState {
    /**
     * The JSON-formatted certificate policy
     * specification.  Typically read from a file using the `file` function.
     */
    policySpecification?: pulumi.Input<string>;
    /**
     * The *Trust Protection Plaform* policy folder or
     * *Venafi as a Service* application and issuing template.
     */
    zone?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Policy resource.
 */
export interface PolicyArgs {
    /**
     * The JSON-formatted certificate policy
     * specification.  Typically read from a file using the `file` function.
     */
    policySpecification?: pulumi.Input<string>;
    /**
     * The *Trust Protection Plaform* policy folder or
     * *Venafi as a Service* application and issuing template.
     */
    zone?: pulumi.Input<string>;
}
