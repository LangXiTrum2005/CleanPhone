package kabul;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.apical;
import com.applovin.sdk.AppLovinEventTypes;

/* JADX INFO: compiled from: BatteryNotLowTracker.java */
/* JADX INFO: loaded from: classes.dex */
public class saneness extends dern<Boolean> {

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final String f29032taiyuan = apical.beachfront("BatteryNotLowTracker");

    public saneness(Context context, arugula.attabal attabalVar) {
        super(context, attabalVar);
    }

    @Override // kabul.dern
    public IntentFilter competently() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // kabul.dern
    public void impromptu(Context context, Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        apical.dern().attabal(f29032taiyuan, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            wireman(Boolean.TRUE);
        } else if (action.equals("android.intent.action.BATTERY_LOW")) {
            wireman(Boolean.FALSE);
        }
    }

    @Override // kabul.wireman
    /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
    public Boolean saneness() {
        Intent intentRegisterReceiver = this.f29037saneness.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(intentRegisterReceiver.getIntExtra("status", -1) == 1 || ((float) intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1)) / ((float) intentRegisterReceiver.getIntExtra("scale", -1)) > 0.15f);
        }
        apical.dern().saneness(f29032taiyuan, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }
}
