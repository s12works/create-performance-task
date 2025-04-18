package com.s12works.imageRandomizer.assertion

public fun <O> validated(
    receipt: Receipt,
    enforcer: Enforcer<*>,
    obj: O,
): O {
    assert(receipt, enforcer) {
        reporter    
    }

    return obj
}
