### **1. Hello World in Kotlin**

### 1. **Create the Kotlin File**

- Open a terminal and use a text editor to create a Kotlin file. For example, use `nano` to create `HelloWorld.kt`:
  ```bash
  nano HelloWorld.kt
  ```

- Add the following code in the `HelloWorld.kt` file:
  ```kotlin
  fun main() {
      println("Hello, World!")
  }
  ```

- Save the file and exit the editor (e.g., in nano, press `Ctrl + X`, then press `Y`, and hit `Enter`).

### 2. **Compile the Kotlin Code**

- In the terminal, navigate to the directory where `HelloWorld.kt` is saved.

- Compile the Kotlin file using the `kotlinc` compiler:
  ```bash
  kotlinc HelloWorld.kt -include-runtime -d HelloWorld.jar
  ```

  - `kotlinc` is the Kotlin compiler.
  - `-include-runtime` includes the Kotlin runtime in the generated `.jar` file.
  - `-d HelloWorld.jar` specifies the output `.jar` file.

### 3. **Run the Program**

- After compiling, you can run the `.jar` file using the `java` command:
  ```bash
  java -jar HelloWorld.jar
  ```

### 4. **Output**

- After running the command, you should see the following output in the terminal:
  ```
  Hello, World!
  ```

