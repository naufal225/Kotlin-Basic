fun hello(value: String, transform: (String) -> String): String {
    return "Hello, ${transform(value)}"
}

fun main() {
    val transformUpper: (String) -> String = {
        value: String -> value.toUpperCase()
    }
    val transformLower: (String) -> String = {
        value: String -> value.toLowerCase()
    }
    val hasil = hello("Budi", transformLower)
    val hasil2 = hello("eko") {
        value: String -> value.toUpperCase()
    }
    println(hasil)
    println(hasil2)
}
