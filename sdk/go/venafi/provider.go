// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package venafi

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// The provider type for the venafi package. By default, resources use package-wide configuration
// settings, however an explicit `Provider` instance may be created and passed during resource
// construction to achieve fine-grained programmatic control over provider settings. See the
// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
type Provider struct {
	pulumi.ProviderResourceState
}

// NewProvider registers a new resource with the given unique name, arguments, and options.
func NewProvider(ctx *pulumi.Context,
	name string, args *ProviderArgs, opts ...pulumi.ResourceOption) (*Provider, error) {
	if args == nil {
		args = &ProviderArgs{}
	}

	var resource Provider
	err := ctx.RegisterResource("pulumi:providers:venafi", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

type providerArgs struct {
	// Access token for TPP, user should use this for authentication
	AccessToken *string `pulumi:"accessToken"`
	// API key for Venafi Cloud. Example: 142231b7-cvb0-412e-886b-6aeght0bc93d
	ApiKey *string `pulumi:"apiKey"`
	// When set to true, the resulting certificate will be issued by an ephemeral, no trust CA rather than enrolling using
	// Venafi Cloud or Platform. Useful for development and testing.
	DevMode *bool `pulumi:"devMode"`
	// Password for WebSDK user. Example: password
	//
	// Deprecated: , please use access_token instead
	TppPassword *string `pulumi:"tppPassword"`
	// WebSDK user for Venafi Platform. Example: admin
	//
	// Deprecated: , please use access_token instead
	TppUsername *string `pulumi:"tppUsername"`
	// Use to specify a PEM-formatted file that contains certificates to be trust anchors for all communications with the
	// Venafi Web Service. Example: trust_bundle = "${file("chain.pem")}"
	TrustBundle *string `pulumi:"trustBundle"`
	// The Venafi Web Service URL.. Example: https://tpp.venafi.example/vedsdk
	Url *string `pulumi:"url"`
	// DN of the Venafi Platform policy folder or name of the Venafi Cloud zone. Example for Platform: testpolicy\\vault
	// Example for Venafi Cloud: Default
	Zone *string `pulumi:"zone"`
}

// The set of arguments for constructing a Provider resource.
type ProviderArgs struct {
	// Access token for TPP, user should use this for authentication
	AccessToken pulumi.StringPtrInput
	// API key for Venafi Cloud. Example: 142231b7-cvb0-412e-886b-6aeght0bc93d
	ApiKey pulumi.StringPtrInput
	// When set to true, the resulting certificate will be issued by an ephemeral, no trust CA rather than enrolling using
	// Venafi Cloud or Platform. Useful for development and testing.
	DevMode pulumi.BoolPtrInput
	// Password for WebSDK user. Example: password
	//
	// Deprecated: , please use access_token instead
	TppPassword pulumi.StringPtrInput
	// WebSDK user for Venafi Platform. Example: admin
	//
	// Deprecated: , please use access_token instead
	TppUsername pulumi.StringPtrInput
	// Use to specify a PEM-formatted file that contains certificates to be trust anchors for all communications with the
	// Venafi Web Service. Example: trust_bundle = "${file("chain.pem")}"
	TrustBundle pulumi.StringPtrInput
	// The Venafi Web Service URL.. Example: https://tpp.venafi.example/vedsdk
	Url pulumi.StringPtrInput
	// DN of the Venafi Platform policy folder or name of the Venafi Cloud zone. Example for Platform: testpolicy\\vault
	// Example for Venafi Cloud: Default
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
	return reflect.TypeOf((*Provider)(nil))
}

func (i *Provider) ToProviderOutput() ProviderOutput {
	return i.ToProviderOutputWithContext(context.Background())
}

func (i *Provider) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderOutput)
}

type ProviderOutput struct {
	*pulumi.OutputState
}

func (ProviderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Provider)(nil))
}

func (o ProviderOutput) ToProviderOutput() ProviderOutput {
	return o
}

func (o ProviderOutput) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(ProviderOutput{})
}
