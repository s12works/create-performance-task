package com.s12works.imageRandomizer.graphics.rgbValueValidation

import com.s12works.imageRandomizer.assertion.enforcers.fail
import com.s12works.imageRandomizer.graphics.RGBValue

public fun getValidatedValue(
    type: ColorType,
    value: RGBValue
): RGBValue = com.s12works.imageRandomizer.assertion.validated(
    getMessage(type, value),
    ::fail,
    value,
    { com.s12works.imageRandomizer.graphics.isValidRGBValue(it) }
)
