// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package venafi

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides access to request and retrieve SSH certificates from *Venafi Trust Protection Platform*.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-venafi/sdk/go/venafi"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := venafi.NewSshCertificate(ctx, "sshCert", &venafi.SshCertificateArgs{
// 			KeyId:         pulumi.String("my-first-ssh-certificate"),
// 			KeyPassphrase: pulumi.String("passw0rd"),
// 			KeySize:       pulumi.Int(3072),
// 			Principals: pulumi.StringArray{
// 				pulumi.String("seamus"),
// 			},
// 			PublicKeyMethod: pulumi.String("local"),
// 			Template:        pulumi.String("Sample SSH CA"),
// 			ValidHours:      pulumi.Int(24),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type SshCertificate struct {
	pulumi.CustomResourceState

	// The issued SSH certificate.
	Certificate pulumi.StringOutput `pulumi:"certificate"`
	// Indicates whether the SSH certificate is for client or server authentication.
	CertificateType pulumi.StringOutput `pulumi:"certificateType"`
	// A list of one or more valid IP or CIDR destination hosts where the certificate will authenticate.
	DestinationAddresses pulumi.StringArrayOutput `pulumi:"destinationAddresses"`
	// A list of key-value pairs that contain certificate extensions from the CA template for client certificates. Allowed values (case-sensitive): *permit-X11-forwarding, permit-agent-forwarding, permit-port-forwarding, permit-pty, permit-user-rc*
	Extensions pulumi.StringArrayOutput `pulumi:"extensions"`
	// The DN of the policy folder where the SSH certificate object will be created.
	Folder pulumi.StringPtrOutput `pulumi:"folder"`
	// A command to run after successful login.
	ForceCommand pulumi.StringPtrOutput `pulumi:"forceCommand"`
	// The identifier of the requested SSH certificate.
	KeyId pulumi.StringOutput `pulumi:"keyId"`
	// Passphrase for encrypting the private key.
	KeyPassphrase pulumi.StringPtrOutput `pulumi:"keyPassphrase"`
	// Number of bits to use when creating a key pair. (e.g. 3072)
	KeySize pulumi.IntPtrOutput `pulumi:"keySize"`
	// The friendly name of the SSH certificate object. When not specified the `keyId` is used for the friendly name. If the object already exists the old certificate is archived and the CA issues a new certificate.
	ObjectName pulumi.StringPtrOutput `pulumi:"objectName"`
	// A list of user names for whom the requested certificate will be valid.
	Principals pulumi.StringArrayOutput `pulumi:"principals"`
	// The private key for the SSH certificate if generated by Venafi.
	PrivateKey pulumi.StringOutput `pulumi:"privateKey"`
	// The OpenSSH formatted public key that will be used to generate the SSH certificate.
	PublicKey pulumi.StringPtrOutput `pulumi:"publicKey"`
	// The SHA256 fingerprint of the SSH certificate's public key.
	PublicKeyFingerprint pulumi.StringOutput `pulumi:"publicKeyFingerprint"`
	// Specifies whether the public key will be "local" (default), "file" or "service" generated.
	PublicKeyMethod pulumi.StringPtrOutput `pulumi:"publicKeyMethod"`
	// The serial number of the SSH certificate.
	Serial pulumi.StringOutput `pulumi:"serial"`
	// The SHA256 fingerprint of the CA that signed the SSH certificate.
	SigningCa pulumi.StringOutput `pulumi:"signingCa"`
	// A list of one or more valid IP or CIDR addresses that can use the SSH certificate.
	SourceAddresses pulumi.StringArrayOutput `pulumi:"sourceAddresses"`
	// The SSH certificate issuing template.
	Template pulumi.StringOutput `pulumi:"template"`
	// The date the SSH certificate was issued.
	ValidFrom pulumi.StringOutput `pulumi:"validFrom"`
	// Desired number of hours for which the certificate will be valid.
	ValidHours pulumi.IntPtrOutput `pulumi:"validHours"`
	// The date the SSH certificate will expire.
	ValidTo pulumi.StringOutput `pulumi:"validTo"`
	// Specifies whether the private key will use Windows/DOS style line breaks.
	Windows pulumi.BoolPtrOutput `pulumi:"windows"`
}

