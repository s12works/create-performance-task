package com.s12works.imageRandomizer.graphics.colorUtil

import com.s12works.imageRandomizer.graphics.RGBValue
import com.s12works.imageRandomizer.graphics.rgbRange

@com.s12works.imageRandomizer.FromStandardLibrary(
    com.s12works.imageRandomizer.StandardLibraryUtility.COLOR_UTILITY
)
public fun getRGBValueTransformation(
    rgbValue: RGBValue,
    transformationValue: RGBValue
): RGBValue {
    val newValue: RGBValue = rgbValue + transformationValue

    return when {
        newValue < rgbRange.minimum!! -> rgbRange.minimum!!
        newValue > rgbRange.maximum!! -> rgbRange.maximum!!
        else -> newValue
    }
}
