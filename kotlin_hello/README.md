### **README.md**

# Getting Started with Kotlin

Kotlin is a general-purpose, open-source programming language that can be used to develop a wide variety of applications, from web and mobile apps to server-side and backend systems. It's designed to interoperate seamlessly with Java code and is known for its concise syntax and readability.

This guide provides a quick introduction to setting up a Kotlin development environment and creating a simple "Hello, World!" program using Docker.

## Why Kotlin?

### 1. **Concise Syntax**  
   Kotlin reduces boilerplate code compared to Java. Here's a comparison:

   **Java Example** (for printing "Hello, World!"):
   ```java
   public class HelloWorld {
       public static void main(String[] args) {
           System.out.println("Hello, World!");
       }
   }
   ```

   **Kotlin Example**:
   ```kotlin
   fun main() {
       println("Hello, World!")
   }
   ```
   - **Why Kotlin**: Kotlin does not require defining a class for simple tasks like printing, making the code much cleaner and easier to write.

### 2. **Null Safety**  
   Kotlin’s type system eliminates null pointer exceptions, which are a common issue in Java and other languages.

   **Java Example**:
   ```java
   String str = null;
   int length = str.length(); // Throws NullPointerException
   ```

   **Kotlin Example**:
   ```kotlin
   val str: String? = null
   val length = str?.length ?: 0  // Safely handles null
   ```
   - **Why Kotlin**: Kotlin introduces nullable types (`String?`) and safe calls (`?.`), ensuring that null values are handled explicitly without causing runtime crashes.

### 3. **Interoperability with Java**  
   Kotlin is fully interoperable with Java, which means you can easily use Java libraries and frameworks in Kotlin without any issues.

   **Java Example**:
   ```java
   import java.util.Date;
   Date today = new Date();
   ```

   **Kotlin Example**:
   ```kotlin
   import java.util.Date
   val today = Date()
   ```
   - **Why Kotlin**: You can use Java libraries as is, while benefiting from Kotlin’s modern syntax and features.

### 4. **Coroutines for Asynchronous Programming**  
   Kotlin has built-in support for coroutines, making asynchronous programming much easier compared to Java's callback-based approach.

   **Java Example** (using Threads for async):
   ```java
   new Thread(() -> {
       // Do some task in background
   }).start();
   ```

   **Kotlin Example** (using Coroutines):
   ```kotlin
   import kotlinx.coroutines.*

   fun main() = runBlocking {
       launch {
           // Do some task in background
       }
   }
   ```
   - **Why Kotlin**: Kotlin’s coroutines simplify async code, making it more readable and easier to manage compared to Java’s thread management or callback mechanisms.

### 5. **Cross-Platform**  
   Kotlin can be used for Android development, backend development (with frameworks like Ktor or Spring), and even for cross-platform applications with Kotlin/Native.

   **Example**: You can use Kotlin to write Android apps, backend services, and desktop applications without switching to a different language.

   - **Why Kotlin**: Write once, run anywhere! Kotlin allows you to use a single language across various platforms, ensuring code reuse and consistency.

---

# Getting Started with Kotlin on Ubuntu 24.04

This guide provides a quick setup to run a "Hello, World!" program in Kotlin on Ubuntu 24.04.

---

## **Step 1: Install Java (Required for Kotlin)**

1. Update your package list:
   ```bash
   sudo apt update
   ```
2. Install OpenJDK (version 8 or higher):
   ```bash
   sudo apt install default-jdk -y
   ```
3. Verify installation:
   ```bash
   java -version
   ```

---

## **Step 2: Install Kotlin**

1. Install `snap` if not already installed:
   ```bash
   sudo apt install snapd -y
   ```
2. Install Kotlin using `snap`:
   ```bash
   sudo snap install kotlin --classic
   ```
3. Verify Kotlin installation:
   ```bash
   kotlinc -version
   ```

---

## **Step 3: Write Your First Kotlin Program**

1. Create a file named `hello.kt`:
   ```bash
   nano hello.kt
   ```
2. Add this code:
   ```kotlin
   fun main() {
       println("Hello, World!")
   }
   ```
3. Save and exit.

---

## **Step 4: Compile and Run the Kotlin Program**

1. Compile the program:
   ```bash
   kotlinc hello.kt -include-runtime -d hello.jar
   ```
2. Run the compiled JAR file:
   ```bash
   java -jar hello.jar
   ```
   **Output:**
   ```
   Hello, World!
   ```

---

## **Optional: Quick Run Without JAR**
Run the program directly:
```bash
kotlin hello.kt
```

---

## **What’s Next?**
- Explore Kotlin REPL (Interactive Shell):
  ```bash
  kotlinc
  ```
- Use an IDE like IntelliJ IDEA for enhanced development.

--- 

# Kotlin Hello World in Docker

This project demonstrates how to compile and run a simple Kotlin "Hello, World!" program inside a Docker container.

## Project Structure

```
kotlin_hello/
├── Dockerfile    # Dockerfile to build and run the Kotlin program
├── hello.kt      # Kotlin source code
```

## Prerequisites

- Docker installed on your machine.

## Build and Run

1. **Build the Docker Image**:
   ```bash
   docker build -t kotlin-hello .
   ```

2. **Run the Docker Container**:
   ```bash
   docker run --rm kotlin-hello
   ```

3. **Output**:
   ```
   Hello, World!
   ```

## How It Works

- The `Dockerfile` uses the OpenJDK base image and installs Kotlin.
- The Kotlin program (`hello.kt`) is compiled to a JAR file and executed inside the container.

## Files

- `hello.kt`: Contains the Kotlin "Hello, World!" source code.
- `Dockerfile`: Instructions to build and run the application in Docker.

## License

This project is open source and available under the [MIT License](LICENSE).
```

