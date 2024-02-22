package ControlFlow

fun main() {
    var i = 0
    while (i < 10) {
        i++
        println(i)
    } // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9

    var doWhile = 0
    do {
        println(doWhile)
        doWhile++
    } while (doWhile < 10)
}