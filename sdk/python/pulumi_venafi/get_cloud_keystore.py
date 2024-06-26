# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetCloudKeystoreResult',
    'AwaitableGetCloudKeystoreResult',
    'get_cloud_keystore',
    'get_cloud_keystore_output',
]

@pulumi.output_type
class GetCloudKeystoreResult:
    """
    A collection of values returned by getCloudKeystore.
    """
    def __init__(__self__, cloud_provider_id=None, id=None, machine_identities_count=None, name=None, type=None):
        if cloud_provider_id and not isinstance(cloud_provider_id, str):
            raise TypeError("Expected argument 'cloud_provider_id' to be a str")
        pulumi.set(__self__, "cloud_provider_id", cloud_provider_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if machine_identities_count and not isinstance(machine_identities_count, int):
            raise TypeError("Expected argument 'machine_identities_count' to be a int")
        pulumi.set(__self__, "machine_identities_count", machine_identities_count)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="cloudProviderId")
    def cloud_provider_id(self) -> str:
        return pulumi.get(self, "cloud_provider_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="machineIdentitiesCount")
    def machine_identities_count(self) -> int:
        """
        Number of machine identities provisioned to the cloud keystore.
        """
        return pulumi.get(self, "machine_identities_count")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        The cloud keystore type. Either `ACM`, `AKV` or `GCM`.
        """
        return pulumi.get(self, "type")


class AwaitableGetCloudKeystoreResult(GetCloudKeystoreResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCloudKeystoreResult(
            cloud_provider_id=self.cloud_provider_id,
            id=self.id,
            machine_identities_count=self.machine_identities_count,
            name=self.name,
            type=self.type)


def get_cloud_keystore(cloud_provider_id: Optional[str] = None,
                       name: Optional[str] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCloudKeystoreResult:
    """
    Use this data source to get the `ID` of a cloud keystore in Venafi Control Plane, referenced by its name and parent
    cloud provider ID. You can use `get_cloud_provider` data source to obtain the ID of the parent cloud provider.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_venafi as venafi

    # Find a cloud keystore with a static cloud provider id
    ck_example_by_id = venafi.get_cloud_keystore(cloud_provider_id="e48897d0-2762-11ef-8fab-79ac590dd358",
        name="Cloud Keystore Example")
    # Find a cloud keystore by using venafi_cloud_provider data source as input
    ck_example = venafi.get_cloud_keystore(cloud_provider_id=cp_example["id"],
        name="Cloud Keystore example")
    ```


    :param str cloud_provider_id: ID of the cloud provider whom the cloud keystore to look up belongs to.
    :param str name: Name of the cloud keystore to look up.
    """
    __args__ = dict()
    __args__['cloudProviderId'] = cloud_provider_id
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('venafi:index/getCloudKeystore:getCloudKeystore', __args__, opts=opts, typ=GetCloudKeystoreResult).value

    return AwaitableGetCloudKeystoreResult(
        cloud_provider_id=pulumi.get(__ret__, 'cloud_provider_id'),
        id=pulumi.get(__ret__, 'id'),
        machine_identities_count=pulumi.get(__ret__, 'machine_identities_count'),
        name=pulumi.get(__ret__, 'name'),
        type=pulumi.get(__ret__, 'type'))


@_utilities.lift_output_func(get_cloud_keystore)
def get_cloud_keystore_output(cloud_provider_id: Optional[pulumi.Input[str]] = None,
                              name: Optional[pulumi.Input[str]] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetCloudKeystoreResult]:
    """
    Use this data source to get the `ID` of a cloud keystore in Venafi Control Plane, referenced by its name and parent
    cloud provider ID. You can use `get_cloud_provider` data source to obtain the ID of the parent cloud provider.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_venafi as venafi

    # Find a cloud keystore with a static cloud provider id
    ck_example_by_id = venafi.get_cloud_keystore(cloud_provider_id="e48897d0-2762-11ef-8fab-79ac590dd358",
        name="Cloud Keystore Example")
    # Find a cloud keystore by using venafi_cloud_provider data source as input
    ck_example = venafi.get_cloud_keystore(cloud_provider_id=cp_example["id"],
        name="Cloud Keystore example")
    ```


    :param str cloud_provider_id: ID of the cloud provider whom the cloud keystore to look up belongs to.
    :param str name: Name of the cloud keystore to look up.
    """
    ...