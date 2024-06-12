// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

declare var exports: any;
const __config = new pulumi.Config("venafi");

/**
 * Access token for Venafi TLSPDC, user should use this for authentication
 */
export declare const accessToken: string | undefined;
Object.defineProperty(exports, "accessToken", {
    get() {
        return __config.get("accessToken");
    },
    enumerable: true,
});

/**
 * API key for Venafi Control Plane. Example: 142231b7-cvb0-412e-886b-6aeght0bc93d
 */
export declare const apiKey: string | undefined;
Object.defineProperty(exports, "apiKey", {
    get() {
        return __config.get("apiKey");
    },
    enumerable: true,
});

/**
 * application that will be using the token
 */
export declare const clientId: string | undefined;
Object.defineProperty(exports, "clientId", {
    get() {
        return __config.get("clientId");
    },
    enumerable: true,
});

/**
 * When set to true, the resulting certificate will be issued by an ephemeral, no trust CA rather than enrolling using
 * Venafi as a Service or Trust Protection Platform. Useful for development and testing
 */
export declare const devMode: boolean | undefined;
Object.defineProperty(exports, "devMode", {
    get() {
        return __config.getObject<boolean>("devMode");
    },
    enumerable: true,
});

/**
 * JWT of the identity provider associated to the Venafi Control Plane service account that is granting the access token
 */
export declare const externalJwt: string | undefined;
Object.defineProperty(exports, "externalJwt", {
    get() {
        return __config.get("externalJwt");
    },
    enumerable: true,
});

/**
 * Filename of PKCS#12 keystore containing a client certificate, private key, and chain certificates to authenticate to
 * TLSPDC
 */
export declare const p12CertFilename: string | undefined;
Object.defineProperty(exports, "p12CertFilename", {
    get() {
        return __config.get("p12CertFilename");
    },
    enumerable: true,
});

/**
 * Password for the PKCS#12 keystore declared in p12_cert
 */
export declare const p12CertPassword: string | undefined;
Object.defineProperty(exports, "p12CertPassword", {
    get() {
        return __config.get("p12CertPassword");
    },
    enumerable: true,
});

export declare const skipRetirement: boolean | undefined;
Object.defineProperty(exports, "skipRetirement", {
    get() {
        return __config.getObject<boolean>("skipRetirement");
    },
    enumerable: true,
});

/**
 * Endpoint URL to request new Venafi Control Plane access tokens
 */
export declare const tokenUrl: string | undefined;
Object.defineProperty(exports, "tokenUrl", {
    get() {
        return __config.get("tokenUrl");
    },
    enumerable: true,
});

/**
 * Password for WebSDK user. Example: password
 */
export declare const tppPassword: string | undefined;
Object.defineProperty(exports, "tppPassword", {
    get() {
        return __config.get("tppPassword");
    },
    enumerable: true,
});

/**
 * WebSDK user for Venafi TLSPDC. Example: admin
 */
export declare const tppUsername: string | undefined;
Object.defineProperty(exports, "tppUsername", {
    get() {
        return __config.get("tppUsername");
    },
    enumerable: true,
});

/**
 * Use to specify a PEM-formatted file that contains certificates to be trust anchors for all communications with the
 * Venafi Web Service. Example: trustBundle = "${file("chain.pem")}"
 */
export declare const trustBundle: string | undefined;
Object.defineProperty(exports, "trustBundle", {
    get() {
        return __config.get("trustBundle");
    },
    enumerable: true,
});

/**
 * The Venafi Platform URL. Example: https://tpp.venafi.example/vedsdk
 */
export declare const url: string | undefined;
Object.defineProperty(exports, "url", {
    get() {
        return __config.get("url");
    },
    enumerable: true,
});

/**
 * DN of the Venafi TLSPDC policy folder or name of the Venafi as a Service application plus issuing template alias.
 * Example for Platform: testPolicy\\vault Example for Venafi as a Service: myApp\\Default
 */
export declare const zone: string | undefined;
Object.defineProperty(exports, "zone", {
    get() {
        return __config.get("zone");
    },
    enumerable: true,
});

