fun hello(nama: String, func: (String) -> String) : String {
    return "Hello ${func(nama)}"
}

fun main() {
    val anonymousUpper = fun(value: String) : String {
        if(value.isBlank()) {
            return "Uppss"
        } else {
            return value.toUpperCase()
        }
    }
    
    println(hello("eko", anonymousUpper))
}
