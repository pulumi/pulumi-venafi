"""A Python Pulumi program"""

import pulumi
import pulumi_venafi as venafi

config = pulumi.Config()
PASSWORD = config.require_secret("CertificatePassword")

certificate = venafi.Certificate("demo-certificate-py",
                                 common_name="demo-py.mycompany.io",
                                 san_dns=["web01.venafi.example", "web02.venafi.example"],
                                 algoritm="RSA",
                                 rsa_bits=2048,
                                 key_password=PASSWORD,
                                 custom_fields={
                                     "team": "development",
                                 })

pulumi.export("expiration_window", certificate.expiration_window)
