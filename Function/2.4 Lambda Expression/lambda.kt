val lambdaContoh: (String, String, Int) -> String = {
    firstname: String, 
    lastname: String, 
    umur: Int 
    ->
    "$firstname $lastname, ${umur.toString()} tahun"
}

fun main() {
    var hasil: String = lambdaContoh("Budi", "Gunawan", 17)
    println(hasil)
}
