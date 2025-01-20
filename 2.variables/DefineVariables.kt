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
