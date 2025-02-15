# java-stellar-sdk

[![Build Status](https://travis-ci.org/stellar/java-stellar-sdk.svg)](https://travis-ci.org/stellar/java-stellar-sdk)
[![](https://jitpack.io/v/stellar/java-stellar-sdk.svg)](https://jitpack.io/#stellar/java-stellar-sdk)

The Java Stellar Sdk library provides APIs to build transactions and connect to [Horizon](https://github.com/stellar/horizon).

## Installation

### Maven

Use [jitpack.io](https://jitpack.io)'s Maven repository:

```
repositories {
    maven { url "https://jitpack.io" }
}

dependencies {
    implementation 'com.github.stellar:java-stellar-sdk:{version}'
}
```

The list of versions to install can be found in the [Releases](./releases) section. More information can be found in [jitpack.io docs](https://jitpack.io/docs/).

### JAR

Download the latest jar from the GitHub repo's [releases tab](https://github.com/stellar/java-stellar-sdk/releases). Add the `jar` package to your project according to how your environment is set up.

## Basic Usage
For some examples on how to use this library, take a look at the [Get Started docs in the developers site](https://developers.stellar.org/docs/tutorials/create-account/).

## Documentation
Javadoc is available at https://stellar.github.io/java-stellar-sdk

## Contributing
For information on how to contribute, please refer to our [contribution guide](https://github.com/stellar/java-stellar-sdk/blob/master/CONTRIBUTING.md).

## License
java-stellar-sdk is licensed under an Apache-2.0 license. See the [LICENSE](https://github.com/stellar/java-stellar-sdk/blob/master/LICENSE) file for details.

## xdr to jave code generation
All the java source files in org.stellar.sdk.xdr package are generated using the `xdrgen` command from the [stellar/xdrgen](https://github.com/stellar/xdrgen) 
```
xdrgen -o ./src/main/java/org/stellar/sdk/xdr -l java -n org.stellar.sdk.xdr ./xdr/Stellar-types.x ./xdr/Stellar-SCP.x ./xdr/Stellar-overlay.x ./xdr/Stellar-ledger-entries.x ./xdr/Stellar-ledger.x ./xdr/Stellar-transaction.x
```