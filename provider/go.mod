module github.com/pulumi/pulumi-venafi/provider

go 1.16

replace github.com/Venafi/terraform-provider-venafi => github.com/pulumi/terraform-provider-venafi v0.10.2-0.20210922135732-88b8dad04f30

require (
	github.com/Venafi/terraform-provider-venafi v0.0.0-00010101000000-000000000000
	github.com/hashicorp/terraform-plugin-sdk v1.9.1
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.19.1
	github.com/pulumi/pulumi/sdk/v3 v3.25.0
)
