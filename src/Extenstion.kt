fun main(args: Array<String>) {
var intArray = ArrayList<Int>()
    intArray.add(5)
    intArray.add(9)
    intArray.addTwoNumbers(intArray[0], intArray[1])
    var stringArray = ArrayList<String>()
    stringArray.add("How are you?")
    stringArray.add("Are you?")
   // stringArray.addTwoNumbers(stringArray[0],stringArray[1])



}

fun ArrayList<Int>.addTwoNumbers(number1: Int, number2: Int): Int {
    var result = number1 + number2
    println(result)
    return result
}