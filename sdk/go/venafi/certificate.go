// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package venafi

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-venafi/sdk/go/venafi/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type Certificate struct {
	pulumi.CustomResourceState

	// Key encryption algorithm, either RSA or ECDSA. Defaults to `RSA`.
	Algorithm pulumi.StringPtrOutput `pulumi:"algorithm"`
	// The X509 certificate in PEM format.
	Certificate   pulumi.StringOutput `pulumi:"certificate"`
	CertificateDn pulumi.StringOutput `pulumi:"certificateDn"`
	// ID of the issued certificate
	CertificateId pulumi.StringOutput `pulumi:"certificateId"`
	// The trust chain of X509 certificate authority certificates in PEM format concatenated together.
	Chain pulumi.StringOutput `pulumi:"chain"`
	// The common name of the certificate.
	CommonName pulumi.StringOutput `pulumi:"commonName"`
	// Country of the certificate (C)
	Country pulumi.StringPtrOutput `pulumi:"country"`
	// Whether key-pair generation will be `local` or `service` generated. Default is
	// `local`.
	CsrOrigin pulumi.StringPtrOutput `pulumi:"csrOrigin"`
	CsrPem    pulumi.StringOutput    `pulumi:"csrPem"`
	// Collection of Custom Field name-value pairs to assign to the certificate.
	CustomFields pulumi.StringMapOutput `pulumi:"customFields"`
	// ECDSA curve to use when generating a key
	EcdsaCurve pulumi.StringPtrOutput `pulumi:"ecdsaCurve"`
	// Number of hours before certificate expiry to request a new certificate.
	// Defaults to `168`.
	ExpirationWindow pulumi.IntPtrOutput `pulumi:"expirationWindow"`
	// Used with `validDays` to indicate the target issuer when using Trust Protection
	// Platform. Relevant values are: `DigiCert`, `Entrust`, and `Microsoft`.
	IssuerHint pulumi.StringPtrOutput `pulumi:"issuerHint"`
	// The password used to encrypt the private key.
	KeyPassword pulumi.StringPtrOutput `pulumi:"keyPassword"`
	// Locality/City of the certificate (L)
	Locality pulumi.StringPtrOutput `pulumi:"locality"`
	// Use to specify a name for the new certificate object that will be created and placed
	// in a policy. Only valid for Trust Protection Platform.
	Nickname pulumi.StringPtrOutput `pulumi:"nickname"`
	// Organization of the certificate (O)
	Organization pulumi.StringPtrOutput `pulumi:"organization"`
	// List of Organizational Units of the certificate (OU)
	OrganizationalUnits pulumi.StringArrayOutput `pulumi:"organizationalUnits"`
	// A base64-encoded PKCS#12 keystore secured by the `keyPassword`. Useful when working with resources like
	// azure key_vault_certificate.
	Pkcs12 pulumi.StringOutput `pulumi:"pkcs12"`
	// The private key in PEM format.
	PrivateKeyPem pulumi.StringOutput `pulumi:"privateKeyPem"`
	// Indicates the certificate should be reissued. This means the resource will destroyed and recreated
	RenewRequired pulumi.BoolPtrOutput `pulumi:"renewRequired"`
	// Number of bits to use when generating an RSA key. Applies when algorithm is `RSA`.
	// Defaults to `2048`.
	RsaBits pulumi.IntPtrOutput `pulumi:"rsaBits"`
	// List of DNS names to use as alternative subjects of the certificate.
	SanDns pulumi.StringArrayOutput `pulumi:"sanDns"`
	// List of email addresses to use as alternative subjects of the certificate.
	SanEmails pulumi.StringArrayOutput `pulumi:"sanEmails"`
	// List of IP addresses to use as alternative subjects of the certificate.
	SanIps pulumi.StringArrayOutput `pulumi:"sanIps"`
	// List of Uniform Resource Identifiers (URIs) to use as alternative subjects of
	// the certificate.
	SanUris pulumi.StringArrayOutput `pulumi:"sanUris"`
	// State of the certificate (S)
	State pulumi.StringPtrOutput `pulumi:"state"`
	// Desired number of days for which the new certificate will be valid.
	ValidDays pulumi.IntPtrOutput `pulumi:"validDays"`
}

