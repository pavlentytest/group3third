import java.util.*
import kotlin.collections.ArrayList

// ArrayList vs LinkedList



class Test {
    fun toDo() {

    }
}
// функция расширения
fun Test.doSmth() {

}

fun String.countOf() {

}

fun main() {

    val str = "d123123123f";

    val digits = str.filter { it.isDigit() }
    println(digits)


        val test = Test()
    test.toDo()
    test.doSmth()

        val arrayList = ArrayList<Int>()
        val linkedList = LinkedList<Int>()
        // 1) добавление элементов в начало
        // 2) поиск в середине
        // 3) добавление в конец списков

        var start = System.nanoTime()
        for(i in 1..100000) {
            arrayList.add(0,i)
        }
        var end = System.nanoTime()
        println("Arraylist add to the begin:  ${end-start}")

        start = System.nanoTime()
        for(i in 1..100000) {
            linkedList.add(0,i)
        }
        end = System.nanoTime()
        println("Linkedlist add to the begin: ${end-start}")


        start = System.nanoTime()
        for(i in 30000..60000) {
            arrayList.get(i)
        }
        end = System.nanoTime()
        println("Arraylist get:  ${end-start}")

        start = System.nanoTime()
        for(i in 30000..60000) {
            linkedList.get(i)
        }
        end = System.nanoTime()
        println("Linkedlist get: ${end-start}")

        start = System.nanoTime()
        for(i in 0..100000) {
            arrayList.add(i)
        }
        end = System.nanoTime()
        println("Arraylist add to the end:  ${end-start}")

        start = System.nanoTime()
        for(i in 0..100000) {
            linkedList.add(i)
        }
        end = System.nanoTime()
        println("Linkedlist add to the end: ${end-start}")







    var names: List<String> = listOf("Ivan","Petr")
    val names2: List<String> = listOf("Maria","Olga")

    names = names2

   // println(names2)
   // names[0] = "Maria"

    var cities= mutableListOf("Msk","Kzn","Spb")
    cities[0] = "EKT"
    cities.add("TTT")
    var countries = arrayListOf("RU","CN")
    cities = countries
    println(cities)


}

