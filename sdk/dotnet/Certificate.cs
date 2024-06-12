// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Venafi
{
    [VenafiResourceType("venafi:index/certificate:Certificate")]
    public partial class Certificate : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Key encryption algorithm, either RSA or ECDSA. Defaults to `RSA`.
        /// </summary>
        [Output("algorithm")]
        public Output<string?> Algorithm { get; private set; } = null!;

        /// <summary>
        /// The X509 certificate in PEM format.
        /// </summary>
        [Output("certificate")]
        public Output<string> CertificateDetails { get; private set; } = null!;

        [Output("certificateDn")]
        public Output<string> CertificateDn { get; private set; } = null!;

        /// <summary>
        /// ID of the issued certificate
        /// </summary>
        [Output("certificateId")]
        public Output<string> CertificateId { get; private set; } = null!;

        /// <summary>
        /// The trust chain of X509 certificate authority certificates in PEM format concatenated together.
        /// </summary>
        [Output("chain")]
        public Output<string> Chain { get; private set; } = null!;

        /// <summary>
        /// The common name of the certificate.
        /// </summary>
        [Output("commonName")]
        public Output<string> CommonName { get; private set; } = null!;

        /// <summary>
        /// Whether key-pair generation will be `local` or `service` generated. Default is 
        /// `local`.
        /// </summary>
        [Output("csrOrigin")]
        public Output<string?> CsrOrigin { get; private set; } = null!;

        [Output("csrPem")]
        public Output<string> CsrPem { get; private set; } = null!;

        /// <summary>
        /// Collection of Custom Field name-value pairs to assign to the certificate.
        /// </summary>
        [Output("customFields")]
        public Output<ImmutableDictionary<string, string>?> CustomFields { get; private set; } = null!;

        /// <summary>
        /// ECDSA curve to use when generating a key
        /// </summary>
        [Output("ecdsaCurve")]
        public Output<string?> EcdsaCurve { get; private set; } = null!;

        /// <summary>
        /// Number of hours before certificate expiry to request a new certificate. 
        /// Defaults to `168`.
        /// </summary>
        [Output("expirationWindow")]
        public Output<int?> ExpirationWindow { get; private set; } = null!;

        /// <summary>
        /// Used with `valid_days` to indicate the target issuer when using Trust Protection 
        /// Platform. Relevant values are: `DigiCert`, `Entrust`, and `Microsoft`.
        /// </summary>
        [Output("issuerHint")]
        public Output<string?> IssuerHint { get; private set; } = null!;

        /// <summary>
        /// The password used to encrypt the private key.
        /// </summary>
        [Output("keyPassword")]
        public Output<string?> KeyPassword { get; private set; } = null!;

        /// <summary>
        /// Use to specify a name for the new certificate object that will be created and placed 
        /// in a policy. Only valid for Trust Protection Platform.
        /// </summary>
        [Output("nickname")]
        public Output<string?> Nickname { get; private set; } = null!;

        /// <summary>
        /// A base64-encoded PKCS#12 keystore secured by the `key_password`. Useful when working with resources like 
        /// azure key_vault_certificate.
        /// </summary>
        [Output("pkcs12")]
        public Output<string> Pkcs12 { get; private set; } = null!;

        /// <summary>
        /// The private key in PEM format.
        /// </summary>
        [Output("privateKeyPem")]
        public Output<string> PrivateKeyPem { get; private set; } = null!;

        /// <summary>
        /// Indicates the certificate should be reissued. This means the resource will destroyed and recreated
        /// </summary>
        [Output("renewRequired")]
        public Output<bool?> RenewRequired { get; private set; } = null!;

        /// <summary>
        /// Number of bits to use when generating an RSA key. Applies when algorithm is `RSA`. 
        /// Defaults to `2048`.
        /// </summary>
        [Output("rsaBits")]
        public Output<int?> RsaBits { get; private set; } = null!;

        /// <summary>
        /// List of DNS names to use as alternative subjects of the certificate.
        /// </summary>
        [Output("sanDns")]
        public Output<ImmutableArray<string>> SanDns { get; private set; } = null!;

        /// <summary>
        /// List of email addresses to use as alternative subjects of the certificate.
        /// </summary>
        [Output("sanEmails")]
        public Output<ImmutableArray<string>> SanEmails { get; private set; } = null!;

        /// <summary>
        /// List of IP addresses to use as alternative subjects of the certificate.
        /// </summary>
        [Output("sanIps")]
        public Output<ImmutableArray<string>> SanIps { get; private set; } = null!;

        /// <summary>
        /// List of Uniform Resource Identifiers (URIs) to use as alternative subjects of 
        /// the certificate.
        /// </summary>
        [Output("sanUris")]
        public Output<ImmutableArray<string>> SanUris { get; private set; } = null!;

        /// <summary>
        /// Desired number of days for which the new certificate will be valid.
        /// </summary>
        [Output("validDays")]
        public Output<int?> ValidDays { get; private set; } = null!;


        /// <summary>
        /// Create a Certificate resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Certificate(string name, CertificateArgs args, CustomResourceOptions? options = null)
            : base("venafi:index/certificate:Certificate", name, args ?? new CertificateArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Certificate(string name, Input<string> id, CertificateState? state = null, CustomResourceOptions? options = null)
            : base("venafi:index/certificate:Certificate", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "keyPassword",
                    "privateKeyPem",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Certificate resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Certificate Get(string name, Input<string> id, CertificateState? state = null, CustomResourceOptions? options = null)
        {
            return new Certificate(name, id, state, options);
        }
    }

    public sealed class CertificateArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Key encryption algorithm, either RSA or ECDSA. Defaults to `RSA`.
        /// </summary>
        [Input("algorithm")]
        public Input<string>? Algorithm { get; set; }

        [Input("certificateDn")]
        public Input<string>? CertificateDn { get; set; }

        /// <summary>
        /// The common name of the certificate.
        /// </summary>
        [Input("commonName", required: true)]
        public Input<string> CommonName { get; set; } = null!;

        /// <summary>
        /// Whether key-pair generation will be `local` or `service` generated. Default is 
        /// `local`.
        /// </summary>
        [Input("csrOrigin")]
        public Input<string>? CsrOrigin { get; set; }

        [Input("csrPem")]
        public Input<string>? CsrPem { get; set; }

        [Input("customFields")]
        private InputMap<string>? _customFields;

        /// <summary>
        /// Collection of Custom Field name-value pairs to assign to the certificate.
        /// </summary>
        public InputMap<string> CustomFields
        {
            get => _customFields ?? (_customFields = new InputMap<string>());
            set => _customFields = value;
        }

        /// <summary>
        /// ECDSA curve to use when generating a key
        /// </summary>
        [Input("ecdsaCurve")]
        public Input<string>? EcdsaCurve { get; set; }

        /// <summary>
        /// Number of hours before certificate expiry to request a new certificate. 
        /// Defaults to `168`.
        /// </summary>
        [Input("expirationWindow")]
        public Input<int>? ExpirationWindow { get; set; }

        /// <summary>
        /// Used with `valid_days` to indicate the target issuer when using Trust Protection 
        /// Platform. Relevant values are: `DigiCert`, `Entrust`, and `Microsoft`.
        /// </summary>
        [Input("issuerHint")]
        public Input<string>? IssuerHint { get; set; }

        [Input("keyPassword")]
        private Input<string>? _keyPassword;

        /// <summary>
        /// The password used to encrypt the private key.
        /// </summary>
        public Input<string>? KeyPassword
        {
            get => _keyPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _keyPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Use to specify a name for the new certificate object that will be created and placed 
        /// in a policy. Only valid for Trust Protection Platform.
        /// </summary>
        [Input("nickname")]
        public Input<string>? Nickname { get; set; }

        /// <summary>
        /// A base64-encoded PKCS#12 keystore secured by the `key_password`. Useful when working with resources like 
        /// azure key_vault_certificate.
        /// </summary>
        [Input("pkcs12")]
        public Input<string>? Pkcs12 { get; set; }

        [Input("privateKeyPem")]
        private Input<string>? _privateKeyPem;

        /// <summary>
        /// The private key in PEM format.
        /// </summary>
        public Input<string>? PrivateKeyPem
        {
            get => _privateKeyPem;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _privateKeyPem = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Indicates the certificate should be reissued. This means the resource will destroyed and recreated
        /// </summary>
        [Input("renewRequired")]
        public Input<bool>? RenewRequired { get; set; }

        /// <summary>
        /// Number of bits to use when generating an RSA key. Applies when algorithm is `RSA`. 
        /// Defaults to `2048`.
        /// </summary>
        [Input("rsaBits")]
        public Input<int>? RsaBits { get; set; }

        [Input("sanDns")]
        private InputList<string>? _sanDns;

        /// <summary>
        /// List of DNS names to use as alternative subjects of the certificate.
        /// </summary>
        public InputList<string> SanDns
        {
            get => _sanDns ?? (_sanDns = new InputList<string>());
            set => _sanDns = value;
        }

        [Input("sanEmails")]
        private InputList<string>? _sanEmails;

        /// <summary>
        /// List of email addresses to use as alternative subjects of the certificate.
        /// </summary>
        public InputList<string> SanEmails
        {
            get => _sanEmails ?? (_sanEmails = new InputList<string>());
            set => _sanEmails = value;
        }

        [Input("sanIps")]
        private InputList<string>? _sanIps;

        /// <summary>
        /// List of IP addresses to use as alternative subjects of the certificate.
        /// </summary>
        public InputList<string> SanIps
        {
            get => _sanIps ?? (_sanIps = new InputList<string>());
            set => _sanIps = value;
        }

        [Input("sanUris")]
        private InputList<string>? _sanUris;

        /// <summary>
        /// List of Uniform Resource Identifiers (URIs) to use as alternative subjects of 
        /// the certificate.
        /// </summary>
        public InputList<string> SanUris
        {
            get => _sanUris ?? (_sanUris = new InputList<string>());
            set => _sanUris = value;
        }

        /// <summary>
        /// Desired number of days for which the new certificate will be valid.
        /// </summary>
        [Input("validDays")]
        public Input<int>? ValidDays { get; set; }

        public CertificateArgs()
        {
        }
        public static new CertificateArgs Empty => new CertificateArgs();
    }

    public sealed class CertificateState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Key encryption algorithm, either RSA or ECDSA. Defaults to `RSA`.
        /// </summary>
        [Input("algorithm")]
        public Input<string>? Algorithm { get; set; }

        /// <summary>
        /// The X509 certificate in PEM format.
        /// </summary>
        [Input("certificate")]
        public Input<string>? CertificateDetails { get; set; }

        [Input("certificateDn")]
        public Input<string>? CertificateDn { get; set; }

        /// <summary>
        /// ID of the issued certificate
        /// </summary>
        [Input("certificateId")]
        public Input<string>? CertificateId { get; set; }

        /// <summary>
        /// The trust chain of X509 certificate authority certificates in PEM format concatenated together.
        /// </summary>
        [Input("chain")]
        public Input<string>? Chain { get; set; }

        /// <summary>
        /// The common name of the certificate.
        /// </summary>
        [Input("commonName")]
        public Input<string>? CommonName { get; set; }

        /// <summary>
        /// Whether key-pair generation will be `local` or `service` generated. Default is 
        /// `local`.
        /// </summary>
        [Input("csrOrigin")]
        public Input<string>? CsrOrigin { get; set; }

        [Input("csrPem")]
        public Input<string>? CsrPem { get; set; }

        [Input("customFields")]
        private InputMap<string>? _customFields;

        /// <summary>
        /// Collection of Custom Field name-value pairs to assign to the certificate.
        /// </summary>
        public InputMap<string> CustomFields
        {
            get => _customFields ?? (_customFields = new InputMap<string>());
            set => _customFields = value;
        }

        /// <summary>
        /// ECDSA curve to use when generating a key
        /// </summary>
        [Input("ecdsaCurve")]
        public Input<string>? EcdsaCurve { get; set; }

        /// <summary>
        /// Number of hours before certificate expiry to request a new certificate. 
        /// Defaults to `168`.
        /// </summary>
        [Input("expirationWindow")]
        public Input<int>? ExpirationWindow { get; set; }

        /// <summary>
        /// Used with `valid_days` to indicate the target issuer when using Trust Protection 
        /// Platform. Relevant values are: `DigiCert`, `Entrust`, and `Microsoft`.
        /// </summary>
        [Input("issuerHint")]
        public Input<string>? IssuerHint { get; set; }

        [Input("keyPassword")]
        private Input<string>? _keyPassword;

        /// <summary>
        /// The password used to encrypt the private key.
        /// </summary>
        public Input<string>? KeyPassword
        {
            get => _keyPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _keyPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Use to specify a name for the new certificate object that will be created and placed 
        /// in a policy. Only valid for Trust Protection Platform.
        /// </summary>
        [Input("nickname")]
        public Input<string>? Nickname { get; set; }

        /// <summary>
        /// A base64-encoded PKCS#12 keystore secured by the `key_password`. Useful when working with resources like 
        /// azure key_vault_certificate.
        /// </summary>
        [Input("pkcs12")]
        public Input<string>? Pkcs12 { get; set; }

        [Input("privateKeyPem")]
        private Input<string>? _privateKeyPem;

        /// <summary>
        /// The private key in PEM format.
        /// </summary>
        public Input<string>? PrivateKeyPem
        {
            get => _privateKeyPem;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _privateKeyPem = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Indicates the certificate should be reissued. This means the resource will destroyed and recreated
        /// </summary>
        [Input("renewRequired")]
        public Input<bool>? RenewRequired { get; set; }

        /// <summary>
        /// Number of bits to use when generating an RSA key. Applies when algorithm is `RSA`. 
        /// Defaults to `2048`.
        /// </summary>
        [Input("rsaBits")]
        public Input<int>? RsaBits { get; set; }

        [Input("sanDns")]
        private InputList<string>? _sanDns;

        /// <summary>
        /// List of DNS names to use as alternative subjects of the certificate.
        /// </summary>
        public InputList<string> SanDns
        {
            get => _sanDns ?? (_sanDns = new InputList<string>());
            set => _sanDns = value;
        }

        [Input("sanEmails")]
        private InputList<string>? _sanEmails;

        /// <summary>
        /// List of email addresses to use as alternative subjects of the certificate.
        /// </summary>
        public InputList<string> SanEmails
        {
            get => _sanEmails ?? (_sanEmails = new InputList<string>());
            set => _sanEmails = value;
        }

        [Input("sanIps")]
        private InputList<string>? _sanIps;

        /// <summary>
        /// List of IP addresses to use as alternative subjects of the certificate.
        /// </summary>
        public InputList<string> SanIps
        {
            get => _sanIps ?? (_sanIps = new InputList<string>());
            set => _sanIps = value;
        }

        [Input("sanUris")]
        private InputList<string>? _sanUris;

        /// <summary>
        /// List of Uniform Resource Identifiers (URIs) to use as alternative subjects of 
        /// the certificate.
        /// </summary>
        public InputList<string> SanUris
        {
            get => _sanUris ?? (_sanUris = new InputList<string>());
            set => _sanUris = value;
        }

        /// <summary>
        /// Desired number of days for which the new certificate will be valid.
        /// </summary>
        [Input("validDays")]
        public Input<int>? ValidDays { get; set; }

        public CertificateState()
        {
        }
        public static new CertificateState Empty => new CertificateState();
    }
}
