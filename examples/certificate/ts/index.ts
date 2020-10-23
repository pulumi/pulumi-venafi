import * as pulumi from "@pulumi/pulumi";
import * as venafi from "@pulumi/venafi";

const conf = new pulumi.Config();
const certPassword = conf.requireSecret("CertificatePassword")

const myCert = new venafi.Certificate("demo-certificate-ts", {
    commonName: "demo-ts.mycompany.io",
    sanDns: [
        "web01.venafi.example",
        "web02.venafi.example",
    ],
    algorithm: "RSA",
    rsaBits: 2048,
    keyPassword: certPassword,
});

export const expirationWindow = myCert.expirationWindow;


