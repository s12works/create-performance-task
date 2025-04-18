package com.s12works.imageRandomizer.assertion.reporters

import com.s12works.imageRandomizer.assertion.Receipt

@com.s12works.imageRandomizer.FromStandardLibrary(
    com.s12works.imageRandomizer.StandardLibraryUtility.ASSERTION_REPORTER
)
public fun getTemporalReport(receipt: Receipt): com.s12works.imageRandomizer.Report? = when(receipt.assessor.func()) {
    false -> com.s12works.imageRandomizer.assertion.reports.TemporalReport(receipt, java.time.LocalDateTime.now())
    true -> null
}
