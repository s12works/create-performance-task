package com.s12works.imageRandomizer.assertion.reports

@com.s12works.imageRandomizer.FromStandardLibrary(
    com.s12works.imageRandomizer.StandardLibraryUtility.ASSERTION_REPORT
)
public open class TemporalReport(
    receipt: com.s12works.imageRandomizer.assertion.Receipt,
    public final val occurance: java.time.LocalDateTime
): com.s12works.imageRandomizer.assertion.Report(receipt)
