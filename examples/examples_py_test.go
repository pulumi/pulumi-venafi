// Copyright 2016-2020, Pulumi Corporation.  All rights reserved.
//go:build python || all
// +build python all

package examples

import (
	"path/filepath"
	"testing"

	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
)

func TestCertificatePy(t *testing.T) {
	test := getPythonBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: filepath.Join(getCwd(t), "certificate", "py"),
		})

	integration.ProgramTest(t, &test)
}

func getPythonBaseOptions(t *testing.T) integration.ProgramTestOptions {
	base := getBaseOptions(t)
	basePy := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			filepath.Join("..", "sdk", "python", "bin"),
		},
		// The Venafi tests run against a staging environment that is not always sufficiently warmed up to pass
		// the tests within the timeout. We retry failed steps to guard against this condition:
		RetryFailedSteps: true,
	})

	return basePy
}
