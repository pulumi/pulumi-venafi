# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities

__all__ = ['PolicyArgs', 'Policy']

@pulumi.input_type
class PolicyArgs:
    def __init__(__self__, *,
                 policy_specification: Optional[pulumi.Input[builtins.str]] = None,
                 zone: Optional[pulumi.Input[builtins.str]] = None):
        """
        The set of arguments for constructing a Policy resource.
        :param pulumi.Input[builtins.str] policy_specification: The JSON-formatted certificate policy specification as documented 
               [here](https://github.com/Venafi/vcert/blob/master/README-POLICY-SPEC.md). Typically read from a file using the `file`
               function.
        :param pulumi.Input[builtins.str] zone: The *Trust Protection Plaform* policy folder or *Venafi Control Plane* application and 
               issuing template.
        """
        if policy_specification is not None:
            pulumi.set(__self__, "policy_specification", policy_specification)
        if zone is not None:
            pulumi.set(__self__, "zone", zone)

    @property
    @pulumi.getter(name="policySpecification")
    def policy_specification(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The JSON-formatted certificate policy specification as documented 
        [here](https://github.com/Venafi/vcert/blob/master/README-POLICY-SPEC.md). Typically read from a file using the `file`
        function.
        """
        return pulumi.get(self, "policy_specification")

    @policy_specification.setter
    def policy_specification(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "policy_specification", value)

    @property
    @pulumi.getter
    def zone(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The *Trust Protection Plaform* policy folder or *Venafi Control Plane* application and 
        issuing template.
        """
        return pulumi.get(self, "zone")

    @zone.setter
    def zone(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "zone", value)


@pulumi.input_type
class _PolicyState:
    def __init__(__self__, *,
                 policy_specification: Optional[pulumi.Input[builtins.str]] = None,
                 zone: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering Policy resources.
        :param pulumi.Input[builtins.str] policy_specification: The JSON-formatted certificate policy specification as documented 
               [here](https://github.com/Venafi/vcert/blob/master/README-POLICY-SPEC.md). Typically read from a file using the `file`
               function.
        :param pulumi.Input[builtins.str] zone: The *Trust Protection Plaform* policy folder or *Venafi Control Plane* application and 
               issuing template.
        """
        if policy_specification is not None:
            pulumi.set(__self__, "policy_specification", policy_specification)
        if zone is not None:
            pulumi.set(__self__, "zone", zone)

    @property
    @pulumi.getter(name="policySpecification")
    def policy_specification(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The JSON-formatted certificate policy specification as documented 
        [here](https://github.com/Venafi/vcert/blob/master/README-POLICY-SPEC.md). Typically read from a file using the `file`
        function.
        """
        return pulumi.get(self, "policy_specification")

    @policy_specification.setter
    def policy_specification(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "policy_specification", value)

    @property
    @pulumi.getter
    def zone(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The *Trust Protection Plaform* policy folder or *Venafi Control Plane* application and 
        issuing template.
        """
        return pulumi.get(self, "zone")

    @zone.setter
    def zone(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "zone", value)


class Policy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 policy_specification: Optional[pulumi.Input[builtins.str]] = None,
                 zone: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        Provides access to read and write certificate policy in Venafi. This can be used to define a new policy (folder in
        *Trust Protection Platform*; application and issuing template in *Venafi Control Plane*).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_std as std
        import pulumi_venafi as venafi

        internal_policy = venafi.Policy("internal_policy",
            zone="My Business App\\\\Enterprise Trusted Certs",
            policy_specification=std.file(input="/path-to/internal-policy.json").result)
        ```

        ## Import

        The `venafi_policy` resource supports the Terraform import method.

        When used, the `zone` and `policy_specification` resource arguments are not required since the zone is a required

        parameter of the import method and the policy specification is populated from the existing infrastructure. Policy that

        is successfully imported is also output to a file named after the zone that was specified.

        hcl

        resource "venafi_policy" "existing_policy" {}

        ```sh
        $ pulumi import venafi:index/policy:Policy existing_policy" "My Business App\\\\Enterprise Trusted Certs"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] policy_specification: The JSON-formatted certificate policy specification as documented 
               [here](https://github.com/Venafi/vcert/blob/master/README-POLICY-SPEC.md). Typically read from a file using the `file`
               function.
        :param pulumi.Input[builtins.str] zone: The *Trust Protection Plaform* policy folder or *Venafi Control Plane* application and 
               issuing template.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[PolicyArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides access to read and write certificate policy in Venafi. This can be used to define a new policy (folder in
        *Trust Protection Platform*; application and issuing template in *Venafi Control Plane*).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_std as std
        import pulumi_venafi as venafi

        internal_policy = venafi.Policy("internal_policy",
            zone="My Business App\\\\Enterprise Trusted Certs",
            policy_specification=std.file(input="/path-to/internal-policy.json").result)
        ```

        ## Import

        The `venafi_policy` resource supports the Terraform import method.

        When used, the `zone` and `policy_specification` resource arguments are not required since the zone is a required

        parameter of the import method and the policy specification is populated from the existing infrastructure. Policy that

        is successfully imported is also output to a file named after the zone that was specified.

        hcl

        resource "venafi_policy" "existing_policy" {}

        ```sh
        $ pulumi import venafi:index/policy:Policy existing_policy" "My Business App\\\\Enterprise Trusted Certs"
        ```

        :param str resource_name: The name of the resource.
        :param PolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 policy_specification: Optional[pulumi.Input[builtins.str]] = None,
                 zone: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PolicyArgs.__new__(PolicyArgs)

            __props__.__dict__["policy_specification"] = policy_specification
            __props__.__dict__["zone"] = zone
        super(Policy, __self__).__init__(
            'venafi:index/policy:Policy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            policy_specification: Optional[pulumi.Input[builtins.str]] = None,
            zone: Optional[pulumi.Input[builtins.str]] = None) -> 'Policy':
        """
        Get an existing Policy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] policy_specification: The JSON-formatted certificate policy specification as documented 
               [here](https://github.com/Venafi/vcert/blob/master/README-POLICY-SPEC.md). Typically read from a file using the `file`
               function.
        :param pulumi.Input[builtins.str] zone: The *Trust Protection Plaform* policy folder or *Venafi Control Plane* application and 
               issuing template.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PolicyState.__new__(_PolicyState)

        __props__.__dict__["policy_specification"] = policy_specification
        __props__.__dict__["zone"] = zone
        return Policy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="policySpecification")
    def policy_specification(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        The JSON-formatted certificate policy specification as documented 
        [here](https://github.com/Venafi/vcert/blob/master/README-POLICY-SPEC.md). Typically read from a file using the `file`
        function.
        """
        return pulumi.get(self, "policy_specification")

    @property
    @pulumi.getter
    def zone(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        The *Trust Protection Plaform* policy folder or *Venafi Control Plane* application and 
        issuing template.
        """
        return pulumi.get(self, "zone")

