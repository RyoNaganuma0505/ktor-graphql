package com.example.schema

import com.example.usecases.GetUser
import com.expediagroup.graphql.server.operations.Query

object ExampleQuery : Query {
    // 簡単な文字列を返す場合
    fun hello() = "Hello Query"

    // 実行結果を返す場合
    // { users { id, name , address { city } } }
    fun users() = GetUser.execute()

    // 引数付の場合
    // { userById(id: "user-1") { id, name , address { city } } }
    fun userById(id: String) = GetUser.execute(id)
}
