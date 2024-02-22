package ControlFlow

fun main(){
    val range = 1..10
    val steps = 0..10 step 2
    for(i in range){
        println(i) // 1 2 3 4 5 6 7 8 9 10()
    }

    for (i in steps){
        println("Lewati 2 angka :  $i")
    }

    val rangeTo = 0.rangeTo(10) step 2
    for (i in rangeTo){
        println("Lewati 2 angka :  $i")
    }

    val downTo = 10.downTo(0) step 2
    for (i in downTo){
        println("turun dan lewati 2 angka $i")
    }

    val nilai = 71
    when (nilai){
        in 0..50 -> println("Nilai anda $nilai")
        in 51..100 -> println("Nilai anda $nilai")
        else -> println("Nilai anda $nilai")
    }
}