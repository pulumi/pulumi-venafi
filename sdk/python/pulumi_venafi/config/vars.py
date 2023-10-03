# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

import types

__config__ = pulumi.Config('venafi')


class _ExportableConfig(types.ModuleType):
    @property
    def access_token(self) -> Optional[str]:
        """
        Access token for Venafi TLSPDC, user should use this for authentication
        """
        return __config__.get('accessToken')

    @property
    def api_key(self) -> Optional[str]:
        """
        API key for Venafi as a Service. Example: 142231b7-cvb0-412e-886b-6aeght0bc93d
        """
        return __config__.get('apiKey')

    @property
    def client_id(self) -> Optional[str]:
        """
        application that will be using the token
        """
        return __config__.get('clientId')

    @property
    def dev_mode(self) -> Optional[bool]:
        """
        When set to true, the resulting certificate will be issued by an ephemeral, no trust CA rather than enrolling using
        Venafi as a Service or Trust Protection Platform. Useful for development and testing.
        """
        return __config__.get_bool('devMode')

    @property
    def p12_cert_filename(self) -> Optional[str]:
        """
        Filename of PKCS#12 keystore containing a client certificate, private key, and chain certificates to authenticate to
        TLSPDC
        """
        return __config__.get('p12CertFilename')

    @property
    def p12_cert_password(self) -> Optional[str]:
        """
        Password for the PKCS#12 keystore declared in p12_cert
        """
        return __config__.get('p12CertPassword')

    @property
    def tpp_password(self) -> Optional[str]:
        """
        Password for WebSDK user. Example: password
        """
        return __config__.get('tppPassword')

    @property
    def tpp_username(self) -> Optional[str]:
        """
        WebSDK user for Venafi TLSPDC. Example: admin
        """
        return __config__.get('tppUsername')

    @property
    def trust_bundle(self) -> Optional[str]:
        """
        Use to specify a PEM-formatted file that contains certificates to be trust anchors for all communications with the
        Venafi Web Service. Example: trust_bundle = "${file("chain.pem")}"
        """
        return __config__.get('trustBundle')

    @property
    def url(self) -> Optional[str]:
        """
        The Venafi Platform URL. Example: https://tpp.venafi.example/vedsdk
        """
        return __config__.get('url')

    @property
    def zone(self) -> Optional[str]:
        """
        DN of the Venafi TLSPDC policy folder or name of the Venafi as a Service application plus issuing template alias.
        Example for Platform: testPolicy\\\\vault Example for Venafi as a Service: myApp\\\\Default
        """
        return __config__.get('zone')

