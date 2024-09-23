// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to get the `ID` of a cloud keystore in Venafi Control Plane, referenced by its name and parent
 * cloud provider ID. You can use `venafi.getCloudProvider` data source to obtain the ID of the parent cloud provider.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as venafi from "@pulumi/venafi";
 *
 * // Find a cloud keystore with a static cloud provider id
 * const ckExampleById = venafi.getCloudKeystore({
 *     cloudProviderId: "e48897d0-2762-11ef-8fab-79ac590dd358",
 *     name: "Cloud Keystore Example",
 * });
 * // Find a cloud keystore by using venafi_cloud_provider data source as input
 * const ckExample = venafi.getCloudKeystore({
 *     cloudProviderId: cpExample.id,
 *     name: "Cloud Keystore example",
 * });
 * ```
 */
export function getCloudKeystore(args: GetCloudKeystoreArgs, opts?: pulumi.InvokeOptions): Promise<GetCloudKeystoreResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("venafi:index/getCloudKeystore:getCloudKeystore", {
        "cloudProviderId": args.cloudProviderId,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getCloudKeystore.
 */
export interface GetCloudKeystoreArgs {
    /**
     * ID of the cloud provider whom the cloud keystore to look up belongs to.
     */
    cloudProviderId: string;
    /**
     * Name of the cloud keystore to look up.
     */
    name: string;
}

/**
 * A collection of values returned by getCloudKeystore.
 */
export interface GetCloudKeystoreResult {
    readonly cloudProviderId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Number of machine identities provisioned to the cloud keystore.
     */
    readonly machineIdentitiesCount: number;
    readonly name: string;
    /**
     * The cloud keystore type. Either `ACM`, `AKV` or `GCM`.
     */
    readonly type: string;
}
/**
 * Use this data source to get the `ID` of a cloud keystore in Venafi Control Plane, referenced by its name and parent
 * cloud provider ID. You can use `venafi.getCloudProvider` data source to obtain the ID of the parent cloud provider.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as venafi from "@pulumi/venafi";
 *
 * // Find a cloud keystore with a static cloud provider id
 * const ckExampleById = venafi.getCloudKeystore({
 *     cloudProviderId: "e48897d0-2762-11ef-8fab-79ac590dd358",
 *     name: "Cloud Keystore Example",
 * });
 * // Find a cloud keystore by using venafi_cloud_provider data source as input
 * const ckExample = venafi.getCloudKeystore({
 *     cloudProviderId: cpExample.id,
 *     name: "Cloud Keystore example",
 * });
 * ```
 */
export function getCloudKeystoreOutput(args: GetCloudKeystoreOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetCloudKeystoreResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("venafi:index/getCloudKeystore:getCloudKeystore", {
        "cloudProviderId": args.cloudProviderId,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getCloudKeystore.
 */
export interface GetCloudKeystoreOutputArgs {
    /**
     * ID of the cloud provider whom the cloud keystore to look up belongs to.
     */
    cloudProviderId: pulumi.Input<string>;
    /**
     * Name of the cloud keystore to look up.
     */
    name: pulumi.Input<string>;
}
