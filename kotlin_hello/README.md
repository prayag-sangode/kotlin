# Getting Started with Kotlin

Kotlin is a general-purpose, open-source programming language that can be used to develop a wide variety of applications, from web and mobile apps to server-side and backend systems. It's designed to interoperate seamlessly with Java code and is known for its concise syntax and readability.

This guide provides a quick introduction to setting up a Kotlin development environment and creating a simple "Hello, World\!" program.

## Prerequisites

Before you begin, you'll need the following:

  * A computer with a modern operating system (Windows, macOS, or Linux)
  * Java Development Kit (JDK) 8 or higher. You can download the latest JDK from the Oracle website: [https://www.oracle.com/java/technologies/javase/downloads.html](https://www.google.com/url?sa=E&source=gmail&q=https://www.oracle.com/java/technologies/javase/downloads.html)

## Installing Kotlin

There are two primary ways to install Kotlin:

### Using the Official Kotlin compiler (kotlinc)

1.  Update your system's package list:

    ```bash
    sudo apt update
    ```

2.  Install OpenJDK (Kotlin requires JDK 8 or higher):

    ```bash
    sudo apt install default-jdk -y
    ```

3.  Verify the Java installation:

    ```bash
    java -version
    ```

    You should see something like `openjdk version "XX.X"`.

4.  Install the Kotlin compiler using snap:

    ```bash
    sudo apt install snapd -y
    sudo snap install kotlin --classic
    ```

5.  Verify the Kotlin installation:

    ```bash
    kotlinc -version
    ```

    This should display the installed Kotlin compiler version.

## Writing Your First Kotlin Program

1.  Create a directory for your Kotlin project (optional):

    ```bash
    mkdir kotlin_hello
    cd kotlin_hello
    ```

2.  Create a file named `hello.kt` using your preferred text editor.

3.  Add the following code to the file:

    ```kotlin
    fun main() {
        println("Hello, World!")
    }
    ```

    This code defines a simple function named `main` that prints the message "Hello, World\!" to the console.

4.  Save and close the file.

## Compiling and Running Your Kotlin Program

There are two ways to compile and run your Kotlin program:

### 1\. Compiling to a JAR File

1.  Compile the Kotlin file into a JAR (Java Archive) executable:

    ```bash
    kotlinc hello.kt -include-runtime -d hello.jar
    ```

      * `-include-runtime`: This option includes the Kotlin runtime libraries in the JAR file, making it self-contained.
      * `-d hello.jar`: This option specifies the output filename as `hello.jar`.

2.  Run the compiled JAR file:

    ```bash
    java -jar hello.jar
    ```

    You should see the output:

    ```
    Hello, World!
    ```

