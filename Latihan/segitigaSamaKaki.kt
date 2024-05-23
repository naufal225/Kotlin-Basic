fun segitigaSamaKaki(baris: Int, balik: String? = null) {
    if((balik==null || balik=="berdiri") && balik != "kebalik") {
        for(i in 1..baris) {
            for(k in baris-i downTo 0) {
                print(" ")
            }
            for(j in 1..i) {
                print("* ")
            }
            println()
        }
    } else {
        for(i in baris downTo 1) {
            for(k in 0..baris-i) {
                print(" ")
            }
            for(j in 1..i) {
                print("* ")
            }
            println()
        }
    }
}

fun main() {
    segitigaSamaKaki(31, "berdiri")
}
