package nixlab.phone.cleaner.freeup.storage.ui.charging

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.BatteryManager
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import nixlab.phone.cleaner.freeup.storage.databinding.ActivityChargingAnimationBinding
import nixlab.phone.cleaner.freeup.storage.ui.base.BaseActivity
import nixlab.phone.cleaner.freeup.storage.util.SafeAreaUtils

class ChargingAnimationActivity : BaseActivity() {

    private lateinit var binding: ActivityChargingAnimationBinding

    private val batteryReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            intent?.let { updateBatteryState(it) }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityChargingAnimationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { _, windowInsets ->
            val insets = windowInsets.getInsets(
                WindowInsetsCompat.Type.systemBars() or WindowInsetsCompat.Type.displayCutout()
            )
            val btnLp = binding.btnClose.layoutParams as? android.view.ViewGroup.MarginLayoutParams
            btnLp?.let {
                it.topMargin = insets.top + SafeAreaUtils.dpToPx(this, 16)
                it.leftMargin = insets.left + SafeAreaUtils.dpToPx(this, 16)
                binding.btnClose.layoutParams = it
            }
            windowInsets
        }

        binding.btnClose.setOnClickListener { finish() }
    }

    override fun onResume() {
        super.onResume()
        try {
            androidx.core.content.ContextCompat.registerReceiver(
                this,
                batteryReceiver,
                IntentFilter(Intent.ACTION_BATTERY_CHANGED),
                androidx.core.content.ContextCompat.RECEIVER_EXPORTED
            )
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun onPause() {
        super.onPause()
        try {
            unregisterReceiver(batteryReceiver)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun updateBatteryState(intent: Intent) {
        val level = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, -1)
        val scale = intent.getIntExtra(BatteryManager.EXTRA_SCALE, -1)
        val percent = if (level >= 0 && scale > 0) (level * 100) / scale else 85
        binding.tvChargingPercent.text = "$percent%"
    }

    companion object {
        fun start(context: Context) {
            val intent = Intent(context, ChargingAnimationActivity::class.java)
            context.startActivity(intent)
        }
    }
}
