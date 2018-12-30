# Alfresco Kafka Listener Example

This is a Spring Boot application that listens to [Alfresco Kafka](https://github.com/jpotts/alfresco-kafka) events.

What the code does with those events is completely up to you. This is just an example.

## Pre-requisites

You must have an Alfresco server running with the Alfresco Kafka repository tier AMP installed. Alternatively, you can
checkout the Alfresco Kafka project and then run it using the embedded tomcat.

## Running

Switch to the root of the project directory then run `mvn spring-boot:run`.

The default log level is set to DEBUG. When the listener processes an Alfresco Kafka event, a message is written to the
log that includes the event type and node ID.
