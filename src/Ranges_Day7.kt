
fun main() {

  var range1= 1..10
    println(range1.first)
    println(12 in range1)

    var range2= 10 downTo 1  // 10 9 8 7 6 5 4 3 2 1
    println("last element of range2: ${range2.last}")
    println("first element of range2: ${range2.first}")

    var range3= 1..10 step 2  // 1 3 5 7 9
    println("first element of range3: ${range3.first}")
    println("last element of range3: ${range3.last}")
    println(2 in range3)

    var range4=1 until 10
    println("last element of range4: ${range4.last}")

    var charRange='a'..'f'
    println('d' in charRange)

}