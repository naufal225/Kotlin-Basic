fun main() {
    var counter: Int = 0
    val tambah : () -> Int = {
        counter ++
    }
    tambah()
    tambah()
    println(counter)
}