// NewCertificate registers a new resource with the given unique name, arguments, and options.
func NewCertificate(ctx *pulumi.Context,
	name string, args *CertificateArgs, opts ...pulumi.ResourceOption) (*Certificate, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CommonName == nil {
		return nil, errors.New("invalid value for required argument 'CommonName'")
	}
	if args.KeyPassword != nil {
		args.KeyPassword = pulumi.ToSecret(args.KeyPassword).(pulumi.StringPtrInput)
	}
	if args.PrivateKeyPem != nil {
		args.PrivateKeyPem = pulumi.ToSecret(args.PrivateKeyPem).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"keyPassword",
		"privateKeyPem",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Certificate
	err := ctx.RegisterResource("venafi:index/certificate:Certificate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCertificate gets an existing Certificate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCertificate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CertificateState, opts ...pulumi.ResourceOption) (*Certificate, error) {
	var resource Certificate
	err := ctx.ReadResource("venafi:index/certificate:Certificate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Certificate resources.
type certificateState struct {
	// Key encryption algorithm, either RSA or ECDSA. Defaults to `RSA`.
	Algorithm *string `pulumi:"algorithm"`
	// The X509 certificate in PEM format.
	Certificate   *string `pulumi:"certificate"`
	CertificateDn *string `pulumi:"certificateDn"`
	// ID of the issued certificate
	CertificateId *string `pulumi:"certificateId"`
	// The trust chain of X509 certificate authority certificates in PEM format concatenated together.
	Chain *string `pulumi:"chain"`
	// The common name of the certificate.
	CommonName *string `pulumi:"commonName"`
	// Country of the certificate (C)
	Country *string `pulumi:"country"`
	// Whether key-pair generation will be `local` or `service` generated. Default is
	// `local`.
	CsrOrigin *string `pulumi:"csrOrigin"`
	CsrPem    *string `pulumi:"csrPem"`
	// Collection of Custom Field name-value pairs to assign to the certificate.
	CustomFields map[string]string `pulumi:"customFields"`
	// ECDSA curve to use when generating a key
	EcdsaCurve *string `pulumi:"ecdsaCurve"`
	// Number of hours before certificate expiry to request a new certificate.
	// Defaults to `168`.
	ExpirationWindow *int `pulumi:"expirationWindow"`
	// Used with `validDays` to indicate the target issuer when using Trust Protection
	// Platform. Relevant values are: `DigiCert`, `Entrust`, and `Microsoft`.
	IssuerHint *string `pulumi:"issuerHint"`
	// The password used to encrypt the private key.
	KeyPassword *string `pulumi:"keyPassword"`
	// Locality/City of the certificate (L)
	Locality *string `pulumi:"locality"`
	// Use to specify a name for the new certificate object that will be created and placed
	// in a policy. Only valid for Trust Protection Platform.
	Nickname *string `pulumi:"nickname"`
	// Organization of the certificate (O)
	Organization *string `pulumi:"organization"`
	// List of Organizational Units of the certificate (OU)
	OrganizationalUnits []string `pulumi:"organizationalUnits"`
	// A base64-encoded PKCS#12 keystore secured by the `keyPassword`. Useful when working with resources like
	// azure key_vault_certificate.
	Pkcs12 *string `pulumi:"pkcs12"`
	// The private key in PEM format.
	PrivateKeyPem *string `pulumi:"privateKeyPem"`
	// Indicates the certificate should be reissued. This means the resource will destroyed and recreated
	RenewRequired *bool `pulumi:"renewRequired"`
	// Number of bits to use when generating an RSA key. Applies when algorithm is `RSA`.
	// Defaults to `2048`.
	RsaBits *int `pulumi:"rsaBits"`
	// List of DNS names to use as alternative subjects of the certificate.
	SanDns []string `pulumi:"sanDns"`
	// List of email addresses to use as alternative subjects of the certificate.
	SanEmails []string `pulumi:"sanEmails"`
	// List of IP addresses to use as alternative subjects of the certificate.
	SanIps []string `pulumi:"sanIps"`
	// List of Uniform Resource Identifiers (URIs) to use as alternative subjects of
	// the certificate.
	SanUris []string `pulumi:"sanUris"`
	// State of the certificate (S)
	State *string `pulumi:"state"`
	// Desired number of days for which the new certificate will be valid.
	ValidDays *int `pulumi:"validDays"`
}

type CertificateState struct {
	// Key encryption algorithm, either RSA or ECDSA. Defaults to `RSA`.
	Algorithm pulumi.StringPtrInput
	// The X509 certificate in PEM format.
	Certificate   pulumi.StringPtrInput
	CertificateDn pulumi.StringPtrInput
	// ID of the issued certificate
	CertificateId pulumi.StringPtrInput
	// The trust chain of X509 certificate authority certificates in PEM format concatenated together.
	Chain pulumi.StringPtrInput
	// The common name of the certificate.
	CommonName pulumi.StringPtrInput
	// Country of the certificate (C)
	Country pulumi.StringPtrInput
	// Whether key-pair generation will be `local` or `service` generated. Default is
	// `local`.
	CsrOrigin pulumi.StringPtrInput
	CsrPem    pulumi.StringPtrInput
	// Collection of Custom Field name-value pairs to assign to the certificate.
	CustomFields pulumi.StringMapInput
	// ECDSA curve to use when generating a key
	EcdsaCurve pulumi.StringPtrInput
	// Number of hours before certificate expiry to request a new certificate.
	// Defaults to `168`.
	ExpirationWindow pulumi.IntPtrInput
	// Used with `validDays` to indicate the target issuer when using Trust Protection
	// Platform. Relevant values are: `DigiCert`, `Entrust`, and `Microsoft`.
	IssuerHint pulumi.StringPtrInput
	// The password used to encrypt the private key.
	KeyPassword pulumi.StringPtrInput
	// Locality/City of the certificate (L)
	Locality pulumi.StringPtrInput
	// Use to specify a name for the new certificate object that will be created and placed
	// in a policy. Only valid for Trust Protection Platform.
	Nickname pulumi.StringPtrInput
	// Organization of the certificate (O)
	Organization pulumi.StringPtrInput
	// List of Organizational Units of the certificate (OU)
	OrganizationalUnits pulumi.StringArrayInput
	// A base64-encoded PKCS#12 keystore secured by the `keyPassword`. Useful when working with resources like
	// azure key_vault_certificate.
	Pkcs12 pulumi.StringPtrInput
	// The private key in PEM format.
	PrivateKeyPem pulumi.StringPtrInput
	// Indicates the certificate should be reissued. This means the resource will destroyed and recreated
	RenewRequired pulumi.BoolPtrInput
	// Number of bits to use when generating an RSA key. Applies when algorithm is `RSA`.
	// Defaults to `2048`.
	RsaBits pulumi.IntPtrInput
	// List of DNS names to use as alternative subjects of the certificate.
	SanDns pulumi.StringArrayInput
	// List of email addresses to use as alternative subjects of the certificate.
	SanEmails pulumi.StringArrayInput
	// List of IP addresses to use as alternative subjects of the certificate.
	SanIps pulumi.StringArrayInput
	// List of Uniform Resource Identifiers (URIs) to use as alternative subjects of
	// the certificate.
	SanUris pulumi.StringArrayInput
	// State of the certificate (S)
	State pulumi.StringPtrInput
	// Desired number of days for which the new certificate will be valid.
	ValidDays pulumi.IntPtrInput
}

func (CertificateState) ElementType() reflect.Type {
	return reflect.TypeOf((*certificateState)(nil)).Elem()
}

type certificateArgs struct {
	// Key encryption algorithm, either RSA or ECDSA. Defaults to `RSA`.
	Algorithm     *string `pulumi:"algorithm"`
	CertificateDn *string `pulumi:"certificateDn"`
	// The common name of the certificate.
	CommonName string `pulumi:"commonName"`
	// Country of the certificate (C)
	Country *string `pulumi:"country"`
	// Whether key-pair generation will be `local` or `service` generated. Default is
	// `local`.
	CsrOrigin *string `pulumi:"csrOrigin"`
	CsrPem    *string `pulumi:"csrPem"`
	// Collection of Custom Field name-value pairs to assign to the certificate.
	CustomFields map[string]string `pulumi:"customFields"`
	// ECDSA curve to use when generating a key
	EcdsaCurve *string `pulumi:"ecdsaCurve"`
	// Number of hours before certificate expiry to request a new certificate.
	// Defaults to `168`.
	ExpirationWindow *int `pulumi:"expirationWindow"`
	// Used with `validDays` to indicate the target issuer when using Trust Protection
	// Platform. Relevant values are: `DigiCert`, `Entrust`, and `Microsoft`.
	IssuerHint *string `pulumi:"issuerHint"`
	// The password used to encrypt the private key.
	KeyPassword *string `pulumi:"keyPassword"`
	// Locality/City of the certificate (L)
	Locality *string `pulumi:"locality"`
	// Use to specify a name for the new certificate object that will be created and placed
	// in a policy. Only valid for Trust Protection Platform.
	Nickname *string `pulumi:"nickname"`
	// Organization of the certificate (O)
	Organization *string `pulumi:"organization"`
	// List of Organizational Units of the certificate (OU)
	OrganizationalUnits []string `pulumi:"organizationalUnits"`
	// A base64-encoded PKCS#12 keystore secured by the `keyPassword`. Useful when working with resources like
	// azure key_vault_certificate.
	Pkcs12 *string `pulumi:"pkcs12"`
	// The private key in PEM format.
	PrivateKeyPem *string `pulumi:"privateKeyPem"`
	// Indicates the certificate should be reissued. This means the resource will destroyed and recreated
	RenewRequired *bool `pulumi:"renewRequired"`
	// Number of bits to use when generating an RSA key. Applies when algorithm is `RSA`.
	// Defaults to `2048`.
	RsaBits *int `pulumi:"rsaBits"`
	// List of DNS names to use as alternative subjects of the certificate.
	SanDns []string `pulumi:"sanDns"`
	// List of email addresses to use as alternative subjects of the certificate.
	SanEmails []string `pulumi:"sanEmails"`
	// List of IP addresses to use as alternative subjects of the certificate.
	SanIps []string `pulumi:"sanIps"`
	// List of Uniform Resource Identifiers (URIs) to use as alternative subjects of
	// the certificate.
	SanUris []string `pulumi:"sanUris"`
	// State of the certificate (S)
	State *string `pulumi:"state"`
	// Desired number of days for which the new certificate will be valid.
	ValidDays *int `pulumi:"validDays"`
}

// The set of arguments for constructing a Certificate resource.
type CertificateArgs struct {
	// Key encryption algorithm, either RSA or ECDSA. Defaults to `RSA`.
	Algorithm     pulumi.StringPtrInput
	CertificateDn pulumi.StringPtrInput
	// The common name of the certificate.
	CommonName pulumi.StringInput
	// Country of the certificate (C)
	Country pulumi.StringPtrInput
	// Whether key-pair generation will be `local` or `service` generated. Default is
	// `local`.
	CsrOrigin pulumi.StringPtrInput
	CsrPem    pulumi.StringPtrInput
	// Collection of Custom Field name-value pairs to assign to the certificate.
	CustomFields pulumi.StringMapInput
	// ECDSA curve to use when generating a key
	EcdsaCurve pulumi.StringPtrInput
	// Number of hours before certificate expiry to request a new certificate.
	// Defaults to `168`.
	ExpirationWindow pulumi.IntPtrInput
	// Used with `validDays` to indicate the target issuer when using Trust Protection
	// Platform. Relevant values are: `DigiCert`, `Entrust`, and `Microsoft`.
	IssuerHint pulumi.StringPtrInput
	// The password used to encrypt the private key.
	KeyPassword pulumi.StringPtrInput
	// Locality/City of the certificate (L)
	Locality pulumi.StringPtrInput
	// Use to specify a name for the new certificate object that will be created and placed
	// in a policy. Only valid for Trust Protection Platform.
	Nickname pulumi.StringPtrInput
	// Organization of the certificate (O)
	Organization pulumi.StringPtrInput
	// List of Organizational Units of the certificate (OU)
	OrganizationalUnits pulumi.StringArrayInput
	// A base64-encoded PKCS#12 keystore secured by the `keyPassword`. Useful when working with resources like
	// azure key_vault_certificate.
	Pkcs12 pulumi.StringPtrInput
	// The private key in PEM format.
	PrivateKeyPem pulumi.StringPtrInput
	// Indicates the certificate should be reissued. This means the resource will destroyed and recreated
	RenewRequired pulumi.BoolPtrInput
	// Number of bits to use when generating an RSA key. Applies when algorithm is `RSA`.
	// Defaults to `2048`.
	RsaBits pulumi.IntPtrInput
	// List of DNS names to use as alternative subjects of the certificate.
	SanDns pulumi.StringArrayInput
	// List of email addresses to use as alternative subjects of the certificate.
	SanEmails pulumi.StringArrayInput
	// List of IP addresses to use as alternative subjects of the certificate.
	SanIps pulumi.StringArrayInput
	// List of Uniform Resource Identifiers (URIs) to use as alternative subjects of
	// the certificate.
	SanUris pulumi.StringArrayInput
	// State of the certificate (S)
	State pulumi.StringPtrInput
	// Desired number of days for which the new certificate will be valid.
	ValidDays pulumi.IntPtrInput
}

func (CertificateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*certificateArgs)(nil)).Elem()
}

type CertificateInput interface {
	pulumi.Input

	ToCertificateOutput() CertificateOutput
	ToCertificateOutputWithContext(ctx context.Context) CertificateOutput
}

func (*Certificate) ElementType() reflect.Type {
	return reflect.TypeOf((**Certificate)(nil)).Elem()
}

func (i *Certificate) ToCertificateOutput() CertificateOutput {
	return i.ToCertificateOutputWithContext(context.Background())
}

func (i *Certificate) ToCertificateOutputWithContext(ctx context.Context) CertificateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CertificateOutput)
}

