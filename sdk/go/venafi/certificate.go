// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package venafi

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides access to TLS key and certificate data enrolled using Venafi. This can be used to define a
// certificate.
//
// The `Certificate` resource handles certificate renewals as long as a
// `pulumi up` is run within the `expirationWindow` period. Keep in mind that the
// `expirationWindow` in the provider configuration needs to align with the renewal
// window of the issuing CA to achieve the desired result.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-venafi/sdk/go/venafi"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := venafi.NewCertificate(ctx, "webserver", &venafi.CertificateArgs{
// 			Algorithm:  pulumi.String("RSA"),
// 			CommonName: pulumi.String("web.venafi.example"),
// 			CustomFields: pulumi.StringMap{
// 				"Cost Center": pulumi.String("AB1234"),
// 				"Environment": pulumi.String("UAT|Staging"),
// 			},
// 			KeyPassword: pulumi.Any(_var.Pk_pass),
// 			RsaBits:     pulumi.Int(2048),
// 			SanDns: pulumi.StringArray{
// 				pulumi.String("web01.venafi.example"),
// 				pulumi.String("web02.venafi.example"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type Certificate struct {
	pulumi.CustomResourceState

	// Key encryption algorithm, either `RSA` or `ECDSA`.
	// Defaults to `RSA`.
	Algorithm pulumi.StringPtrOutput `pulumi:"algorithm"`
	// The X509 certificate in PEM format.
	Certificate   pulumi.StringOutput `pulumi:"certificate"`
	CertificateDn pulumi.StringOutput `pulumi:"certificateDn"`
	// The trust chain of X509 certificate authority certificates in PEM format
	// concatenated together.
	Chain pulumi.StringOutput `pulumi:"chain"`
	// The common name of the certificate.
	CommonName pulumi.StringOutput `pulumi:"commonName"`
	CsrPem     pulumi.StringOutput `pulumi:"csrPem"`
	// Collection of Custom Field name-value pairs to
	// assign to the certificate.
	CustomFields pulumi.StringMapOutput `pulumi:"customFields"`
	// ECDSA curve to use when generating a key
	EcdsaCurve pulumi.StringPtrOutput `pulumi:"ecdsaCurve"`
	// Number of hours before certificate expiry
	// to request a new certificate.
	ExpirationWindow pulumi.IntPtrOutput `pulumi:"expirationWindow"`
	// Used with validDays to indicate the target
	// issuer when using Trust Protection Platform.  Relevant values are: "DigiCert",
	// "Entrust", and "Microsoft".
	IssuerHint pulumi.StringPtrOutput `pulumi:"issuerHint"`
	// The password used to encrypt the private key.
	KeyPassword pulumi.StringPtrOutput `pulumi:"keyPassword"`
	// A base64-encoded PKCS#12 keystore secured by the `keyPassword`.
	Pkcs12 pulumi.StringOutput `pulumi:"pkcs12"`
	// The private key in PEM format.
	PrivateKeyPem pulumi.StringOutput `pulumi:"privateKeyPem"`
	// Number of bits to use when generating an RSA key.
	// Applies when `algorithm=RSA`.  Defaults to `2048`.
	RsaBits pulumi.IntPtrOutput `pulumi:"rsaBits"`
	// List of DNS names to use as alternative
	// subjects of the certificate.
	SanDns pulumi.StringArrayOutput `pulumi:"sanDns"`
	// List of email addresses to use as
	// alternative subjects of the certificate.
	SanEmails pulumi.StringArrayOutput `pulumi:"sanEmails"`
	// List of IP addresses to use as alternative
	// subjects of the certificate.
	SanIps pulumi.StringArrayOutput `pulumi:"sanIps"`
	// Desired number of days for which the new
	// certificate will be valid.
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
	// Key encryption algorithm, either `RSA` or `ECDSA`.
	// Defaults to `RSA`.
	Algorithm *string `pulumi:"algorithm"`
	// The X509 certificate in PEM format.
	Certificate   *string `pulumi:"certificate"`
	CertificateDn *string `pulumi:"certificateDn"`
	// The trust chain of X509 certificate authority certificates in PEM format
	// concatenated together.
	Chain *string `pulumi:"chain"`
	// The common name of the certificate.
	CommonName *string `pulumi:"commonName"`
	CsrPem     *string `pulumi:"csrPem"`
	// Collection of Custom Field name-value pairs to
	// assign to the certificate.
	CustomFields map[string]string `pulumi:"customFields"`
	// ECDSA curve to use when generating a key
	EcdsaCurve *string `pulumi:"ecdsaCurve"`
	// Number of hours before certificate expiry
	// to request a new certificate.
	ExpirationWindow *int `pulumi:"expirationWindow"`
	// Used with validDays to indicate the target
	// issuer when using Trust Protection Platform.  Relevant values are: "DigiCert",
	// "Entrust", and "Microsoft".
	IssuerHint *string `pulumi:"issuerHint"`
	// The password used to encrypt the private key.
	KeyPassword *string `pulumi:"keyPassword"`
	// A base64-encoded PKCS#12 keystore secured by the `keyPassword`.
	Pkcs12 *string `pulumi:"pkcs12"`
	// The private key in PEM format.
	PrivateKeyPem *string `pulumi:"privateKeyPem"`
	// Number of bits to use when generating an RSA key.
	// Applies when `algorithm=RSA`.  Defaults to `2048`.
	RsaBits *int `pulumi:"rsaBits"`
	// List of DNS names to use as alternative
	// subjects of the certificate.
	SanDns []string `pulumi:"sanDns"`
	// List of email addresses to use as
	// alternative subjects of the certificate.
	SanEmails []string `pulumi:"sanEmails"`
	// List of IP addresses to use as alternative
	// subjects of the certificate.
	SanIps []string `pulumi:"sanIps"`
	// Desired number of days for which the new
	// certificate will be valid.
	ValidDays *int `pulumi:"validDays"`
}

