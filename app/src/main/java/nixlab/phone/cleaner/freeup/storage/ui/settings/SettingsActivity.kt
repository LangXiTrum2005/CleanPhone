package nixlab.phone.cleaner.freeup.storage.ui.settings

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import nixlab.phone.cleaner.freeup.storage.R
import nixlab.phone.cleaner.freeup.storage.databinding.ActivitySettingsBinding
import nixlab.phone.cleaner.freeup.storage.ui.base.BaseActivity
import nixlab.phone.cleaner.freeup.storage.util.SafeAreaUtils

class SettingsActivity : BaseActivity() {

    private lateinit var binding: ActivitySettingsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        SafeAreaUtils.applySafeArea(this, binding.root)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.settingsContainer, SettingsFragment.newInstance(isFromActivity = true))
                .commit()
        }
    }

    companion object {
        fun start(context: Context) {
            val intent = Intent(context, SettingsActivity::class.java)
            context.startActivity(intent)
        }
    }
}
