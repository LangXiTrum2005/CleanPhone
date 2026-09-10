package kabul;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.apical;

/* JADX INFO: compiled from: BatteryChargingTracker.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal extends dern<Boolean> {

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final String f29016taiyuan = apical.beachfront("BatteryChrgTracker");

    public attabal(Context context, arugula.attabal attabalVar) {
        super(context, attabalVar);
    }

    @Override // kabul.dern
    public IntentFilter competently() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    public final boolean cutely(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    @Override // kabul.dern
    public void impromptu(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        byte b = 0;
        apical.dern().attabal(f29016taiyuan, String.format("Received %s", action), new Throwable[0]);
        switch (action.hashCode()) {
            case -1886648615:
                if (!action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    b = -1;
                }
                break;
            case -54942926:
                b = !action.equals("android.os.action.DISCHARGING") ? (byte) -1 : (byte) 1;
                break;
            case 948344062:
                b = !action.equals("android.os.action.CHARGING") ? (byte) -1 : (byte) 2;
                break;
            case 1019184907:
                b = !action.equals("android.intent.action.ACTION_POWER_CONNECTED") ? (byte) -1 : (byte) 3;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                wireman(Boolean.FALSE);
                break;
            case 1:
                wireman(Boolean.FALSE);
                break;
            case 2:
                wireman(Boolean.TRUE);
                break;
            case 3:
                wireman(Boolean.TRUE);
                break;
        }
    }

    @Override // kabul.wireman
    /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
    public Boolean saneness() {
        Intent intentRegisterReceiver = this.f29037saneness.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(cutely(intentRegisterReceiver));
        }
        apical.dern().saneness(f29016taiyuan, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }
}
