fun operasi(angka1: Int, angka2: Int, op: (Int, Int) -> Int): Int {
    return op(angka1,angka2)
}

fun main() {
    val tambah: (Int, Int) -> Int = {
        a: Int, b: Int -> a + b
    }
    val kurang: (Int, Int) -> Int = {
        a: Int, b: Int -> a - b
    }
    val kali: (Int, Int) -> Int = {
        a: Int, b: Int -> a * b
    }
    
    println(operasi(2,3,tambah))
    println(operasi(4,2,kurang))
    println(operasi(3,4,kali))