// NewSshCertificate registers a new resource with the given unique name, arguments, and options.
func NewSshCertificate(ctx *pulumi.Context,
	name string, args *SshCertificateArgs, opts ...pulumi.ResourceOption) (*SshCertificate, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.KeyId == nil {
		return nil, errors.New("invalid value for required argument 'KeyId'")
	}
	if args.Template == nil {
		return nil, errors.New("invalid value for required argument 'Template'")
	}
	var resource SshCertificate
	err := ctx.RegisterResource("venafi:index/sshCertificate:SshCertificate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSshCertificate gets an existing SshCertificate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSshCertificate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SshCertificateState, opts ...pulumi.ResourceOption) (*SshCertificate, error) {
	var resource SshCertificate
	err := ctx.ReadResource("venafi:index/sshCertificate:SshCertificate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SshCertificate resources.
type sshCertificateState struct {
	// The issued SSH certificate.
	Certificate *string `pulumi:"certificate"`
	// Indicates whether the SSH certificate is for client or server authentication.
	CertificateType *string `pulumi:"certificateType"`
	// A list of one or more valid IP or CIDR destination hosts where the certificate will authenticate.
	DestinationAddresses []string `pulumi:"destinationAddresses"`
	// A list of key-value pairs that contain certificate extensions from the CA template for client certificates. Allowed values (case-sensitive): *permit-X11-forwarding, permit-agent-forwarding, permit-port-forwarding, permit-pty, permit-user-rc*
	Extensions []string `pulumi:"extensions"`
	// The DN of the policy folder where the SSH certificate object will be created.
	Folder *string `pulumi:"folder"`
	// A command to run after successful login.
	ForceCommand *string `pulumi:"forceCommand"`
	// The identifier of the requested SSH certificate.
	KeyId *string `pulumi:"keyId"`
	// Passphrase for encrypting the private key.
	KeyPassphrase *string `pulumi:"keyPassphrase"`
	// Number of bits to use when creating a key pair. (e.g. 3072)
	KeySize *int `pulumi:"keySize"`
	// The friendly name of the SSH certificate object. When not specified the `keyId` is used for the friendly name. If the object already exists the old certificate is archived and the CA issues a new certificate.
	ObjectName *string `pulumi:"objectName"`
	// A list of user names for whom the requested certificate will be valid.
	Principals []string `pulumi:"principals"`
	// The private key for the SSH certificate if generated by Venafi.
	PrivateKey *string `pulumi:"privateKey"`
	// The OpenSSH formatted public key that will be used to generate the SSH certificate.
	PublicKey *string `pulumi:"publicKey"`
	// The SHA256 fingerprint of the SSH certificate's public key.
	PublicKeyFingerprint *string `pulumi:"publicKeyFingerprint"`
	// Specifies whether the public key will be "local" (default), "file" or "service" generated.
	PublicKeyMethod *string `pulumi:"publicKeyMethod"`
	// The serial number of the SSH certificate.
	Serial *string `pulumi:"serial"`
	// The SHA256 fingerprint of the CA that signed the SSH certificate.
	SigningCa *string `pulumi:"signingCa"`
	// A list of one or more valid IP or CIDR addresses that can use the SSH certificate.
	SourceAddresses []string `pulumi:"sourceAddresses"`
	// The SSH certificate issuing template.
	Template *string `pulumi:"template"`
	// The date the SSH certificate was issued.
	ValidFrom *string `pulumi:"validFrom"`
	// Desired number of hours for which the certificate will be valid.
	ValidHours *int `pulumi:"validHours"`
	// The date the SSH certificate will expire.
	ValidTo *string `pulumi:"validTo"`
	// Specifies whether the private key will use Windows/DOS style line breaks.
	Windows *bool `pulumi:"windows"`
}

type SshCertificateState struct {
	// The issued SSH certificate.
	Certificate pulumi.StringPtrInput
	// Indicates whether the SSH certificate is for client or server authentication.
	CertificateType pulumi.StringPtrInput
	// A list of one or more valid IP or CIDR destination hosts where the certificate will authenticate.
	DestinationAddresses pulumi.StringArrayInput
	// A list of key-value pairs that contain certificate extensions from the CA template for client certificates. Allowed values (case-sensitive): *permit-X11-forwarding, permit-agent-forwarding, permit-port-forwarding, permit-pty, permit-user-rc*
	Extensions pulumi.StringArrayInput
	// The DN of the policy folder where the SSH certificate object will be created.
	Folder pulumi.StringPtrInput
	// A command to run after successful login.
	ForceCommand pulumi.StringPtrInput
	// The identifier of the requested SSH certificate.
	KeyId pulumi.StringPtrInput
	// Passphrase for encrypting the private key.
	KeyPassphrase pulumi.StringPtrInput
	// Number of bits to use when creating a key pair. (e.g. 3072)
	KeySize pulumi.IntPtrInput
	// The friendly name of the SSH certificate object. When not specified the `keyId` is used for the friendly name. If the object already exists the old certificate is archived and the CA issues a new certificate.
	ObjectName pulumi.StringPtrInput
	// A list of user names for whom the requested certificate will be valid.
	Principals pulumi.StringArrayInput
	// The private key for the SSH certificate if generated by Venafi.
	PrivateKey pulumi.StringPtrInput
	// The OpenSSH formatted public key that will be used to generate the SSH certificate.
	PublicKey pulumi.StringPtrInput
	// The SHA256 fingerprint of the SSH certificate's public key.
	PublicKeyFingerprint pulumi.StringPtrInput
	// Specifies whether the public key will be "local" (default), "file" or "service" generated.
	PublicKeyMethod pulumi.StringPtrInput
	// The serial number of the SSH certificate.
	Serial pulumi.StringPtrInput
	// The SHA256 fingerprint of the CA that signed the SSH certificate.
	SigningCa pulumi.StringPtrInput
	// A list of one or more valid IP or CIDR addresses that can use the SSH certificate.
	SourceAddresses pulumi.StringArrayInput
	// The SSH certificate issuing template.
	Template pulumi.StringPtrInput
	// The date the SSH certificate was issued.
	ValidFrom pulumi.StringPtrInput
	// Desired number of hours for which the certificate will be valid.
	ValidHours pulumi.IntPtrInput
	// The date the SSH certificate will expire.
	ValidTo pulumi.StringPtrInput
	// Specifies whether the private key will use Windows/DOS style line breaks.
	Windows pulumi.BoolPtrInput
}

func (SshCertificateState) ElementType() reflect.Type {
	return reflect.TypeOf((*sshCertificateState)(nil)).Elem()
}

type sshCertificateArgs struct {
	// A list of one or more valid IP or CIDR destination hosts where the certificate will authenticate.
	DestinationAddresses []string `pulumi:"destinationAddresses"`
	// A list of key-value pairs that contain certificate extensions from the CA template for client certificates. Allowed values (case-sensitive): *permit-X11-forwarding, permit-agent-forwarding, permit-port-forwarding, permit-pty, permit-user-rc*
	Extensions []string `pulumi:"extensions"`
	// The DN of the policy folder where the SSH certificate object will be created.
	Folder *string `pulumi:"folder"`
	// A command to run after successful login.
	ForceCommand *string `pulumi:"forceCommand"`
	// The identifier of the requested SSH certificate.
	KeyId string `pulumi:"keyId"`
	// Passphrase for encrypting the private key.
	KeyPassphrase *string `pulumi:"keyPassphrase"`
	// Number of bits to use when creating a key pair. (e.g. 3072)
	KeySize *int `pulumi:"keySize"`
	// The friendly name of the SSH certificate object. When not specified the `keyId` is used for the friendly name. If the object already exists the old certificate is archived and the CA issues a new certificate.
	ObjectName *string `pulumi:"objectName"`
	// A list of user names for whom the requested certificate will be valid.
	Principals []string `pulumi:"principals"`
	// The OpenSSH formatted public key that will be used to generate the SSH certificate.
	PublicKey *string `pulumi:"publicKey"`
	// Specifies whether the public key will be "local" (default), "file" or "service" generated.
	PublicKeyMethod *string `pulumi:"publicKeyMethod"`
	// A list of one or more valid IP or CIDR addresses that can use the SSH certificate.
	SourceAddresses []string `pulumi:"sourceAddresses"`
	// The SSH certificate issuing template.
	Template string `pulumi:"template"`
	// Desired number of hours for which the certificate will be valid.
	ValidHours *int `pulumi:"validHours"`
	// Specifies whether the private key will use Windows/DOS style line breaks.
	Windows *bool `pulumi:"windows"`
}

// The set of arguments for constructing a SshCertificate resource.
type SshCertificateArgs struct {
	// A list of one or more valid IP or CIDR destination hosts where the certificate will authenticate.
	DestinationAddresses pulumi.StringArrayInput
	// A list of key-value pairs that contain certificate extensions from the CA template for client certificates. Allowed values (case-sensitive): *permit-X11-forwarding, permit-agent-forwarding, permit-port-forwarding, permit-pty, permit-user-rc*
	Extensions pulumi.StringArrayInput
	// The DN of the policy folder where the SSH certificate object will be created.
	Folder pulumi.StringPtrInput
	// A command to run after successful login.
	ForceCommand pulumi.StringPtrInput
	// The identifier of the requested SSH certificate.
	KeyId pulumi.StringInput
	// Passphrase for encrypting the private key.
	KeyPassphrase pulumi.StringPtrInput
	// Number of bits to use when creating a key pair. (e.g. 3072)
	KeySize pulumi.IntPtrInput
	// The friendly name of the SSH certificate object. When not specified the `keyId` is used for the friendly name. If the object already exists the old certificate is archived and the CA issues a new certificate.
	ObjectName pulumi.StringPtrInput
	// A list of user names for whom the requested certificate will be valid.
	Principals pulumi.StringArrayInput
	// The OpenSSH formatted public key that will be used to generate the SSH certificate.
	PublicKey pulumi.StringPtrInput
	// Specifies whether the public key will be "local" (default), "file" or "service" generated.
	PublicKeyMethod pulumi.StringPtrInput
	// A list of one or more valid IP or CIDR addresses that can use the SSH certificate.
	SourceAddresses pulumi.StringArrayInput
	// The SSH certificate issuing template.
	Template pulumi.StringInput
	// Desired number of hours for which the certificate will be valid.
	ValidHours pulumi.IntPtrInput
	// Specifies whether the private key will use Windows/DOS style line breaks.
	Windows pulumi.BoolPtrInput
}

func (SshCertificateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*sshCertificateArgs)(nil)).Elem()
}

type SshCertificateInput interface {
	pulumi.Input

	ToSshCertificateOutput() SshCertificateOutput
	ToSshCertificateOutputWithContext(ctx context.Context) SshCertificateOutput
}

func (*SshCertificate) ElementType() reflect.Type {
	return reflect.TypeOf((**SshCertificate)(nil)).Elem()
}

func (i *SshCertificate) ToSshCertificateOutput() SshCertificateOutput {
	return i.ToSshCertificateOutputWithContext(context.Background())
}

func (i *SshCertificate) ToSshCertificateOutputWithContext(ctx context.Context) SshCertificateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SshCertificateOutput)
}

