package com.s12works.imageRandomizer.assertion

public fun report(message: Message, assessor: Assessor): Report? = when (assessor.func()) {
    false -> Report(Receipt(message, assessor), java.time.LocalDateTime.now())
    true -> null
}
