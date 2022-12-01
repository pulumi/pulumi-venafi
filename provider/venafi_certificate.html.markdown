---
layout: "venafi"
page_title: "Venafi: venafi_certificate"
sidebar_current: "docs-venafi-resource-venafi-certificate"
description: |-
Provides access to TLS key and certificate data in Venafi. This can be used to define a Venafi certificate.
---

# venafi_certificate

!> We dropped support for RSA PKCS#1 formatted keys for TLS certificates in version 15.0 and also for EC Keys in 
version 0.15.4 (you can find out more about this transition in [here](https://github.com/Venafi/vcert/releases/tag/v4.17.0)).
For backward compatibility during Terraform state refresh please update to version 0.15.5 or above.

Provides access to TLS key and certificate data enrolled using Venafi. This can be used to define a
certificate.

The `venafi_certificate` resource handles certificate renewals as long as a
`pulumi up` is run within the `expiration_window` period. Keep in mind that the
`expiration_window` in the provider configuration needs to align with the renewal
window of the issuing CA to achieve the desired result.

## Example Usage

```hcl
resource "venafi_certificate" "webserver" {
    common_name = "web.venafi.example"
    san_dns = [
        "web01.venafi.example",
        "web02.venafi.example"
    ]
    algorithm = "RSA"
    rsa_bits = "2048"
    key_password = "${var.pk_pass}"
    custom_fields = {
        "Cost Center" = "AB1234",
        "Environment" = "UAT|Staging"
    }
}
```

## Argument Reference

The following arguments are supported:

~>**Note:** Updating `expiration_window` will not trigger another resource to be created by itself, thus won't enroll a new certificate. This won't apply if the `expiration_window` constraint allows it, this means, if time to expire of the certificate is within the expiration window.

* `common_name` - (Required, string) The common name of the certificate.

* `algorithm` - (Optional, string) Key encryption algorithm, either `RSA` or `ECDSA`.
  Defaults to `RSA`.

* `rsa_bits` - (Optional, integer) Number of bits to use when generating an RSA key.
  Applies when `algorithm=RSA`.  Defaults to `2048`.

* `ecsa_curve` - (Optional, string) Elliptic curve to use when generating an ECDSA
  key pair.  Applies when `algorithm=ECDSA`.  Defaults to `P521`.

* `san_dns` - (Optional, set of strings) List of DNS names to use as alternative
  subjects of the certificate.

* `san_email` - (Optional, set of strings) List of email addresses to use as
  alternative subjects of the certificate.

* `san_ip` - (Optional, set of strings) List of IP addresses to use as alternative
  subjects of the certificate.

* `san_uri` - (Optional, set of strings) List of Uniform Resource Identifiers (URIs) to use as alternative
  subjects of the certificate.

* `key_password` - (Optional, string) The password used to encrypt the private key.

* `custom_fields` - (Optional, map) Collection of Custom Field name-value pairs to
  assign to the certificate.

* `valid_days` - (Optional, integer) Desired number of days for which the new
  certificate will be valid.

* `issuer_hint` - (Optional, string) Used with valid_days to indicate the target
  issuer when using Trust Protection Platform.  Relevant values are: "DigiCert",
  "Entrust", and "Microsoft".

* `expiration_window` - (Optional, integer) Number of hours before certificate expiry
  to request a new certificate.  Defaults to `168`.

* `csr_origin` - (Optional, string) Whether key-pair generation will be `local` or `service` generated. Default is `local`.

## Attributes Reference

The following attributes are exported:

* `private_key_pem` - The private key in PEM format.

* `chain` - The trust chain of X509 certificate authority certificates in PEM format
  concatenated together.

* `certificate` - The X509 certificate in PEM format.

* `pkcs12` - A base64-encoded PKCS#12 keystore secured by the `key_password`.
