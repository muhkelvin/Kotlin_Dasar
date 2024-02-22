package FunctionParameter

fun main() {
    val lambdaName:(String) -> String  = {
        it.toUpperCase()
    }
    val lamdaNumber:(Int) -> Int = {value ->
        value + 1
    }

    val name = lambdaName("hello")
    println(name)

    val number = lamdaNumber(1)
    println(number)
}