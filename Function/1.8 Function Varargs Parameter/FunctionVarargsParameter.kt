// varargs di kotlin
// parameter vararg harus ditempatkan di akhir penulisan parameter pada function

fun rerata(vararg values: Int): Double{
    var count:Int = 0
    var nilai: Int = 0
    for(value in values) {
        count++
        nilai += value
    }
    
    var hasil: Double = nilai.toDouble() / count.toDouble()
    return hasil
}

fun main() {
    println(rerata(80,90,68,100,56,89,99,100))
}