// CertificateArrayInput is an input type that accepts CertificateArray and CertificateArrayOutput values.
// You can construct a concrete instance of `CertificateArrayInput` via:
//
//	CertificateArray{ CertificateArgs{...} }
type CertificateArrayInput interface {
	pulumi.Input

	ToCertificateArrayOutput() CertificateArrayOutput
	ToCertificateArrayOutputWithContext(context.Context) CertificateArrayOutput
}

type CertificateArray []CertificateInput

func (CertificateArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Certificate)(nil)).Elem()
}

func (i CertificateArray) ToCertificateArrayOutput() CertificateArrayOutput {
	return i.ToCertificateArrayOutputWithContext(context.Background())
}

func (i CertificateArray) ToCertificateArrayOutputWithContext(ctx context.Context) CertificateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CertificateArrayOutput)
}

// CertificateMapInput is an input type that accepts CertificateMap and CertificateMapOutput values.
// You can construct a concrete instance of `CertificateMapInput` via:
//
//	CertificateMap{ "key": CertificateArgs{...} }
type CertificateMapInput interface {
	pulumi.Input

	ToCertificateMapOutput() CertificateMapOutput
	ToCertificateMapOutputWithContext(context.Context) CertificateMapOutput
}

type CertificateMap map[string]CertificateInput

