package com.example.schema

import com.example.usecases.UpdateUser
import com.expediagroup.graphql.server.operations.Mutation

object ExampleMutation : Mutation {
    // 簡単な文字列を返す場合
    fun hello(): String {
        println("Hello Mutation")
        return "Hello World"
    }

    // mutation { updateUser(id: "user-1", name: "Hitori") { id , name }  }
    fun updateUser(id: String, name: String) = UpdateUser.execute(id, name)
}
