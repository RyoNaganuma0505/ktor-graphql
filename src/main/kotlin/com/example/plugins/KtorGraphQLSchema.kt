package com.example.plugins

import com.example.schema.ExampleMutation
import com.example.schema.ExampleQuery
import com.expediagroup.graphql.generator.SchemaGeneratorConfig
import com.expediagroup.graphql.generator.TopLevelObject
import com.expediagroup.graphql.generator.scalars.IDValueUnboxer
import com.expediagroup.graphql.generator.toSchema
import graphql.GraphQL

object KtorGraphQLSchema {
    private val config = SchemaGeneratorConfig(listOf("com.example.dto"))
    private val queries = listOf(TopLevelObject(ExampleQuery))
    private val mutations = listOf(TopLevelObject(ExampleMutation))

    private val graphQLSchema = toSchema(
        config = config,
        queries = queries,
        mutations = mutations
    )

    fun getGraphQLObject(): GraphQL = GraphQL.newGraphQL(graphQLSchema)
        .valueUnboxer(IDValueUnboxer())
        .build()
}
