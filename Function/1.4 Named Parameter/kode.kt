fun sayHello(firstname: String,lastname: String? = null) {
    println("Hello $firstname $lastname")
}

fun main() {
    
    // contoh penggunaan named parameter
    sayHello(lastname="Gunawan", firstname="Budi")
    
    
}
