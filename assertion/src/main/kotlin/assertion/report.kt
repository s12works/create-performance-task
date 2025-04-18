package com.s12works.imageRandomizer.assertion

public fun report(message: Message, assessor: () -> Assessment): Report? = when (assessor()) {
    false -> Report(Receipt(message, assessor), java.time.LocalDateTime.now())
    true -> null
}
