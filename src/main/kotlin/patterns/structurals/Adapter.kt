package patterns.structurals

/**
 * The Adapter Pattern is a structural pattern that allows the interface of an existing class to be used
 * as another interface. It is used when the interface of an existing class does not match the client's expectations,
 * and you want to adapt it without modifying the existing code.
 */
interface Target {
    fun request()
}

class Adaptee {
    fun specificRequest() {
        println("Specific Request")
    }
}

class Adapter(private val adaptee: Adaptee) : Target {
    override fun request() {
        adaptee.specificRequest()
    }
}