type CertificateState struct {
	// Key encryption algorithm, either `RSA` or `ECDSA`.
	// Defaults to `RSA`.
	Algorithm pulumi.StringPtrInput
	// The X509 certificate in PEM format.
	Certificate   pulumi.StringPtrInput
	CertificateDn pulumi.StringPtrInput
	// The trust chain of X509 certificate authority certificates in PEM format
	// concatenated together.
	Chain pulumi.StringPtrInput
	// The common name of the certificate.
	CommonName pulumi.StringPtrInput
	CsrPem     pulumi.StringPtrInput
	// Collection of Custom Field name-value pairs to
	// assign to the certificate.
	CustomFields pulumi.StringMapInput
	// ECDSA curve to use when generating a key
	EcdsaCurve pulumi.StringPtrInput
	// Number of hours before certificate expiry
	// to request a new certificate.
	ExpirationWindow pulumi.IntPtrInput
	// Used with validDays to indicate the target
	// issuer when using Trust Protection Platform.  Relevant values are: "DigiCert",
	// "Entrust", and "Microsoft".
	IssuerHint pulumi.StringPtrInput
	// The password used to encrypt the private key.
	KeyPassword pulumi.StringPtrInput
	// A base64-encoded PKCS#12 keystore secured by the `keyPassword`.
	Pkcs12 pulumi.StringPtrInput
	// The private key in PEM format.
	PrivateKeyPem pulumi.StringPtrInput
	// Number of bits to use when generating an RSA key.
	// Applies when `algorithm=RSA`.  Defaults to `2048`.
	RsaBits pulumi.IntPtrInput
	// List of DNS names to use as alternative
	// subjects of the certificate.
	SanDns pulumi.StringArrayInput
	// List of email addresses to use as
	// alternative subjects of the certificate.
	SanEmails pulumi.StringArrayInput
	// List of IP addresses to use as alternative
	// subjects of the certificate.
	SanIps pulumi.StringArrayInput
	// Desired number of days for which the new
	// certificate will be valid.
	ValidDays pulumi.IntPtrInput
}

func (CertificateState) ElementType() reflect.Type {
	return reflect.TypeOf((*certificateState)(nil)).Elem()
}

