// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.venafi;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SshCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final SshCertificateArgs Empty = new SshCertificateArgs();

    /**
     * A list of one or more valid IP or CIDR destination hosts where the
     * certificate will authenticate.
     * 
     */
    @Import(name="destinationAddresses")
    private @Nullable Output<List<String>> destinationAddresses;

    /**
     * @return A list of one or more valid IP or CIDR destination hosts where the
     * certificate will authenticate.
     * 
     */
    public Optional<Output<List<String>>> destinationAddresses() {
        return Optional.ofNullable(this.destinationAddresses);
    }

    /**
     * A list of key-value pairs that contain certificate extensions from the CA
     * template for client certificates. Allowed values (case-sensitive): `permit-X11-forwarding`, `permit-agent-forwarding`,
     * `permit-port-forwarding`, `permit-pty`, `permit-user-rc`.
     * 
     */
    @Import(name="extensions")
    private @Nullable Output<List<String>> extensions;

    /**
     * @return A list of key-value pairs that contain certificate extensions from the CA
     * template for client certificates. Allowed values (case-sensitive): `permit-X11-forwarding`, `permit-agent-forwarding`,
     * `permit-port-forwarding`, `permit-pty`, `permit-user-rc`.
     * 
     */
    public Optional<Output<List<String>>> extensions() {
        return Optional.ofNullable(this.extensions);
    }

    /**
     * The DN of the policy folder where the SSH certificate object will be created.
     * 
     */
    @Import(name="folder")
    private @Nullable Output<String> folder;

    /**
     * @return The DN of the policy folder where the SSH certificate object will be created.
     * 
     */
    public Optional<Output<String>> folder() {
        return Optional.ofNullable(this.folder);
    }

    /**
     * A command to run after successful login.
     * 
     */
    @Import(name="forceCommand")
    private @Nullable Output<String> forceCommand;

    /**
     * @return A command to run after successful login.
     * 
     */
    public Optional<Output<String>> forceCommand() {
        return Optional.ofNullable(this.forceCommand);
    }

    /**
     * The identifier of the requested SSH certificate.
     * 
     */
    @Import(name="keyId", required=true)
    private Output<String> keyId;

    /**
     * @return The identifier of the requested SSH certificate.
     * 
     */
    public Output<String> keyId() {
        return this.keyId;
    }

    /**
     * Passphrase for encrypting the private key.
     * 
     */
    @Import(name="keyPassphrase")
    private @Nullable Output<String> keyPassphrase;

    /**
     * @return Passphrase for encrypting the private key.
     * 
     */
    public Optional<Output<String>> keyPassphrase() {
        return Optional.ofNullable(this.keyPassphrase);
    }

    /**
     * Number of bits to use when creating a key pair. (e.g. `3072`).
     * 
     */
    @Import(name="keySize")
    private @Nullable Output<Integer> keySize;

    /**
     * @return Number of bits to use when creating a key pair. (e.g. `3072`).
     * 
     */
    public Optional<Output<Integer>> keySize() {
        return Optional.ofNullable(this.keySize);
    }

    /**
     * The friendly name of the SSH certificate object. When not specified the `key_id`
     * is used for the friendly name. If the object already exists the old certificate is archived and the CA issues a new
     * certificate.
     * 
     */
    @Import(name="objectName")
    private @Nullable Output<String> objectName;

    /**
     * @return The friendly name of the SSH certificate object. When not specified the `key_id`
     * is used for the friendly name. If the object already exists the old certificate is archived and the CA issues a new
     * certificate.
     * 
     */
    public Optional<Output<String>> objectName() {
        return Optional.ofNullable(this.objectName);
    }

    /**
     * [DEPRECATED] - (Optional, set of strings) Use &#34;principals&#34; instead. A list of usernames for whom the
     * requested certificate will be valid.
     * 
     * @deprecated
     * This will be removed in the future. Use &#34;principals&#34; instead
     * 
     */
    @Deprecated /* This will be removed in the future. Use ""principals"" instead */
    @Import(name="principal")
    private @Nullable Output<List<String>> principal;

    /**
     * @return [DEPRECATED] - (Optional, set of strings) Use &#34;principals&#34; instead. A list of usernames for whom the
     * requested certificate will be valid.
     * 
     * @deprecated
     * This will be removed in the future. Use &#34;principals&#34; instead
     * 
     */
    @Deprecated /* This will be removed in the future. Use ""principals"" instead */
    public Optional<Output<List<String>>> principal() {
        return Optional.ofNullable(this.principal);
    }

    /**
     * A list of usernames for whom the requested certificate will be valid.
     * 
     */
    @Import(name="principals")
    private @Nullable Output<List<String>> principals;

    /**
     * @return A list of usernames for whom the requested certificate will be valid.
     * 
     */
    public Optional<Output<List<String>>> principals() {
        return Optional.ofNullable(this.principals);
    }

    /**
     * The OpenSSH formatted public key that will be used to generate the SSH certificate.
     * 
     */
    @Import(name="publicKey")
    private @Nullable Output<String> publicKey;

    /**
     * @return The OpenSSH formatted public key that will be used to generate the SSH certificate.
     * 
     */
    public Optional<Output<String>> publicKey() {
        return Optional.ofNullable(this.publicKey);
    }

    /**
     * Specifies whether the public key will be `local` (default), `file` or
     * `service` generated.
     * 
     */
    @Import(name="publicKeyMethod")
    private @Nullable Output<String> publicKeyMethod;

    /**
     * @return Specifies whether the public key will be `local` (default), `file` or
     * `service` generated.
     * 
     */
    public Optional<Output<String>> publicKeyMethod() {
        return Optional.ofNullable(this.publicKeyMethod);
    }

    /**
     * A list of one or more valid IP or CIDR addresses that can use the SSH
     * certificate.
     * 
     */
    @Import(name="sourceAddresses")
    private @Nullable Output<List<String>> sourceAddresses;

    /**
     * @return A list of one or more valid IP or CIDR addresses that can use the SSH
     * certificate.
     * 
     */
    public Optional<Output<List<String>>> sourceAddresses() {
        return Optional.ofNullable(this.sourceAddresses);
    }

    /**
     * The SSH certificate issuing template.
     * 
     */
    @Import(name="template", required=true)
    private Output<String> template;

    /**
     * @return The SSH certificate issuing template.
     * 
     */
    public Output<String> template() {
        return this.template;
    }

    /**
     * Desired number of hours for which the certificate will be valid.
     * 
     */
    @Import(name="validHours")
    private @Nullable Output<Integer> validHours;

    /**
     * @return Desired number of hours for which the certificate will be valid.
     * 
     */
    public Optional<Output<Integer>> validHours() {
        return Optional.ofNullable(this.validHours);
    }

    /**
     * Specifies whether the private key will use Windows/DOS style line breaks.
     * 
     */
    @Import(name="windows")
    private @Nullable Output<Boolean> windows;

    /**
     * @return Specifies whether the private key will use Windows/DOS style line breaks.
     * 
     */
    public Optional<Output<Boolean>> windows() {
        return Optional.ofNullable(this.windows);
    }

    private SshCertificateArgs() {}

    private SshCertificateArgs(SshCertificateArgs $) {
        this.destinationAddresses = $.destinationAddresses;
        this.extensions = $.extensions;
        this.folder = $.folder;
        this.forceCommand = $.forceCommand;
        this.keyId = $.keyId;
        this.keyPassphrase = $.keyPassphrase;
        this.keySize = $.keySize;
        this.objectName = $.objectName;
        this.principal = $.principal;
        this.principals = $.principals;
        this.publicKey = $.publicKey;
        this.publicKeyMethod = $.publicKeyMethod;
        this.sourceAddresses = $.sourceAddresses;
        this.template = $.template;
        this.validHours = $.validHours;
        this.windows = $.windows;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SshCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SshCertificateArgs $;

        public Builder() {
            $ = new SshCertificateArgs();
        }

        public Builder(SshCertificateArgs defaults) {
            $ = new SshCertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param destinationAddresses A list of one or more valid IP or CIDR destination hosts where the
         * certificate will authenticate.
         * 
         * @return builder
         * 
         */
        public Builder destinationAddresses(@Nullable Output<List<String>> destinationAddresses) {
            $.destinationAddresses = destinationAddresses;
            return this;
        }

        /**
         * @param destinationAddresses A list of one or more valid IP or CIDR destination hosts where the
         * certificate will authenticate.
         * 
         * @return builder
         * 
         */
        public Builder destinationAddresses(List<String> destinationAddresses) {
            return destinationAddresses(Output.of(destinationAddresses));
        }

        /**
         * @param destinationAddresses A list of one or more valid IP or CIDR destination hosts where the
         * certificate will authenticate.
         * 
         * @return builder
         * 
         */
        public Builder destinationAddresses(String... destinationAddresses) {
            return destinationAddresses(List.of(destinationAddresses));
        }

        /**
         * @param extensions A list of key-value pairs that contain certificate extensions from the CA
         * template for client certificates. Allowed values (case-sensitive): `permit-X11-forwarding`, `permit-agent-forwarding`,
         * `permit-port-forwarding`, `permit-pty`, `permit-user-rc`.
         * 
         * @return builder
         * 
         */
        public Builder extensions(@Nullable Output<List<String>> extensions) {
            $.extensions = extensions;
            return this;
        }

        /**
         * @param extensions A list of key-value pairs that contain certificate extensions from the CA
         * template for client certificates. Allowed values (case-sensitive): `permit-X11-forwarding`, `permit-agent-forwarding`,
         * `permit-port-forwarding`, `permit-pty`, `permit-user-rc`.
         * 
         * @return builder
         * 
         */
        public Builder extensions(List<String> extensions) {
            return extensions(Output.of(extensions));
        }

        /**
         * @param extensions A list of key-value pairs that contain certificate extensions from the CA
         * template for client certificates. Allowed values (case-sensitive): `permit-X11-forwarding`, `permit-agent-forwarding`,
         * `permit-port-forwarding`, `permit-pty`, `permit-user-rc`.
         * 
         * @return builder
         * 
         */
        public Builder extensions(String... extensions) {
            return extensions(List.of(extensions));
        }

        /**
         * @param folder The DN of the policy folder where the SSH certificate object will be created.
         * 
         * @return builder
         * 
         */
        public Builder folder(@Nullable Output<String> folder) {
            $.folder = folder;
            return this;
        }

        /**
         * @param folder The DN of the policy folder where the SSH certificate object will be created.
         * 
         * @return builder
         * 
         */
        public Builder folder(String folder) {
            return folder(Output.of(folder));
        }

        /**
         * @param forceCommand A command to run after successful login.
         * 
         * @return builder
         * 
         */
        public Builder forceCommand(@Nullable Output<String> forceCommand) {
            $.forceCommand = forceCommand;
            return this;
        }

        /**
         * @param forceCommand A command to run after successful login.
         * 
         * @return builder
         * 
         */
        public Builder forceCommand(String forceCommand) {
            return forceCommand(Output.of(forceCommand));
        }

        /**
         * @param keyId The identifier of the requested SSH certificate.
         * 
         * @return builder
         * 
         */
        public Builder keyId(Output<String> keyId) {
            $.keyId = keyId;
            return this;
        }

        /**
         * @param keyId The identifier of the requested SSH certificate.
         * 
         * @return builder
         * 
         */
        public Builder keyId(String keyId) {
            return keyId(Output.of(keyId));
        }

        /**
         * @param keyPassphrase Passphrase for encrypting the private key.
         * 
         * @return builder
         * 
         */
        public Builder keyPassphrase(@Nullable Output<String> keyPassphrase) {
            $.keyPassphrase = keyPassphrase;
            return this;
        }

        /**
         * @param keyPassphrase Passphrase for encrypting the private key.
         * 
         * @return builder
         * 
         */
        public Builder keyPassphrase(String keyPassphrase) {
            return keyPassphrase(Output.of(keyPassphrase));
        }

        /**
         * @param keySize Number of bits to use when creating a key pair. (e.g. `3072`).
         * 
         * @return builder
         * 
         */
        public Builder keySize(@Nullable Output<Integer> keySize) {
            $.keySize = keySize;
            return this;
        }

        /**
         * @param keySize Number of bits to use when creating a key pair. (e.g. `3072`).
         * 
         * @return builder
         * 
         */
        public Builder keySize(Integer keySize) {
            return keySize(Output.of(keySize));
        }

        /**
         * @param objectName The friendly name of the SSH certificate object. When not specified the `key_id`
         * is used for the friendly name. If the object already exists the old certificate is archived and the CA issues a new
         * certificate.
         * 
         * @return builder
         * 
         */
        public Builder objectName(@Nullable Output<String> objectName) {
            $.objectName = objectName;
            return this;
        }

        /**
         * @param objectName The friendly name of the SSH certificate object. When not specified the `key_id`
         * is used for the friendly name. If the object already exists the old certificate is archived and the CA issues a new
         * certificate.
         * 
         * @return builder
         * 
         */
        public Builder objectName(String objectName) {
            return objectName(Output.of(objectName));
        }

        /**
         * @param principal [DEPRECATED] - (Optional, set of strings) Use &#34;principals&#34; instead. A list of usernames for whom the
         * requested certificate will be valid.
         * 
         * @return builder
         * 
         * @deprecated
         * This will be removed in the future. Use &#34;principals&#34; instead
         * 
         */
        @Deprecated /* This will be removed in the future. Use ""principals"" instead */
        public Builder principal(@Nullable Output<List<String>> principal) {
            $.principal = principal;
            return this;
        }

        /**
         * @param principal [DEPRECATED] - (Optional, set of strings) Use &#34;principals&#34; instead. A list of usernames for whom the
         * requested certificate will be valid.
         * 
         * @return builder
         * 
         * @deprecated
         * This will be removed in the future. Use &#34;principals&#34; instead
         * 
         */
        @Deprecated /* This will be removed in the future. Use ""principals"" instead */
        public Builder principal(List<String> principal) {
            return principal(Output.of(principal));
        }

        /**
         * @param principal [DEPRECATED] - (Optional, set of strings) Use &#34;principals&#34; instead. A list of usernames for whom the
         * requested certificate will be valid.
         * 
         * @return builder
         * 
         * @deprecated
         * This will be removed in the future. Use &#34;principals&#34; instead
         * 
         */
        @Deprecated /* This will be removed in the future. Use ""principals"" instead */
        public Builder principal(String... principal) {
            return principal(List.of(principal));
        }

        /**
         * @param principals A list of usernames for whom the requested certificate will be valid.
         * 
         * @return builder
         * 
         */
        public Builder principals(@Nullable Output<List<String>> principals) {
            $.principals = principals;
            return this;
        }

        /**
         * @param principals A list of usernames for whom the requested certificate will be valid.
         * 
         * @return builder
         * 
         */
        public Builder principals(List<String> principals) {
            return principals(Output.of(principals));
        }

        /**
         * @param principals A list of usernames for whom the requested certificate will be valid.
         * 
         * @return builder
         * 
         */
        public Builder principals(String... principals) {
            return principals(List.of(principals));
        }

        /**
         * @param publicKey The OpenSSH formatted public key that will be used to generate the SSH certificate.
         * 
         * @return builder
         * 
         */
        public Builder publicKey(@Nullable Output<String> publicKey) {
            $.publicKey = publicKey;
            return this;
        }

        /**
         * @param publicKey The OpenSSH formatted public key that will be used to generate the SSH certificate.
         * 
         * @return builder
         * 
         */
        public Builder publicKey(String publicKey) {
            return publicKey(Output.of(publicKey));
        }

        /**
         * @param publicKeyMethod Specifies whether the public key will be `local` (default), `file` or
         * `service` generated.
         * 
         * @return builder
         * 
         */
        public Builder publicKeyMethod(@Nullable Output<String> publicKeyMethod) {
            $.publicKeyMethod = publicKeyMethod;
            return this;
        }

        /**
         * @param publicKeyMethod Specifies whether the public key will be `local` (default), `file` or
         * `service` generated.
         * 
         * @return builder
         * 
         */
        public Builder publicKeyMethod(String publicKeyMethod) {
            return publicKeyMethod(Output.of(publicKeyMethod));
        }

        /**
         * @param sourceAddresses A list of one or more valid IP or CIDR addresses that can use the SSH
         * certificate.
         * 
         * @return builder
         * 
         */
        public Builder sourceAddresses(@Nullable Output<List<String>> sourceAddresses) {
            $.sourceAddresses = sourceAddresses;
            return this;
        }

        /**
         * @param sourceAddresses A list of one or more valid IP or CIDR addresses that can use the SSH
         * certificate.
         * 
         * @return builder
         * 
         */
        public Builder sourceAddresses(List<String> sourceAddresses) {
            return sourceAddresses(Output.of(sourceAddresses));
        }

        /**
         * @param sourceAddresses A list of one or more valid IP or CIDR addresses that can use the SSH
         * certificate.
         * 
         * @return builder
         * 
         */
        public Builder sourceAddresses(String... sourceAddresses) {
            return sourceAddresses(List.of(sourceAddresses));
        }

        /**
         * @param template The SSH certificate issuing template.
         * 
         * @return builder
         * 
         */
        public Builder template(Output<String> template) {
            $.template = template;
            return this;
        }

        /**
         * @param template The SSH certificate issuing template.
         * 
         * @return builder
         * 
         */
        public Builder template(String template) {
            return template(Output.of(template));
        }

        /**
         * @param validHours Desired number of hours for which the certificate will be valid.
         * 
         * @return builder
         * 
         */
        public Builder validHours(@Nullable Output<Integer> validHours) {
            $.validHours = validHours;
            return this;
        }

        /**
         * @param validHours Desired number of hours for which the certificate will be valid.
         * 
         * @return builder
         * 
         */
        public Builder validHours(Integer validHours) {
            return validHours(Output.of(validHours));
        }

        /**
         * @param windows Specifies whether the private key will use Windows/DOS style line breaks.
         * 
         * @return builder
         * 
         */
        public Builder windows(@Nullable Output<Boolean> windows) {
            $.windows = windows;
            return this;
        }

        /**
         * @param windows Specifies whether the private key will use Windows/DOS style line breaks.
         * 
         * @return builder
         * 
         */
        public Builder windows(Boolean windows) {
            return windows(Output.of(windows));
        }

        public SshCertificateArgs build() {
            if ($.keyId == null) {
                throw new MissingRequiredPropertyException("SshCertificateArgs", "keyId");
            }
            if ($.template == null) {
                throw new MissingRequiredPropertyException("SshCertificateArgs", "template");
            }
            return $;
        }
    }

}
