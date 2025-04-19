package com.s12works.imageRandomizer.graphics

import com.s12works.imageRandomizer.graphics.rgbValueValidation.ColorType
import com.s12works.imageRandomizer.graphics.rgbValueValidation.getValidatedValue

public class Color {
    public val red: RGBValue
    public val green: RGBValue
    public val blue: RGBValue

    public constructor(
        red: RGBValue,
        green: RGBValue,
        blue: RGBValue
    ) {
        this.red = getValidatedValue(ColorType.RED, red)
        this.green = getValidatedValue(ColorType.GREEN, green)
        this.blue = getValidatedValue(ColorType.BLUE, blue)
    }

    override fun toString(): com.s12works.imageRandomizer.objectRepr.Translation =
        com.s12works.imageRandomizer.objectRepr.getStandardRepr(this)

    override fun equals(other: Any?): Boolean = (
        other is Color &&
        this.red == other.red &&
        this.green == other.green &&
        this.blue == other.blue
    )
}
