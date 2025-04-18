package com.s12works.imageRandomizer.input

public fun startREPL(request: Request, errorPrefix: String, tests: Map<Test, ErrorMessage?>): UserInput {
    while (true) {
        var input = getInput(request + " ")
        var results = com.s12works.imageRandomizer.getProcGeneratedCollection<Test, Boolean>(tests.keys) {
            it(input)
        }
    
        if (results.all { it }) {
            return input
        } else {
            for (i in 0 until results.size) {
                var message = tests.values.toList()[i]

                if (!results.toList()[i] && message != null) {
                    println(errorPrefix + message)
                }
             }
         }
     }
 }
