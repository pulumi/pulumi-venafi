# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['SshConfigArgs', 'SshConfig']

@pulumi.input_type
class SshConfigArgs:
    def __init__(__self__, *,
                 template: pulumi.Input[str]):
        """
        The set of arguments for constructing a SshConfig resource.
        :param pulumi.Input[str] template: The SSH certificate issuing template.
        """
        pulumi.set(__self__, "template", template)

    @property
    @pulumi.getter
    def template(self) -> pulumi.Input[str]:
        """
        The SSH certificate issuing template.
        """
        return pulumi.get(self, "template")

    @template.setter
    def template(self, value: pulumi.Input[str]):
        pulumi.set(self, "template", value)


@pulumi.input_type
class _SshConfigState:
    def __init__(__self__, *,
                 ca_public_key: Optional[pulumi.Input[str]] = None,
                 principals: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 template: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering SshConfig resources.
        :param pulumi.Input[str] ca_public_key: (Optional, string) The template's CA public key.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] principals: (Optional, set of strings) A list of user names exported from the template.
        :param pulumi.Input[str] template: The SSH certificate issuing template.
        """
        if ca_public_key is not None:
            pulumi.set(__self__, "ca_public_key", ca_public_key)
        if principals is not None:
            pulumi.set(__self__, "principals", principals)
        if template is not None:
            pulumi.set(__self__, "template", template)

    @property
    @pulumi.getter(name="caPublicKey")
    def ca_public_key(self) -> Optional[pulumi.Input[str]]:
        """
        (Optional, string) The template's CA public key.
        """
        return pulumi.get(self, "ca_public_key")

    @ca_public_key.setter
    def ca_public_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ca_public_key", value)

    @property
    @pulumi.getter
    def principals(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        (Optional, set of strings) A list of user names exported from the template.
        """
        return pulumi.get(self, "principals")

    @principals.setter
    def principals(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "principals", value)

    @property
    @pulumi.getter
    def template(self) -> Optional[pulumi.Input[str]]:
        """
        The SSH certificate issuing template.
        """
        return pulumi.get(self, "template")

    @template.setter
    def template(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "template", value)


class SshConfig(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 template: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides access to retrieve configuration from SSH certificate issuance template from *Venafi Trust Protection Platform*.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_venafi as venafi

        cit = venafi.SshConfig("cit", template="devops-terraform-cit")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] template: The SSH certificate issuing template.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SshConfigArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides access to retrieve configuration from SSH certificate issuance template from *Venafi Trust Protection Platform*.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_venafi as venafi

        cit = venafi.SshConfig("cit", template="devops-terraform-cit")
        ```

        :param str resource_name: The name of the resource.
        :param SshConfigArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SshConfigArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 template: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SshConfigArgs.__new__(SshConfigArgs)

            if template is None and not opts.urn:
                raise TypeError("Missing required property 'template'")
            __props__.__dict__["template"] = template
            __props__.__dict__["ca_public_key"] = None
            __props__.__dict__["principals"] = None
        super(SshConfig, __self__).__init__(
            'venafi:index/sshConfig:SshConfig',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            ca_public_key: Optional[pulumi.Input[str]] = None,
            principals: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            template: Optional[pulumi.Input[str]] = None) -> 'SshConfig':
        """
        Get an existing SshConfig resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] ca_public_key: (Optional, string) The template's CA public key.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] principals: (Optional, set of strings) A list of user names exported from the template.
        :param pulumi.Input[str] template: The SSH certificate issuing template.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SshConfigState.__new__(_SshConfigState)

        __props__.__dict__["ca_public_key"] = ca_public_key
        __props__.__dict__["principals"] = principals
        __props__.__dict__["template"] = template
        return SshConfig(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="caPublicKey")
    def ca_public_key(self) -> pulumi.Output[str]:
        """
        (Optional, string) The template's CA public key.
        """
        return pulumi.get(self, "ca_public_key")

    @property
    @pulumi.getter
    def principals(self) -> pulumi.Output[Sequence[str]]:
        """
        (Optional, set of strings) A list of user names exported from the template.
        """
        return pulumi.get(self, "principals")

    @property
    @pulumi.getter
    def template(self) -> pulumi.Output[str]:
        """
        The SSH certificate issuing template.
        """
        return pulumi.get(self, "template")

