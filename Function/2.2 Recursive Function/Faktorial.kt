fun faktorialRekursif(nilai: Int): Int {
    return when (nilai) {
        0 -> 1
        1 -> 1
        else -> nilai * faktorialRekursif(nilai-1)
    }
}

fun main() {
    println(faktorialRekursif(0))
}
