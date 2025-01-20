# Stage 1: Build stage
FROM openjdk:17-alpine as build

# Install required tools: bash, wget, and unzip
RUN apk add --no-cache bash wget unzip

# Set the working directory inside the container
WORKDIR /app

# Download and extract the Kotlin compiler
RUN wget https://github.com/JetBrains/kotlin/releases/download/v1.9.10/kotlin-compiler-1.9.10.zip && \
    unzip kotlin-compiler-1.9.10.zip && \
    mv kotlinc /usr/local/kotlinc && \
    rm -rf kotlin-compiler-1.9.10.zip

# Add Kotlin to PATH
ENV PATH="/usr/local/kotlinc/bin:$PATH"

# Copy the Kotlin source file to the container
COPY hello.kt .

# Compile the Kotlin file into a JAR
RUN kotlinc hello.kt -include-runtime -d hello.jar

# Stage 2: Final stage
FROM openjdk:17-alpine

# Set the working directory for the runtime container
WORKDIR /app

# Copy the compiled JAR file from the build stage
COPY --from=build /app/hello.jar .

# Command to run the JAR file
CMD ["java", "-jar", "hello.jar"]
