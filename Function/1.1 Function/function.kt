fun HelloWorld(any : String = "") {
    if(any=="print" || any=="println") {
        println("Hello World")
    } else {
        println(any)
    }
}

fun main() {
    HelloWorld("println")
}
