### **2. Defining Variables**

In this lab, you will learn how to define variables in Kotlin using both `val` and `var`.

#### **Code:**

```kotlin
fun main() {
    // Immutable variable (cannot be reassigned)
    val name: String = "Kotlin"
    println("Language: $name")

    // Mutable variable (can be reassigned)
    var version: Double = 1.5
    println("Version: $version")

    // Reassigning the mutable variable
    version = 1.6
    println("Updated Version: $version")
}
```

#### **Explanation:**
1. `val`: Declares a **read-only** (immutable) variable. Once assigned, it cannot be changed.
2. `var`: Declares a **mutable** variable, which can be reassigned a new value.

In the code:
- The `name` variable is immutable (`val`), so it cannot be reassigned.
- The `version` variable is mutable (`var`), so it can be updated.

---

### **Steps to Run:**

1. **Create the Kotlin File:**
   - Open the terminal and create a new Kotlin file using any text editor, like `nano`:
     ```bash
     nano DefineVariables.kt
     ```

2. **Add the Code:**
   - Copy and paste the code above into your `DefineVariables.kt` file.

3. **Save and Exit:**
   - Save the file (`Ctrl + X`, then `Y`, and press `Enter`).

4. **Compile the Kotlin Code:**
   - In the terminal, navigate to the directory where your `DefineVariables.kt` file is located.
   - Compile the Kotlin code:
     ```bash
     kotlinc DefineVariables.kt -include-runtime -d DefineVariables.jar
     ```

5. **Run the Program:**
   - Run the `.jar` file with the following command:
     ```bash
     java -jar DefineVariables.jar
     ```

### **Expected Output:**
```
Language: Kotlin
Version: 1.5
Updated Version: 1.6
```

