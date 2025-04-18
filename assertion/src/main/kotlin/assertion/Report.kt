package com.s12works.imageRandomizer.assertion

/**
 * contains all that which is necessary for processing/representing errors
 * 
 * @property reciept represents the report's required [Reciept] (or representation of the error)
 * @property occurance represents the occurance of the error temporally
 */
public data class Report(
    public val reciept: Receipt,
    public val occurance: java.time.LocalDateTime
) {
    override fun toString(): com.s12works.imageRandomizer.objectRepr.Translation =
        com.s12works.imageRandomizer.objectRepr.getStandardRepr(this)
} 
