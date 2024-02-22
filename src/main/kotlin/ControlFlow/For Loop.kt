package ControlFlow

fun main(){
    for (i in 1..10){
        println("Range :$i ")
    }

    val arrayList:Array<Int> = arrayOf(1,2,3,4,5,6,7,8)

    for (i in arrayList){
        println(i)
    }

    arrayList.forEach {
        println("it berisi data : $it")
    }

    var nilai = 1
    while (nilai <= 10){
        println("Nilai : $nilai")
        nilai++
    }

    do {
        println("Nilai : $nilai")
        nilai++
    } while (nilai <= 5)

}