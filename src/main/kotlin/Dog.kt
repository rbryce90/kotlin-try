class Dog: Animal (name = "Dog") {

    override fun makeSound(){
        println("Bark Bark")
    }

    init {
        println(" I have $legCount legs")
    }
}