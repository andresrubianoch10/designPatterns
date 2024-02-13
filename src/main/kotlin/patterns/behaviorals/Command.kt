package patterns.behaviorals

interface Command {
    fun execute()
}

class PrintCommand(val message: String): Command {
    override fun execute() {
        println(message)
    }
}

class CommandInvoker {
    private val commands = mutableListOf<Command>()

    fun addCommand(command: Command) {
        commands.add(command)
    }

    fun executeCommands() {
        commands.forEach {
            it.execute()
        }
    }
}

fun main() {
    val invoker = CommandInvoker()
    invoker.addCommand(PrintCommand("Hello"))
    invoker.addCommand(PrintCommand("World"))
    invoker.executeCommands()
}