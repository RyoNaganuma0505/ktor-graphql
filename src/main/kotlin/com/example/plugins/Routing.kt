package com.example.plugins

import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }
        post("/graphql") {
            println("ACCEPT graphql")
            KtorGraphQLServer.handle(this.call)
        }
    }
}
