package FunctionParameter

fun main(){
    val sum = lambdaFuntion(1, 2)
    val sum2 = lambdaFuntion2(1, 2)
    println(sum2)
    println(sum)


}

val lambdaFuntion = { a: Int, b: Int -> a + b }
val lambdaFuntion2: (Int, Int) -> Int = { a, b -> a + b }

fun highOrderFunction(a: Int, b: Int, function: (Int, Int) -> Int): Int {
    return function(a, b)
}


