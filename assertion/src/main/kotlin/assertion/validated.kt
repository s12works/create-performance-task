package com.s12works.imageRandomizer.assertion

public fun <O> validated(
    name: String?,
    message: Message,
    enforcer: Enforcer<*>,
    obj: O,
    assessor: (O) -> Assessment
): O {
    assert(
        message,
        enforcer,
        Assessor(
            name,
            { assessor(obj) }
        )
    )

    return obj
}
