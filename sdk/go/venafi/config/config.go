// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package config

import (
	"github.com/pulumi/pulumi-venafi/sdk/go/venafi/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

var _ = internal.GetEnvOrDefault

// Access token for Venafi TLSPDC, user should use this for authentication
func GetAccessToken(ctx *pulumi.Context) string {
	return config.Get(ctx, "venafi:accessToken")
}

// API key for Venafi Control Plane. Example: 142231b7-cvb0-412e-886b-6aeght0bc93d
func GetApiKey(ctx *pulumi.Context) string {
	return config.Get(ctx, "venafi:apiKey")
}

// application that will be using the token
func GetClientId(ctx *pulumi.Context) string {
	return config.Get(ctx, "venafi:clientId")
}

// When set to true, the resulting certificate will be issued by an ephemeral, no trust CA rather than enrolling using
// Venafi as a Service or Trust Protection Platform. Useful for development and testing.
func GetDevMode(ctx *pulumi.Context) bool {
	return config.GetBool(ctx, "venafi:devMode")
}

// JWT of the identity provider associated to the Venafi Control Plane service account that is granting the access token
func GetIdpJwt(ctx *pulumi.Context) string {
	return config.Get(ctx, "venafi:idpJwt")
}

// Filename of PKCS#12 keystore containing a client certificate, private key, and chain certificates to authenticate to
// TLSPDC
func GetP12CertFilename(ctx *pulumi.Context) string {
	return config.Get(ctx, "venafi:p12CertFilename")
}

// Password for the PKCS#12 keystore declared in p12_cert
func GetP12CertPassword(ctx *pulumi.Context) string {
	return config.Get(ctx, "venafi:p12CertPassword")
}
func GetSkipRetirement(ctx *pulumi.Context) bool {
	return config.GetBool(ctx, "venafi:skipRetirement")
}

// Endpoint URL to request new Venafi Control Plane access tokens
func GetTokenUrl(ctx *pulumi.Context) string {
	return config.Get(ctx, "venafi:tokenUrl")
}

// Password for WebSDK user. Example: password
//
// Deprecated: , please use accessToken instead
func GetTppPassword(ctx *pulumi.Context) string {
	return config.Get(ctx, "venafi:tppPassword")
}

// WebSDK user for Venafi TLSPDC. Example: admin
//
// Deprecated: , please use accessToken instead
func GetTppUsername(ctx *pulumi.Context) string {
	return config.Get(ctx, "venafi:tppUsername")
}

// Use to specify a PEM-formatted file that contains certificates to be trust anchors for all communications with the
// Venafi Web Service. Example: trustBundle = "${file("chain.pem")}"
func GetTrustBundle(ctx *pulumi.Context) string {
	return config.Get(ctx, "venafi:trustBundle")
}

// The Venafi Platform URL. Example: https://tpp.venafi.example/vedsdk
func GetUrl(ctx *pulumi.Context) string {
	return config.Get(ctx, "venafi:url")
}

// DN of the Venafi TLSPDC policy folder or name of the Venafi as a Service application plus issuing template alias.
// Example for Platform: testPolicy\\vault Example for Venafi as a Service: myApp\\Default
func GetZone(ctx *pulumi.Context) string {
	return config.Get(ctx, "venafi:zone")
}
