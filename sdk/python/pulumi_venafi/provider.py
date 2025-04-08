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

__all__ = ['ProviderArgs', 'Provider']

@pulumi.input_type
class ProviderArgs:
    def __init__(__self__, *,
                 access_token: Optional[pulumi.Input[builtins.str]] = None,
                 api_key: Optional[pulumi.Input[builtins.str]] = None,
                 client_id: Optional[pulumi.Input[builtins.str]] = None,
                 dev_mode: Optional[pulumi.Input[builtins.bool]] = None,
                 external_jwt: Optional[pulumi.Input[builtins.str]] = None,
                 p12_cert_filename: Optional[pulumi.Input[builtins.str]] = None,
                 p12_cert_password: Optional[pulumi.Input[builtins.str]] = None,
                 skip_retirement: Optional[pulumi.Input[builtins.bool]] = None,
                 token_url: Optional[pulumi.Input[builtins.str]] = None,
                 tpp_password: Optional[pulumi.Input[builtins.str]] = None,
                 tpp_username: Optional[pulumi.Input[builtins.str]] = None,
                 trust_bundle: Optional[pulumi.Input[builtins.str]] = None,
                 url: Optional[pulumi.Input[builtins.str]] = None,
                 zone: Optional[pulumi.Input[builtins.str]] = None):
        """
        The set of arguments for constructing a Provider resource.
        :param pulumi.Input[builtins.str] access_token: Access token for Venafi TLSPDC, user should use this for authentication
        :param pulumi.Input[builtins.str] api_key: API key for Venafi Control Plane. Example: 142231b7-cvb0-412e-886b-6aeght0bc93d
        :param pulumi.Input[builtins.str] client_id: application that will be using the token
        :param pulumi.Input[builtins.bool] dev_mode: When set to true, the resulting certificate will be issued by an ephemeral, no trust CA rather than enrolling using
               Venafi as a Service or Trust Protection Platform. Useful for development and testing
        :param pulumi.Input[builtins.str] external_jwt: JWT of the identity provider associated to the Venafi Control Plane service account that is granting the access token
        :param pulumi.Input[builtins.str] p12_cert_filename: Filename of PKCS#12 keystore containing a client certificate, private key, and chain certificates to authenticate to
               TLSPDC
        :param pulumi.Input[builtins.str] p12_cert_password: Password for the PKCS#12 keystore declared in p12_cert
        :param pulumi.Input[builtins.str] token_url: Endpoint URL to request new Venafi Control Plane access tokens
        :param pulumi.Input[builtins.str] tpp_password: Password for WebSDK user. Example: password
        :param pulumi.Input[builtins.str] tpp_username: WebSDK user for Venafi TLSPDC. Example: admin
        :param pulumi.Input[builtins.str] trust_bundle: Use to specify a PEM-formatted file that contains certificates to be trust anchors for all communications with the
               Venafi Web Service. Example: trust_bundle = "${file("chain.pem")}"
        :param pulumi.Input[builtins.str] url: The Venafi Platform URL. Example: https://tpp.venafi.example/vedsdk
        :param pulumi.Input[builtins.str] zone: DN of the Venafi TLSPDC policy folder or name of the Venafi as a Service application plus issuing template alias.
               Example for Platform: testPolicy\\\\vault Example for Venafi as a Service: myApp\\\\Default
        """
        if access_token is not None:
            pulumi.set(__self__, "access_token", access_token)
        if api_key is not None:
            pulumi.set(__self__, "api_key", api_key)
        if client_id is not None:
            pulumi.set(__self__, "client_id", client_id)
        if dev_mode is not None:
            pulumi.set(__self__, "dev_mode", dev_mode)
        if external_jwt is not None:
            pulumi.set(__self__, "external_jwt", external_jwt)
        if p12_cert_filename is not None:
            pulumi.set(__self__, "p12_cert_filename", p12_cert_filename)
        if p12_cert_password is not None:
            pulumi.set(__self__, "p12_cert_password", p12_cert_password)
        if skip_retirement is not None:
            pulumi.set(__self__, "skip_retirement", skip_retirement)
        if token_url is not None:
            pulumi.set(__self__, "token_url", token_url)
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
    def access_token(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Access token for Venafi TLSPDC, user should use this for authentication
        """
        return pulumi.get(self, "access_token")

    @access_token.setter
    def access_token(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "access_token", value)

    @property
    @pulumi.getter(name="apiKey")
    def api_key(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        API key for Venafi Control Plane. Example: 142231b7-cvb0-412e-886b-6aeght0bc93d
        """
        return pulumi.get(self, "api_key")

    @api_key.setter
    def api_key(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "api_key", value)

    @property
    @pulumi.getter(name="clientId")
    def client_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        application that will be using the token
        """
        return pulumi.get(self, "client_id")

    @client_id.setter
    def client_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "client_id", value)

    @property
    @pulumi.getter(name="devMode")
    def dev_mode(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        When set to true, the resulting certificate will be issued by an ephemeral, no trust CA rather than enrolling using
        Venafi as a Service or Trust Protection Platform. Useful for development and testing
        """
        return pulumi.get(self, "dev_mode")

    @dev_mode.setter
    def dev_mode(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "dev_mode", value)

    @property
    @pulumi.getter(name="externalJwt")
    def external_jwt(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        JWT of the identity provider associated to the Venafi Control Plane service account that is granting the access token
        """
        return pulumi.get(self, "external_jwt")

    @external_jwt.setter
    def external_jwt(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "external_jwt", value)

    @property
    @pulumi.getter(name="p12CertFilename")
    def p12_cert_filename(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Filename of PKCS#12 keystore containing a client certificate, private key, and chain certificates to authenticate to
        TLSPDC
        """
        return pulumi.get(self, "p12_cert_filename")

    @p12_cert_filename.setter
    def p12_cert_filename(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "p12_cert_filename", value)

    @property
    @pulumi.getter(name="p12CertPassword")
    def p12_cert_password(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Password for the PKCS#12 keystore declared in p12_cert
        """
        return pulumi.get(self, "p12_cert_password")

    @p12_cert_password.setter
    def p12_cert_password(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "p12_cert_password", value)

    @property
    @pulumi.getter(name="skipRetirement")
    def skip_retirement(self) -> Optional[pulumi.Input[builtins.bool]]:
        return pulumi.get(self, "skip_retirement")

    @skip_retirement.setter
    def skip_retirement(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "skip_retirement", value)

    @property
    @pulumi.getter(name="tokenUrl")
    def token_url(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Endpoint URL to request new Venafi Control Plane access tokens
        """
        return pulumi.get(self, "token_url")

    @token_url.setter
    def token_url(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "token_url", value)

    @property
    @pulumi.getter(name="tppPassword")
    @_utilities.deprecated(""", please use access_token instead""")
    def tpp_password(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Password for WebSDK user. Example: password
        """
        return pulumi.get(self, "tpp_password")

    @tpp_password.setter
    def tpp_password(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "tpp_password", value)

    @property
    @pulumi.getter(name="tppUsername")
    @_utilities.deprecated(""", please use access_token instead""")
    def tpp_username(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        WebSDK user for Venafi TLSPDC. Example: admin
        """
        return pulumi.get(self, "tpp_username")

    @tpp_username.setter
    def tpp_username(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "tpp_username", value)

    @property
    @pulumi.getter(name="trustBundle")
    def trust_bundle(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Use to specify a PEM-formatted file that contains certificates to be trust anchors for all communications with the
        Venafi Web Service. Example: trust_bundle = "${file("chain.pem")}"
        """
        return pulumi.get(self, "trust_bundle")

    @trust_bundle.setter
    def trust_bundle(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "trust_bundle", value)

    @property
    @pulumi.getter
    def url(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The Venafi Platform URL. Example: https://tpp.venafi.example/vedsdk
        """
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "url", value)

    @property
    @pulumi.getter
    def zone(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        DN of the Venafi TLSPDC policy folder or name of the Venafi as a Service application plus issuing template alias.
        Example for Platform: testPolicy\\\\vault Example for Venafi as a Service: myApp\\\\Default
        """
        return pulumi.get(self, "zone")

    @zone.setter
    def zone(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "zone", value)


class Provider(pulumi.ProviderResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_token: Optional[pulumi.Input[builtins.str]] = None,
                 api_key: Optional[pulumi.Input[builtins.str]] = None,
                 client_id: Optional[pulumi.Input[builtins.str]] = None,
                 dev_mode: Optional[pulumi.Input[builtins.bool]] = None,
                 external_jwt: Optional[pulumi.Input[builtins.str]] = None,
                 p12_cert_filename: Optional[pulumi.Input[builtins.str]] = None,
                 p12_cert_password: Optional[pulumi.Input[builtins.str]] = None,
                 skip_retirement: Optional[pulumi.Input[builtins.bool]] = None,
                 token_url: Optional[pulumi.Input[builtins.str]] = None,
                 tpp_password: Optional[pulumi.Input[builtins.str]] = None,
                 tpp_username: Optional[pulumi.Input[builtins.str]] = None,
                 trust_bundle: Optional[pulumi.Input[builtins.str]] = None,
                 url: Optional[pulumi.Input[builtins.str]] = None,
                 zone: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        The provider type for the venafi package. By default, resources use package-wide configuration
        settings, however an explicit `Provider` instance may be created and passed during resource
        construction to achieve fine-grained programmatic control over provider settings. See the
        [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] access_token: Access token for Venafi TLSPDC, user should use this for authentication
        :param pulumi.Input[builtins.str] api_key: API key for Venafi Control Plane. Example: 142231b7-cvb0-412e-886b-6aeght0bc93d
        :param pulumi.Input[builtins.str] client_id: application that will be using the token
        :param pulumi.Input[builtins.bool] dev_mode: When set to true, the resulting certificate will be issued by an ephemeral, no trust CA rather than enrolling using
               Venafi as a Service or Trust Protection Platform. Useful for development and testing
        :param pulumi.Input[builtins.str] external_jwt: JWT of the identity provider associated to the Venafi Control Plane service account that is granting the access token
        :param pulumi.Input[builtins.str] p12_cert_filename: Filename of PKCS#12 keystore containing a client certificate, private key, and chain certificates to authenticate to
               TLSPDC
        :param pulumi.Input[builtins.str] p12_cert_password: Password for the PKCS#12 keystore declared in p12_cert
        :param pulumi.Input[builtins.str] token_url: Endpoint URL to request new Venafi Control Plane access tokens
        :param pulumi.Input[builtins.str] tpp_password: Password for WebSDK user. Example: password
        :param pulumi.Input[builtins.str] tpp_username: WebSDK user for Venafi TLSPDC. Example: admin
        :param pulumi.Input[builtins.str] trust_bundle: Use to specify a PEM-formatted file that contains certificates to be trust anchors for all communications with the
               Venafi Web Service. Example: trust_bundle = "${file("chain.pem")}"
        :param pulumi.Input[builtins.str] url: The Venafi Platform URL. Example: https://tpp.venafi.example/vedsdk
        :param pulumi.Input[builtins.str] zone: DN of the Venafi TLSPDC policy folder or name of the Venafi as a Service application plus issuing template alias.
               Example for Platform: testPolicy\\\\vault Example for Venafi as a Service: myApp\\\\Default
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
                 access_token: Optional[pulumi.Input[builtins.str]] = None,
                 api_key: Optional[pulumi.Input[builtins.str]] = None,
                 client_id: Optional[pulumi.Input[builtins.str]] = None,
                 dev_mode: Optional[pulumi.Input[builtins.bool]] = None,
                 external_jwt: Optional[pulumi.Input[builtins.str]] = None,
                 p12_cert_filename: Optional[pulumi.Input[builtins.str]] = None,
                 p12_cert_password: Optional[pulumi.Input[builtins.str]] = None,
                 skip_retirement: Optional[pulumi.Input[builtins.bool]] = None,
                 token_url: Optional[pulumi.Input[builtins.str]] = None,
                 tpp_password: Optional[pulumi.Input[builtins.str]] = None,
                 tpp_username: Optional[pulumi.Input[builtins.str]] = None,
                 trust_bundle: Optional[pulumi.Input[builtins.str]] = None,
                 url: Optional[pulumi.Input[builtins.str]] = None,
                 zone: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ProviderArgs.__new__(ProviderArgs)

            __props__.__dict__["access_token"] = None if access_token is None else pulumi.Output.secret(access_token)
            __props__.__dict__["api_key"] = None if api_key is None else pulumi.Output.secret(api_key)
            __props__.__dict__["client_id"] = client_id
            __props__.__dict__["dev_mode"] = pulumi.Output.from_input(dev_mode).apply(pulumi.runtime.to_json) if dev_mode is not None else None
            __props__.__dict__["external_jwt"] = None if external_jwt is None else pulumi.Output.secret(external_jwt)
            __props__.__dict__["p12_cert_filename"] = p12_cert_filename
            __props__.__dict__["p12_cert_password"] = None if p12_cert_password is None else pulumi.Output.secret(p12_cert_password)
            __props__.__dict__["skip_retirement"] = pulumi.Output.from_input(skip_retirement).apply(pulumi.runtime.to_json) if skip_retirement is not None else None
            __props__.__dict__["token_url"] = None if token_url is None else pulumi.Output.secret(token_url)
            __props__.__dict__["tpp_password"] = None if tpp_password is None else pulumi.Output.secret(tpp_password)
            __props__.__dict__["tpp_username"] = tpp_username
            __props__.__dict__["trust_bundle"] = trust_bundle
            __props__.__dict__["url"] = url
            __props__.__dict__["zone"] = zone
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["accessToken", "apiKey", "externalJwt", "p12CertPassword", "tokenUrl", "tppPassword"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(Provider, __self__).__init__(
            'venafi',
            resource_name,
            __props__,
            opts)

    @property
    @pulumi.getter(name="accessToken")
    def access_token(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        Access token for Venafi TLSPDC, user should use this for authentication
        """
        return pulumi.get(self, "access_token")

    @property
    @pulumi.getter(name="apiKey")
    def api_key(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        API key for Venafi Control Plane. Example: 142231b7-cvb0-412e-886b-6aeght0bc93d
        """
        return pulumi.get(self, "api_key")

    @property
    @pulumi.getter(name="clientId")
    def client_id(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        application that will be using the token
        """
        return pulumi.get(self, "client_id")

    @property
    @pulumi.getter(name="externalJwt")
    def external_jwt(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        JWT of the identity provider associated to the Venafi Control Plane service account that is granting the access token
        """
        return pulumi.get(self, "external_jwt")

    @property
    @pulumi.getter(name="p12CertFilename")
    def p12_cert_filename(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        Filename of PKCS#12 keystore containing a client certificate, private key, and chain certificates to authenticate to
        TLSPDC
        """
        return pulumi.get(self, "p12_cert_filename")

    @property
    @pulumi.getter(name="p12CertPassword")
    def p12_cert_password(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        Password for the PKCS#12 keystore declared in p12_cert
        """
        return pulumi.get(self, "p12_cert_password")

    @property
    @pulumi.getter(name="tokenUrl")
    def token_url(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        Endpoint URL to request new Venafi Control Plane access tokens
        """
        return pulumi.get(self, "token_url")

    @property
    @pulumi.getter(name="tppPassword")
    @_utilities.deprecated(""", please use access_token instead""")
    def tpp_password(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        Password for WebSDK user. Example: password
        """
        return pulumi.get(self, "tpp_password")

    @property
    @pulumi.getter(name="tppUsername")
    @_utilities.deprecated(""", please use access_token instead""")
    def tpp_username(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        WebSDK user for Venafi TLSPDC. Example: admin
        """
        return pulumi.get(self, "tpp_username")

    @property
    @pulumi.getter(name="trustBundle")
    def trust_bundle(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        Use to specify a PEM-formatted file that contains certificates to be trust anchors for all communications with the
        Venafi Web Service. Example: trust_bundle = "${file("chain.pem")}"
        """
        return pulumi.get(self, "trust_bundle")

    @property
    @pulumi.getter
    def url(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        The Venafi Platform URL. Example: https://tpp.venafi.example/vedsdk
        """
        return pulumi.get(self, "url")

    @property
    @pulumi.getter
    def zone(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        DN of the Venafi TLSPDC policy folder or name of the Venafi as a Service application plus issuing template alias.
        Example for Platform: testPolicy\\\\vault Example for Venafi as a Service: myApp\\\\Default
        """
        return pulumi.get(self, "zone")

