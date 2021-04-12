# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities, _tables

__all__ = [
    'access_token',
    'api_key',
    'dev_mode',
    'tpp_password',
    'tpp_username',
    'trust_bundle',
    'url',
    'zone',
]

__config__ = pulumi.Config('venafi')

access_token = __config__.get('accessToken')
"""
Access token for TPP, user should use this for authentication
"""

api_key = __config__.get('apiKey')
"""
API key for Venafi Cloud. Example: 142231b7-cvb0-412e-886b-6aeght0bc93d
"""

dev_mode = __config__.get('devMode')
"""
When set to true, the resulting certificate will be issued by an ephemeral, no trust CA rather than enrolling using
Venafi Cloud or Platform. Useful for development and testing.
"""

tpp_password = __config__.get('tppPassword')
"""
Password for WebSDK user. Example: password
"""

tpp_username = __config__.get('tppUsername')
"""
WebSDK user for Venafi Platform. Example: admin
"""

trust_bundle = __config__.get('trustBundle')
"""
Use to specify a PEM-formatted file that contains certificates to be trust anchors for all communications with the
Venafi Web Service. Example: trust_bundle = "${file("chain.pem")}"
"""

url = __config__.get('url')
"""
The Venafi Web Service URL.. Example: https://tpp.venafi.example/vedsdk
"""

zone = __config__.get('zone')
"""
DN of the Venafi Platform policy folder or name of the Venafi Cloud zone. Example for Platform: testpolicy\\vault
Example for Venafi Cloud: Default
"""

