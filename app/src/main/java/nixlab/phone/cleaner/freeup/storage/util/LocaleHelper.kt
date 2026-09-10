package nixlab.phone.cleaner.freeup.storage.util

import android.content.Context
import android.content.SharedPreferences
import android.content.res.Configuration
import android.os.Build
import android.os.LocaleList
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.os.LocaleListCompat
import java.util.Locale

object LocaleHelper {

    private const val PREFS_NAME = "cleanup_prefs"
    private const val KEY_LANGUAGE = "key_app_language"
    private const val KEY_ONBOARDING_COMPLETED = "key_onboarding_completed"

    private fun getPrefs(context: Context): SharedPreferences {
        return context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
    }

    fun isOnboardingCompleted(context: Context): Boolean {
        return getPrefs(context).getBoolean(KEY_ONBOARDING_COMPLETED, false)
    }

    fun setOnboardingCompleted(context: Context, completed: Boolean = true) {
        getPrefs(context).edit().putBoolean(KEY_ONBOARDING_COMPLETED, completed).apply()
    }

    fun getSelectedLanguage(context: Context): String {
        return getPrefs(context).getString(KEY_LANGUAGE, null) ?: Locale.getDefault().language
    }

    fun setLocale(context: Context, languageCode: String): Context {
        getPrefs(context).edit().putString(KEY_LANGUAGE, languageCode).apply()

        // 1. AndroidX AppCompat application locales
        val appLocale = LocaleListCompat.forLanguageTags(languageCode)
        AppCompatDelegate.setApplicationLocales(appLocale)

        // 2. Wrap and update JVM Locale and Context Resources
        return updateResources(context, languageCode)
    }

    fun applySavedLocale(context: Context) {
        val savedLang = getPrefs(context).getString(KEY_LANGUAGE, null)
        if (!savedLang.isNullOrEmpty()) {
            val appLocale = LocaleListCompat.forLanguageTags(savedLang)
            AppCompatDelegate.setApplicationLocales(appLocale)
            updateResources(context, savedLang)
        }
    }

    fun wrap(context: Context): Context {
        val savedLang = getPrefs(context).getString(KEY_LANGUAGE, null) ?: return context
        return updateResources(context, savedLang)
    }

    private fun updateResources(context: Context, languageCode: String): Context {
        val locale = Locale(languageCode)
        Locale.setDefault(locale)

        val res = context.resources
        val config = Configuration(res.configuration)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            val localeList = LocaleList(locale)
            LocaleList.setDefault(localeList)
            config.setLocales(localeList)
            return context.createConfigurationContext(config)
        } else {
            @Suppress("DEPRECATION")
            config.locale = locale
            @Suppress("DEPRECATION")
            res.updateConfiguration(config, res.displayMetrics)
            return context
        }
    }
}
