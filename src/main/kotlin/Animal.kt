abstract class Animal(
    val name: String,
    val legCount: Int = 4
    ) {

    init {
        println("My name is $name")
    }

    abstract fun makeSound()

}