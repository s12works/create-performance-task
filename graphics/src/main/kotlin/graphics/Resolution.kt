package com.s12works.imageRandomizer.graphics

import com.s12works.imageRandomizer.graphics.resolutionValidation.DimensionType
import com.s12works.imageRandomizer.graphics.resolutionValidation.getValidatedValue

public class Resolution {
    public val length: Dimension
    public val width: Dimension

    public constructor(
        length: Dimension,
        width: Dimension
    ) {
        this.length = getValidatedValue(
            DimensionType.LENGTH,
            length
        )

        this.width = getValidatedValue(
            DimensionType.WIDTH,
            width
        )
    }

    override fun toString(): com.s12works.imageRandomizer.objectRepr.Translation =
        com.s12works.imageRandomizer.objectRepr.getStandardRepr(this)

    override fun equals(other: Any?): Boolean = (
        other is Resolution &&
        this.length == other.length &&
        this.width == other.width
    )
}
