// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package venafi

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-venafi/sdk/go/venafi/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The provider type for the venafi package. By default, resources use package-wide configuration
// settings, however an explicit `Provider` instance may be created and passed during resource
// construction to achieve fine-grained programmatic control over provider settings. See the
// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
type Provider struct {
	pulumi.ProviderResourceState

	// Access token for Venafi TLSPDC, user should use this for authentication
	AccessToken pulumi.StringPtrOutput `pulumi:"accessToken"`
	// API key for Venafi Control Plane. Example: 142231b7-cvb0-412e-886b-6aeght0bc93d
	ApiKey pulumi.StringPtrOutput `pulumi:"apiKey"`
	// application that will be using the token
	ClientId pulumi.StringPtrOutput `pulumi:"clientId"`
	// JWT of the identity provider associated to the Venafi Control Plane service account that is granting the access token
	ExternalJwt pulumi.StringPtrOutput `pulumi:"externalJwt"`
	// Filename of PKCS#12 keystore containing a client certificate, private key, and chain certificates to authenticate to
	// TLSPDC
	P12CertFilename pulumi.StringPtrOutput `pulumi:"p12CertFilename"`
	// Password for the PKCS#12 keystore declared in p12_cert
	P12CertPassword pulumi.StringPtrOutput `pulumi:"p12CertPassword"`
	// Endpoint URL to request new Venafi Control Plane access tokens
	TokenUrl pulumi.StringPtrOutput `pulumi:"tokenUrl"`
	// Password for WebSDK user. Example: password
	//
	// Deprecated: , please use accessToken instead
	TppPassword pulumi.StringPtrOutput `pulumi:"tppPassword"`
	// WebSDK user for Venafi TLSPDC. Example: admin
	//
	// Deprecated: , please use accessToken instead
	TppUsername pulumi.StringPtrOutput `pulumi:"tppUsername"`
	// Use to specify a PEM-formatted file that contains certificates to be trust anchors for all communications with the
	// Venafi Web Service. Example: trustBundle = "${file("chain.pem")}"
	TrustBundle pulumi.StringPtrOutput `pulumi:"trustBundle"`
	// The Venafi Platform URL. Example: https://tpp.venafi.example/vedsdk
	Url pulumi.StringPtrOutput `pulumi:"url"`
	// DN of the Venafi TLSPDC policy folder or name of the Venafi as a Service application plus issuing template alias.
	// Example for Platform: testPolicy\\vault Example for Venafi as a Service: myApp\\Default
	Zone pulumi.StringPtrOutput `pulumi:"zone"`
}

// NewProvider registers a new resource with the given unique name, arguments, and options.
func NewProvider(ctx *pulumi.Context,
	name string, args *ProviderArgs, opts ...pulumi.ResourceOption) (*Provider, error) {
	if args == nil {
		args = &ProviderArgs{}
	}

	if args.AccessToken != nil {
		args.AccessToken = pulumi.ToSecret(args.AccessToken).(pulumi.StringPtrInput)
	}
	if args.ApiKey != nil {
		args.ApiKey = pulumi.ToSecret(args.ApiKey).(pulumi.StringPtrInput)
	}
	if args.ExternalJwt != nil {
		args.ExternalJwt = pulumi.ToSecret(args.ExternalJwt).(pulumi.StringPtrInput)
	}
	if args.P12CertPassword != nil {
		args.P12CertPassword = pulumi.ToSecret(args.P12CertPassword).(pulumi.StringPtrInput)
	}
	if args.TokenUrl != nil {
		args.TokenUrl = pulumi.ToSecret(args.TokenUrl).(pulumi.StringPtrInput)
	}
	if args.TppPassword != nil {
		args.TppPassword = pulumi.ToSecret(args.TppPassword).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"accessToken",
		"apiKey",
		"externalJwt",
		"p12CertPassword",
		"tokenUrl",
		"tppPassword",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Provider
	err := ctx.RegisterResource("pulumi:providers:venafi", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

type providerArgs struct {
	// Access token for Venafi TLSPDC, user should use this for authentication
	AccessToken *string `pulumi:"accessToken"`
	// API key for Venafi Control Plane. Example: 142231b7-cvb0-412e-886b-6aeght0bc93d
	ApiKey *string `pulumi:"apiKey"`
	// application that will be using the token
	ClientId *string `pulumi:"clientId"`
	// When set to true, the resulting certificate will be issued by an ephemeral, no trust CA rather than enrolling using
	// Venafi as a Service or Trust Protection Platform. Useful for development and testing
	DevMode *bool `pulumi:"devMode"`
	// JWT of the identity provider associated to the Venafi Control Plane service account that is granting the access token
	ExternalJwt *string `pulumi:"externalJwt"`
	// Filename of PKCS#12 keystore containing a client certificate, private key, and chain certificates to authenticate to
	// TLSPDC
	P12CertFilename *string `pulumi:"p12CertFilename"`
	// Password for the PKCS#12 keystore declared in p12_cert
	P12CertPassword *string `pulumi:"p12CertPassword"`
	SkipRetirement  *bool   `pulumi:"skipRetirement"`
	// Endpoint URL to request new Venafi Control Plane access tokens
	TokenUrl *string `pulumi:"tokenUrl"`
	// Password for WebSDK user. Example: password
	//
	// Deprecated: , please use accessToken instead
	TppPassword *string `pulumi:"tppPassword"`
	// WebSDK user for Venafi TLSPDC. Example: admin
	//
	// Deprecated: , please use accessToken instead
	TppUsername *string `pulumi:"tppUsername"`
	// Use to specify a PEM-formatted file that contains certificates to be trust anchors for all communications with the
	// Venafi Web Service. Example: trustBundle = "${file("chain.pem")}"
	TrustBundle *string `pulumi:"trustBundle"`
	// The Venafi Platform URL. Example: https://tpp.venafi.example/vedsdk
	Url *string `pulumi:"url"`
	// DN of the Venafi TLSPDC policy folder or name of the Venafi as a Service application plus issuing template alias.
	// Example for Platform: testPolicy\\vault Example for Venafi as a Service: myApp\\Default
	Zone *string `pulumi:"zone"`
}

// The set of arguments for constructing a Provider resource.
type ProviderArgs struct {
	// Access token for Venafi TLSPDC, user should use this for authentication
	AccessToken pulumi.StringPtrInput
	// API key for Venafi Control Plane. Example: 142231b7-cvb0-412e-886b-6aeght0bc93d
	ApiKey pulumi.StringPtrInput
	// application that will be using the token
	ClientId pulumi.StringPtrInput
	// When set to true, the resulting certificate will be issued by an ephemeral, no trust CA rather than enrolling using
	// Venafi as a Service or Trust Protection Platform. Useful for development and testing
	DevMode pulumi.BoolPtrInput
	// JWT of the identity provider associated to the Venafi Control Plane service account that is granting the access token
	ExternalJwt pulumi.StringPtrInput
	// Filename of PKCS#12 keystore containing a client certificate, private key, and chain certificates to authenticate to
	// TLSPDC
	P12CertFilename pulumi.StringPtrInput
	// Password for the PKCS#12 keystore declared in p12_cert
	P12CertPassword pulumi.StringPtrInput
	SkipRetirement  pulumi.BoolPtrInput
	// Endpoint URL to request new Venafi Control Plane access tokens
	TokenUrl pulumi.StringPtrInput
	// Password for WebSDK user. Example: password
	//
	// Deprecated: , please use accessToken instead
	TppPassword pulumi.StringPtrInput
	// WebSDK user for Venafi TLSPDC. Example: admin
	//
	// Deprecated: , please use accessToken instead
	TppUsername pulumi.StringPtrInput
	// Use to specify a PEM-formatted file that contains certificates to be trust anchors for all communications with the
	// Venafi Web Service. Example: trustBundle = "${file("chain.pem")}"
	TrustBundle pulumi.StringPtrInput
	// The Venafi Platform URL. Example: https://tpp.venafi.example/vedsdk
	Url pulumi.StringPtrInput
	// DN of the Venafi TLSPDC policy folder or name of the Venafi as a Service application plus issuing template alias.
	// Example for Platform: testPolicy\\vault Example for Venafi as a Service: myApp\\Default
	Zone pulumi.StringPtrInput
}

func (ProviderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*providerArgs)(nil)).Elem()
}

type ProviderInput interface {
	pulumi.Input

	ToProviderOutput() ProviderOutput
	ToProviderOutputWithContext(ctx context.Context) ProviderOutput
}

func (*Provider) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (i *Provider) ToProviderOutput() ProviderOutput {
	return i.ToProviderOutputWithContext(context.Background())
}

func (i *Provider) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderOutput)
}

