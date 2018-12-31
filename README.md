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

## Overriding the Default Configuration

The default application.yml file assumes this application is running on the same server as Kafka, listening on port
8000, the Kafka topic is "alfresco-node-events", and the group is "group1". You can change these settings by:

  * Editing application.yml, or
  * Creating another YML file and using a Spring Boot profile, or
  * Passing values in on the command line
  
For example, to run the server on a different port and use a different group, you can do:

    mvn spring-boot:run -Dkafkagroup=group2 -Dserver.port=8001

