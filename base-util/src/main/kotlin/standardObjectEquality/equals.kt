package com.s12works.imageRandomizer.standardObjectEquality

@com.s12works.imageRandomizer.FromStandardLibrary(
    com.s12works.imageRandomizer.StandardLibraryUtility.STANDARD_OBJECT_EQUALITY
)
public infix fun <L, R> L.equals(other: R): Boolean = when {
    this::class == other::class && getObjectComposition(this) == getObjectComposition(other) -> true
    this == null && other == null -> true
    else -> false
}
