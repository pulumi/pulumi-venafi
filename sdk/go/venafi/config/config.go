// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package config

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

// Access token for TPP, user should use this for authentication
func GetAccessToken(ctx *pulumi.Context) string {
	return config.Get(ctx, "venafi:accessToken")
}

// API key for Venafi Cloud. Example: 142231b7-cvb0-412e-886b-6aeght0bc93d
func GetApiKey(ctx *pulumi.Context) string {
	return config.Get(ctx, "venafi:apiKey")
}

// When set to true, the resulting certificate will be issued by an ephemeral, no trust CA rather than enrolling using
// Venafi Cloud or Platform. Useful for development and testing.
func GetDevMode(ctx *pulumi.Context) bool {
	return config.GetBool(ctx, "venafi:devMode")
}

// Password for WebSDK user. Example: password
//
// Deprecated: , please use access_token instead
func GetTppPassword(ctx *pulumi.Context) string {
	return config.Get(ctx, "venafi:tppPassword")
}

// WebSDK user for Venafi Platform. Example: admin
//
// Deprecated: , please use access_token instead
func GetTppUsername(ctx *pulumi.Context) string {
	return config.Get(ctx, "venafi:tppUsername")
}

// Use to specify a PEM-formatted file that contains certificates to be trust anchors for all communications with the
// Venafi Web Service. Example: trust_bundle = "${file("chain.pem")}"
func GetTrustBundle(ctx *pulumi.Context) string {
	return config.Get(ctx, "venafi:trustBundle")
}

// The Venafi Web Service URL.. Example: https://tpp.venafi.example/vedsdk
func GetUrl(ctx *pulumi.Context) string {
	return config.Get(ctx, "venafi:url")
}

// DN of the Venafi Platform policy folder or name of the Venafi Cloud zone. Example for Platform: testpolicy\\vault
// Example for Venafi Cloud: Default
func GetZone(ctx *pulumi.Context) string {
	return config.Get(ctx, "venafi:zone")
}