type certificateArgs struct {
	// Key encryption algorithm, either `RSA` or `ECDSA`.
	// Defaults to `RSA`.
	Algorithm     *string `pulumi:"algorithm"`
	CertificateDn *string `pulumi:"certificateDn"`
	// The common name of the certificate.
	CommonName string  `pulumi:"commonName"`
	CsrPem     *string `pulumi:"csrPem"`
	// Collection of Custom Field name-value pairs to
	// assign to the certificate.
	CustomFields map[string]string `pulumi:"customFields"`
	// ECDSA curve to use when generating a key
	EcdsaCurve *string `pulumi:"ecdsaCurve"`
	// Number of hours before certificate expiry
	// to request a new certificate.
	ExpirationWindow *int `pulumi:"expirationWindow"`
	// Used with validDays to indicate the target
	// issuer when using Trust Protection Platform.  Relevant values are: "DigiCert",
	// "Entrust", and "Microsoft".
	IssuerHint *string `pulumi:"issuerHint"`
	// The password used to encrypt the private key.
	KeyPassword *string `pulumi:"keyPassword"`
	// A base64-encoded PKCS#12 keystore secured by the `keyPassword`.
	Pkcs12 *string `pulumi:"pkcs12"`
	// The private key in PEM format.
	PrivateKeyPem *string `pulumi:"privateKeyPem"`
	// Number of bits to use when generating an RSA key.
	// Applies when `algorithm=RSA`.  Defaults to `2048`.
	RsaBits *int `pulumi:"rsaBits"`
	// List of DNS names to use as alternative
	// subjects of the certificate.
	SanDns []string `pulumi:"sanDns"`
	// List of email addresses to use as
	// alternative subjects of the certificate.
	SanEmails []string `pulumi:"sanEmails"`
	// List of IP addresses to use as alternative
	// subjects of the certificate.
	SanIps []string `pulumi:"sanIps"`
	// Desired number of days for which the new
	// certificate will be valid.
	ValidDays *int `pulumi:"validDays"`
}

// The set of arguments for constructing a Certificate resource.
type CertificateArgs struct {
	// Key encryption algorithm, either `RSA` or `ECDSA`.
	// Defaults to `RSA`.
	Algorithm     pulumi.StringPtrInput
	CertificateDn pulumi.StringPtrInput
	// The common name of the certificate.
	CommonName pulumi.StringInput
	CsrPem     pulumi.StringPtrInput
	// Collection of Custom Field name-value pairs to
	// assign to the certificate.
	CustomFields pulumi.StringMapInput
	// ECDSA curve to use when generating a key
	EcdsaCurve pulumi.StringPtrInput
	// Number of hours before certificate expiry
	// to request a new certificate.
	ExpirationWindow pulumi.IntPtrInput
	// Used with validDays to indicate the target
	// issuer when using Trust Protection Platform.  Relevant values are: "DigiCert",
	// "Entrust", and "Microsoft".
	IssuerHint pulumi.StringPtrInput
	// The password used to encrypt the private key.
	KeyPassword pulumi.StringPtrInput
	// A base64-encoded PKCS#12 keystore secured by the `keyPassword`.
	Pkcs12 pulumi.StringPtrInput
	// The private key in PEM format.
	PrivateKeyPem pulumi.StringPtrInput
	// Number of bits to use when generating an RSA key.
	// Applies when `algorithm=RSA`.  Defaults to `2048`.
	RsaBits pulumi.IntPtrInput
	// List of DNS names to use as alternative
	// subjects of the certificate.
	SanDns pulumi.StringArrayInput
	// List of email addresses to use as
	// alternative subjects of the certificate.
	SanEmails pulumi.StringArrayInput
	// List of IP addresses to use as alternative
	// subjects of the certificate.
	SanIps pulumi.StringArrayInput
	// Desired number of days for which the new
	// certificate will be valid.
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

func (Certificate) ElementType() reflect.Type {
	return reflect.TypeOf((*Certificate)(nil)).Elem()
}

func (i Certificate) ToCertificateOutput() CertificateOutput {
	return i.ToCertificateOutputWithContext(context.Background())
}

func (i Certificate) ToCertificateOutputWithContext(ctx context.Context) CertificateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CertificateOutput)
}

type CertificateOutput struct {
	*pulumi.OutputState
}

func (CertificateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*CertificateOutput)(nil)).Elem()
}

func (o CertificateOutput) ToCertificateOutput() CertificateOutput {
	return o
}

func (o CertificateOutput) ToCertificateOutputWithContext(ctx context.Context) CertificateOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(CertificateOutput{})
}
