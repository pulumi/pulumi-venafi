// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.venafi;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderArgs Empty = new ProviderArgs();

    /**
     * Access token for Venafi TLSPDC, user should use this for authentication
     * 
     */
    @Import(name="accessToken")
    private @Nullable Output<String> accessToken;

    /**
     * @return Access token for Venafi TLSPDC, user should use this for authentication
     * 
     */
    public Optional<Output<String>> accessToken() {
        return Optional.ofNullable(this.accessToken);
    }

    /**
     * API key for Venafi as a Service. Example: 142231b7-cvb0-412e-886b-6aeght0bc93d
     * 
     */
    @Import(name="apiKey")
    private @Nullable Output<String> apiKey;

    /**
     * @return API key for Venafi as a Service. Example: 142231b7-cvb0-412e-886b-6aeght0bc93d
     * 
     */
    public Optional<Output<String>> apiKey() {
        return Optional.ofNullable(this.apiKey);
    }

    /**
     * application that will be using the token
     * 
     */
    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    /**
     * @return application that will be using the token
     * 
     */
    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * When set to true, the resulting certificate will be issued by an ephemeral, no trust CA rather than enrolling using
     * Venafi as a Service or Trust Protection Platform. Useful for development and testing.
     * 
     */
    @Import(name="devMode", json=true)
    private @Nullable Output<Boolean> devMode;

    /**
     * @return When set to true, the resulting certificate will be issued by an ephemeral, no trust CA rather than enrolling using
     * Venafi as a Service or Trust Protection Platform. Useful for development and testing.
     * 
     */
    public Optional<Output<Boolean>> devMode() {
        return Optional.ofNullable(this.devMode);
    }

    /**
     * Filename of PKCS#12 keystore containing a client certificate, private key, and chain certificates to authenticate to
     * TLSPDC
     * 
     */
    @Import(name="p12CertFilename")
    private @Nullable Output<String> p12CertFilename;

    /**
     * @return Filename of PKCS#12 keystore containing a client certificate, private key, and chain certificates to authenticate to
     * TLSPDC
     * 
     */
    public Optional<Output<String>> p12CertFilename() {
        return Optional.ofNullable(this.p12CertFilename);
    }

    /**
     * Password for the PKCS#12 keystore declared in p12_cert
     * 
     */
    @Import(name="p12CertPassword")
    private @Nullable Output<String> p12CertPassword;

    /**
     * @return Password for the PKCS#12 keystore declared in p12_cert
     * 
     */
    public Optional<Output<String>> p12CertPassword() {
        return Optional.ofNullable(this.p12CertPassword);
    }

    /**
     * When true, certificates will not be retired on Venafi platforms when terraform destroy is run. Default is false.
     * 
     */
    @Import(name="skipRetirement", json=true)
    private @Nullable Output<Boolean> skipRetirement;

    /**
     * @return When true, certificates will not be retired on Venafi platforms when terraform destroy is run. Default is false.
     * 
     */
    public Optional<Output<Boolean>> skipRetirement() {
        return Optional.ofNullable(this.skipRetirement);
    }

    /**
     * Password for WebSDK user. Example: password
     * 
     * @deprecated
     * , please use access_token instead
     * 
     */
    @Deprecated /* , please use access_token instead */
    @Import(name="tppPassword")
    private @Nullable Output<String> tppPassword;

    /**
     * @return Password for WebSDK user. Example: password
     * 
     * @deprecated
     * , please use access_token instead
     * 
     */
    @Deprecated /* , please use access_token instead */
    public Optional<Output<String>> tppPassword() {
        return Optional.ofNullable(this.tppPassword);
    }

    /**
     * WebSDK user for Venafi TLSPDC. Example: admin
     * 
     * @deprecated
     * , please use access_token instead
     * 
     */
    @Deprecated /* , please use access_token instead */
    @Import(name="tppUsername")
    private @Nullable Output<String> tppUsername;

    /**
     * @return WebSDK user for Venafi TLSPDC. Example: admin
     * 
     * @deprecated
     * , please use access_token instead
     * 
     */
    @Deprecated /* , please use access_token instead */
    public Optional<Output<String>> tppUsername() {
        return Optional.ofNullable(this.tppUsername);
    }

    /**
     * Use to specify a PEM-formatted file that contains certificates to be trust anchors for all communications with the
     * Venafi Web Service. Example: trust_bundle = &#34;${file(&#34;chain.pem&#34;)}&#34;
     * 
     */
    @Import(name="trustBundle")
    private @Nullable Output<String> trustBundle;

    /**
     * @return Use to specify a PEM-formatted file that contains certificates to be trust anchors for all communications with the
     * Venafi Web Service. Example: trust_bundle = &#34;${file(&#34;chain.pem&#34;)}&#34;
     * 
     */
    public Optional<Output<String>> trustBundle() {
        return Optional.ofNullable(this.trustBundle);
    }

    /**
     * The Venafi Platform URL. Example: https://tpp.venafi.example/vedsdk
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return The Venafi Platform URL. Example: https://tpp.venafi.example/vedsdk
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    /**
     * DN of the Venafi TLSPDC policy folder or name of the Venafi as a Service application plus issuing template alias.
     * Example for Platform: testPolicy\\vault Example for Venafi as a Service: myApp\\Default
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    /**
     * @return DN of the Venafi TLSPDC policy folder or name of the Venafi as a Service application plus issuing template alias.
     * Example for Platform: testPolicy\\vault Example for Venafi as a Service: myApp\\Default
     * 
     */
    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private ProviderArgs() {}

    private ProviderArgs(ProviderArgs $) {
        this.accessToken = $.accessToken;
        this.apiKey = $.apiKey;
        this.clientId = $.clientId;
        this.devMode = $.devMode;
        this.p12CertFilename = $.p12CertFilename;
        this.p12CertPassword = $.p12CertPassword;
        this.skipRetirement = $.skipRetirement;
        this.tppPassword = $.tppPassword;
        this.tppUsername = $.tppUsername;
        this.trustBundle = $.trustBundle;
        this.url = $.url;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderArgs $;

        public Builder() {
            $ = new ProviderArgs();
        }

        public Builder(ProviderArgs defaults) {
            $ = new ProviderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessToken Access token for Venafi TLSPDC, user should use this for authentication
         * 
         * @return builder
         * 
         */
        public Builder accessToken(@Nullable Output<String> accessToken) {
            $.accessToken = accessToken;
            return this;
        }

        /**
         * @param accessToken Access token for Venafi TLSPDC, user should use this for authentication
         * 
         * @return builder
         * 
         */
        public Builder accessToken(String accessToken) {
            return accessToken(Output.of(accessToken));
        }

        /**
         * @param apiKey API key for Venafi as a Service. Example: 142231b7-cvb0-412e-886b-6aeght0bc93d
         * 
         * @return builder
         * 
         */
        public Builder apiKey(@Nullable Output<String> apiKey) {
            $.apiKey = apiKey;
            return this;
        }

        /**
         * @param apiKey API key for Venafi as a Service. Example: 142231b7-cvb0-412e-886b-6aeght0bc93d
         * 
         * @return builder
         * 
         */
        public Builder apiKey(String apiKey) {
            return apiKey(Output.of(apiKey));
        }

        /**
         * @param clientId application that will be using the token
         * 
         * @return builder
         * 
         */
        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId application that will be using the token
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param devMode When set to true, the resulting certificate will be issued by an ephemeral, no trust CA rather than enrolling using
         * Venafi as a Service or Trust Protection Platform. Useful for development and testing.
         * 
         * @return builder
         * 
         */
        public Builder devMode(@Nullable Output<Boolean> devMode) {
            $.devMode = devMode;
            return this;
        }

        /**
         * @param devMode When set to true, the resulting certificate will be issued by an ephemeral, no trust CA rather than enrolling using
         * Venafi as a Service or Trust Protection Platform. Useful for development and testing.
         * 
         * @return builder
         * 
         */
        public Builder devMode(Boolean devMode) {
            return devMode(Output.of(devMode));
        }

        /**
         * @param p12CertFilename Filename of PKCS#12 keystore containing a client certificate, private key, and chain certificates to authenticate to
         * TLSPDC
         * 
         * @return builder
         * 
         */
        public Builder p12CertFilename(@Nullable Output<String> p12CertFilename) {
            $.p12CertFilename = p12CertFilename;
            return this;
        }

        /**
         * @param p12CertFilename Filename of PKCS#12 keystore containing a client certificate, private key, and chain certificates to authenticate to
         * TLSPDC
         * 
         * @return builder
         * 
         */
        public Builder p12CertFilename(String p12CertFilename) {
            return p12CertFilename(Output.of(p12CertFilename));
        }

        /**
         * @param p12CertPassword Password for the PKCS#12 keystore declared in p12_cert
         * 
         * @return builder
         * 
         */
        public Builder p12CertPassword(@Nullable Output<String> p12CertPassword) {
            $.p12CertPassword = p12CertPassword;
            return this;
        }

        /**
         * @param p12CertPassword Password for the PKCS#12 keystore declared in p12_cert
         * 
         * @return builder
         * 
         */
        public Builder p12CertPassword(String p12CertPassword) {
            return p12CertPassword(Output.of(p12CertPassword));
        }

        /**
         * @param skipRetirement When true, certificates will not be retired on Venafi platforms when terraform destroy is run. Default is false.
         * 
         * @return builder
         * 
         */
        public Builder skipRetirement(@Nullable Output<Boolean> skipRetirement) {
            $.skipRetirement = skipRetirement;
            return this;
        }

        /**
         * @param skipRetirement When true, certificates will not be retired on Venafi platforms when terraform destroy is run. Default is false.
         * 
         * @return builder
         * 
         */
        public Builder skipRetirement(Boolean skipRetirement) {
            return skipRetirement(Output.of(skipRetirement));
        }

        /**
         * @param tppPassword Password for WebSDK user. Example: password
         * 
         * @return builder
         * 
         * @deprecated
         * , please use access_token instead
         * 
         */
        @Deprecated /* , please use access_token instead */
        public Builder tppPassword(@Nullable Output<String> tppPassword) {
            $.tppPassword = tppPassword;
            return this;
        }

        /**
         * @param tppPassword Password for WebSDK user. Example: password
         * 
         * @return builder
         * 
         * @deprecated
         * , please use access_token instead
         * 
         */
        @Deprecated /* , please use access_token instead */
        public Builder tppPassword(String tppPassword) {
            return tppPassword(Output.of(tppPassword));
        }

        /**
         * @param tppUsername WebSDK user for Venafi TLSPDC. Example: admin
         * 
         * @return builder
         * 
         * @deprecated
         * , please use access_token instead
         * 
         */
        @Deprecated /* , please use access_token instead */
        public Builder tppUsername(@Nullable Output<String> tppUsername) {
            $.tppUsername = tppUsername;
            return this;
        }

        /**
         * @param tppUsername WebSDK user for Venafi TLSPDC. Example: admin
         * 
         * @return builder
         * 
         * @deprecated
         * , please use access_token instead
         * 
         */
        @Deprecated /* , please use access_token instead */
        public Builder tppUsername(String tppUsername) {
            return tppUsername(Output.of(tppUsername));
        }

        /**
         * @param trustBundle Use to specify a PEM-formatted file that contains certificates to be trust anchors for all communications with the
         * Venafi Web Service. Example: trust_bundle = &#34;${file(&#34;chain.pem&#34;)}&#34;
         * 
         * @return builder
         * 
         */
        public Builder trustBundle(@Nullable Output<String> trustBundle) {
            $.trustBundle = trustBundle;
            return this;
        }

        /**
         * @param trustBundle Use to specify a PEM-formatted file that contains certificates to be trust anchors for all communications with the
         * Venafi Web Service. Example: trust_bundle = &#34;${file(&#34;chain.pem&#34;)}&#34;
         * 
         * @return builder
         * 
         */
        public Builder trustBundle(String trustBundle) {
            return trustBundle(Output.of(trustBundle));
        }

        /**
         * @param url The Venafi Platform URL. Example: https://tpp.venafi.example/vedsdk
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The Venafi Platform URL. Example: https://tpp.venafi.example/vedsdk
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        /**
         * @param zone DN of the Venafi TLSPDC policy folder or name of the Venafi as a Service application plus issuing template alias.
         * Example for Platform: testPolicy\\vault Example for Venafi as a Service: myApp\\Default
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone DN of the Venafi TLSPDC policy folder or name of the Venafi as a Service application plus issuing template alias.
         * Example for Platform: testPolicy\\vault Example for Venafi as a Service: myApp\\Default
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public ProviderArgs build() {
            return $;
        }
    }

}
