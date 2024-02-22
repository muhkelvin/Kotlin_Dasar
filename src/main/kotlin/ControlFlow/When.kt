fun main(){
 val number :Int = 4

    val hasil = when (number) {
        1 -> "satu"
        2 -> "dua"
        3 -> "tiga"
        4 -> "Bener"
        else -> "Salah"
    }

    println(hasil)

//    cek tyipe data

    var tipeData: Any = 20

    when(tipeData){
        is Int -> println("Int")
        is String -> println("String")
        is Boolean -> println("Boolean")
        else -> println("tidak diketahui")
    }
}