// SshCertificateArrayInput is an input type that accepts SshCertificateArray and SshCertificateArrayOutput values.
// You can construct a concrete instance of `SshCertificateArrayInput` via:
//
//          SshCertificateArray{ SshCertificateArgs{...} }
type SshCertificateArrayInput interface {
	pulumi.Input

	ToSshCertificateArrayOutput() SshCertificateArrayOutput
	ToSshCertificateArrayOutputWithContext(context.Context) SshCertificateArrayOutput
}

type SshCertificateArray []SshCertificateInput

func (SshCertificateArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SshCertificate)(nil)).Elem()
}

func (i SshCertificateArray) ToSshCertificateArrayOutput() SshCertificateArrayOutput {
	return i.ToSshCertificateArrayOutputWithContext(context.Background())
}

func (i SshCertificateArray) ToSshCertificateArrayOutputWithContext(ctx context.Context) SshCertificateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SshCertificateArrayOutput)
}

// SshCertificateMapInput is an input type that accepts SshCertificateMap and SshCertificateMapOutput values.
// You can construct a concrete instance of `SshCertificateMapInput` via:
//
//          SshCertificateMap{ "key": SshCertificateArgs{...} }
type SshCertificateMapInput interface {
	pulumi.Input

	ToSshCertificateMapOutput() SshCertificateMapOutput
	ToSshCertificateMapOutputWithContext(context.Context) SshCertificateMapOutput
}

