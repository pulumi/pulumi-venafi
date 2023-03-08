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
    /// Provides access to request and retrieve SSH certificates from *Venafi Trust Protection Platform*.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Venafi = Pulumi.Venafi;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var sshCert = new Venafi.SshCertificate("sshCert", new()
    ///     {
    ///         KeyId = "my-first-ssh-certificate",
    ///         KeyPassphrase = "passw0rd",
    ///         KeySize = 3072,
    ///         Principals = new[]
    ///         {
    ///             "seamus",
    ///         },
    ///         PublicKeyMethod = "local",
    ///         Template = "Sample SSH CA",
    ///         ValidHours = 24,
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [VenafiResourceType("venafi:index/sshCertificate:SshCertificate")]
    public partial class SshCertificate : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The issued SSH certificate.
        /// </summary>
        [Output("certificate")]
        public Output<string> Certificate { get; private set; } = null!;

        /// <summary>
        /// Indicates whether the SSH certificate is for client or server authentication.
        /// </summary>
        [Output("certificateType")]
        public Output<string> CertificateType { get; private set; } = null!;

        /// <summary>
        /// A list of one or more valid IP or CIDR destination hosts where the certificate will authenticate.
        /// </summary>
        [Output("destinationAddresses")]
        public Output<ImmutableArray<string>> DestinationAddresses { get; private set; } = null!;

        /// <summary>
        /// A list of key-value pairs that contain certificate extensions from the CA template for client certificates. Allowed values (case-sensitive): *permit-X11-forwarding, permit-agent-forwarding, permit-port-forwarding, permit-pty, permit-user-rc*
        /// </summary>
        [Output("extensions")]
        public Output<ImmutableArray<string>> Extensions { get; private set; } = null!;

        /// <summary>
        /// The DN of the policy folder where the SSH certificate object will be created.
        /// </summary>
        [Output("folder")]
        public Output<string?> Folder { get; private set; } = null!;

        /// <summary>
        /// A command to run after successful login.
        /// </summary>
        [Output("forceCommand")]
        public Output<string?> ForceCommand { get; private set; } = null!;

        /// <summary>
        /// The identifier of the requested SSH certificate.
        /// </summary>
        [Output("keyId")]
        public Output<string> KeyId { get; private set; } = null!;

        /// <summary>
        /// Passphrase for encrypting the private key.
        /// </summary>
        [Output("keyPassphrase")]
        public Output<string?> KeyPassphrase { get; private set; } = null!;

        /// <summary>
        /// Number of bits to use when creating a key pair. (e.g. 3072)
        /// </summary>
        [Output("keySize")]
        public Output<int?> KeySize { get; private set; } = null!;

        /// <summary>
        /// The friendly name of the SSH certificate object. When not specified the `key_id` is used for the friendly name. If the object already exists the old certificate is archived and the CA issues a new certificate.
        /// </summary>
        [Output("objectName")]
        public Output<string?> ObjectName { get; private set; } = null!;

        /// <summary>
        /// [DEPRECATED] - (Optional, set of strings) Use "principals" instead. A list of user names for whom the requested certificate will be valid.
        /// </summary>
        [Output("principal")]
        public Output<ImmutableArray<string>> Principal { get; private set; } = null!;

        /// <summary>
        /// A list of user names for whom the requested certificate will be valid.
        /// </summary>
        [Output("principals")]
        public Output<ImmutableArray<string>> Principals { get; private set; } = null!;

        /// <summary>
        /// The private key for the SSH certificate if generated by Venafi.
        /// </summary>
        [Output("privateKey")]
        public Output<string> PrivateKey { get; private set; } = null!;

        /// <summary>
        /// The OpenSSH formatted public key that will be used to generate the SSH certificate.
        /// </summary>
        [Output("publicKey")]
        public Output<string?> PublicKey { get; private set; } = null!;

        /// <summary>
        /// The SHA256 fingerprint of the SSH certificate's public key.
        /// </summary>
        [Output("publicKeyFingerprint")]
        public Output<string> PublicKeyFingerprint { get; private set; } = null!;

        /// <summary>
        /// Specifies whether the public key will be "local" (default), "file" or "service" generated.
        /// </summary>
        [Output("publicKeyMethod")]
        public Output<string?> PublicKeyMethod { get; private set; } = null!;

        /// <summary>
        /// The serial number of the SSH certificate.
        /// </summary>
        [Output("serial")]
        public Output<string> Serial { get; private set; } = null!;

        /// <summary>
        /// The SHA256 fingerprint of the CA that signed the SSH certificate.
        /// </summary>
        [Output("signingCa")]
        public Output<string> SigningCa { get; private set; } = null!;

        /// <summary>
        /// A list of one or more valid IP or CIDR addresses that can use the SSH certificate.
        /// </summary>
        [Output("sourceAddresses")]
        public Output<ImmutableArray<string>> SourceAddresses { get; private set; } = null!;

        /// <summary>
        /// The SSH certificate issuing template.
        /// </summary>
        [Output("template")]
        public Output<string> Template { get; private set; } = null!;

        /// <summary>
        /// The date the SSH certificate was issued.
        /// </summary>
        [Output("validFrom")]
        public Output<string> ValidFrom { get; private set; } = null!;

        /// <summary>
        /// Desired number of hours for which the certificate will be valid.
        /// </summary>
        [Output("validHours")]
        public Output<int?> ValidHours { get; private set; } = null!;

        /// <summary>
        /// The date the SSH certificate will expire.
        /// </summary>
        [Output("validTo")]
        public Output<string> ValidTo { get; private set; } = null!;

        /// <summary>
        /// Specifies whether the private key will use Windows/DOS style line breaks.
        /// </summary>
        [Output("windows")]
        public Output<bool?> Windows { get; private set; } = null!;


        /// <summary>
        /// Create a SshCertificate resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SshCertificate(string name, SshCertificateArgs args, CustomResourceOptions? options = null)
            : base("venafi:index/sshCertificate:SshCertificate", name, args ?? new SshCertificateArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SshCertificate(string name, Input<string> id, SshCertificateState? state = null, CustomResourceOptions? options = null)
            : base("venafi:index/sshCertificate:SshCertificate", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "keyPassphrase",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing SshCertificate resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SshCertificate Get(string name, Input<string> id, SshCertificateState? state = null, CustomResourceOptions? options = null)
        {
            return new SshCertificate(name, id, state, options);
        }
    }

    public sealed class SshCertificateArgs : global::Pulumi.ResourceArgs
    {
        [Input("destinationAddresses")]
        private InputList<string>? _destinationAddresses;

        /// <summary>
        /// A list of one or more valid IP or CIDR destination hosts where the certificate will authenticate.
        /// </summary>
        public InputList<string> DestinationAddresses
        {
            get => _destinationAddresses ?? (_destinationAddresses = new InputList<string>());
            set => _destinationAddresses = value;
        }

        [Input("extensions")]
        private InputList<string>? _extensions;

        /// <summary>
        /// A list of key-value pairs that contain certificate extensions from the CA template for client certificates. Allowed values (case-sensitive): *permit-X11-forwarding, permit-agent-forwarding, permit-port-forwarding, permit-pty, permit-user-rc*
        /// </summary>
        public InputList<string> Extensions
        {
            get => _extensions ?? (_extensions = new InputList<string>());
            set => _extensions = value;
        }

        /// <summary>
        /// The DN of the policy folder where the SSH certificate object will be created.
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

        /// <summary>
        /// A command to run after successful login.
        /// </summary>
        [Input("forceCommand")]
        public Input<string>? ForceCommand { get; set; }

        /// <summary>
        /// The identifier of the requested SSH certificate.
        /// </summary>
        [Input("keyId", required: true)]
        public Input<string> KeyId { get; set; } = null!;

        [Input("keyPassphrase")]
        private Input<string>? _keyPassphrase;

        /// <summary>
        /// Passphrase for encrypting the private key.
        /// </summary>
        public Input<string>? KeyPassphrase
        {
            get => _keyPassphrase;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _keyPassphrase = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Number of bits to use when creating a key pair. (e.g. 3072)
        /// </summary>
        [Input("keySize")]
        public Input<int>? KeySize { get; set; }

        /// <summary>
        /// The friendly name of the SSH certificate object. When not specified the `key_id` is used for the friendly name. If the object already exists the old certificate is archived and the CA issues a new certificate.
        /// </summary>
        [Input("objectName")]
        public Input<string>? ObjectName { get; set; }

        [Input("principal")]
        private InputList<string>? _principal;

        /// <summary>
        /// [DEPRECATED] - (Optional, set of strings) Use "principals" instead. A list of user names for whom the requested certificate will be valid.
        /// </summary>
        [Obsolete(@"This will be removed in the future. Use ""principals"" instead")]
        public InputList<string> Principal
        {
            get => _principal ?? (_principal = new InputList<string>());
            set => _principal = value;
        }

        [Input("principals")]
        private InputList<string>? _principals;

        /// <summary>
        /// A list of user names for whom the requested certificate will be valid.
        /// </summary>
        public InputList<string> Principals
        {
            get => _principals ?? (_principals = new InputList<string>());
            set => _principals = value;
        }

        /// <summary>
        /// The OpenSSH formatted public key that will be used to generate the SSH certificate.
        /// </summary>
        [Input("publicKey")]
        public Input<string>? PublicKey { get; set; }

        /// <summary>
        /// Specifies whether the public key will be "local" (default), "file" or "service" generated.
        /// </summary>
        [Input("publicKeyMethod")]
        public Input<string>? PublicKeyMethod { get; set; }

        [Input("sourceAddresses")]
        private InputList<string>? _sourceAddresses;

        /// <summary>
        /// A list of one or more valid IP or CIDR addresses that can use the SSH certificate.
        /// </summary>
        public InputList<string> SourceAddresses
        {
            get => _sourceAddresses ?? (_sourceAddresses = new InputList<string>());
            set => _sourceAddresses = value;
        }

        /// <summary>
        /// The SSH certificate issuing template.
        /// </summary>
        [Input("template", required: true)]
        public Input<string> Template { get; set; } = null!;

        /// <summary>
        /// Desired number of hours for which the certificate will be valid.
        /// </summary>
        [Input("validHours")]
        public Input<int>? ValidHours { get; set; }

        /// <summary>
        /// Specifies whether the private key will use Windows/DOS style line breaks.
        /// </summary>
        [Input("windows")]
        public Input<bool>? Windows { get; set; }

        public SshCertificateArgs()
        {
        }
        public static new SshCertificateArgs Empty => new SshCertificateArgs();
    }

    public sealed class SshCertificateState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The issued SSH certificate.
        /// </summary>
        [Input("certificate")]
        public Input<string>? Certificate { get; set; }

        /// <summary>
        /// Indicates whether the SSH certificate is for client or server authentication.
        /// </summary>
        [Input("certificateType")]
        public Input<string>? CertificateType { get; set; }

        [Input("destinationAddresses")]
        private InputList<string>? _destinationAddresses;

        /// <summary>
        /// A list of one or more valid IP or CIDR destination hosts where the certificate will authenticate.
        /// </summary>
        public InputList<string> DestinationAddresses
        {
            get => _destinationAddresses ?? (_destinationAddresses = new InputList<string>());
            set => _destinationAddresses = value;
        }

        [Input("extensions")]
        private InputList<string>? _extensions;

        /// <summary>
        /// A list of key-value pairs that contain certificate extensions from the CA template for client certificates. Allowed values (case-sensitive): *permit-X11-forwarding, permit-agent-forwarding, permit-port-forwarding, permit-pty, permit-user-rc*
        /// </summary>
        public InputList<string> Extensions
        {
            get => _extensions ?? (_extensions = new InputList<string>());
            set => _extensions = value;
        }

        /// <summary>
        /// The DN of the policy folder where the SSH certificate object will be created.
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

        /// <summary>
        /// A command to run after successful login.
        /// </summary>
        [Input("forceCommand")]
        public Input<string>? ForceCommand { get; set; }

        /// <summary>
        /// The identifier of the requested SSH certificate.
        /// </summary>
        [Input("keyId")]
        public Input<string>? KeyId { get; set; }

        [Input("keyPassphrase")]
        private Input<string>? _keyPassphrase;

        /// <summary>
        /// Passphrase for encrypting the private key.
        /// </summary>
        public Input<string>? KeyPassphrase
        {
            get => _keyPassphrase;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _keyPassphrase = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Number of bits to use when creating a key pair. (e.g. 3072)
        /// </summary>
        [Input("keySize")]
        public Input<int>? KeySize { get; set; }

        /// <summary>
        /// The friendly name of the SSH certificate object. When not specified the `key_id` is used for the friendly name. If the object already exists the old certificate is archived and the CA issues a new certificate.
        /// </summary>
        [Input("objectName")]
        public Input<string>? ObjectName { get; set; }

        [Input("principal")]
        private InputList<string>? _principal;

        /// <summary>
        /// [DEPRECATED] - (Optional, set of strings) Use "principals" instead. A list of user names for whom the requested certificate will be valid.
        /// </summary>
        [Obsolete(@"This will be removed in the future. Use ""principals"" instead")]
        public InputList<string> Principal
        {
            get => _principal ?? (_principal = new InputList<string>());
            set => _principal = value;
        }

        [Input("principals")]
        private InputList<string>? _principals;

        /// <summary>
        /// A list of user names for whom the requested certificate will be valid.
        /// </summary>
        public InputList<string> Principals
        {
            get => _principals ?? (_principals = new InputList<string>());
            set => _principals = value;
        }

        /// <summary>
        /// The private key for the SSH certificate if generated by Venafi.
        /// </summary>
        [Input("privateKey")]
        public Input<string>? PrivateKey { get; set; }

        /// <summary>
        /// The OpenSSH formatted public key that will be used to generate the SSH certificate.
        /// </summary>
        [Input("publicKey")]
        public Input<string>? PublicKey { get; set; }

        /// <summary>
        /// The SHA256 fingerprint of the SSH certificate's public key.
        /// </summary>
        [Input("publicKeyFingerprint")]
        public Input<string>? PublicKeyFingerprint { get; set; }

        /// <summary>
        /// Specifies whether the public key will be "local" (default), "file" or "service" generated.
        /// </summary>
        [Input("publicKeyMethod")]
        public Input<string>? PublicKeyMethod { get; set; }

        /// <summary>
        /// The serial number of the SSH certificate.
        /// </summary>
        [Input("serial")]
        public Input<string>? Serial { get; set; }

        /// <summary>
        /// The SHA256 fingerprint of the CA that signed the SSH certificate.
        /// </summary>
        [Input("signingCa")]
        public Input<string>? SigningCa { get; set; }

        [Input("sourceAddresses")]
        private InputList<string>? _sourceAddresses;

        /// <summary>
        /// A list of one or more valid IP or CIDR addresses that can use the SSH certificate.
        /// </summary>
        public InputList<string> SourceAddresses
        {
            get => _sourceAddresses ?? (_sourceAddresses = new InputList<string>());
            set => _sourceAddresses = value;
        }

        /// <summary>
        /// The SSH certificate issuing template.
        /// </summary>
        [Input("template")]
        public Input<string>? Template { get; set; }

        /// <summary>
        /// The date the SSH certificate was issued.
        /// </summary>
        [Input("validFrom")]
        public Input<string>? ValidFrom { get; set; }

        /// <summary>
        /// Desired number of hours for which the certificate will be valid.
        /// </summary>
        [Input("validHours")]
        public Input<int>? ValidHours { get; set; }

        /// <summary>
        /// The date the SSH certificate will expire.
        /// </summary>
        [Input("validTo")]
        public Input<string>? ValidTo { get; set; }

        /// <summary>
        /// Specifies whether the private key will use Windows/DOS style line breaks.
        /// </summary>
        [Input("windows")]
        public Input<bool>? Windows { get; set; }

        public SshCertificateState()
        {
        }
        public static new SshCertificateState Empty => new SshCertificateState();
    }
}
