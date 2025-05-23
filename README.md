# Full Stack Java Web Development

Modern business applications with Java as a single language for both backend and web UI components.

## Overview

This project demonstrates a full-stack Java web application, using Java for both the backend logic and the frontend UI components. The architecture is designed to enable rapid development and maintainability for modern business applications.

## Features

- Unified development with Java on both frontend and backend
- Clean separation of concerns between layers
- Scalable and modular design
- Suitable for enterprise and commercial use cases

## Project Preview

![Project Management Screenshot](docs/projectmanagement.png)

## Building the Application

The default DB of HSQLDB has been switched to PostgreSQL in application.properties

Build a java File
<pre>./gradlew -Pvaadin.productionMode=true bootJar</pre>

Build a War File
<pre>./gradlew -Pvaadin.productionMode=true bootWar</pre>

## Running the Application

Change Directory into /build/libs and execute Jar File
<pre>java -jar ProjectManagement-0.0.1-SNAPSHOT.jar</pre>

To deploy the WAR file, use Apache Tomcat 10 or later, with support for Jakarta EE 9 (jakarta.* namespace).
Copy the WAR file to the webapps folder of your Tomcat installation.

## Externalizing Application Properties

The application.properties file can contain placeholders for sensitive or environment-specific configuration values. These placeholders can be supplied at runtime via environment variables.

<pre>main.datasource.username=${DB_USER}
main.datasource.password=${DB_PASSWORD}</pre>

Running the application

<pre>
  export DB_USER=user
  export DB_PASSWORD=password
  java -jar ProjectManagement-0.0.1-SNAPSHOT.jar
</pre>

Or you may use Multiple profiles such as application-prod.properties with the properties required

<pre>java -Dspring.profiles.active=prod -jar ProjectManagement-0.0.1-SNAPSHOT.jar</pre>
