FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

# Copy pom.xml and wrapper scripts first for dependency caching
COPY pom.xml mvnw ./
COPY .mvn .mvn

RUN ./mvnw dependency:go-offline

# Now copy the rest of the source code
COPY . .

RUN ./mvnw clean package -DskipTests

CMD ["java", "-jar", "target/twitter-0.0.1-SNAPSHOT.jar"]