func (CertificateMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Certificate)(nil)).Elem()
}

func (i CertificateMap) ToCertificateMapOutput() CertificateMapOutput {
	return i.ToCertificateMapOutputWithContext(context.Background())
}

func (i CertificateMap) ToCertificateMapOutputWithContext(ctx context.Context) CertificateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CertificateMapOutput)
}

type CertificateOutput struct{ *pulumi.OutputState }

func (CertificateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Certificate)(nil)).Elem()
}

func (o CertificateOutput) ToCertificateOutput() CertificateOutput {
	return o
}

func (o CertificateOutput) ToCertificateOutputWithContext(ctx context.Context) CertificateOutput {
	return o
}

// Key encryption algorithm, either RSA or ECDSA. Defaults to `RSA`.
func (o CertificateOutput) Algorithm() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringPtrOutput { return v.Algorithm }).(pulumi.StringPtrOutput)
}

// The X509 certificate in PEM format.
func (o CertificateOutput) Certificate() pulumi.StringOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringOutput { return v.Certificate }).(pulumi.StringOutput)
}

func (o CertificateOutput) CertificateDn() pulumi.StringOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringOutput { return v.CertificateDn }).(pulumi.StringOutput)
}

// ID of the issued certificate
func (o CertificateOutput) CertificateId() pulumi.StringOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringOutput { return v.CertificateId }).(pulumi.StringOutput)
}

