package com.s12works.imageRandomizer.graphics

import com.s12works.imageRandomizer.rangeUtil.contains

public fun isValidRGBValue(int: RGBValue): Boolean =
    int in rgbRange
