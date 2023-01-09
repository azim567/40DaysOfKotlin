fun main() {

//    for( i in 1..10){
//        sendMessage()
//        println()
//    }

//    areaOfRectAngle(10, 5)
//    areaOfRectAngle(12, 5)
//    areaOfRectAngle()

    //println(sum(3, 6))

    maximumNumber(2,4,6,1,3,6,11, 17)
}


fun sendMessage() {
    val a = 5 + 6
    println("message sent")
    println("thankyou")
}

fun areaOfRectAngle(length: Int = 0, breath: Int = 0) {
    val area = length * breath
    println("Area of rectangle is : $area")
}

fun sum(number1: Int, number2: Int): Int {

    return number1 + number2
}

fun maximumNumber(vararg numbers: Int){
    println(numbers.maxOrNull())
}

