package org.mozilla.reference.browser.initializers

import android.content.Context
import androidx.annotation.Keep
import androidx.startup.Initializer
import io.sentry.android.core.SentryPerformanceProvider
import mozilla.components.support.base.log.logger.Logger

@Suppress("unused")// referenced for android manifest file
@Keep
class SentryPerformanceInitializer : Initializer<SentryPerformanceProvider> {
    override fun create(context: Context): SentryPerformanceProvider {
        Logger("Initializer").info("SentryPerformanceInitializer")
        return SentryPerformanceProvider()
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        // No dependencies on other libraries.
        return emptyList()
    }
}