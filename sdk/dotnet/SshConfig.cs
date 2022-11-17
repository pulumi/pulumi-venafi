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
    /// Provides access to retrieve configuration from SSH certificate issuance template from *Venafi Trust Protection Platform*.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Venafi = Pulumi.Venafi;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var cit = new Venafi.SshConfig("cit", new Venafi.SshConfigArgs
    ///         {
    ///             Template = "devops-terraform-cit",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    [VenafiResourceType("venafi:index/sshConfig:SshConfig")]
    public partial class SshConfig : Pulumi.CustomResource
    {
        /// <summary>
        /// (Optional, string) The template's CA public key.
        /// </summary>
        [Output("caPublicKey")]
        public Output<string> CaPublicKey { get; private set; } = null!;

        /// <summary>
        /// (Optional, set of strings) A list of user names exported from the template.
        /// </summary>
        [Output("principals")]
        public Output<ImmutableArray<string>> Principals { get; private set; } = null!;

        /// <summary>
        /// The SSH certificate issuing template.
        /// </summary>
        [Output("template")]
        public Output<string> Template { get; private set; } = null!;


        /// <summary>
        /// Create a SshConfig resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SshConfig(string name, SshConfigArgs args, CustomResourceOptions? options = null)
            : base("venafi:index/sshConfig:SshConfig", name, args ?? new SshConfigArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SshConfig(string name, Input<string> id, SshConfigState? state = null, CustomResourceOptions? options = null)
            : base("venafi:index/sshConfig:SshConfig", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SshConfig resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SshConfig Get(string name, Input<string> id, SshConfigState? state = null, CustomResourceOptions? options = null)
        {
            return new SshConfig(name, id, state, options);
        }
    }

    public sealed class SshConfigArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The SSH certificate issuing template.
        /// </summary>
        [Input("template", required: true)]
        public Input<string> Template { get; set; } = null!;

        public SshConfigArgs()
        {
        }
    }

    public sealed class SshConfigState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Optional, string) The template's CA public key.
        /// </summary>
        [Input("caPublicKey")]
        public Input<string>? CaPublicKey { get; set; }

        [Input("principals")]
        private InputList<string>? _principals;

        /// <summary>
        /// (Optional, set of strings) A list of user names exported from the template.
        /// </summary>
        public InputList<string> Principals
        {
            get => _principals ?? (_principals = new InputList<string>());
            set => _principals = value;
        }

        /// <summary>
        /// The SSH certificate issuing template.
        /// </summary>
        [Input("template")]
        public Input<string>? Template { get; set; }

        public SshConfigState()
        {
        }
    }
}