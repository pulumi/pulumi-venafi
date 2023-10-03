package examples

import (
	"fmt"
	"os"
	"os/exec"
	"testing"

	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
)

var VENAFI_TOKEN string

func init() {
	accessToken, err := exec.Command("./get_token.sh").Output()
	if err != nil {
		panic(fmt.Sprintf("Expected to get a token: %v", err))
	}
	VENAFI_TOKEN = string(accessToken)
	err = os.Setenv("VENAFI_TOKEN", VENAFI_TOKEN)
	if err != nil {
		panic(fmt.Sprintf("Error setting env var VENAFI_TOKEN: %v", err))
	}
}

func getCwd(t *testing.T) string {
	cwd, err := os.Getwd()
	if err != nil {
		t.FailNow()
	}

	return cwd
}

func getBaseOptions(t *testing.T) integration.ProgramTestOptions {
	t.Skip("Skipping due to expired Venafi token")
	return integration.ProgramTestOptions{
		ExpectRefreshChanges: true,
		Secrets: map[string]string{
			"CertificatePassword": "Password1234!",
		},
		Env: []string{
			fmt.Sprintf("VENAFI_TOKEN=%s", VENAFI_TOKEN),
		},
	}
}
