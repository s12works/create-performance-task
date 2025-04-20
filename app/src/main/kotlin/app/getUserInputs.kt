package com.s12works.imageRandomizer.app

public fun getUserInputs(errorPrefix: String, instances: List<UserInputREPLInstance>):
    Collection<com.s12works.imageRandomizer.input.UserInput> = com.s12works.imageRandomizer.getProcGeneratedCollection(
        instances
    ) {
        com.s12works.imageRandomizer.input.startREPL(
            it.request,
            errorPrefix,
            it.tests
        )
    }
