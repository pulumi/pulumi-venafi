// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Venafi
{
    /// <summary>
    /// Provides access to read and write certificate policy in Venafi. This can be used
    /// to define a new policy (folder in *Trust Protection Platform*; application
    /// and/or issuing template in *Venafi as a Service*).
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.IO;
    /// using System.Linq;
    /// using Pulumi;
    /// using Venafi = Pulumi.Venafi;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var internalPolicy = new Venafi.Policy("internalPolicy", new()
    ///     {
    ///         Zone = "My Business App\\Enterprise Trusted Certs",
    ///         PolicySpecification = File.ReadAllText("/path-to/internal-policy.json"),
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// The `venafi_policy` resource supports the Terraform import method.
    /// 
    /// When used, the `zone` and `policy_specification` resource arguments are not required since the zone is a required parameter of the import method and the policy specification is populated from the existing infrastructure. Policy that is successfully imported is also output to a file named after the zone that was specified. hcl resource "venafi_policy" "existing_policy" {}
    /// 
    /// ```sh
    ///  $ pulumi import venafi:index/policy:Policy existing_policy" "My Business App\\Enterprise Trusted Certs"
    /// ```
    /// </summary>
    [VenafiResourceType("venafi:index/policy:Policy")]
    public partial class Policy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The JSON-formatted certificate policy
        /// specification as documented [here](https://github.com/Venafi/vcert/blob/master/README-POLICY-SPEC.md).
        /// Typically read from a file using the `file` function.
        /// </summary>
        [Output("policySpecification")]
        public Output<string?> PolicySpecification { get; private set; } = null!;

        /// <summary>
        /// The *Trust Protection Plaform* policy folder or
        /// *Venafi as a Service* application and issuing template.
        /// </summary>
        [Output("zone")]
        public Output<string?> Zone { get; private set; } = null!;


        /// <summary>
        /// Create a Policy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Policy(string name, PolicyArgs? args = null, CustomResourceOptions? options = null)
            : base("venafi:index/policy:Policy", name, args ?? new PolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Policy(string name, Input<string> id, PolicyState? state = null, CustomResourceOptions? options = null)
            : base("venafi:index/policy:Policy", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Policy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Policy Get(string name, Input<string> id, PolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new Policy(name, id, state, options);
        }
    }

    public sealed class PolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The JSON-formatted certificate policy
        /// specification as documented [here](https://github.com/Venafi/vcert/blob/master/README-POLICY-SPEC.md).
        /// Typically read from a file using the `file` function.
        /// </summary>
        [Input("policySpecification")]
        public Input<string>? PolicySpecification { get; set; }

        /// <summary>
        /// The *Trust Protection Plaform* policy folder or
        /// *Venafi as a Service* application and issuing template.
        /// </summary>
        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public PolicyArgs()
        {
        }
        public static new PolicyArgs Empty => new PolicyArgs();
    }

    public sealed class PolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The JSON-formatted certificate policy
        /// specification as documented [here](https://github.com/Venafi/vcert/blob/master/README-POLICY-SPEC.md).
        /// Typically read from a file using the `file` function.
        /// </summary>
        [Input("policySpecification")]
        public Input<string>? PolicySpecification { get; set; }

        /// <summary>
        /// The *Trust Protection Plaform* policy folder or
        /// *Venafi as a Service* application and issuing template.
        /// </summary>
        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public PolicyState()
        {
        }
        public static new PolicyState Empty => new PolicyState();
    }
}
