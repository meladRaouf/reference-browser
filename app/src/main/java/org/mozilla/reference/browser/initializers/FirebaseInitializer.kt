package org.mozilla.reference.browser.initializers

import android.content.Context
import androidx.annotation.Keep
import androidx.startup.Initializer
import com.google.firebase.provider.FirebaseInitProvider
import mozilla.components.support.base.log.logger.Logger

@Suppress("unused")// referenced for android manifest file
@Keep
class FirebaseInitializer : Initializer<FirebaseInitProvider> {
    override fun create(context: Context): FirebaseInitProvider {
        Logger("Initializer").info("FirebaseInitializer")

        return FirebaseInitProvider()
    }
    override fun dependencies(): List<Class<out Initializer<*>>> {
        // No dependencies on other libraries.
        return emptyList()
    }
}