package com.s12works.imageRandomizer.assertion

public fun assert(
    receipt: Receipt
    enforcer: Enforcer<*>,
    reporter: Reporter
): Unit {
    val report: Report? = reporter(receipt)

    when (report != null) {
        true -> enforcer(report)
        false -> Unit
    }
}
