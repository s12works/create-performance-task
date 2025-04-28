package com.s12works.imageRandomizer.assertion.enforcers

public class FailureException internal constructor(
    public val report: com.s12works.imageRandomizer.assertion.Report
): Exception(report.reciept.message) {
    // potentially remaster to include auto-gen message as qualification   
    override fun equals(other: Any?): Boolean = (
        other is FailureException &&
        this.report == other.report
    )
}
