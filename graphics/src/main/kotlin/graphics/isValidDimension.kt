package com.s12works.imageRandomizer.graphics

import com.s12works.imageRandomizer.rangeUtil.contains

public fun isValidDimension(dimension: Dimension): Boolean =
    dimension in com.s12works.imageRandomizer.rangeUtil.ranges.positive