type SshCertificateMap map[string]SshCertificateInput

func (SshCertificateMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SshCertificate)(nil)).Elem()
}

func (i SshCertificateMap) ToSshCertificateMapOutput() SshCertificateMapOutput {
	return i.ToSshCertificateMapOutputWithContext(context.Background())
}

func (i SshCertificateMap) ToSshCertificateMapOutputWithContext(ctx context.Context) SshCertificateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SshCertificateMapOutput)
}

type SshCertificateOutput struct{ *pulumi.OutputState }

func (SshCertificateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SshCertificate)(nil)).Elem()
}

func (o SshCertificateOutput) ToSshCertificateOutput() SshCertificateOutput {
	return o
}

func (o SshCertificateOutput) ToSshCertificateOutputWithContext(ctx context.Context) SshCertificateOutput {
	return o
}

type SshCertificateArrayOutput struct{ *pulumi.OutputState }

func (SshCertificateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SshCertificate)(nil)).Elem()
}

func (o SshCertificateArrayOutput) ToSshCertificateArrayOutput() SshCertificateArrayOutput {
	return o
}

func (o SshCertificateArrayOutput) ToSshCertificateArrayOutputWithContext(ctx context.Context) SshCertificateArrayOutput {
	return o
}

func (o SshCertificateArrayOutput) Index(i pulumi.IntInput) SshCertificateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SshCertificate {
		return vs[0].([]*SshCertificate)[vs[1].(int)]
	}).(SshCertificateOutput)
}

type SshCertificateMapOutput struct{ *pulumi.OutputState }

func (SshCertificateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SshCertificate)(nil)).Elem()
}

func (o SshCertificateMapOutput) ToSshCertificateMapOutput() SshCertificateMapOutput {
	return o
}

func (o SshCertificateMapOutput) ToSshCertificateMapOutputWithContext(ctx context.Context) SshCertificateMapOutput {
	return o
}

func (o SshCertificateMapOutput) MapIndex(k pulumi.StringInput) SshCertificateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SshCertificate {
		return vs[0].(map[string]*SshCertificate)[vs[1].(string)]
	}).(SshCertificateOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SshCertificateInput)(nil)).Elem(), &SshCertificate{})
	pulumi.RegisterInputType(reflect.TypeOf((*SshCertificateArrayInput)(nil)).Elem(), SshCertificateArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SshCertificateMapInput)(nil)).Elem(), SshCertificateMap{})
	pulumi.RegisterOutputType(SshCertificateOutput{})
	pulumi.RegisterOutputType(SshCertificateArrayOutput{})
	pulumi.RegisterOutputType(SshCertificateMapOutput{})
}
