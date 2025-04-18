package com.s12works.imageRandomizer.rangeUtil

// FIXME: Range's BoundsSpecification nullability results in "hacky" solution; remaster to make more viable/elegant
public operator fun Range.contains(int: Int): Boolean = (
    int <= (this.maximum ?: int) &&
    int >= (this.minimum ?: int)
)
