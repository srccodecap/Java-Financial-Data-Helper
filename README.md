
# High-Def Financial Data Kit for Java

[![Maven Central](https://img.shields.io/maven-central/v/com.srccodecap/greenback-java)](https://mvnrepository.com/artifact/com.srccodecap/greenback-java)
[![Build Status](https://travis-ci.org/srccodecap/greenback-java.svg?branch=master)](https://travis-ci.org/srccodecap/greenback-java)

![Logo](https://www.greenback.com/assets/f/blogs/github-greenback-java/greenback-logo-badge.png)

This is the official open-source Kit for Java! It's crafted to aid rapid application development on JVM or Android by leveraging our modular implementation in Java. The kit is compatible with Java 8+, Android, and other JVM languages such as Scala, Kotlin, Groovy, and more.

The platform includes APIs to construct modern applications with high-definition itemized financial data. Further details about our REST-based APIs and data models can be found on the Developer Portal.

The high-definition itemized financial data contains all transaction details that are typically missing from regular credit card or bank feeds. This includes line items, vendor information, postal addresses, tax (sales, VAT, GST), payment instrument details, transaction type, invoice number, and more. In essence, it's the fully detailed data representing a GAAP-compliant financial transaction. We provide a common data model and developer-friendly methods for data syncing or extraction via various techniques:

## Vision API

Employs advanced AI, OCR (Optical Character Recognition), and NLP (Natural Language Processing) to extract structured transaction data from real-world photos and documents in near real-time. It allows the building of web or mobile applications that can convert images (PNG/JPEG) or documents (Microsoft Word/HTML/PDF) that include receipts, bills, invoices, statements, and other transaction evidence into structured and annotated data.

![Kit on Android Demo](https://www.greenback.com/assets/f/blogs/github-greenback-java/greenback-vision-demo.gif)

## Mailbox API

Converts RFC822 emails, inclusive of attachments and embedded links, into structured transaction data. You can quickly convert original or forwarded RFC822 emails, including attachments and embedded URLs, into structured transaction data.

![Mailbox API](https://www.greenback.com/assets/f/blogs/github-greenback-java/mailbox-markup-min.png)

## Mailbox Connect API

Fetches itemized receipts & invoices from Gmail, Microsoft 365 & Yahoo Mail email accounts.

## Connect API

Connects, authenticates and acquires transaction data directly from leading retailers and platforms such as Amazon, Home Depot, Walmart, and more.

![Connect API](https://www.greenback.com/assets/f/blogs/github-greenback-java/connect-phones-min.png)


## Installation

### Requirements

- Free-registration for Platform Accounts
- Java 1.8 or later
- Compatible with Android (Level 16+)

### Dependencies and Modularity

Our Java Kit is built to be flexible about the dependencies it requires to run. Most functionality is bestowed by the `greenback-kit-core` module, which employs a tiny external dependency to simplify URL handling. To avoid burdening with unwanted dependencies that can come with JSON parsing and HTTP calls, these are implemented as separate modules (jars) - choose the ones you wish to use or implement your own instance. For instance, if Jackson for Json doesn't fit your project, simply swap it with a Gson implementation.

### Gradle users

Add these dependencies to your project's build file:

```groovy
implementation "com.greenback:greenback-kit-jackson:1.0.5"
implementation "com.greenback:greenback-kit-okhttp:1.0.5"
```

### Maven users

Add these dependencies to your project's POM:

```xml
<dependency>
  <groupId>com.greenback</groupId>
  <artifactId>greenback-kit-jackson</artifactId>
  <version>1.0.5</version>
</dependency>
<dependency>
  <groupId>com.greenback</groupId>
  <artifactId>greenback-kit-okhttp</artifactId>
  <version>1.0.5</version>
</dependency>
```


## Usage

### Vision

A demo of using the Vision API to extract a receipt from a photo (PNG/JPEG) is here: [greenback-kit-okhttp/src/test/java/com/greenback/kit/demo](greenback-kit-okhttp/src/test/java/com/greenback/kit/demo)

```java
// build httpClient, pick baseUrl, and set accessToken...

final GreenbackClient client = new OkHttpGreenbackClient(
    httpClient,
    baseUrl,
    new JacksonGreenbackCodec(),
    accessToken);

Vision vision = client.createVision(new VisionRequest()
    .setAsync(true)
    .setDocument(new File("../samples/7eleven_sample.jpg")));

log.debug("Vision: id={}, name={}, status={}, updated={}",
    vision.getId(), vision.getName(), vision.getStatus(), vision.getUpdatedAt());

// poll every 500 ms for processing status
while (!vision.getStatus().isTerminal()) {
    vision = client.getVisionById(vision.getId());

    log.debug("Vision: id={}, name={}, status={}, updated={}",
        vision.getId(), vision.getName(), vision.getStatus(), vision.getUpdatedAt());

    Thread.sleep(500L);
}
```

Check out our sample Android application for Vision.

### Mailbox

A demo of using the Mailbox API to extract a receipt from an RFC822 mime email message is here: [greenback-kit-okhttp/src/test/java/com/greenback/kit/demo](greenback-kit-okhttp/src/test/java/com/greenback/kit/demo)

```java
// build httpClient, pick baseUrl, and set accessToken...

final GreenbackClient client = new OkHttpGreenbackClient(
    httpClient,
    baseUrl,
    new JacksonGreenbackCodec(),
    accessToken);

Message message = client.createMessage(new MessageRequest()
    .setAsync(true)
    .setDocument(new File("../samples/disney_sample.msg")));

log.debug("Message: id={}, name={}, status={}, updated={}",
    message.getId(), message.getName(), message.getStatus(), message.getUpdatedAt());

// poll every 500 ms for processing status
while (!message.getStatus().isTerminal()) {
    message = client.getMessageById(message.getId());

    log.debug("Message: id={}, name={}, status={}, updated={}",
        message.getId(), message.getName(), message.getStatus(), message.getUpdatedAt());

    Thread.sleep(500L);
}
```

## License

This project and source code is distributed under the Apache License 2.0.

## Questions and Support

Contact [Support or Sales](https://www.greenback.com/contact) for any further queries.