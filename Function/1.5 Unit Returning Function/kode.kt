fun sayHello(name: String? = null): Unit {
    // penggunaan keyword Unit adalah untuk menunjukan bahwa function ini tidak mereturn apa apa, seperti keyword void
    if(name==null){
        println("Hello Bro!")
    } else {
        println("Hello $name!")
    }
}

fun main() {
    sayHello()
}
