### **3. Basic Data Types**

In this lab, you will learn how to work with basic data types in Kotlin, such as `Int`, `Double`, `Boolean`, and `String`.

#### **Code:**

```kotlin
fun main() {
    // Integer (Int) type
    val age: Int = 25
    println("Age: $age")

    // Double (Floating point) type
    val temperature: Double = 36.6
    println("Temperature: $temperature")

    // Boolean type
    val isRaining: Boolean = false
    println("Is it raining? $isRaining")

    // String type
    val greeting: String = "Hello, Kotlin!"
    println(greeting)
}
```

#### **Explanation:**
1. **`Int`**: Represents whole numbers (e.g., `25`).
2. **`Double`**: Represents floating-point numbers (e.g., `36.6`).
3. **`Boolean`**: Represents `true` or `false` values (e.g., `false`).
4. **`String`**: Represents a sequence of characters (e.g., `"Hello, Kotlin!"`).

In this code:
- We are declaring variables of different types (`Int`, `Double`, `Boolean`, `String`), assigning values, and then printing them.

---

### **Steps to Run:**

1. **Create the Kotlin File:**
   - Open a terminal and create a new Kotlin file using a text editor:
     ```bash
     nano BasicDataTypes.kt
     ```

2. **Add the Code:**
   - Copy and paste the code above into your `BasicDataTypes.kt` file.

3. **Save and Exit:**
   - Save the file (`Ctrl + X`, then `Y`, and press `Enter`).

4. **Compile the Kotlin Code:**
   - In the terminal, navigate to the directory where your `BasicDataTypes.kt` file is located.
   - Compile the Kotlin code:
     ```bash
     kotlinc BasicDataTypes.kt -include-runtime -d BasicDataTypes.jar
     ```

5. **Run the Program:**
   - Run the `.jar` file with the following command:
     ```bash
     java -jar BasicDataTypes.jar
     ```

### **Expected Output:**
```
Age: 25
Temperature: 36.6
Is it raining? false
Hello, Kotlin!
```

