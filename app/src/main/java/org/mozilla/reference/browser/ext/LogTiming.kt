package org.mozilla.reference.browser.ext

import mozilla.components.support.base.log.logger.Logger
import kotlin.system.measureTimeMillis

fun measureAndLog(log:String,block: () -> Unit){
    Logger("measure").info("$log took ${measureTimeMillis(block)} ms")
}