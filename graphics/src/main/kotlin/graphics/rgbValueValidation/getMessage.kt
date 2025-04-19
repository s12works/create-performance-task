package com.s12works.imageRandomizer.graphics.rgbValueValidation

public fun getMessage(type: ColorType, rgbValue: com.s12works.imageRandomizer.graphics.RGBValue):
    com.s12works.imageRandomizer.assertion.Message = "Color object illegally instantiated; ${type.name.lowercase(java.util.Locale.US)} value is ${rgbValue}"
