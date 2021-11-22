[![Actions Status](https://github.com/pulumi/pulumi-venafi/workflows/master/badge.svg)](https://github.com/pulumi/pulumi-venafi/actions)
[![Slack](http://www.pulumi.com/images/docs/badges/slack.svg)](https://slack.pulumi.com)
[![NPM version](https://badge.fury.io/js/%40pulumi%2Fvenafi.svg)](https://www.npmjs.com/package/@pulumi/venafi)
[![Python version](https://badge.fury.io/py/pulumi-venafi.svg)](https://pypi.org/project/pulumi-venafi)
[![NuGet version](https://badge.fury.io/nu/pulumi.venafi.svg)](https://badge.fury.io/nu/pulumi.venafi)
[![PkgGoDev](https://pkg.go.dev/badge/github.com/pulumi/pulumi-venafi/sdk/go)](https://pkg.go.dev/github.com/pulumi/pulumi-venafi/sdk/go)
[![License](https://img.shields.io/npm/l/%40pulumi%2Fpulumi.svg)](https://github.com/pulumi/pulumi-venafi/blob/master/LICENSE)

# Venafi Resource Provider

The Venafi Resource Provider lets you manage Venafi resources.

## Installing

This package is available in many languages in the standard packaging formats.

### Node.js (Java/TypeScript)

To use from JavaScript or TypeScript in Node.js, install using either `npm`:

    $ npm install @pulumi/venafi

or `yarn`:

    $ yarn add @pulumi/venafi

### Python

To use from Python, install using `pip`:

    $ pip install pulumi_venafi

### Go

To use from Go, use `go get` to grab the latest version of the library

    $ go get github.com/pulumi/pulumi-venafi/sdk

### .NET

To use from .NET, install using `dotnet add package`:

    $ dotnet add package Pulumi.Venafi

## Configuration

The following configuration points are available:

- `venafi:zone` - (Optional) Zone ID for Venafi Cloud or policy folder for Venafi Platform.  
  It can also be sourced from the `VENAFI_ZONE` environment variable.
- `venafi:url` - (Optional) Venafi URL (e.g. `https://tpp.venafi.example`). It can also be sourced
  from the `VENAFI_URL` environment variable.
- `venafi:accessToken` - (Optional) authentication token for the API Application 
  (applies only to Venafi Platform). It can also be sourced  from the `VENAFI_TOKEN` environment variable.
- `venafi:apiKey` - (Optional) REST API key for authentication (applies only to Venafi Cloud).
  It can also be sourced  from the `VENAFI_API` environment variable.
- `venafi:tppUsername` - (Optional) WebSDK account username for authentication (applies only to Venafi Platform).
  It can also be sourced  from the `VENAFI_USER` environment variable.
- `venafi:tppPassword` - (Optional) WebSDK account password for authentication (applies only to Venafi Platform).
  It can also be sourced  from the `VENAFI_PASS` environment variable.
- `venafi:trustBundle` - (Optional) PEM trust bundle for Venafi Platform server certificate.
- `venafi:devMode` - (Optional) When `true` will test the provider without connecting to Venafi Platform or Venafi Cloud.
  It can also be sourced  from the `VENAFI_DEVMODE` environment variable.

## Reference

For further information, please visit [the Venafi provider docs](https://www.pulumi.com/docs/intro/cloud-providers/venafi)
or for detailed reference documentation, please visit [the API docs](https://www.pulumi.com/docs/reference/pkg/venafi).
