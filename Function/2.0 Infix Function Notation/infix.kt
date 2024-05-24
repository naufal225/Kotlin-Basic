infix fun String.to(any: String): String {
    if(any=="UP"){
        return this.toUpperCase()
    } else {
        return this.toLowerCase()
    }
}

fun main() {
    var cihuy = "cihuy"
    println(cihuy)
    var cihuy2 = cihuy to "UP"
    println(cihuy2)
}
