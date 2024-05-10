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
    public partial class Provider : global::Pulumi.ProviderResource
    {
        /// <summary>
        /// Access token for Venafi TLSPDC, user should use this for authentication
        /// </summary>
        [Output("accessToken")]
        public Output<string?> AccessToken { get; private set; } = null!;

        /// <summary>
        /// API key for Venafi Control Plane. Example: 142231b7-cvb0-412e-886b-6aeght0bc93d
        /// </summary>
        [Output("apiKey")]
        public Output<string?> ApiKey { get; private set; } = null!;

        /// <summary>
        /// application that will be using the token
        /// </summary>
        [Output("clientId")]
        public Output<string?> ClientId { get; private set; } = null!;

        /// <summary>
        /// JWT of the identity provider associated to the Venafi Control Plane service account that is granting the access token
        /// </summary>
        [Output("externalJwt")]
        public Output<string?> ExternalJwt { get; private set; } = null!;

        /// <summary>
        /// Filename of PKCS#12 keystore containing a client certificate, private key, and chain certificates to authenticate to
        /// TLSPDC
        /// </summary>
        [Output("p12CertFilename")]
        public Output<string?> P12CertFilename { get; private set; } = null!;

        /// <summary>
        /// Password for the PKCS#12 keystore declared in p12_cert
        /// </summary>
        [Output("p12CertPassword")]
        public Output<string?> P12CertPassword { get; private set; } = null!;

        /// <summary>
        /// Endpoint URL to request new Venafi Control Plane access tokens
        /// </summary>
        [Output("tokenUrl")]
        public Output<string?> TokenUrl { get; private set; } = null!;

        /// <summary>
        /// Password for WebSDK user. Example: password
        /// </summary>
        [Output("tppPassword")]
        public Output<string?> TppPassword { get; private set; } = null!;

        /// <summary>
        /// WebSDK user for Venafi TLSPDC. Example: admin
        /// </summary>
        [Output("tppUsername")]
        public Output<string?> TppUsername { get; private set; } = null!;

        /// <summary>
        /// Use to specify a PEM-formatted file that contains certificates to be trust anchors for all communications with the
        /// Venafi Web Service. Example: trust_bundle = "${file("chain.pem")}"
        /// </summary>
        [Output("trustBundle")]
        public Output<string?> TrustBundle { get; private set; } = null!;

        /// <summary>
        /// The Venafi Platform URL. Example: https://tpp.venafi.example/vedsdk
        /// </summary>
        [Output("url")]
        public Output<string?> Url { get; private set; } = null!;

        /// <summary>
        /// DN of the Venafi TLSPDC policy folder or name of the Venafi as a Service application plus issuing template alias.
        /// Example for Platform: testPolicy\\vault Example for Venafi as a Service: myApp\\Default
        /// </summary>
        [Output("zone")]
        public Output<string?> Zone { get; private set; } = null!;


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
                AdditionalSecretOutputs =
                {
                    "accessToken",
                    "apiKey",
                    "externalJwt",
                    "p12CertPassword",
                    "tokenUrl",
                    "tppPassword",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
    }

    public sealed class ProviderArgs : global::Pulumi.ResourceArgs
    {
        [Input("accessToken")]
        private Input<string>? _accessToken;

        /// <summary>
        /// Access token for Venafi TLSPDC, user should use this for authentication
        /// </summary>
        public Input<string>? AccessToken
        {
            get => _accessToken;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _accessToken = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("apiKey")]
        private Input<string>? _apiKey;

        /// <summary>
        /// API key for Venafi Control Plane. Example: 142231b7-cvb0-412e-886b-6aeght0bc93d
        /// </summary>
        public Input<string>? ApiKey
        {
            get => _apiKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _apiKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// application that will be using the token
        /// </summary>
        [Input("clientId")]
        public Input<string>? ClientId { get; set; }

        /// <summary>
        /// When set to true, the resulting certificate will be issued by an ephemeral, no trust CA rather than enrolling using
        /// Venafi as a Service or Trust Protection Platform. Useful for development and testing.
        /// </summary>
        [Input("devMode", json: true)]
        public Input<bool>? DevMode { get; set; }

        [Input("externalJwt")]
        private Input<string>? _externalJwt;

        /// <summary>
        /// JWT of the identity provider associated to the Venafi Control Plane service account that is granting the access token
        /// </summary>
        public Input<string>? ExternalJwt
        {
            get => _externalJwt;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _externalJwt = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Filename of PKCS#12 keystore containing a client certificate, private key, and chain certificates to authenticate to
        /// TLSPDC
        /// </summary>
        [Input("p12CertFilename")]
        public Input<string>? P12CertFilename { get; set; }

        [Input("p12CertPassword")]
        private Input<string>? _p12CertPassword;

        /// <summary>
        /// Password for the PKCS#12 keystore declared in p12_cert
        /// </summary>
        public Input<string>? P12CertPassword
        {
            get => _p12CertPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _p12CertPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("skipRetirement", json: true)]
        public Input<bool>? SkipRetirement { get; set; }

        [Input("tokenUrl")]
        private Input<string>? _tokenUrl;

        /// <summary>
        /// Endpoint URL to request new Venafi Control Plane access tokens
        /// </summary>
        public Input<string>? TokenUrl
        {
            get => _tokenUrl;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _tokenUrl = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("tppPassword")]
        private Input<string>? _tppPassword;

        /// <summary>
        /// Password for WebSDK user. Example: password
        /// </summary>
        [Obsolete(@", please use access_token instead")]
        public Input<string>? TppPassword
        {
            get => _tppPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _tppPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// WebSDK user for Venafi TLSPDC. Example: admin
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
        /// The Venafi Platform URL. Example: https://tpp.venafi.example/vedsdk
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        /// <summary>
        /// DN of the Venafi TLSPDC policy folder or name of the Venafi as a Service application plus issuing template alias.
        /// Example for Platform: testPolicy\\vault Example for Venafi as a Service: myApp\\Default
        /// </summary>
        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public ProviderArgs()
        {
        }
        public static new ProviderArgs Empty => new ProviderArgs();
    }
}
