# Use an OpenJDK image as base for building the application
FROM openjdk:22-jdk-slim AS builder

RUN apt-get update && apt-get install dos2unix

# Set working directory
WORKDIR /app

# Copy the source code into the container
COPY . /app

RUN ls -l
RUN cat /etc/os-release

# Build the application using Maven Wrapper
RUN dos2unix mvnw
RUN chmod +x /app/mvnw && /app/mvnw -B clean package -DskipTests

# Use a lightweight image for running the application
FROM openjdk:22-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the compiled JAR from the builder stage
COPY --from=builder /app/target/students-spring-api-0.0.1.jar /app/app.jar

# Expose the application port
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "app.jar"]