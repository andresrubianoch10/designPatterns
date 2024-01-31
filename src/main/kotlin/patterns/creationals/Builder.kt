package patterns.creationals

class Person private constructor(
    val name: String,
    val age: String,
    val address: String
) {
    class Builder {
        private var name: String = ""
        private var age: String = ""
        private var address: String = ""

        fun setName(name: String): Builder {
            this.name = name
            return this
        }

        fun setAge(age: String): Builder {
            this.age = age
            return this
        }

        fun setAddress(address: String): Builder {
            this.address = address
            return this
        }

        fun build(): Person {
            return Person(name, age, address)
        }
    }
}

fun main() {
    val person = Person.Builder()
        .setName("Name")
        .setAddress("Address")
        .build()

    val secondPerson = Person.Builder()
        .setAge("Age")
        .build()

    println("First person with Name and Address ->")
    println("${person.name} - ${person.address}")
    println("Second Person with just age -> ")
    println("${secondPerson.age}")
}