# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities

import types

__config__ = pulumi.Config('venafi')


class _ExportableConfig(types.ModuleType):
    @_builtins.property
    def access_token(self) -> Optional[str]:
        """
        Access token for Venafi TLSPDC, user should use this for authentication
        """
        return __config__.get('accessToken')

    @_builtins.property
    def api_key(self) -> Optional[str]:
        """
        API key for Venafi Control Plane. Example: 142231b7-cvb0-412e-886b-6aeght0bc93d
        """
        return __config__.get('apiKey')

    @_builtins.property
    def client_id(self) -> Optional[str]:
        """
        application that will be using the token
        """
        return __config__.get('clientId')

    @_builtins.property
    def dev_mode(self) -> Optional[bool]:
        """
        When set to true, the resulting certificate will be issued by an ephemeral, no trust CA rather than enrolling using
        Venafi as a Service or Trust Protection Platform. Useful for development and testing
        """
        return __config__.get_bool('devMode')

    @_builtins.property
    def external_jwt(self) -> Optional[str]:
        """
        JWT of the identity provider associated to the Venafi Control Plane service account that is granting the access token
        """
        return __config__.get('externalJwt')

    @_builtins.property
    def p12_cert_filename(self) -> Optional[str]:
        """
        Filename of PKCS#12 keystore containing a client certificate, private key, and chain certificates to authenticate to
        TLSPDC
        """
        return __config__.get('p12CertFilename')

    @_builtins.property
    def p12_cert_password(self) -> Optional[str]:
        """
        Password for the PKCS#12 keystore declared in p12_cert
        """
        return __config__.get('p12CertPassword')

    @_builtins.property
    def skip_retirement(self) -> Optional[bool]:
        return __config__.get_bool('skipRetirement')

    @_builtins.property
    def token_url(self) -> Optional[str]:
        """
        Endpoint URL to request new Venafi Control Plane access tokens
        """
        return __config__.get('tokenUrl')

    @_builtins.property
    def tpp_password(self) -> Optional[str]:
        """
        Password for WebSDK user. Example: password
        """
        return __config__.get('tppPassword')

    @_builtins.property
    def tpp_username(self) -> Optional[str]:
        """
        WebSDK user for Venafi TLSPDC. Example: admin
        """
        return __config__.get('tppUsername')

    @_builtins.property
    def trust_bundle(self) -> Optional[str]:
        """
        Use to specify a PEM-formatted file that contains certificates to be trust anchors for all communications with the
        Venafi Web Service. Example: trust_bundle = "${file("chain.pem")}"
        """
        return __config__.get('trustBundle')

    @_builtins.property
    def url(self) -> Optional[str]:
        """
        The Venafi Platform URL. Example: https://tpp.venafi.example/vedsdk
        """
        return __config__.get('url')

    @_builtins.property
    def zone(self) -> Optional[str]:
        """
        DN of the Venafi TLSPDC policy folder or name of the Venafi as a Service application plus issuing template alias.
        Example for Platform: testPolicy\\\\vault Example for Venafi as a Service: myApp\\\\Default
        """
        return __config__.get('zone')

