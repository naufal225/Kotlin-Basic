fun sum(a: Int, b: Int) : Int { // return integer
    return a + b
}

fun pow(a: Int, b: Int) : Int { // return integer
    var hasil: Int = a
    var i: Int = 1
    while(i<b) {
        hasil *= a
        i++
    }
    return hasil
}

fun sayHello(name: String) : String { // return string
    return "Hello $name"
}

fun main() {
    var result1 = sum(3,4)
    var result2 = pow(2,6)
    var result3 = sayHello("Udin")
    
    println(result1)
    println(result2)
    println(result3)
}
