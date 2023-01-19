package com.example.plugins

import com.expediagroup.graphql.generator.SchemaGeneratorConfig
import com.expediagroup.graphql.generator.TopLevelObject
import com.expediagroup.graphql.generator.scalars.IDValueUnboxer
import com.expediagroup.graphql.generator.toSchema
import com.expediagroup.graphql.server.operations.Query
import graphql.GraphQL

object HelloQuery : Query {
    fun hello() = "Hello Query"
}

object KtorGraphQLSchema {
    private val config = SchemaGeneratorConfig(listOf("com.example.plugins"))
    private val queries = listOf(TopLevelObject(HelloQuery))

    private val graphQLSchema = toSchema(
        config = config,
        queries = queries
    )

    fun getGraphQLObject(): GraphQL = GraphQL.newGraphQL(graphQLSchema)
        .valueUnboxer(IDValueUnboxer())
        .build()
}
