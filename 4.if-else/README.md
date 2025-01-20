
### **4. Using If-Else Statements**

In this lab, you will learn how to use `if-else` conditions in Kotlin to make decisions in your program.

#### **Code:**

```kotlin
fun main() {
    val age: Int = 18

    // Using if-else statement to check age
    if (age >= 18) {
        println("You are an adult.")
    } else {
        println("You are a minor.")
    }
}
```

#### **Explanation:**
- The `if-else` statement checks whether the `age` is greater than or equal to 18. If true, it prints "You are an adult.", otherwise, it prints "You are a minor."

---

### **Steps to Run Using `cat >> EOF`:**

1. **Create the Kotlin File Using `cat >> EOF`:**
   Open the terminal and use `cat >> EOF` to create the file and add the code:

   ```bash
   cat > IfElseExample.kt << EOF
   fun main() {
       val age: Int = 18

       // Using if-else statement to check age
       if (age >= 18) {
           println("You are an adult.")
       } else {
           println("You are a minor.")
       }
   }
   EOF
   ```

   - This command will create a file `IfElseExample.kt` and add the code directly into it.

2. **Compile the Kotlin Code:**
   After the file is created, compile it:
   ```bash
   kotlinc IfElseExample.kt -include-runtime -d IfElseExample.jar
   ```

3. **Run the Program:**
   Run the compiled `.jar` file:
   ```bash
   java -jar IfElseExample.jar
   ```

### **Expected Output:**
```
You are an adult.
```