// The trust chain of X509 certificate authority certificates in PEM format concatenated together.
func (o CertificateOutput) Chain() pulumi.StringOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringOutput { return v.Chain }).(pulumi.StringOutput)
}

// The common name of the certificate.
func (o CertificateOutput) CommonName() pulumi.StringOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringOutput { return v.CommonName }).(pulumi.StringOutput)
}

// Country of the certificate (C)
func (o CertificateOutput) Country() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringPtrOutput { return v.Country }).(pulumi.StringPtrOutput)
}

// Whether key-pair generation will be `local` or `service` generated. Default is
// `local`.
func (o CertificateOutput) CsrOrigin() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringPtrOutput { return v.CsrOrigin }).(pulumi.StringPtrOutput)
}

func (o CertificateOutput) CsrPem() pulumi.StringOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringOutput { return v.CsrPem }).(pulumi.StringOutput)
}

// Collection of Custom Field name-value pairs to assign to the certificate.
func (o CertificateOutput) CustomFields() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringMapOutput { return v.CustomFields }).(pulumi.StringMapOutput)
}

// ECDSA curve to use when generating a key
func (o CertificateOutput) EcdsaCurve() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringPtrOutput { return v.EcdsaCurve }).(pulumi.StringPtrOutput)
}

