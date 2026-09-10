package nixlab.phone.cleaner.freeup.storage.ui.paywall

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import nixlab.phone.cleaner.freeup.storage.R
import nixlab.phone.cleaner.freeup.storage.databinding.ActivityPaywallBinding
import nixlab.phone.cleaner.freeup.storage.ui.base.BaseActivity

class PaywallActivity : BaseActivity() {

    enum class Plan {
        YEARLY,
        MONTHLY,
        LIFETIME
    }

    private lateinit var binding: ActivityPaywallBinding
    private var selectedPlan: Plan = Plan.YEARLY

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityPaywallBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { _, windowInsets ->
            val insets = windowInsets.getInsets(
                WindowInsetsCompat.Type.systemBars() or WindowInsetsCompat.Type.displayCutout()
            )
            val basePadding = nixlab.phone.cleaner.freeup.storage.util.SafeAreaUtils.dpToPx(this, 16f)
            binding.root.setPadding(
                insets.left + basePadding,
                insets.top + nixlab.phone.cleaner.freeup.storage.util.SafeAreaUtils.dpToPx(this, 8f),
                insets.right + basePadding,
                insets.bottom + basePadding
            )
            windowInsets
        }

        setupPlanSelection()

        binding.btnClose.setOnClickListener { finish() }

        binding.btnRestore.setOnClickListener {
            Toast.makeText(this, getString(R.string.subscriptions_restored_success), Toast.LENGTH_SHORT).show()
            finish()
        }

        binding.btnSubscribe.setOnClickListener {
            val planName = when (selectedPlan) {
                Plan.YEARLY -> getString(R.string.plan_yearly_name)
                Plan.MONTHLY -> getString(R.string.plan_monthly_name)
                Plan.LIFETIME -> getString(R.string.plan_lifetime_name)
            }
            Toast.makeText(this, getString(R.string.pro_welcome_fmt, planName), Toast.LENGTH_LONG).show()
            finish()
        }
    }

    private fun setupPlanSelection() {
        selectPlan(Plan.YEARLY)

        binding.cardYearly.setOnClickListener {
            selectPlan(Plan.YEARLY)
        }

        binding.cardMonthly.setOnClickListener {
            selectPlan(Plan.MONTHLY)
        }

        binding.cardLifetime.setOnClickListener {
            selectPlan(Plan.LIFETIME)
        }
    }

    private fun selectPlan(plan: Plan) {
        selectedPlan = plan

        val isYearly = plan == Plan.YEARLY
        val isMonthly = plan == Plan.MONTHLY
        val isLifetime = plan == Plan.LIFETIME

        // 1. Yearly Card State
        binding.rbYearly.isChecked = isYearly
        binding.cardYearly.strokeColor = getColor(if (isYearly) R.color.primary_glow else R.color.border_subtle)
        binding.cardYearly.strokeWidth = if (isYearly) 4 else 2
        binding.cardYearly.setCardBackgroundColor(getColor(if (isYearly) R.color.bg_surface else R.color.bg_card))

        // 2. Monthly Card State
        binding.rbMonthly.isChecked = isMonthly
        binding.cardMonthly.strokeColor = getColor(if (isMonthly) R.color.primary_glow else R.color.border_subtle)
        binding.cardMonthly.strokeWidth = if (isMonthly) 4 else 2
        binding.cardMonthly.setCardBackgroundColor(getColor(if (isMonthly) R.color.bg_surface else R.color.bg_card))

        // 3. Lifetime Card State
        binding.rbLifetime.isChecked = isLifetime
        binding.cardLifetime.strokeColor = getColor(if (isLifetime) R.color.primary_glow else R.color.border_subtle)
        binding.cardLifetime.strokeWidth = if (isLifetime) 4 else 2
        binding.cardLifetime.setCardBackgroundColor(getColor(if (isLifetime) R.color.bg_surface else R.color.bg_card))

        // Update CTA Button Text
        if (isYearly) {
            binding.btnSubscribe.text = getString(R.string.btn_start_trial)
        } else {
            binding.btnSubscribe.text = getString(R.string.btn_continue)
        }
    }

    companion object {
        fun start(context: Context) {
            val intent = Intent(context, PaywallActivity::class.java)
            context.startActivity(intent)
        }
    }
}
