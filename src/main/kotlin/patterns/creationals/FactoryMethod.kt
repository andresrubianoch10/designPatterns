package patterns.creationals

/**
 * It's quite similar on android when we're working on RecyclerView/ListAdapter, and we want to have different
 * view types and helps us to show different types depends on the param
 */

interface Animal {
    fun makeSound()
}

class Dog: Animal {
    override fun makeSound() {
        print("WOOF!")
    }
}

class Cat: Animal {
    override fun makeSound() {
        print("MEOW!")
    }
}

object AnimalFactory {
    fun createAnimal(animalType: AnimalType): Animal {
        return when(animalType) {
            AnimalType.DOG -> Dog()
            AnimalType.CAT -> Cat()
            else -> throw IllegalArgumentException("Unknown Animal Type")
        }
    }
}

enum class AnimalType {
    DOG, CAT
}

fun main() {
    val myDog: Animal = AnimalFactory.createAnimal(AnimalType.DOG)
    val myCat: Animal = AnimalFactory.createAnimal(AnimalType.CAT)
    myDog.makeSound()
    myCat.makeSound()
}