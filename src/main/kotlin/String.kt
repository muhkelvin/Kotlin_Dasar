fun main(){
    val escapeString:String = "\"Kelvin\" \n"
    println(escapeString)
    val rawString:String = """
        Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups. 
    """.trimIndent()
    println(rawString)

    val name:String = "Kelvin"
    val age:Int = 20

    println("My name is $name" + " and I am $age years old \n")
    println("My Name And My Age  is ${name + age}")

    var firstname:String = "AbuLahab"
    firstname = "Abu"
    println(firstname)
}