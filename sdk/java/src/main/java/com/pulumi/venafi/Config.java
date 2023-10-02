// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.venafi;

import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;

public final class Config {

    private static final com.pulumi.Config config = com.pulumi.Config.of("venafi");
/**
 * Access token for Venafi TLSPDC, user should use this for authentication
 * 
 */
    public Optional<String> accessToken() {
        return Codegen.stringProp("accessToken").config(config).get();
    }
/**
 * API key for Venafi as a Service. Example: 142231b7-cvb0-412e-886b-6aeght0bc93d
 * 
 */
    public Optional<String> apiKey() {
        return Codegen.stringProp("apiKey").config(config).get();
    }
/**
 * application that will be using the token
 * 
 */
    public Optional<String> clientId() {
        return Codegen.stringProp("clientId").config(config).get();
    }
/**
 * When set to true, the resulting certificate will be issued by an ephemeral, no trust CA rather than enrolling using
 * Venafi as a Service or Trust Protection Platform. Useful for development and testing.
 * 
 */
    public Optional<Boolean> devMode() {
        return Codegen.booleanProp("devMode").config(config).get();
    }
/**
 * Filename of PKCS#12 keystore containing a client certificate, private key, and chain certificates to authenticate to
 * TLSPDC
 * 
 */
    public Optional<String> p12CertFilename() {
        return Codegen.stringProp("p12CertFilename").config(config).get();
    }
/**
 * Password for the PKCS#12 keystore declared in p12_cert
 * 
 */
    public Optional<String> p12CertPassword() {
        return Codegen.stringProp("p12CertPassword").config(config).get();
    }
/**
 * Password for WebSDK user. Example: password
 * 
 */
    public Optional<String> tppPassword() {
        return Codegen.stringProp("tppPassword").config(config).get();
    }
/**
 * WebSDK user for Venafi TLSPDC. Example: admin
 * 
 */
    public Optional<String> tppUsername() {
        return Codegen.stringProp("tppUsername").config(config).get();
    }
/**
 * Use to specify a PEM-formatted file that contains certificates to be trust anchors for all communications with the
 * Venafi Web Service. Example: trust_bundle = &#34;${file(&#34;chain.pem&#34;)}&#34;
 * 
 */
    public Optional<String> trustBundle() {
        return Codegen.stringProp("trustBundle").config(config).get();
    }
/**
 * The Venafi Platform URL. Example: https://tpp.venafi.example/vedsdk
 * 
 */
    public Optional<String> url() {
        return Codegen.stringProp("url").config(config).get();
    }
/**
 * DN of the Venafi TLSPDC policy folder or name of the Venafi as a Service application plus issuing template alias.
 * Example for Platform: testPolicy\\vault Example for Venafi as a Service: myApp\\Default
 * 
 */
    public Optional<String> zone() {
        return Codegen.stringProp("zone").config(config).get();
    }
}
