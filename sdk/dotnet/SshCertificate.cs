// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Venafi
{
    [VenafiResourceType("venafi:index/sshCertificate:SshCertificate")]
    public partial class SshCertificate : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The SSH Certificate
        /// </summary>
        [Output("certificate")]
        public Output<string> Certificate { get; private set; } = null!;

        /// <summary>
        /// Certificate type, server or client
        /// </summary>
        [Output("certificateType")]
        public Output<string> CertificateType { get; private set; } = null!;

        /// <summary>
        /// The address (FQDN/hostname/IP/CIDR) of the destination host where the certificate will be used to authenticate to
        /// </summary>
        [Output("destinationAddresses")]
        public Output<ImmutableArray<string>> DestinationAddresses { get; private set; } = null!;

        /// <summary>
        /// The requested certificate extensions.
        /// </summary>
        [Output("extensions")]
        public Output<ImmutableArray<string>> Extensions { get; private set; } = null!;

        /// <summary>
        /// The DN of the policy folder where the certificate object will be created
        /// </summary>
        [Output("folder")]
        public Output<string?> Folder { get; private set; } = null!;

        /// <summary>
        /// The requested force command.
        /// </summary>
        [Output("forceCommand")]
        public Output<string?> ForceCommand { get; private set; } = null!;

        /// <summary>
        /// The identifier of the requested certificate
        /// </summary>
        [Output("keyId")]
        public Output<string> KeyId { get; private set; } = null!;

        /// <summary>
        /// Passphrase for encrypting the private key
        /// </summary>
        [Output("keyPassphrase")]
        public Output<string?> KeyPassphrase { get; private set; } = null!;

        /// <summary>
        /// The key size bits, they will be used for creating keypair
        /// </summary>
        [Output("keySize")]
        public Output<int?> KeySize { get; private set; } = null!;

        /// <summary>
        /// The friendly name for the certificate object.
        /// </summary>
        [Output("objectName")]
        public Output<string?> ObjectName { get; private set; } = null!;

        /// <summary>
        /// The requested principals.
        /// </summary>
        [Output("principals")]
        public Output<ImmutableArray<string>> Principals { get; private set; } = null!;

        /// <summary>
        /// Private key
        /// </summary>
        [Output("privateKey")]
        public Output<string> PrivateKey { get; private set; } = null!;

        /// <summary>
        /// Public key that will be used to generate the certificate
        /// </summary>
        [Output("publicKey")]
        public Output<string?> PublicKey { get; private set; } = null!;

        /// <summary>
        /// Public key fingerprint SHA256
        /// </summary>
        [Output("publicKeyFingerprint")]
        public Output<string> PublicKeyFingerprint { get; private set; } = null!;

        /// <summary>
        /// If the public key will be: file provided or local, service generated
        /// </summary>
        [Output("publicKeyMethod")]
        public Output<string?> PublicKeyMethod { get; private set; } = null!;

        /// <summary>
        /// Serial number
        /// </summary>
        [Output("serial")]
        public Output<string> Serial { get; private set; } = null!;

        /// <summary>
        /// CA fingerprint SHA256
        /// </summary>
        [Output("signingCa")]
        public Output<string> SigningCa { get; private set; } = null!;

        /// <summary>
        /// The requested source addresses as list of IP/CIDR
        /// </summary>
        [Output("sourceAddresses")]
        public Output<ImmutableArray<string>> SourceAddresses { get; private set; } = null!;

        /// <summary>
        /// The certificate issuing template
        /// </summary>
        [Output("template")]
        public Output<string> Template { get; private set; } = null!;

        /// <summary>
        /// Valid from
        /// </summary>
        [Output("validFrom")]
        public Output<string> ValidFrom { get; private set; } = null!;

        /// <summary>
        /// How much time the requester wants to have the certificate valid, the format is hours
        /// </summary>
        [Output("validHours")]
        public Output<int?> ValidHours { get; private set; } = null!;

        /// <summary>
        /// Valid to
        /// </summary>
        [Output("validTo")]
        public Output<string> ValidTo { get; private set; } = null!;

        /// <summary>
        /// If the line endings of service's private key will end on MS windows format
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
        /// The address (FQDN/hostname/IP/CIDR) of the destination host where the certificate will be used to authenticate to
        /// </summary>
        public InputList<string> DestinationAddresses
        {
            get => _destinationAddresses ?? (_destinationAddresses = new InputList<string>());
            set => _destinationAddresses = value;
        }

        [Input("extensions")]
        private InputList<string>? _extensions;

        /// <summary>
        /// The requested certificate extensions.
        /// </summary>
        public InputList<string> Extensions
        {
            get => _extensions ?? (_extensions = new InputList<string>());
            set => _extensions = value;
        }

        /// <summary>
        /// The DN of the policy folder where the certificate object will be created
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

        /// <summary>
        /// The requested force command.
        /// </summary>
        [Input("forceCommand")]
        public Input<string>? ForceCommand { get; set; }

        /// <summary>
        /// The identifier of the requested certificate
        /// </summary>
        [Input("keyId", required: true)]
        public Input<string> KeyId { get; set; } = null!;

        [Input("keyPassphrase")]
        private Input<string>? _keyPassphrase;

        /// <summary>
        /// Passphrase for encrypting the private key
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
        /// The key size bits, they will be used for creating keypair
        /// </summary>
        [Input("keySize")]
        public Input<int>? KeySize { get; set; }

        /// <summary>
        /// The friendly name for the certificate object.
        /// </summary>
        [Input("objectName")]
        public Input<string>? ObjectName { get; set; }

        [Input("principals")]
        private InputList<string>? _principals;

        /// <summary>
        /// The requested principals.
        /// </summary>
        public InputList<string> Principals
        {
            get => _principals ?? (_principals = new InputList<string>());
            set => _principals = value;
        }

        /// <summary>
        /// Public key that will be used to generate the certificate
        /// </summary>
        [Input("publicKey")]
        public Input<string>? PublicKey { get; set; }

        /// <summary>
        /// If the public key will be: file provided or local, service generated
        /// </summary>
        [Input("publicKeyMethod")]
        public Input<string>? PublicKeyMethod { get; set; }

        [Input("sourceAddresses")]
        private InputList<string>? _sourceAddresses;

        /// <summary>
        /// The requested source addresses as list of IP/CIDR
        /// </summary>
        public InputList<string> SourceAddresses
        {
            get => _sourceAddresses ?? (_sourceAddresses = new InputList<string>());
            set => _sourceAddresses = value;
        }

        /// <summary>
        /// The certificate issuing template
        /// </summary>
        [Input("template", required: true)]
        public Input<string> Template { get; set; } = null!;

        /// <summary>
        /// How much time the requester wants to have the certificate valid, the format is hours
        /// </summary>
        [Input("validHours")]
        public Input<int>? ValidHours { get; set; }

        /// <summary>
        /// If the line endings of service's private key will end on MS windows format
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
        /// The SSH Certificate
        /// </summary>
        [Input("certificate")]
        public Input<string>? Certificate { get; set; }

        /// <summary>
        /// Certificate type, server or client
        /// </summary>
        [Input("certificateType")]
        public Input<string>? CertificateType { get; set; }

        [Input("destinationAddresses")]
        private InputList<string>? _destinationAddresses;

        /// <summary>
        /// The address (FQDN/hostname/IP/CIDR) of the destination host where the certificate will be used to authenticate to
        /// </summary>
        public InputList<string> DestinationAddresses
        {
            get => _destinationAddresses ?? (_destinationAddresses = new InputList<string>());
            set => _destinationAddresses = value;
        }

        [Input("extensions")]
        private InputList<string>? _extensions;

        /// <summary>
        /// The requested certificate extensions.
        /// </summary>
        public InputList<string> Extensions
        {
            get => _extensions ?? (_extensions = new InputList<string>());
            set => _extensions = value;
        }

        /// <summary>
        /// The DN of the policy folder where the certificate object will be created
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

        /// <summary>
        /// The requested force command.
        /// </summary>
        [Input("forceCommand")]
        public Input<string>? ForceCommand { get; set; }

        /// <summary>
        /// The identifier of the requested certificate
        /// </summary>
        [Input("keyId")]
        public Input<string>? KeyId { get; set; }

        [Input("keyPassphrase")]
        private Input<string>? _keyPassphrase;

        /// <summary>
        /// Passphrase for encrypting the private key
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
        /// The key size bits, they will be used for creating keypair
        /// </summary>
        [Input("keySize")]
        public Input<int>? KeySize { get; set; }

        /// <summary>
        /// The friendly name for the certificate object.
        /// </summary>
        [Input("objectName")]
        public Input<string>? ObjectName { get; set; }

        [Input("principals")]
        private InputList<string>? _principals;

        /// <summary>
        /// The requested principals.
        /// </summary>
        public InputList<string> Principals
        {
            get => _principals ?? (_principals = new InputList<string>());
            set => _principals = value;
        }

        /// <summary>
        /// Private key
        /// </summary>
        [Input("privateKey")]
        public Input<string>? PrivateKey { get; set; }

        /// <summary>
        /// Public key that will be used to generate the certificate
        /// </summary>
        [Input("publicKey")]
        public Input<string>? PublicKey { get; set; }

        /// <summary>
        /// Public key fingerprint SHA256
        /// </summary>
        [Input("publicKeyFingerprint")]
        public Input<string>? PublicKeyFingerprint { get; set; }

        /// <summary>
        /// If the public key will be: file provided or local, service generated
        /// </summary>
        [Input("publicKeyMethod")]
        public Input<string>? PublicKeyMethod { get; set; }

        /// <summary>
        /// Serial number
        /// </summary>
        [Input("serial")]
        public Input<string>? Serial { get; set; }

        /// <summary>
        /// CA fingerprint SHA256
        /// </summary>
        [Input("signingCa")]
        public Input<string>? SigningCa { get; set; }

        [Input("sourceAddresses")]
        private InputList<string>? _sourceAddresses;

        /// <summary>
        /// The requested source addresses as list of IP/CIDR
        /// </summary>
        public InputList<string> SourceAddresses
        {
            get => _sourceAddresses ?? (_sourceAddresses = new InputList<string>());
            set => _sourceAddresses = value;
        }

        /// <summary>
        /// The certificate issuing template
        /// </summary>
        [Input("template")]
        public Input<string>? Template { get; set; }

        /// <summary>
        /// Valid from
        /// </summary>
        [Input("validFrom")]
        public Input<string>? ValidFrom { get; set; }

        /// <summary>
        /// How much time the requester wants to have the certificate valid, the format is hours
        /// </summary>
        [Input("validHours")]
        public Input<int>? ValidHours { get; set; }

        /// <summary>
        /// Valid to
        /// </summary>
        [Input("validTo")]
        public Input<string>? ValidTo { get; set; }

        /// <summary>
        /// If the line endings of service's private key will end on MS windows format
        /// </summary>
        [Input("windows")]
        public Input<bool>? Windows { get; set; }

        public SshCertificateState()
        {
        }
        public static new SshCertificateState Empty => new SshCertificateState();
    }
}
