package com.s12works.imageRandomizer.assertion

public fun assert(
    message: Message,
    enforcer: Enforcer<*>,
    assessor: Assessor
): Unit {
    val report: Report? = report(message, assessor)

    when (report != null) {
        true -> enforcer(report)
        false -> Unit
    }
}
