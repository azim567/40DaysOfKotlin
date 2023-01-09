fun main() {

    //  val channelName: String = "the codingshef"
    val channelName: String? = null

//    if (channelName != null) {
//        println(channelName.length)
//    }


   channelName?.let {
       println(it.length)
       println(it.toUpperCase())
       println(it.toLowerCase())
   }

    //  println(channelName?.length)
    println(channelName!!.length)

    val color: String? = null
    val defaultColor = "#FF0000"

    val backGroundColor: String = color ?: defaultColor

    //?.  -> It is used to check the null condition and if the expression is null then by default it will return null
    // !! -> absolutely sure about null
    // ?:  -> default value

}