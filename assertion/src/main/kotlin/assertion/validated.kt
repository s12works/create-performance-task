package com.s12works.imageRandomizer.assertion

public fun <O> validated(
    message: Message,
    enforcer: Enforcer<*>,
    obj: O,
    assessor: (O) -> Assessment
): O {
    assert(message, enforcer) {
        assessor(obj)
    }

    return obj
}
