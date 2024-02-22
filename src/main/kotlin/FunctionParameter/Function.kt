package FunctionParameter

fun main(){
    sayHello()
    name("Daffa")
    identitity("Daffa", 20)
    println(sum(10, 20))
    gega(1)
    singleExpression(2)
    val extension = "Daffa".hello()
    println(extension)
    println(returnIf("Daffa"))
}

fun sayHello(){       // function Tanpa parameter
    println("Hello Function")
}

fun name(name: String){       // function dengan parameter
    println("Hello $name")
}

fun identitity(name: String, age: Int){       // function dengan multiple parameter
    println("Hello $name, $age")
}

fun sum(a: Int, b: Int): Int{       // function dengan return value
    return a + b
}

fun singleExpression(a:Int):Int = a + 2   // single expression

fun String.hello(){
    println("Hello $this")   // extension
}

fun gega(angka: Int){
    if (angka % 2 == 0){
        println("Angka $angka Genap")
    } else if (angka % 2 != 0){
        println("Angka $angka Ganjil")
    }
}

fun returnIf(name:String = ""):String{
    return if (name == "") "Guest" else name
}

