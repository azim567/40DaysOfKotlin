
fun main() {

   /* for (ele in 10 downTo 1 step 2){
        println(ele)
    }*/

    val fruitList= listOf<String>("Apple","Banana","Mango","Papaya","Pear")

   // for (fruit in fruitList.indices) println(fruit)

    for ((index,fruit ) in fruitList.withIndex()) println("$index : $fruit")

}