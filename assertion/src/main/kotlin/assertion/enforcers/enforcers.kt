package com.s12works.imageRandomizer.assertion.enforcers

import com.s12works.imageRandomizer.assertion.Report
import com.s12works.imageRandomizer.FromStandardLibrary
import com.s12works.imageRandomizer.StandardLibraryUtility

@FromStandardLibrary(StandardLibraryUtility.ASSERTION_ENFORCER)
public fun warn(report: TemporalReport) =
    println(
        "[${report.occurance.format(java.time.format.DateTimeFormatter.ofPattern("HH:mm:ss"))}] WARNING: ${report}"
    )

@FromStandardLibrary(StandardLibraryUtility.ASSERTION_ENFORCER)
@Throws(FailureException::class)
public fun fail(report: Report): Nothing = throw FailureException(report)
