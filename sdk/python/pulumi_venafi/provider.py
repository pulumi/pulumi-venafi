# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ProviderArgs', 'Provider']

@pulumi.input_type
class ProviderArgs:
    def __init__(__self__, *,
                 access_token: Optional[pulumi.Input[str]] = None,
                 api_key: Optional[pulumi.Input[str]] = None,
                 dev_mode: Optional[pulumi.Input[bool]] = None,
                 tpp_password: Optional[pulumi.Input[str]] = None,
                 tpp_username: Optional[pulumi.Input[str]] = None,
                 trust_bundle: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 zone: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Provider resource.
        :param pulumi.Input[str] access_token: Access token for TPP, user should use this for authentication
        :param pulumi.Input[str] api_key: API key for Venafi as a Service. Example: 142231b7-cvb0-412e-886b-6aeght0bc93d
        :param pulumi.Input[bool] dev_mode: When set to true, the resulting certificate will be issued by an ephemeral, no trust CA rather than enrolling using
               Venafi as a Service or Trust Protection Platform. Useful for development and testing.
        :param pulumi.Input[str] tpp_password: Password for WebSDK user. Example: password
        :param pulumi.Input[str] tpp_username: WebSDK user for Venafi Platform. Example: admin
        :param pulumi.Input[str] trust_bundle: Use to specify a PEM-formatted file that contains certificates to be trust anchors for all communications with the
               Venafi Web Service. Example: trust_bundle = "${file("chain.pem")}"
        :param pulumi.Input[str] url: The Venafi Web Service URL.. Example: https://tpp.venafi.example/vedsdk
        :param pulumi.Input[str] zone: DN of the Venafi Platform policy folder or name of the Venafi as a Service application. Example for Platform:
               testpolicy\\\\vault Example for Venafi as a Service: Default
        """
        if access_token is not None:
            pulumi.set(__self__, "access_token", access_token)
        if api_key is not None:
            pulumi.set(__self__, "api_key", api_key)
        if dev_mode is not None:
            pulumi.set(__self__, "dev_mode", dev_mode)
        if tpp_password is not None:
            warnings.warn(""", please use access_token instead""", DeprecationWarning)
            pulumi.log.warn("""tpp_password is deprecated: , please use access_token instead""")
        if tpp_password is not None:
            pulumi.set(__self__, "tpp_password", tpp_password)
        if tpp_username is not None:
            warnings.warn(""", please use access_token instead""", DeprecationWarning)
            pulumi.log.warn("""tpp_username is deprecated: , please use access_token instead""")
        if tpp_username is not None:
            pulumi.set(__self__, "tpp_username", tpp_username)
        if trust_bundle is not None:
            pulumi.set(__self__, "trust_bundle", trust_bundle)
        if url is not None:
            pulumi.set(__self__, "url", url)
        if zone is not None:
            pulumi.set(__self__, "zone", zone)

    @property
    @pulumi.getter(name="accessToken")
    def access_token(self) -> Optional[pulumi.Input[str]]:
        """
        Access token for TPP, user should use this for authentication
        """
        return pulumi.get(self, "access_token")

    @access_token.setter
    def access_token(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "access_token", value)

    @property
    @pulumi.getter(name="apiKey")
    def api_key(self) -> Optional[pulumi.Input[str]]:
        """
        API key for Venafi as a Service. Example: 142231b7-cvb0-412e-886b-6aeght0bc93d
        """
        return pulumi.get(self, "api_key")

    @api_key.setter
    def api_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "api_key", value)

    @property
    @pulumi.getter(name="devMode")
    def dev_mode(self) -> Optional[pulumi.Input[bool]]:
        """
        When set to true, the resulting certificate will be issued by an ephemeral, no trust CA rather than enrolling using
        Venafi as a Service or Trust Protection Platform. Useful for development and testing.
        """
        return pulumi.get(self, "dev_mode")

    @dev_mode.setter
    def dev_mode(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "dev_mode", value)

    @property
    @pulumi.getter(name="tppPassword")
    def tpp_password(self) -> Optional[pulumi.Input[str]]:
        """
        Password for WebSDK user. Example: password
        """
        return pulumi.get(self, "tpp_password")

    @tpp_password.setter
    def tpp_password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tpp_password", value)

    @property
    @pulumi.getter(name="tppUsername")
    def tpp_username(self) -> Optional[pulumi.Input[str]]:
        """
        WebSDK user for Venafi Platform. Example: admin
        """
        return pulumi.get(self, "tpp_username")

    @tpp_username.setter
    def tpp_username(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tpp_username", value)

    @property
    @pulumi.getter(name="trustBundle")
    def trust_bundle(self) -> Optional[pulumi.Input[str]]:
        """
        Use to specify a PEM-formatted file that contains certificates to be trust anchors for all communications with the
        Venafi Web Service. Example: trust_bundle = "${file("chain.pem")}"
        """
        return pulumi.get(self, "trust_bundle")

    @trust_bundle.setter
    def trust_bundle(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "trust_bundle", value)

    @property
    @pulumi.getter
    def url(self) -> Optional[pulumi.Input[str]]:
        """
        The Venafi Web Service URL.. Example: https://tpp.venafi.example/vedsdk
        """
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "url", value)

    @property
    @pulumi.getter
    def zone(self) -> Optional[pulumi.Input[str]]:
        """
        DN of the Venafi Platform policy folder or name of the Venafi as a Service application. Example for Platform:
        testpolicy\\\\vault Example for Venafi as a Service: Default
        """
        return pulumi.get(self, "zone")

    @zone.setter
    def zone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone", value)


class Provider(pulumi.ProviderResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_token: Optional[pulumi.Input[str]] = None,
                 api_key: Optional[pulumi.Input[str]] = None,
                 dev_mode: Optional[pulumi.Input[bool]] = None,
                 tpp_password: Optional[pulumi.Input[str]] = None,
                 tpp_username: Optional[pulumi.Input[str]] = None,
                 trust_bundle: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 zone: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        The provider type for the venafi package. By default, resources use package-wide configuration
        settings, however an explicit `Provider` instance may be created and passed during resource
        construction to achieve fine-grained programmatic control over provider settings. See the
        [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_token: Access token for TPP, user should use this for authentication
        :param pulumi.Input[str] api_key: API key for Venafi as a Service. Example: 142231b7-cvb0-412e-886b-6aeght0bc93d
        :param pulumi.Input[bool] dev_mode: When set to true, the resulting certificate will be issued by an ephemeral, no trust CA rather than enrolling using
               Venafi as a Service or Trust Protection Platform. Useful for development and testing.
        :param pulumi.Input[str] tpp_password: Password for WebSDK user. Example: password
        :param pulumi.Input[str] tpp_username: WebSDK user for Venafi Platform. Example: admin
        :param pulumi.Input[str] trust_bundle: Use to specify a PEM-formatted file that contains certificates to be trust anchors for all communications with the
               Venafi Web Service. Example: trust_bundle = "${file("chain.pem")}"
        :param pulumi.Input[str] url: The Venafi Web Service URL.. Example: https://tpp.venafi.example/vedsdk
        :param pulumi.Input[str] zone: DN of the Venafi Platform policy folder or name of the Venafi as a Service application. Example for Platform:
               testpolicy\\\\vault Example for Venafi as a Service: Default
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ProviderArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        The provider type for the venafi package. By default, resources use package-wide configuration
        settings, however an explicit `Provider` instance may be created and passed during resource
        construction to achieve fine-grained programmatic control over provider settings. See the
        [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.

        :param str resource_name: The name of the resource.
        :param ProviderArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProviderArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_token: Optional[pulumi.Input[str]] = None,
                 api_key: Optional[pulumi.Input[str]] = None,
                 dev_mode: Optional[pulumi.Input[bool]] = None,
                 tpp_password: Optional[pulumi.Input[str]] = None,
                 tpp_username: Optional[pulumi.Input[str]] = None,
                 trust_bundle: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 zone: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ProviderArgs.__new__(ProviderArgs)

            __props__.__dict__["access_token"] = access_token
            __props__.__dict__["api_key"] = api_key
            __props__.__dict__["dev_mode"] = pulumi.Output.from_input(dev_mode).apply(pulumi.runtime.to_json) if dev_mode is not None else None
            if tpp_password is not None and not opts.urn:
                warnings.warn(""", please use access_token instead""", DeprecationWarning)
                pulumi.log.warn("""tpp_password is deprecated: , please use access_token instead""")
            __props__.__dict__["tpp_password"] = tpp_password
            if tpp_username is not None and not opts.urn:
                warnings.warn(""", please use access_token instead""", DeprecationWarning)
                pulumi.log.warn("""tpp_username is deprecated: , please use access_token instead""")
            __props__.__dict__["tpp_username"] = tpp_username
            __props__.__dict__["trust_bundle"] = trust_bundle
            __props__.__dict__["url"] = url
            __props__.__dict__["zone"] = zone
        super(Provider, __self__).__init__(
            'venafi',
            resource_name,
            __props__,
            opts)

    @property
    @pulumi.getter(name="accessToken")
    def access_token(self) -> pulumi.Output[Optional[str]]:
        """
        Access token for TPP, user should use this for authentication
        """
        return pulumi.get(self, "access_token")

    @property
    @pulumi.getter(name="apiKey")
    def api_key(self) -> pulumi.Output[Optional[str]]:
        """
        API key for Venafi as a Service. Example: 142231b7-cvb0-412e-886b-6aeght0bc93d
        """
        return pulumi.get(self, "api_key")

    @property
    @pulumi.getter(name="tppPassword")
    def tpp_password(self) -> pulumi.Output[Optional[str]]:
        """
        Password for WebSDK user. Example: password
        """
        return pulumi.get(self, "tpp_password")

    @property
    @pulumi.getter(name="tppUsername")
    def tpp_username(self) -> pulumi.Output[Optional[str]]:
        """
        WebSDK user for Venafi Platform. Example: admin
        """
        return pulumi.get(self, "tpp_username")

    @property
    @pulumi.getter(name="trustBundle")
    def trust_bundle(self) -> pulumi.Output[Optional[str]]:
        """
        Use to specify a PEM-formatted file that contains certificates to be trust anchors for all communications with the
        Venafi Web Service. Example: trust_bundle = "${file("chain.pem")}"
        """
        return pulumi.get(self, "trust_bundle")

    @property
    @pulumi.getter
    def url(self) -> pulumi.Output[Optional[str]]:
        """
        The Venafi Web Service URL.. Example: https://tpp.venafi.example/vedsdk
        """
        return pulumi.get(self, "url")

    @property
    @pulumi.getter
    def zone(self) -> pulumi.Output[Optional[str]]:
        """
        DN of the Venafi Platform policy folder or name of the Venafi as a Service application. Example for Platform:
        testpolicy\\\\vault Example for Venafi as a Service: Default
        """
        return pulumi.get(self, "zone")

