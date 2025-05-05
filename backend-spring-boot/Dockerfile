FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

# Copy everything in one go
COPY . .

# Now make sure mvnw is executable
RUN chmod +x mvnw

# Pre-fetch dependencies
RUN ./mvnw dependency:go-offline

# Build the application (skip tests for speed)
RUN ./mvnw clean package -DskipTests

# Run the jar
CMD ["java", "-jar", "target/twitter-0.0.1-SNAPSHOT.jar"]
