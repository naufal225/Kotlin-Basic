// Extension Function digunakan untuk menambahkan function pada suatu tipe data
// bisa juga menambahkan function pada suatu class

fun String.hi(): String = "My Name Is $this"

class Car(val name: String)

fun Car.jalan(): String = "Mobil " + this.name + " lagi jalan"

fun main() {
    val udin : String = "Udin"
    val toyota = Car("avanza")
    println(toyota.jalan())
    println(udin.hi())
}
