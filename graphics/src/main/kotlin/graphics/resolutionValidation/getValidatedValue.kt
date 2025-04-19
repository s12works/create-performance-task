package com.s12works.imageRandomizer.graphics.resolutionValidation

import com.s12works.imageRandomizer.assertion.enforcers.fail
import com.s12works.imageRandomizer.graphics.Dimension

public fun getValidatedValue(
    type: DimensionType,
    value: Dimension
): Dimension = com.s12works.imageRandomizer.assertion.validated(
    getMessage(type, value),
    ::fail,
    value,
    { com.s12works.imageRandomizer.graphics.isValidDimension(it) }
)
