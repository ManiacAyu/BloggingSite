FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

# Copy the pom.xml and mvnw scripts first
COPY pom.xml mvnw ./

# Grant execute permissions to mvnw script
RUN chmod +x mvnw

# Now, copy the rest of the .mvn directory and other necessary files
COPY .mvn .mvn

# Run Maven offline dependencies step
RUN ./mvnw dependency:go-offline

# Copy the rest of the source code
COPY . .

# Run Maven to build the package (skipping tests)
RUN ./mvnw clean package -DskipTests

# Run the application
CMD ["java", "-jar", "target/*.jar"]
