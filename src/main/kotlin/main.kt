//
//fun newFunction(){
//    val shoppingList = listOf<String>('bread', 'butter', 'coffee')
//    println(shoppingList)
////    return shoppingList
//    return
//}

fun main(args: Array<String>) {

    val list = listOf("My", "List", "Here")

//    val count = list.count{ currentString ->
//        currentString.length == 2
//    }
//    println(count)


    fun List<String>.customCount(function: (String) -> Boolean): Int {
        var counter = 0
        for (string in this){
            if (function(string)){
                counter++
            }
        }
        return counter
    }


    println(list.customCount{ currentString ->
        currentString.length == 2
    })



//    println("Please type something and press enter: ")
//    val number = readLine() ?: "0"
//
//    val parsedNum = try {
//        number.toInt()
//    } catch(err: Exception){
//        0
//    }
//    println(parsedNum)
//
//



//    val bear = object : Animal(name= "Bear"){
//        override fun makeSound(){
//            println("Roar!!!!")
//        }
//    }
//    bear.makeSound()
//



//    val dog = Dog()
//    dog.makeSound()
//
//    val cat = Cat()
//    cat.makeSound()




//    val wholeNumber = 4;
//    val bigNumber = 3L;
//    val preciseDecimal = 3.33;
//    val iLoveVegitables = false;
//    val iLovePizza = true;
//    val iAmALetter = 'a'
//    val x = 3 * 4;
//    println("value of x is $x")
//
//    val myDec = 3f/4f
//    println("My decimal is $myDec")

//    val string = "This is my Kotlin program"
//    println(string)
//    println(string.toUpperCase())
//
//    val x = 1 + 5
//
//    if (x == 2){
//       print("Yes x is greater than 2")
//    } else if (x > 5 ) {
//        println("No it's not 2 but it is greater than 5")
//    }
//    else {
//        println("Nah, it isn't man ")
//    }
//
//    val y = if(x == 2) 2 else 3
//
//    println("y is now $y")

//    val userInput1 = readLine() ?: "0"
//    val userInput2 = readLine() ?: "4"
//    val result = userInput1!!.toInt() + userInput2!!.toInt()
//    println(result)

//    val theList = newFunction()

//    println(theList)

//    newFunction()
//    val shoppingList = listOf<String>("bread", "butter", "coffee")
//    println(shoppingList[2])
//
//    val anotherList = mutableListOf<String>("item1", "item2", "item3")
//    anotherList.add("thing5")
//    println(anotherList[3])

//    var counter = 0

//    while(counter < shoppingList.size){
//        println(shoppingList[counter])
//        counter++
//    }



//    for(shoppingItem in shoppingList){
//        println(shoppingItem)
//    }
//    for (i in 1..100){
//        println(i)
//    }

//    val x = 3
//    when (x){
//        in 1..2 -> println("x is between 1 and 2")
//        in 3..10 -> println("x is between 3 and 10")
//        else -> {
//            println("x ius not in range of 1 to 10")
//        }
//    }

//    print10Numbers()
//    println(isEven(4))
//    println(isEven(5))
//    println(isEven())
//
//    val my30 = 30.isOdd()
//
//    print("This should be false: $my30"





}


//fun isEven (number: Int = 10): Boolean {
////    println(number % 2 == 0)
//    return number % 2 == 0
//}
//
//
//fun Int.isOdd(): Boolean{
//    return this % 2 == 1
//}

//fun print10Numbers() {
//    for (i in 1..10){
//        println(i)
//    }
//}