package com.s12works.imageRandomizer.graphics.colorUtil

import com.s12works.imageRandomizer.FromStandardLibrary
import com.s12works.imageRandomizer.StandardLibraryUtility
import com.s12works.imageRandomizer.graphics.rgbRange
import com.s12works.imageRandomizer.graphics.Color

@FromStandardLibrary(StandardLibraryUtility.COLOR_UTILITY)
public val red = Color(
    rgbRange.maximum!!,
    rgbRange.minimum!!,
    rgbRange.minimum!!
)

@FromStandardLibrary(StandardLibraryUtility.COLOR_UTILITY)
public val green = Color(
    rgbRange.minimum!!,
    rgbRange.maximum!!,
    rgbRange.minimum!!
)

@FromStandardLibrary(StandardLibraryUtility.COLOR_UTILITY)
public val blue = Color(
    rgbRange.minimum!!,
    rgbRange.minimum!!,
    rgbRange.maximum!!
)

@FromStandardLibrary(StandardLibraryUtility.COLOR_UTILITY)
public val black = Color(
    rgbRange.minimum!!,
    rgbRange.minimum!!,
    rgbRange.minimum!!
) 

@FromStandardLibrary(StandardLibraryUtility.COLOR_UTILITY)
public val white = Color(
    rgbRange.maximum!!,
    rgbRange.maximum!!,
    rgbRange.maximum!!
)
