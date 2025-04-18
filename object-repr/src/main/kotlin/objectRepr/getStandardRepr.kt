package com.s12works.imageRandomizer.objectRepr

public fun <O: Any> getStandardRepr(obj: O): Translation =
    com.s12works.imageRandomizer.objectRepr.translators.getDefault(
        com.s12works.imageRandomizer.objectRepr.representors.getStandard(
            obj
        )
    )
