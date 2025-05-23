package com.s12works.imageRandomizer.assertion.enforcers

public class FailureException internal constructor(
    public val report: com.s12works.imageRandomizer.assertion.Report
): Exception(report.reciept.message) {
    override fun toString(): com.s12works.imageRandomizer.objectRepr.Translation =
        com.s12works.imageRandomizer.objectRepr.getStandardRepr(this)
 
    // potentially remaster to include auto-gen message as qualification   
    override fun equals(other: Any?): Boolean = (
        other is FailureException &&
        this.report == other.report
    )
}
