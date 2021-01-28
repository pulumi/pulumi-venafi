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
    /// The provider type for the venafi package. By default, resources use package-wide configuration
    /// settings, however an explicit `Provider` instance may be created and passed during resource
    /// construction to achieve fine-grained programmatic control over provider settings. See the
    /// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
    /// </summary>
    [VenafiResourceType("pulumi:providers:venafi")]
    public partial class Provider : Pulumi.ProviderResource
    {
        /// <summary>
        /// Create a Provider resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Provider(string name, ProviderArgs? args = null, CustomResourceOptions? options = null)
            : base("venafi", name, args ?? new ProviderArgs(), MakeResourceOptions(options, ""))
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
    }

    public sealed class ProviderArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Access token for TPP, user should use this for authentication
        /// </summary>
        [Input("accessToken")]
        public Input<string>? AccessToken { get; set; }

        /// <summary>
        /// API key for Venafi Cloud. Example: 142231b7-cvb0-412e-886b-6aeght0bc93d
        /// </summary>
        [Input("apiKey")]
        public Input<string>? ApiKey { get; set; }

        /// <summary>
        /// When set to true, the resulting certificate will be issued by an ephemeral, no trust CA rather than enrolling using
        /// Venafi Cloud or Platform. Useful for development and testing.
        /// </summary>
        [Input("devMode", json: true)]
        public Input<bool>? DevMode { get; set; }

        /// <summary>
        /// Password for WebSDK user. Example: password
        /// </summary>
        [Input("tppPassword")]
        public Input<string>? TppPassword { get; set; }

        /// <summary>
        /// WebSDK user for Venafi Platform. Example: admin
        /// </summary>
        [Input("tppUsername")]
        public Input<string>? TppUsername { get; set; }

        /// <summary>
        /// Use to specify a PEM-formatted file that contains certificates to be trust anchors for all communications with the
        /// Venafi Web Service. Example: trust_bundle = "${file("chain.pem")}"
        /// </summary>
        [Input("trustBundle")]
        public Input<string>? TrustBundle { get; set; }

        /// <summary>
        /// The Venafi Web Service URL.. Example: https://tpp.venafi.example/vedsdk
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        /// <summary>
        /// DN of the Venafi Platform policy folder or name of the Venafi Cloud zone. Example for Platform: testpolicy\\vault
        /// Example for Venafi Cloud: Default
        /// </summary>
        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public ProviderArgs()
        {
        }
    }
}
