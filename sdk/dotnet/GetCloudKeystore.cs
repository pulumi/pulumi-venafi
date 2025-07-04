// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Venafi
{
    public static class GetCloudKeystore
    {
        /// <summary>
        /// Use this data source to get the `ID` of a cloud keystore in Venafi Control Plane, referenced by its name and parent 
        /// cloud provider ID. You can use `venafi.getCloudProvider` data source to obtain the ID of the parent cloud provider.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Venafi = Pulumi.Venafi;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     // Find a cloud keystore with a static cloud provider id
        ///     var ckExampleById = Venafi.GetCloudKeystore.Invoke(new()
        ///     {
        ///         CloudProviderId = "e48897d0-2762-11ef-8fab-79ac590dd358",
        ///         Name = "Cloud Keystore Example",
        ///     });
        /// 
        ///     // Find a cloud keystore by using venafi_cloud_provider data source as input
        ///     var ckExample = Venafi.GetCloudKeystore.Invoke(new()
        ///     {
        ///         CloudProviderId = cpExample.Id,
        ///         Name = "Cloud Keystore example",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetCloudKeystoreResult> InvokeAsync(GetCloudKeystoreArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCloudKeystoreResult>("venafi:index/getCloudKeystore:getCloudKeystore", args ?? new GetCloudKeystoreArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get the `ID` of a cloud keystore in Venafi Control Plane, referenced by its name and parent 
        /// cloud provider ID. You can use `venafi.getCloudProvider` data source to obtain the ID of the parent cloud provider.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Venafi = Pulumi.Venafi;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     // Find a cloud keystore with a static cloud provider id
        ///     var ckExampleById = Venafi.GetCloudKeystore.Invoke(new()
        ///     {
        ///         CloudProviderId = "e48897d0-2762-11ef-8fab-79ac590dd358",
        ///         Name = "Cloud Keystore Example",
        ///     });
        /// 
        ///     // Find a cloud keystore by using venafi_cloud_provider data source as input
        ///     var ckExample = Venafi.GetCloudKeystore.Invoke(new()
        ///     {
        ///         CloudProviderId = cpExample.Id,
        ///         Name = "Cloud Keystore example",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetCloudKeystoreResult> Invoke(GetCloudKeystoreInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCloudKeystoreResult>("venafi:index/getCloudKeystore:getCloudKeystore", args ?? new GetCloudKeystoreInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get the `ID` of a cloud keystore in Venafi Control Plane, referenced by its name and parent 
        /// cloud provider ID. You can use `venafi.getCloudProvider` data source to obtain the ID of the parent cloud provider.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Venafi = Pulumi.Venafi;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     // Find a cloud keystore with a static cloud provider id
        ///     var ckExampleById = Venafi.GetCloudKeystore.Invoke(new()
        ///     {
        ///         CloudProviderId = "e48897d0-2762-11ef-8fab-79ac590dd358",
        ///         Name = "Cloud Keystore Example",
        ///     });
        /// 
        ///     // Find a cloud keystore by using venafi_cloud_provider data source as input
        ///     var ckExample = Venafi.GetCloudKeystore.Invoke(new()
        ///     {
        ///         CloudProviderId = cpExample.Id,
        ///         Name = "Cloud Keystore example",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetCloudKeystoreResult> Invoke(GetCloudKeystoreInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetCloudKeystoreResult>("venafi:index/getCloudKeystore:getCloudKeystore", args ?? new GetCloudKeystoreInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCloudKeystoreArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the cloud provider whom the cloud keystore to look up belongs to.
        /// </summary>
        [Input("cloudProviderId", required: true)]
        public string CloudProviderId { get; set; } = null!;

        /// <summary>
        /// Name of the cloud keystore to look up.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetCloudKeystoreArgs()
        {
        }
        public static new GetCloudKeystoreArgs Empty => new GetCloudKeystoreArgs();
    }

    public sealed class GetCloudKeystoreInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the cloud provider whom the cloud keystore to look up belongs to.
        /// </summary>
        [Input("cloudProviderId", required: true)]
        public Input<string> CloudProviderId { get; set; } = null!;

        /// <summary>
        /// Name of the cloud keystore to look up.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetCloudKeystoreInvokeArgs()
        {
        }
        public static new GetCloudKeystoreInvokeArgs Empty => new GetCloudKeystoreInvokeArgs();
    }


    [OutputType]
    public sealed class GetCloudKeystoreResult
    {
        public readonly string CloudProviderId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Number of machine identities provisioned to the cloud keystore.
        /// </summary>
        public readonly int MachineIdentitiesCount;
        public readonly string Name;
        /// <summary>
        /// The cloud keystore type. Either `ACM`, `AKV` or `GCM`.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetCloudKeystoreResult(
            string cloudProviderId,

            string id,

            int machineIdentitiesCount,

            string name,

            string type)
        {
            CloudProviderId = cloudProviderId;
            Id = id;
            MachineIdentitiesCount = machineIdentitiesCount;
            Name = name;
            Type = type;
        }
    }
}
