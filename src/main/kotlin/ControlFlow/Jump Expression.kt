package ControlFlow

fun main(){
    var nilai = 0

    while (nilai < 10){
        println("Nilai : $nilai")
        nilai++

        if (nilai >= 5){
            break
        }
    }

    var nilai2 = 0
    while (nilai2 < 7){
        if (nilai2 == 3){
            continue
        }
        println(nilai2)
        nilai2++
    }
}
