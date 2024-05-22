fun sayHello(firstname: String, lastname: String? = null) {
    // membuat parameter lastname memiliki nilai default null, tidak wajib diisi
    if(lastname == null) {
        println("Hello $firstname")
    } else {
        println("Hello $firstname $lastname")
    }
}

fun main() {
    sayHello("Budi", "Gunawan")
    sayHello("Eko")
}
