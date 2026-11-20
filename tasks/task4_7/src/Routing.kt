// Task 4.7

import io.ktor.server.application.*
import io.ktor.server.pebble.*
import io.ktor.server.request.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondTemplate("form.peb", emptyMap())
        }

        // Add route to handle POST requests containing form data
        post("/roll") {
            val params = call.receiveParameters()

            val numDice = params["num_dice"]?.toInt() ?: 1
            val dieSides = params["die_sides"]?.toInt() ?: 6

            val roll = DiceRoll(numDice, dieSides)
            call.respondTemplate("result.peb", mapOf("roll" to roll))
        }

        // Add route to handle GET requests for URLs like /roll/3d8
        get("/roll/{ndn}") {
            val ndn = call.parameters["ndn"]?: return@get

            val parts = ndn.split("d")
            val numDice = parts[0].toInt()
            val dieSides = parts[1].toInt()

            val roll = DiceRoll(numDice, dieSides)
            call.respondTemplate("result.peb", mapOf("roll" to roll))

        }
    }
}