type ProviderOutput struct{ *pulumi.OutputState }

func (ProviderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (o ProviderOutput) ToProviderOutput() ProviderOutput {
	return o
}

func (o ProviderOutput) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return o
}

// Access token for Venafi TLSPDC, user should use this for authentication
func (o ProviderOutput) AccessToken() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.AccessToken }).(pulumi.StringPtrOutput)
}

// API key for Venafi Control Plane. Example: 142231b7-cvb0-412e-886b-6aeght0bc93d
func (o ProviderOutput) ApiKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.ApiKey }).(pulumi.StringPtrOutput)
}

// application that will be using the token
func (o ProviderOutput) ClientId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.ClientId }).(pulumi.StringPtrOutput)
}

// JWT of the identity provider associated to the Venafi Control Plane service account that is granting the access token
func (o ProviderOutput) ExternalJwt() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.ExternalJwt }).(pulumi.StringPtrOutput)
}

// Filename of PKCS#12 keystore containing a client certificate, private key, and chain certificates to authenticate to
// TLSPDC
func (o ProviderOutput) P12CertFilename() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.P12CertFilename }).(pulumi.StringPtrOutput)
}

// Password for the PKCS#12 keystore declared in p12_cert
func (o ProviderOutput) P12CertPassword() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.P12CertPassword }).(pulumi.StringPtrOutput)
}

// Endpoint URL to request new Venafi Control Plane access tokens
func (o ProviderOutput) TokenUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.TokenUrl }).(pulumi.StringPtrOutput)
}

// Password for WebSDK user. Example: password
//
// Deprecated: , please use accessToken instead
func (o ProviderOutput) TppPassword() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.TppPassword }).(pulumi.StringPtrOutput)
}

// WebSDK user for Venafi TLSPDC. Example: admin
//
// Deprecated: , please use accessToken instead
func (o ProviderOutput) TppUsername() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.TppUsername }).(pulumi.StringPtrOutput)
}

// Use to specify a PEM-formatted file that contains certificates to be trust anchors for all communications with the
// Venafi Web Service. Example: trustBundle = "${file("chain.pem")}"
func (o ProviderOutput) TrustBundle() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.TrustBundle }).(pulumi.StringPtrOutput)
}

// The Venafi Platform URL. Example: https://tpp.venafi.example/vedsdk
func (o ProviderOutput) Url() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Url }).(pulumi.StringPtrOutput)
}

// DN of the Venafi TLSPDC policy folder or name of the Venafi as a Service application plus issuing template alias.
// Example for Platform: testPolicy\\vault Example for Venafi as a Service: myApp\\Default
func (o ProviderOutput) Zone() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Zone }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProviderInput)(nil)).Elem(), &Provider{})
	pulumi.RegisterOutputType(ProviderOutput{})
}
