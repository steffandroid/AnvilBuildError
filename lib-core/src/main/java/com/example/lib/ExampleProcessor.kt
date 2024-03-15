package com.example.lib

import com.example.scope.AppScope
import com.squareup.anvil.annotations.optional.SingleIn
import javax.inject.Inject

@SingleIn(AppScope::class)
class ExampleProcessor @Inject constructor(
    private val exampleMap: @JvmSuppressWildcards Map<String, ExampleInterface>
) {
    fun process() {
        println(exampleMap.entries.size)
    }
}
