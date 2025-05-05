FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY pom.xml mvnw ./

# Grant execute permissions to mvnw
RUN chmod +x mvnw

COPY .mvn .mvn

RUN ./mvnw dependency:go-offline

# Now copy the rest of the source code
COPY . .

RUN ./mvnw clean package -DskipTests

CMD ["java", "-jar", "target/*.jar"]
