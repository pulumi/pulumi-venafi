module github.com/pulumi/pulumi-venafi/provider

go 1.14

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/Venafi/terraform-provider-venafi => github.com/pulumi/terraform-provider-venafi v0.10.2-0.20201019162410-4c2d7bacfc21
)

require (
	github.com/Venafi/terraform-provider-venafi v0.0.0-00010101000000-000000000000
	github.com/hashicorp/terraform-plugin-sdk v1.9.1
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.11.0
	github.com/pulumi/pulumi/sdk/v2 v2.12.0
)
