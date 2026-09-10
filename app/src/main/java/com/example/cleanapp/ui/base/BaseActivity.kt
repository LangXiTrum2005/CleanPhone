package com.example.cleanapp.ui.base

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import com.example.cleanapp.util.LocaleHelper

/**
 * BaseActivity that attaches localized Context to ensure proper language configuration across all activities.
 */
abstract class BaseActivity : AppCompatActivity() {

    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(LocaleHelper.wrap(newBase))
    }
}
