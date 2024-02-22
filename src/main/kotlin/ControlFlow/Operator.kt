package ControlFlow

fun main(){
    val hasilTambah = tambah(1,2)
    println(hasilTambah)

}

fun tambah(a: Int, b: Int): Int {
    return a + b
}

fun kurang(a: Int, b: Int): Int {
    return a - b
}

fun bagi(a: Int, b: Int): Int {
    return a / b
}

fun kali(a: Int, b: Int): Int {
    return a * b
}