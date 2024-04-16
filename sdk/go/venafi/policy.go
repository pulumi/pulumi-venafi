// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package venafi

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-venafi/sdk/go/venafi/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides access to read and write certificate policy in Venafi. This can be used to define a new policy (folder in
// *Trust Protection Platform*; application and issuing template in *Venafi Control Plane*).
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"os"
//
//	"github.com/pulumi/pulumi-venafi/sdk/go/venafi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func readFileOrPanic(path string) pulumi.StringPtrInput {
//		data, err := os.ReadFile(path)
//		if err != nil {
//			panic(err.Error())
//		}
//		return pulumi.String(string(data))
//	}
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := venafi.NewPolicy(ctx, "internalPolicy", &venafi.PolicyArgs{
//				Zone:                pulumi.String("My Business App\\Enterprise Trusted Certs"),
//				PolicySpecification: readFileOrPanic("/path-to/internal-policy.json"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// The `venafi_policy` resource supports the Terraform import method.
//
// When used, the `zone` and `policy_specification` resource arguments are not required since the zone is a required
//
// parameter of the import method and the policy specification is populated from the existing infrastructure. Policy that
//
// is successfully imported is also output to a file named after the zone that was specified.
//
// hcl
//
// resource "venafi_policy" "existing_policy" {}
//
// ```sh
// $ pulumi import venafi:index/policy:Policy existing_policy" "My Business App\\Enterprise Trusted Certs"
// ```
type Policy struct {
	pulumi.CustomResourceState

	// The JSON-formatted certificate policy specification as documented
	// [here](https://github.com/Venafi/vcert/blob/master/README-POLICY-SPEC.md). Typically read from a file using the `file`
	// function.
	PolicySpecification pulumi.StringPtrOutput `pulumi:"policySpecification"`
	// The *Trust Protection Plaform* policy folder or *Venafi Control Plane* application and
	// issuing template.
	Zone pulumi.StringPtrOutput `pulumi:"zone"`
}

// NewPolicy registers a new resource with the given unique name, arguments, and options.
func NewPolicy(ctx *pulumi.Context,
	name string, args *PolicyArgs, opts ...pulumi.ResourceOption) (*Policy, error) {
	if args == nil {
		args = &PolicyArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Policy
	err := ctx.RegisterResource("venafi:index/policy:Policy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPolicy gets an existing Policy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PolicyState, opts ...pulumi.ResourceOption) (*Policy, error) {
	var resource Policy
	err := ctx.ReadResource("venafi:index/policy:Policy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Policy resources.
type policyState struct {
	// The JSON-formatted certificate policy specification as documented
	// [here](https://github.com/Venafi/vcert/blob/master/README-POLICY-SPEC.md). Typically read from a file using the `file`
	// function.
	PolicySpecification *string `pulumi:"policySpecification"`
	// The *Trust Protection Plaform* policy folder or *Venafi Control Plane* application and
	// issuing template.
	Zone *string `pulumi:"zone"`
}

type PolicyState struct {
	// The JSON-formatted certificate policy specification as documented
	// [here](https://github.com/Venafi/vcert/blob/master/README-POLICY-SPEC.md). Typically read from a file using the `file`
	// function.
	PolicySpecification pulumi.StringPtrInput
	// The *Trust Protection Plaform* policy folder or *Venafi Control Plane* application and
	// issuing template.
	Zone pulumi.StringPtrInput
}

func (PolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*policyState)(nil)).Elem()
}

type policyArgs struct {
	// The JSON-formatted certificate policy specification as documented
	// [here](https://github.com/Venafi/vcert/blob/master/README-POLICY-SPEC.md). Typically read from a file using the `file`
	// function.
	PolicySpecification *string `pulumi:"policySpecification"`
	// The *Trust Protection Plaform* policy folder or *Venafi Control Plane* application and
	// issuing template.
	Zone *string `pulumi:"zone"`
}

// The set of arguments for constructing a Policy resource.
type PolicyArgs struct {
	// The JSON-formatted certificate policy specification as documented
	// [here](https://github.com/Venafi/vcert/blob/master/README-POLICY-SPEC.md). Typically read from a file using the `file`
	// function.
	PolicySpecification pulumi.StringPtrInput
	// The *Trust Protection Plaform* policy folder or *Venafi Control Plane* application and
	// issuing template.
	Zone pulumi.StringPtrInput
}

func (PolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*policyArgs)(nil)).Elem()
}

type PolicyInput interface {
	pulumi.Input

	ToPolicyOutput() PolicyOutput
	ToPolicyOutputWithContext(ctx context.Context) PolicyOutput
}

func (*Policy) ElementType() reflect.Type {
	return reflect.TypeOf((**Policy)(nil)).Elem()
}

func (i *Policy) ToPolicyOutput() PolicyOutput {
	return i.ToPolicyOutputWithContext(context.Background())
}

func (i *Policy) ToPolicyOutputWithContext(ctx context.Context) PolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PolicyOutput)
}

// PolicyArrayInput is an input type that accepts PolicyArray and PolicyArrayOutput values.
// You can construct a concrete instance of `PolicyArrayInput` via:
//
//	PolicyArray{ PolicyArgs{...} }
type PolicyArrayInput interface {
	pulumi.Input

	ToPolicyArrayOutput() PolicyArrayOutput
	ToPolicyArrayOutputWithContext(context.Context) PolicyArrayOutput
}

type PolicyArray []PolicyInput

func (PolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Policy)(nil)).Elem()
}

