// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Immutable;

namespace Pulumi.Venafi
{
    public static class Config
    {
        [global::System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Design", "IDE1006", Justification = 
        "Double underscore prefix used to avoid conflicts with variable names.")]
        private sealed class __Value<T>
        {
            private readonly Func<T> _getter;
            private T _value = default!;
            private bool _set;

            public __Value(Func<T> getter)
            {
                _getter = getter;
            }

            public T Get() => _set ? _value : _getter();

            public void Set(T value)
            {
                _value = value;
                _set = true;
            }
        }

        private static readonly global::Pulumi.Config __config = new global::Pulumi.Config("venafi");

        private static readonly __Value<string?> _accessToken = new __Value<string?>(() => __config.Get("accessToken"));
        /// <summary>
        /// Access token for Venafi TLSPDC, user should use this for authentication
        /// </summary>
        public static string? AccessToken
        {
            get => _accessToken.Get();
            set => _accessToken.Set(value);
        }

        private static readonly __Value<string?> _apiKey = new __Value<string?>(() => __config.Get("apiKey"));
        /// <summary>
        /// API key for Venafi Control Plane. Example: 142231b7-cvb0-412e-886b-6aeght0bc93d
        /// </summary>
        public static string? ApiKey
        {
            get => _apiKey.Get();
            set => _apiKey.Set(value);
        }

        private static readonly __Value<string?> _clientId = new __Value<string?>(() => __config.Get("clientId"));
        /// <summary>
        /// application that will be using the token
        /// </summary>
        public static string? ClientId
        {
            get => _clientId.Get();
            set => _clientId.Set(value);
        }

        private static readonly __Value<bool?> _devMode = new __Value<bool?>(() => __config.GetBoolean("devMode"));
        /// <summary>
        /// When set to true, the resulting certificate will be issued by an ephemeral, no trust CA rather than enrolling using
        /// Venafi as a Service or Trust Protection Platform. Useful for development and testing
        /// </summary>
        public static bool? DevMode
        {
            get => _devMode.Get();
            set => _devMode.Set(value);
        }

        private static readonly __Value<string?> _externalJwt = new __Value<string?>(() => __config.Get("externalJwt"));
        /// <summary>
        /// JWT of the identity provider associated to the Venafi Control Plane service account that is granting the access token
        /// </summary>
        public static string? ExternalJwt
        {
            get => _externalJwt.Get();
            set => _externalJwt.Set(value);
        }

        private static readonly __Value<string?> _p12CertFilename = new __Value<string?>(() => __config.Get("p12CertFilename"));
        /// <summary>
        /// Filename of PKCS#12 keystore containing a client certificate, private key, and chain certificates to authenticate to
        /// TLSPDC
        /// </summary>
        public static string? P12CertFilename
        {
            get => _p12CertFilename.Get();
            set => _p12CertFilename.Set(value);
        }

        private static readonly __Value<string?> _p12CertPassword = new __Value<string?>(() => __config.Get("p12CertPassword"));
        /// <summary>
        /// Password for the PKCS#12 keystore declared in p12_cert
        /// </summary>
        public static string? P12CertPassword
        {
            get => _p12CertPassword.Get();
            set => _p12CertPassword.Set(value);
        }

        private static readonly __Value<bool?> _skipRetirement = new __Value<bool?>(() => __config.GetBoolean("skipRetirement"));
        public static bool? SkipRetirement
        {
            get => _skipRetirement.Get();
            set => _skipRetirement.Set(value);
        }

        private static readonly __Value<string?> _tokenUrl = new __Value<string?>(() => __config.Get("tokenUrl"));
        /// <summary>
        /// Endpoint URL to request new Venafi Control Plane access tokens
        /// </summary>
        public static string? TokenUrl
        {
            get => _tokenUrl.Get();
            set => _tokenUrl.Set(value);
        }

        private static readonly __Value<string?> _tppPassword = new __Value<string?>(() => __config.Get("tppPassword"));
        /// <summary>
        /// Password for WebSDK user. Example: password
        /// </summary>
        public static string? TppPassword
        {
            get => _tppPassword.Get();
            set => _tppPassword.Set(value);
        }

        private static readonly __Value<string?> _tppUsername = new __Value<string?>(() => __config.Get("tppUsername"));
        /// <summary>
        /// WebSDK user for Venafi TLSPDC. Example: admin
        /// </summary>
        public static string? TppUsername
        {
            get => _tppUsername.Get();
            set => _tppUsername.Set(value);
        }

        private static readonly __Value<string?> _trustBundle = new __Value<string?>(() => __config.Get("trustBundle"));
        /// <summary>
        /// Use to specify a PEM-formatted file that contains certificates to be trust anchors for all communications with the
        /// Venafi Web Service. Example: trust_bundle = "${file("chain.pem")}"
        /// </summary>
        public static string? TrustBundle
        {
            get => _trustBundle.Get();
            set => _trustBundle.Set(value);
        }

        private static readonly __Value<string?> _url = new __Value<string?>(() => __config.Get("url"));
        /// <summary>
        /// The Venafi Platform URL. Example: https://tpp.venafi.example/vedsdk
        /// </summary>
        public static string? Url
        {
            get => _url.Get();
            set => _url.Set(value);
        }

        private static readonly __Value<string?> _zone = new __Value<string?>(() => __config.Get("zone"));
        /// <summary>
        /// DN of the Venafi TLSPDC policy folder or name of the Venafi as a Service application plus issuing template alias.
        /// Example for Platform: testPolicy\\vault Example for Venafi as a Service: myApp\\Default
        /// </summary>
        public static string? Zone
        {
            get => _zone.Get();
            set => _zone.Set(value);
        }

    }
}
