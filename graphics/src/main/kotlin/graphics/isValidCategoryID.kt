package com.s12works.imageRandomizer.graphics

import com.s12works.imageRandomizer.rangeUtil.contains

public fun isValidCategoryID(id: CategoryID): Boolean =
    id in com.s12works.imageRandomizer.rangeUtil.ranges.positive
