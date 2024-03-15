package com.example.lib

import com.example.scope.AppScope
import com.squareup.anvil.annotations.ContributesMultibinding
import javax.inject.Inject

@ContributesMultibinding(AppScope::class, ExampleInterface::class)
@ExampleKey("ExampleB")
class ExampleImplB @Inject constructor() : ExampleInterface {
    override val name: String
        get() = "B"
}