// Number of hours before certificate expiry to request a new certificate.
// Defaults to `168`.
func (o CertificateOutput) ExpirationWindow() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Certificate) pulumi.IntPtrOutput { return v.ExpirationWindow }).(pulumi.IntPtrOutput)
}

// Used with `validDays` to indicate the target issuer when using Trust Protection
// Platform. Relevant values are: `DigiCert`, `Entrust`, and `Microsoft`.
func (o CertificateOutput) IssuerHint() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringPtrOutput { return v.IssuerHint }).(pulumi.StringPtrOutput)
}

// The password used to encrypt the private key.
func (o CertificateOutput) KeyPassword() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringPtrOutput { return v.KeyPassword }).(pulumi.StringPtrOutput)
}

// Locality/City of the certificate (L)
func (o CertificateOutput) Locality() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringPtrOutput { return v.Locality }).(pulumi.StringPtrOutput)
}

// Use to specify a name for the new certificate object that will be created and placed
// in a policy. Only valid for Trust Protection Platform.
func (o CertificateOutput) Nickname() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringPtrOutput { return v.Nickname }).(pulumi.StringPtrOutput)
}

// Organization of the certificate (O)
func (o CertificateOutput) Organization() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringPtrOutput { return v.Organization }).(pulumi.StringPtrOutput)
}

