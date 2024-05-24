tailrec fun faktorial(value: Int, total: Int = 1): Int {
    return when (value) {
        0 -> 1
        1 -> total
        else -> faktorial(value-1,value*total)
    }
}

tailrec fun hitung(nilai: Int) {
    println(nilai)
    if(nilai>1){
        hitung(nilai-1)
    }
}

fun main() {
    println(faktorial(5))
    hitung(7)
}
