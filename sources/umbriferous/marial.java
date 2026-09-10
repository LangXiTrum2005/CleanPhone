package umbriferous;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.sdk.AppLovinEventTypes;

/* JADX INFO: compiled from: BatteryState.java */
/* JADX INFO: loaded from: classes3.dex */
public class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Float f39165attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final boolean f39166saneness;

    public marial(Float f, boolean z) {
        this.f39166saneness = z;
        this.f39165attabal = f;
    }

    public static marial attabal(Context context) {
        boolean zMarial = false;
        Float fWireman = null;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                zMarial = marial(intentRegisterReceiver);
                fWireman = wireman(intentRegisterReceiver);
            }
        } catch (IllegalStateException e) {
            gelandelaufer.competently.beachfront().marial("An error occurred getting battery state.", e);
        }
        return new marial(fWireman, zMarial);
    }

    public static boolean marial(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    public static Float wireman(Intent intent) {
        int intExtra = intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(intExtra / intExtra2);
    }

    public int dern() {
        Float f;
        if (!this.f39166saneness || (f = this.f39165attabal) == null) {
            return 1;
        }
        return ((double) f.floatValue()) < 0.99d ? 2 : 3;
    }

    public Float saneness() {
        return this.f39165attabal;
    }
}