func (i PolicyArray) ToPolicyArrayOutput() PolicyArrayOutput {
	return i.ToPolicyArrayOutputWithContext(context.Background())
}

func (i PolicyArray) ToPolicyArrayOutputWithContext(ctx context.Context) PolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PolicyArrayOutput)
}

// PolicyMapInput is an input type that accepts PolicyMap and PolicyMapOutput values.
// You can construct a concrete instance of `PolicyMapInput` via:
//
//	PolicyMap{ "key": PolicyArgs{...} }
type PolicyMapInput interface {
	pulumi.Input

	ToPolicyMapOutput() PolicyMapOutput
	ToPolicyMapOutputWithContext(context.Context) PolicyMapOutput
}

type PolicyMap map[string]PolicyInput

func (PolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Policy)(nil)).Elem()
}

func (i PolicyMap) ToPolicyMapOutput() PolicyMapOutput {
	return i.ToPolicyMapOutputWithContext(context.Background())
}

func (i PolicyMap) ToPolicyMapOutputWithContext(ctx context.Context) PolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PolicyMapOutput)
}

type PolicyOutput struct{ *pulumi.OutputState }

func (PolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Policy)(nil)).Elem()
}

func (o PolicyOutput) ToPolicyOutput() PolicyOutput {
	return o
}

func (o PolicyOutput) ToPolicyOutputWithContext(ctx context.Context) PolicyOutput {
	return o
}

// The JSON-formatted certificate policy specification as documented
// [here](https://github.com/Venafi/vcert/blob/master/README-POLICY-SPEC.md). Typically read from a file using the `file`
// function.
func (o PolicyOutput) PolicySpecification() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Policy) pulumi.StringPtrOutput { return v.PolicySpecification }).(pulumi.StringPtrOutput)
}

// The *Trust Protection Plaform* policy folder or *Venafi Control Plane* application and
// issuing template.
func (o PolicyOutput) Zone() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Policy) pulumi.StringPtrOutput { return v.Zone }).(pulumi.StringPtrOutput)
}

type PolicyArrayOutput struct{ *pulumi.OutputState }

func (PolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Policy)(nil)).Elem()
}

func (o PolicyArrayOutput) ToPolicyArrayOutput() PolicyArrayOutput {
	return o
}

func (o PolicyArrayOutput) ToPolicyArrayOutputWithContext(ctx context.Context) PolicyArrayOutput {
	return o
}

func (o PolicyArrayOutput) Index(i pulumi.IntInput) PolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Policy {
		return vs[0].([]*Policy)[vs[1].(int)]
	}).(PolicyOutput)
}

type PolicyMapOutput struct{ *pulumi.OutputState }

func (PolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Policy)(nil)).Elem()
}

func (o PolicyMapOutput) ToPolicyMapOutput() PolicyMapOutput {
	return o
}

func (o PolicyMapOutput) ToPolicyMapOutputWithContext(ctx context.Context) PolicyMapOutput {
	return o
}

func (o PolicyMapOutput) MapIndex(k pulumi.StringInput) PolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Policy {
		return vs[0].(map[string]*Policy)[vs[1].(string)]
	}).(PolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PolicyInput)(nil)).Elem(), &Policy{})
	pulumi.RegisterInputType(reflect.TypeOf((*PolicyArrayInput)(nil)).Elem(), PolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PolicyMapInput)(nil)).Elem(), PolicyMap{})
	pulumi.RegisterOutputType(PolicyOutput{})
	pulumi.RegisterOutputType(PolicyArrayOutput{})
	pulumi.RegisterOutputType(PolicyMapOutput{})
}
