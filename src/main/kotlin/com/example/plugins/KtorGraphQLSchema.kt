package com.example.plugins

import com.example.schema.ExampleQuery
import com.example.usecases.GetUser
import com.expediagroup.graphql.generator.SchemaGeneratorConfig
import com.expediagroup.graphql.generator.TopLevelObject
import com.expediagroup.graphql.generator.scalars.IDValueUnboxer
import com.expediagroup.graphql.generator.toSchema
import com.expediagroup.graphql.server.operations.Query
import graphql.GraphQL

object KtorGraphQLSchema {
    private val config = SchemaGeneratorConfig(listOf("com.example.dto"))
    private val queries = listOf(TopLevelObject(ExampleQuery))

    private val graphQLSchema = toSchema(
        config = config,
        queries = queries
    )

    fun getGraphQLObject(): GraphQL = GraphQL.newGraphQL(graphQLSchema)
        .valueUnboxer(IDValueUnboxer())
        .build()
}
