package org.mozilla.reference.browser.ext

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

fun inBackground(context: CoroutineDispatcher = Dispatchers.IO, block: suspend () -> Unit) {
    CoroutineScope(context).launch {
        block()
    }
}
