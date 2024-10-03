# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

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

__all__ = [
    'GetCloudProviderResult',
    'AwaitableGetCloudProviderResult',
    'get_cloud_provider',
    'get_cloud_provider_output',
]

@pulumi.output_type
class GetCloudProviderResult:
    """
    A collection of values returned by getCloudProvider.
    """
    def __init__(__self__, id=None, keystores_count=None, name=None, status=None, status_details=None, type=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if keystores_count and not isinstance(keystores_count, int):
            raise TypeError("Expected argument 'keystores_count' to be a int")
        pulumi.set(__self__, "keystores_count", keystores_count)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if status_details and not isinstance(status_details, str):
            raise TypeError("Expected argument 'status_details' to be a str")
        pulumi.set(__self__, "status_details", status_details)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="keystoresCount")
    def keystores_count(self) -> int:
        """
        Number of Cloud Keystores configured with the Cloud Provider
        """
        return pulumi.get(self, "keystores_count")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        The status of the Cloud Provider. Either `VALIDATED` or `NOT_VALIDATED`.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="statusDetails")
    def status_details(self) -> str:
        """
        The details of the Cloud Provider status. If the status is `VALIDATED`, this value will be empty.
        """
        return pulumi.get(self, "status_details")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        The Cloud Provider type. Either `AWS`, `AZURE` or `GCP`
        """
        return pulumi.get(self, "type")


class AwaitableGetCloudProviderResult(GetCloudProviderResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCloudProviderResult(
            id=self.id,
            keystores_count=self.keystores_count,
            name=self.name,
            status=self.status,
            status_details=self.status_details,
            type=self.type)


def get_cloud_provider(name: Optional[str] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCloudProviderResult:
    """
    Use this data source to get the `ID` of a cloud provider in Venafi Control Plane, referenced by its name.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_venafi as venafi

    # Find a cloud provider
    cp_example = venafi.get_cloud_provider(name="Cloud Provider Example")
    ```


    :param str name: Name of the Cloud Provider to look up.
    """
    __args__ = dict()
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('venafi:index/getCloudProvider:getCloudProvider', __args__, opts=opts, typ=GetCloudProviderResult).value

    return AwaitableGetCloudProviderResult(
        id=pulumi.get(__ret__, 'id'),
        keystores_count=pulumi.get(__ret__, 'keystores_count'),
        name=pulumi.get(__ret__, 'name'),
        status=pulumi.get(__ret__, 'status'),
        status_details=pulumi.get(__ret__, 'status_details'),
        type=pulumi.get(__ret__, 'type'))
def get_cloud_provider_output(name: Optional[pulumi.Input[str]] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetCloudProviderResult]:
    """
    Use this data source to get the `ID` of a cloud provider in Venafi Control Plane, referenced by its name.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_venafi as venafi

    # Find a cloud provider
    cp_example = venafi.get_cloud_provider(name="Cloud Provider Example")
    ```


    :param str name: Name of the Cloud Provider to look up.
    """
    __args__ = dict()
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('venafi:index/getCloudProvider:getCloudProvider', __args__, opts=opts, typ=GetCloudProviderResult)
    return __ret__.apply(lambda __response__: GetCloudProviderResult(
        id=pulumi.get(__response__, 'id'),
        keystores_count=pulumi.get(__response__, 'keystores_count'),
        name=pulumi.get(__response__, 'name'),
        status=pulumi.get(__response__, 'status'),
        status_details=pulumi.get(__response__, 'status_details'),
        type=pulumi.get(__response__, 'type')))