// List of Organizational Units of the certificate (OU)
func (o CertificateOutput) OrganizationalUnits() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringArrayOutput { return v.OrganizationalUnits }).(pulumi.StringArrayOutput)
}

// A base64-encoded PKCS#12 keystore secured by the `keyPassword`. Useful when working with resources like
// azure key_vault_certificate.
func (o CertificateOutput) Pkcs12() pulumi.StringOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringOutput { return v.Pkcs12 }).(pulumi.StringOutput)
}

// The private key in PEM format.
func (o CertificateOutput) PrivateKeyPem() pulumi.StringOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringOutput { return v.PrivateKeyPem }).(pulumi.StringOutput)
}

// Indicates the certificate should be reissued. This means the resource will destroyed and recreated
func (o CertificateOutput) RenewRequired() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Certificate) pulumi.BoolPtrOutput { return v.RenewRequired }).(pulumi.BoolPtrOutput)
}

// Number of bits to use when generating an RSA key. Applies when algorithm is `RSA`.
// Defaults to `2048`.
func (o CertificateOutput) RsaBits() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Certificate) pulumi.IntPtrOutput { return v.RsaBits }).(pulumi.IntPtrOutput)
}

// List of DNS names to use as alternative subjects of the certificate.
func (o CertificateOutput) SanDns() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringArrayOutput { return v.SanDns }).(pulumi.StringArrayOutput)
}

// List of email addresses to use as alternative subjects of the certificate.
func (o CertificateOutput) SanEmails() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringArrayOutput { return v.SanEmails }).(pulumi.StringArrayOutput)
}

// List of IP addresses to use as alternative subjects of the certificate.
func (o CertificateOutput) SanIps() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringArrayOutput { return v.SanIps }).(pulumi.StringArrayOutput)
}

// List of Uniform Resource Identifiers (URIs) to use as alternative subjects of
// the certificate.
func (o CertificateOutput) SanUris() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringArrayOutput { return v.SanUris }).(pulumi.StringArrayOutput)
}

// State of the certificate (S)
func (o CertificateOutput) State() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringPtrOutput { return v.State }).(pulumi.StringPtrOutput)
}

// Desired number of days for which the new certificate will be valid.
func (o CertificateOutput) ValidDays() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Certificate) pulumi.IntPtrOutput { return v.ValidDays }).(pulumi.IntPtrOutput)
}

type CertificateArrayOutput struct{ *pulumi.OutputState }

func (CertificateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Certificate)(nil)).Elem()
}

func (o CertificateArrayOutput) ToCertificateArrayOutput() CertificateArrayOutput {
	return o
}

func (o CertificateArrayOutput) ToCertificateArrayOutputWithContext(ctx context.Context) CertificateArrayOutput {
	return o
}

func (o CertificateArrayOutput) Index(i pulumi.IntInput) CertificateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Certificate {
		return vs[0].([]*Certificate)[vs[1].(int)]
	}).(CertificateOutput)
}

type CertificateMapOutput struct{ *pulumi.OutputState }

func (CertificateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Certificate)(nil)).Elem()
}

func (o CertificateMapOutput) ToCertificateMapOutput() CertificateMapOutput {
	return o
}

func (o CertificateMapOutput) ToCertificateMapOutputWithContext(ctx context.Context) CertificateMapOutput {
	return o
}

func (o CertificateMapOutput) MapIndex(k pulumi.StringInput) CertificateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Certificate {
		return vs[0].(map[string]*Certificate)[vs[1].(string)]
	}).(CertificateOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CertificateInput)(nil)).Elem(), &Certificate{})
	pulumi.RegisterInputType(reflect.TypeOf((*CertificateArrayInput)(nil)).Elem(), CertificateArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CertificateMapInput)(nil)).Elem(), CertificateMap{})
	pulumi.RegisterOutputType(CertificateOutput{})
	pulumi.RegisterOutputType(CertificateArrayOutput{})
	pulumi.RegisterOutputType(CertificateMapOutput{})
}
