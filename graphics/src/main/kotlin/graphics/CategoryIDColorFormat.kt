package com.s12works.imageRandomizer.graphics

import com.s12works.imageRandomizer.graphics.categoryIDColorFormatValidation.getValidatedValue
import com.s12works.imageRandomizer.graphics.categoryIDColorFormatValidation.CategoryIDColorFormatType

public class CategoryIDColorFormat {
    public val red: CategoryID
    public val green: CategoryID
    public val blue: CategoryID

    public constructor(
        red: CategoryID,
        green: CategoryID,
        blue: CategoryID
    ) {
        this.red = getValidatedValue(CategoryIDColorFormatType.RED, red)
        this.green = getValidatedValue(CategoryIDColorFormatType.GREEN, green)
        this.blue = getValidatedValue(CategoryIDColorFormatType.BLUE, blue)
    }

    override fun toString(): com.s12works.imageRandomizer.objectRepr.Translation =
        com.s12works.imageRandomizer.objectRepr.getStandardRepr(this)

    override fun equals(other: Any?): Boolean = (
        other is CategoryIDColorFormat &&
        this.red == other.red &&
        this.green == other.green &&
        this.blue == other.blue
    )
}
