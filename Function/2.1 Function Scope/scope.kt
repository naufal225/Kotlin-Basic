fun main() {
    fun sayHello(name: String, time: String) {
        println("Hello $name, Good $time")
    }
    // function sayHello hanya bisa diakses di dalam function main, tidak bisa diakses diluarnya karena dideklarasikan di blok kode fun main()
    
    sayHello("Eko","morning")
}
