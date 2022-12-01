// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.venafi.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SshCertificateState extends com.pulumi.resources.ResourceArgs {

    public static final SshCertificateState Empty = new SshCertificateState();

    /**
     * The SSH Certificate
     * 
     */
    @Import(name="certificate")
    private @Nullable Output<String> certificate;

    /**
     * @return The SSH Certificate
     * 
     */
    public Optional<Output<String>> certificate() {
        return Optional.ofNullable(this.certificate);
    }

    /**
     * Certificate type, server or client
     * 
     */
    @Import(name="certificateType")
    private @Nullable Output<String> certificateType;

    /**
     * @return Certificate type, server or client
     * 
     */
    public Optional<Output<String>> certificateType() {
        return Optional.ofNullable(this.certificateType);
    }

    /**
     * The address (FQDN/hostname/IP/CIDR) of the destination host where the certificate will be used to authenticate to
     * 
     */
    @Import(name="destinationAddresses")
    private @Nullable Output<List<String>> destinationAddresses;

    /**
     * @return The address (FQDN/hostname/IP/CIDR) of the destination host where the certificate will be used to authenticate to
     * 
     */
    public Optional<Output<List<String>>> destinationAddresses() {
        return Optional.ofNullable(this.destinationAddresses);
    }

    /**
     * The requested certificate extensions.
     * 
     */
    @Import(name="extensions")
    private @Nullable Output<List<String>> extensions;

    /**
     * @return The requested certificate extensions.
     * 
     */
    public Optional<Output<List<String>>> extensions() {
        return Optional.ofNullable(this.extensions);
    }

    /**
     * The DN of the policy folder where the certificate object will be created
     * 
     */
    @Import(name="folder")
    private @Nullable Output<String> folder;

    /**
     * @return The DN of the policy folder where the certificate object will be created
     * 
     */
    public Optional<Output<String>> folder() {
        return Optional.ofNullable(this.folder);
    }

    /**
     * The requested force command.
     * 
     */
    @Import(name="forceCommand")
    private @Nullable Output<String> forceCommand;

    /**
     * @return The requested force command.
     * 
     */
    public Optional<Output<String>> forceCommand() {
        return Optional.ofNullable(this.forceCommand);
    }

    /**
     * The identifier of the requested certificate
     * 
     */
    @Import(name="keyId")
    private @Nullable Output<String> keyId;

    /**
     * @return The identifier of the requested certificate
     * 
     */
    public Optional<Output<String>> keyId() {
        return Optional.ofNullable(this.keyId);
    }

    /**
     * Passphrase for encrypting the private key
     * 
     */
    @Import(name="keyPassphrase")
    private @Nullable Output<String> keyPassphrase;

    /**
     * @return Passphrase for encrypting the private key
     * 
     */
    public Optional<Output<String>> keyPassphrase() {
        return Optional.ofNullable(this.keyPassphrase);
    }

    /**
     * The key size bits, they will be used for creating keypair
     * 
     */
    @Import(name="keySize")
    private @Nullable Output<Integer> keySize;

    /**
     * @return The key size bits, they will be used for creating keypair
     * 
     */
    public Optional<Output<Integer>> keySize() {
        return Optional.ofNullable(this.keySize);
    }

    /**
     * The friendly name for the certificate object.
     * 
     */
    @Import(name="objectName")
    private @Nullable Output<String> objectName;

    /**
     * @return The friendly name for the certificate object.
     * 
     */
    public Optional<Output<String>> objectName() {
        return Optional.ofNullable(this.objectName);
    }

    /**
     * The requested principals.
     * 
     */
    @Import(name="principals")
    private @Nullable Output<List<String>> principals;

    /**
     * @return The requested principals.
     * 
     */
    public Optional<Output<List<String>>> principals() {
        return Optional.ofNullable(this.principals);
    }

    /**
     * Private key
     * 
     */
    @Import(name="privateKey")
    private @Nullable Output<String> privateKey;

    /**
     * @return Private key
     * 
     */
    public Optional<Output<String>> privateKey() {
        return Optional.ofNullable(this.privateKey);
    }

    /**
     * Public key that will be used to generate the certificate
     * 
     */
    @Import(name="publicKey")
    private @Nullable Output<String> publicKey;

    /**
     * @return Public key that will be used to generate the certificate
     * 
     */
    public Optional<Output<String>> publicKey() {
        return Optional.ofNullable(this.publicKey);
    }

    /**
     * Public key fingerprint SHA256
     * 
     */
    @Import(name="publicKeyFingerprint")
    private @Nullable Output<String> publicKeyFingerprint;

    /**
     * @return Public key fingerprint SHA256
     * 
     */
    public Optional<Output<String>> publicKeyFingerprint() {
        return Optional.ofNullable(this.publicKeyFingerprint);
    }

    /**
     * If the public key will be: file provided or local, service generated
     * 
     */
    @Import(name="publicKeyMethod")
    private @Nullable Output<String> publicKeyMethod;

    /**
     * @return If the public key will be: file provided or local, service generated
     * 
     */
    public Optional<Output<String>> publicKeyMethod() {
        return Optional.ofNullable(this.publicKeyMethod);
    }

    /**
     * Serial number
     * 
     */
    @Import(name="serial")
    private @Nullable Output<String> serial;

    /**
     * @return Serial number
     * 
     */
    public Optional<Output<String>> serial() {
        return Optional.ofNullable(this.serial);
    }

    /**
     * CA fingerprint SHA256
     * 
     */
    @Import(name="signingCa")
    private @Nullable Output<String> signingCa;

    /**
     * @return CA fingerprint SHA256
     * 
     */
    public Optional<Output<String>> signingCa() {
        return Optional.ofNullable(this.signingCa);
    }

    /**
     * The requested source addresses as list of IP/CIDR
     * 
     */
    @Import(name="sourceAddresses")
    private @Nullable Output<List<String>> sourceAddresses;

    /**
     * @return The requested source addresses as list of IP/CIDR
     * 
     */
    public Optional<Output<List<String>>> sourceAddresses() {
        return Optional.ofNullable(this.sourceAddresses);
    }

    /**
     * The certificate issuing template
     * 
     */
    @Import(name="template")
    private @Nullable Output<String> template;

    /**
     * @return The certificate issuing template
     * 
     */
    public Optional<Output<String>> template() {
        return Optional.ofNullable(this.template);
    }

    /**
     * Valid from
     * 
     */
    @Import(name="validFrom")
    private @Nullable Output<String> validFrom;

    /**
     * @return Valid from
     * 
     */
    public Optional<Output<String>> validFrom() {
        return Optional.ofNullable(this.validFrom);
    }

    /**
     * How much time the requester wants to have the certificate valid, the format is hours
     * 
     */
    @Import(name="validHours")
    private @Nullable Output<Integer> validHours;

    /**
     * @return How much time the requester wants to have the certificate valid, the format is hours
     * 
     */
    public Optional<Output<Integer>> validHours() {
        return Optional.ofNullable(this.validHours);
    }

    /**
     * Valid to
     * 
     */
    @Import(name="validTo")
    private @Nullable Output<String> validTo;

    /**
     * @return Valid to
     * 
     */
    public Optional<Output<String>> validTo() {
        return Optional.ofNullable(this.validTo);
    }

    /**
     * If the line endings of service&#39;s private key will end on MS windows format
     * 
     */
    @Import(name="windows")
    private @Nullable Output<Boolean> windows;

    /**
     * @return If the line endings of service&#39;s private key will end on MS windows format
     * 
     */
    public Optional<Output<Boolean>> windows() {
        return Optional.ofNullable(this.windows);
    }

    private SshCertificateState() {}

    private SshCertificateState(SshCertificateState $) {
        this.certificate = $.certificate;
        this.certificateType = $.certificateType;
        this.destinationAddresses = $.destinationAddresses;
        this.extensions = $.extensions;
        this.folder = $.folder;
        this.forceCommand = $.forceCommand;
        this.keyId = $.keyId;
        this.keyPassphrase = $.keyPassphrase;
        this.keySize = $.keySize;
        this.objectName = $.objectName;
        this.principals = $.principals;
        this.privateKey = $.privateKey;
        this.publicKey = $.publicKey;
        this.publicKeyFingerprint = $.publicKeyFingerprint;
        this.publicKeyMethod = $.publicKeyMethod;
        this.serial = $.serial;
        this.signingCa = $.signingCa;
        this.sourceAddresses = $.sourceAddresses;
        this.template = $.template;
        this.validFrom = $.validFrom;
        this.validHours = $.validHours;
        this.validTo = $.validTo;
        this.windows = $.windows;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SshCertificateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SshCertificateState $;

        public Builder() {
            $ = new SshCertificateState();
        }

        public Builder(SshCertificateState defaults) {
            $ = new SshCertificateState(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificate The SSH Certificate
         * 
         * @return builder
         * 
         */
        public Builder certificate(@Nullable Output<String> certificate) {
            $.certificate = certificate;
            return this;
        }

        /**
         * @param certificate The SSH Certificate
         * 
         * @return builder
         * 
         */
        public Builder certificate(String certificate) {
            return certificate(Output.of(certificate));
        }

        /**
         * @param certificateType Certificate type, server or client
         * 
         * @return builder
         * 
         */
        public Builder certificateType(@Nullable Output<String> certificateType) {
            $.certificateType = certificateType;
            return this;
        }

        /**
         * @param certificateType Certificate type, server or client
         * 
         * @return builder
         * 
         */
        public Builder certificateType(String certificateType) {
            return certificateType(Output.of(certificateType));
        }

        /**
         * @param destinationAddresses The address (FQDN/hostname/IP/CIDR) of the destination host where the certificate will be used to authenticate to
         * 
         * @return builder
         * 
         */
        public Builder destinationAddresses(@Nullable Output<List<String>> destinationAddresses) {
            $.destinationAddresses = destinationAddresses;
            return this;
        }

        /**
         * @param destinationAddresses The address (FQDN/hostname/IP/CIDR) of the destination host where the certificate will be used to authenticate to
         * 
         * @return builder
         * 
         */
        public Builder destinationAddresses(List<String> destinationAddresses) {
            return destinationAddresses(Output.of(destinationAddresses));
        }

        /**
         * @param destinationAddresses The address (FQDN/hostname/IP/CIDR) of the destination host where the certificate will be used to authenticate to
         * 
         * @return builder
         * 
         */
        public Builder destinationAddresses(String... destinationAddresses) {
            return destinationAddresses(List.of(destinationAddresses));
        }

        /**
         * @param extensions The requested certificate extensions.
         * 
         * @return builder
         * 
         */
        public Builder extensions(@Nullable Output<List<String>> extensions) {
            $.extensions = extensions;
            return this;
        }

        /**
         * @param extensions The requested certificate extensions.
         * 
         * @return builder
         * 
         */
        public Builder extensions(List<String> extensions) {
            return extensions(Output.of(extensions));
        }

        /**
         * @param extensions The requested certificate extensions.
         * 
         * @return builder
         * 
         */
        public Builder extensions(String... extensions) {
            return extensions(List.of(extensions));
        }

        /**
         * @param folder The DN of the policy folder where the certificate object will be created
         * 
         * @return builder
         * 
         */
        public Builder folder(@Nullable Output<String> folder) {
            $.folder = folder;
            return this;
        }

        /**
         * @param folder The DN of the policy folder where the certificate object will be created
         * 
         * @return builder
         * 
         */
        public Builder folder(String folder) {
            return folder(Output.of(folder));
        }

        /**
         * @param forceCommand The requested force command.
         * 
         * @return builder
         * 
         */
        public Builder forceCommand(@Nullable Output<String> forceCommand) {
            $.forceCommand = forceCommand;
            return this;
        }

        /**
         * @param forceCommand The requested force command.
         * 
         * @return builder
         * 
         */
        public Builder forceCommand(String forceCommand) {
            return forceCommand(Output.of(forceCommand));
        }

        /**
         * @param keyId The identifier of the requested certificate
         * 
         * @return builder
         * 
         */
        public Builder keyId(@Nullable Output<String> keyId) {
            $.keyId = keyId;
            return this;
        }

        /**
         * @param keyId The identifier of the requested certificate
         * 
         * @return builder
         * 
         */
        public Builder keyId(String keyId) {
            return keyId(Output.of(keyId));
        }

        /**
         * @param keyPassphrase Passphrase for encrypting the private key
         * 
         * @return builder
         * 
         */
        public Builder keyPassphrase(@Nullable Output<String> keyPassphrase) {
            $.keyPassphrase = keyPassphrase;
            return this;
        }

        /**
         * @param keyPassphrase Passphrase for encrypting the private key
         * 
         * @return builder
         * 
         */
        public Builder keyPassphrase(String keyPassphrase) {
            return keyPassphrase(Output.of(keyPassphrase));
        }

        /**
         * @param keySize The key size bits, they will be used for creating keypair
         * 
         * @return builder
         * 
         */
        public Builder keySize(@Nullable Output<Integer> keySize) {
            $.keySize = keySize;
            return this;
        }

        /**
         * @param keySize The key size bits, they will be used for creating keypair
         * 
         * @return builder
         * 
         */
        public Builder keySize(Integer keySize) {
            return keySize(Output.of(keySize));
        }

        /**
         * @param objectName The friendly name for the certificate object.
         * 
         * @return builder
         * 
         */
        public Builder objectName(@Nullable Output<String> objectName) {
            $.objectName = objectName;
            return this;
        }

        /**
         * @param objectName The friendly name for the certificate object.
         * 
         * @return builder
         * 
         */
        public Builder objectName(String objectName) {
            return objectName(Output.of(objectName));
        }

        /**
         * @param principals The requested principals.
         * 
         * @return builder
         * 
         */
        public Builder principals(@Nullable Output<List<String>> principals) {
            $.principals = principals;
            return this;
        }

        /**
         * @param principals The requested principals.
         * 
         * @return builder
         * 
         */
        public Builder principals(List<String> principals) {
            return principals(Output.of(principals));
        }

        /**
         * @param principals The requested principals.
         * 
         * @return builder
         * 
         */
        public Builder principals(String... principals) {
            return principals(List.of(principals));
        }

        /**
         * @param privateKey Private key
         * 
         * @return builder
         * 
         */
        public Builder privateKey(@Nullable Output<String> privateKey) {
            $.privateKey = privateKey;
            return this;
        }

        /**
         * @param privateKey Private key
         * 
         * @return builder
         * 
         */
        public Builder privateKey(String privateKey) {
            return privateKey(Output.of(privateKey));
        }

        /**
         * @param publicKey Public key that will be used to generate the certificate
         * 
         * @return builder
         * 
         */
        public Builder publicKey(@Nullable Output<String> publicKey) {
            $.publicKey = publicKey;
            return this;
        }

        /**
         * @param publicKey Public key that will be used to generate the certificate
         * 
         * @return builder
         * 
         */
        public Builder publicKey(String publicKey) {
            return publicKey(Output.of(publicKey));
        }

        /**
         * @param publicKeyFingerprint Public key fingerprint SHA256
         * 
         * @return builder
         * 
         */
        public Builder publicKeyFingerprint(@Nullable Output<String> publicKeyFingerprint) {
            $.publicKeyFingerprint = publicKeyFingerprint;
            return this;
        }

        /**
         * @param publicKeyFingerprint Public key fingerprint SHA256
         * 
         * @return builder
         * 
         */
        public Builder publicKeyFingerprint(String publicKeyFingerprint) {
            return publicKeyFingerprint(Output.of(publicKeyFingerprint));
        }

        /**
         * @param publicKeyMethod If the public key will be: file provided or local, service generated
         * 
         * @return builder
         * 
         */
        public Builder publicKeyMethod(@Nullable Output<String> publicKeyMethod) {
            $.publicKeyMethod = publicKeyMethod;
            return this;
        }

        /**
         * @param publicKeyMethod If the public key will be: file provided or local, service generated
         * 
         * @return builder
         * 
         */
        public Builder publicKeyMethod(String publicKeyMethod) {
            return publicKeyMethod(Output.of(publicKeyMethod));
        }

        /**
         * @param serial Serial number
         * 
         * @return builder
         * 
         */
        public Builder serial(@Nullable Output<String> serial) {
            $.serial = serial;
            return this;
        }

        /**
         * @param serial Serial number
         * 
         * @return builder
         * 
         */
        public Builder serial(String serial) {
            return serial(Output.of(serial));
        }

        /**
         * @param signingCa CA fingerprint SHA256
         * 
         * @return builder
         * 
         */
        public Builder signingCa(@Nullable Output<String> signingCa) {
            $.signingCa = signingCa;
            return this;
        }

        /**
         * @param signingCa CA fingerprint SHA256
         * 
         * @return builder
         * 
         */
        public Builder signingCa(String signingCa) {
            return signingCa(Output.of(signingCa));
        }

        /**
         * @param sourceAddresses The requested source addresses as list of IP/CIDR
         * 
         * @return builder
         * 
         */
        public Builder sourceAddresses(@Nullable Output<List<String>> sourceAddresses) {
            $.sourceAddresses = sourceAddresses;
            return this;
        }

        /**
         * @param sourceAddresses The requested source addresses as list of IP/CIDR
         * 
         * @return builder
         * 
         */
        public Builder sourceAddresses(List<String> sourceAddresses) {
            return sourceAddresses(Output.of(sourceAddresses));
        }

        /**
         * @param sourceAddresses The requested source addresses as list of IP/CIDR
         * 
         * @return builder
         * 
         */
        public Builder sourceAddresses(String... sourceAddresses) {
            return sourceAddresses(List.of(sourceAddresses));
        }

        /**
         * @param template The certificate issuing template
         * 
         * @return builder
         * 
         */
        public Builder template(@Nullable Output<String> template) {
            $.template = template;
            return this;
        }

        /**
         * @param template The certificate issuing template
         * 
         * @return builder
         * 
         */
        public Builder template(String template) {
            return template(Output.of(template));
        }

        /**
         * @param validFrom Valid from
         * 
         * @return builder
         * 
         */
        public Builder validFrom(@Nullable Output<String> validFrom) {
            $.validFrom = validFrom;
            return this;
        }

        /**
         * @param validFrom Valid from
         * 
         * @return builder
         * 
         */
        public Builder validFrom(String validFrom) {
            return validFrom(Output.of(validFrom));
        }

        /**
         * @param validHours How much time the requester wants to have the certificate valid, the format is hours
         * 
         * @return builder
         * 
         */
        public Builder validHours(@Nullable Output<Integer> validHours) {
            $.validHours = validHours;
            return this;
        }

        /**
         * @param validHours How much time the requester wants to have the certificate valid, the format is hours
         * 
         * @return builder
         * 
         */
        public Builder validHours(Integer validHours) {
            return validHours(Output.of(validHours));
        }

        /**
         * @param validTo Valid to
         * 
         * @return builder
         * 
         */
        public Builder validTo(@Nullable Output<String> validTo) {
            $.validTo = validTo;
            return this;
        }

        /**
         * @param validTo Valid to
         * 
         * @return builder
         * 
         */
        public Builder validTo(String validTo) {
            return validTo(Output.of(validTo));
        }

        /**
         * @param windows If the line endings of service&#39;s private key will end on MS windows format
         * 
         * @return builder
         * 
         */
        public Builder windows(@Nullable Output<Boolean> windows) {
            $.windows = windows;
            return this;
        }

        /**
         * @param windows If the line endings of service&#39;s private key will end on MS windows format
         * 
         * @return builder
         * 
         */
        public Builder windows(Boolean windows) {
            return windows(Output.of(windows));
        }

        public SshCertificateState build() {
            return $;
        }
    }

}
