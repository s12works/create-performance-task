package com.s12works.imageRandomizer.graphics.categoryIDColorFormatValidation

import com.s12works.imageRandomizer.assertion.enforcers.fail
import com.s12works.imageRandomizer.graphics.CategoryID

public fun getValidatedValue(
    type: CategoryIDColorFormatType,
    value: CategoryID
): CategoryID = com.s12works.imageRandomizer.assertion.validated(
    getMessage(type, value),
    ::fail,
    value,
    { com.s12works.imageRandomizer.graphics.isValidCategoryID(it) }
)
