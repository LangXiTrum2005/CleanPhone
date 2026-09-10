package k5;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.sdk.AppLovinEventTypes;
import d5.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f44311i = o.i("BatteryNotLowTracker");

    @Override // k5.d
    public final Object a() {
        Intent intentRegisterReceiver = this.f44316b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(intentRegisterReceiver.getIntExtra("status", -1) == 1 || ((float) intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1)) / ((float) intentRegisterReceiver.getIntExtra("scale", -1)) > 0.15f);
        }
        o.g().f(f44311i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }

    @Override // k5.c
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // k5.c
    public final void g(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        o.g().e(f44311i, defpackage.e.n("Received ", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            c(Boolean.TRUE);
        } else if (action.equals("android.intent.action.BATTERY_LOW")) {
            c(Boolean.FALSE);
        }
    }
}
