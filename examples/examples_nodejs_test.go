// Copyright 2016-2020, Pulumi Corporation.  All rights reserved.
//go:build nodejs || all
// +build nodejs all

package examples

import (
	"path/filepath"
	"testing"

	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
)

func TestCertificateTs(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: filepath.Join(getCwd(t), "certificate", "ts"),
		})

	integration.ProgramTest(t, &test)
}

func getJSBaseOptions(t *testing.T) integration.ProgramTestOptions {
	base := getBaseOptions(t)
	baseJS := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			"@pulumi/venafi",
		},
		// The Venafi tests run against a staging environment that is not always sufficiently warmed up to pass
		// the tests within the timeout. We retry failed steps to guard against this condition:
		RetryFailedSteps: true,
	})

	return baseJS
}
