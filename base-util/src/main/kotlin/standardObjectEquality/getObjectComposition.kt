package com.s12works.imageRandomizer.standardObjectEquality

import kotlin.reflect.KProperty

public fun <O: Any> getObjectComposition(obj: O): Collection<Any?> =
    com.s12works.imageRandomizer.getProcGeneratedCollection<KProperty<*>, Any?>(
        obj::class.members.filter {
            it is KProperty<*>
        },
    ) { it.call() }
}
