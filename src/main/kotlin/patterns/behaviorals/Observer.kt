package patterns.behaviorals

/**
 * Observer Pattern
 */

interface Observer {
    fun update(data: String)
}

interface Observable {
    fun addObserver(observer: Observer)
    fun removeObserver(observer:Observer)
    fun notifyObservers(data: String)
}

class DataSource: Observable {
    private val observers = mutableListOf<Observer>()
    override fun addObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers(data: String) {
        observers.forEach {
            it.update(data)
        }
    }

    fun setData(data: String) {
        notifyObservers(data)
    }
}

class DataDisplay : Observer {
    override fun update(data: String) {
        println("data added is $data")
    }
}

fun main() {
    val dataSource = DataSource()
    val dataDisplay = DataDisplay()

    dataSource.addObserver(dataDisplay)
    dataSource.setData("New data here")
}