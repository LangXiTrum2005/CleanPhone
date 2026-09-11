package nixlab.phone.cleaner.freeup.storage.ui.base

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import nixlab.phone.cleaner.freeup.storage.util.LocaleHelper

/**
 * BaseActivity that attaches localized Context to ensure proper language configuration across all activities.
 */
abstract class BaseActivity : AppCompatActivity() {

    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(LocaleHelper.wrap(newBase))
    }

    override fun onResume() {
        super.onResume()
        androidx.core.view.WindowCompat.getInsetsController(window, window.decorView).isAppearanceLightStatusBars = false
    }
}
