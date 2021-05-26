fun main() {

    var input = 5

    /* when(input){

         1 -> print("Welcome")
         2 -> print("How are you")
         5 -> print("I am fine")
         in 6..10 -> print("Talk to you later, I am busy now")
         else -> print("Good bye")
     }*/

    //when as expression
    var message = when (input) {
        1 -> {
            "Welcome"
        }
        2 -> {
            "How are you"
        }
        5 -> {
            "I am fine"
            "I am the last one"
        }
        in 6..10 -> {
            "Talk to you later, I am busy now"
        }
        else -> {
            "Good bye"
            "See you soon"
        }
    }

    print(message)
}