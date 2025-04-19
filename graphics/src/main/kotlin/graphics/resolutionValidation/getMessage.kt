package com.s12works.imageRandomizer.graphics.resolutionValidation

public fun getMessage(type: DimensionType, dimension: com.s12works.imageRandomizer.graphics.Dimension):
    com.s12works.imageRandomizer.assertion.Message = "ImageRectangle object illegally instantiated; ${type.name.lowercase(java.util.Locale.US)} value is ${dimension}"
