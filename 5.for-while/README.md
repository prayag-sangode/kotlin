Let's move to the next lab.

### **5. Loops: Using `for` and `while`**

In this lab, you will learn how to use both `for` and `while` loops to iterate through a range of values or perform a task repeatedly.

#### **Code:**

```kotlin
fun main() {
    // For loop: Iterating over a range of numbers
    for (i in 1..5) {
        println("For loop iteration: $i")
    }

    // While loop: Repeating until a condition is met
    var count = 1
    while (count <= 3) {
        println("While loop iteration: $count")
        count++
    }
}
```

#### **Explanation:**
1. **For loop**: This loop iterates over a range from `1` to `5` and prints each number.
2. **While loop**: This loop starts with `count = 1` and continues as long as the condition `count <= 3` holds true, printing each value of `count` and then incrementing it.

---

### **Steps to Run Using `cat >> EOF`:**

1. **Create the Kotlin File Using `cat >> EOF`:**
   Open the terminal and use `cat >> EOF` to create the file and add the code:

   ```bash
   cat > LoopsExample.kt << EOF
   fun main() {
       // For loop: Iterating over a range of numbers
       for (i in 1..5) {
           println("For loop iteration: $i")
       }

       // While loop: Repeating until a condition is met
       var count = 1
       while (count <= 3) {
           println("While loop iteration: $count")
           count++
       }
   }
   EOF
   ```

2. **Compile the Kotlin Code:**
   After the file is created, compile it:
   ```bash
   kotlinc LoopsExample.kt -include-runtime -d LoopsExample.jar
   ```

3. **Run the Program:**
   Run the compiled `.jar` file:
   ```bash
   java -jar LoopsExample.jar
   ```

### **Expected Output:**
```
For loop iteration: 1
For loop iteration: 2
For loop iteration: 3
For loop iteration: 4
For loop iteration: 5
While loop iteration: 1
While loop iteration: 2
While loop iteration: 3
```

