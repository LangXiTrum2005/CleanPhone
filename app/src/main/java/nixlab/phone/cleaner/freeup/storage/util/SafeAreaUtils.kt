package nixlab.phone.cleaner.freeup.storage.util

import android.content.Context
import android.util.TypedValue
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updatePadding

object SafeAreaUtils {

    fun dpToPx(context: Context, dp: Float): Int {
        return TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP,
            dp,
            context.resources.displayMetrics
        ).toInt()
    }

    fun dpToPx(context: Context, dp: Int): Int {
        return dpToPx(context, dp.toFloat())
    }

    fun applySafeArea(
        activity: ComponentActivity,
        rootView: View,
        applyTop: Boolean = true,
        applyBottom: Boolean = true,
        applyLeft: Boolean = true,
        applyRight: Boolean = true
    ) {
        activity.enableEdgeToEdge(
            statusBarStyle = androidx.activity.SystemBarStyle.dark(android.graphics.Color.TRANSPARENT),
            navigationBarStyle = androidx.activity.SystemBarStyle.dark(android.graphics.Color.TRANSPARENT)
        )
        androidx.core.view.WindowCompat.getInsetsController(activity.window, rootView).isAppearanceLightStatusBars = false

        ViewCompat.setOnApplyWindowInsetsListener(rootView) { view, windowInsets ->
            val insets = windowInsets.getInsets(
                WindowInsetsCompat.Type.systemBars() or WindowInsetsCompat.Type.displayCutout()
            )
            view.updatePadding(
                left = if (applyLeft) insets.left else view.paddingLeft,
                top = if (applyTop) insets.top else view.paddingTop,
                right = if (applyRight) insets.right else view.paddingRight,
                bottom = if (applyBottom) insets.bottom else view.paddingBottom
            )
            windowInsets
        }
    }
}
