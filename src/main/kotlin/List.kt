fun main(){
    val list: List<Int> = listOf(1, 2, 3) // Imurable hanya bisa Di baca Tidak bIsa Menambah, menghapus Data
    val listString:List<String> = listOf("satu", "dua", "tiga")


    for (i in listString){
        println(i)
    }

    for (i in list){
        println(i)
    }

    println(list.get(0)) // Memanggil data()

    val mutableList: MutableList<Int> = mutableListOf(1, 2, 3) // Mutable list bisa menambah data

    mutableList.add(4)
    println(mutableList[1])
//    mutableList.removeAll(true)  // Menghapus semua data yang bernilai true
    mutableList.removeAt(1) // Menghapus data pada index

    for (i in mutableList){
        println(i)
    }

    println(mutableList.size)


}