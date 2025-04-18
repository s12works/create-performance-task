package com.s12works.imageRandomizer.rangeUtil.ranges

import com.s12works.imageRandomizer.FromStandardLibrary
import com.s12works.imageRandomizer.StandardLibraryUtility
import com.s12works.imageRandomizer.rangeUtil.Range
import com.s12works.imageRandomizer.assertion.enforcers.fail

@FromStandardLibrary(StandardLibraryUtility.RANGE)
public val positive = Range(0, null)

@FromStandardLibrary(StandardLibraryUtility.RANGE)
public val negative = Range(null, 0)
