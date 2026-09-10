package kabul;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.apical;

/* JADX INFO: compiled from: StorageNotLowTracker.java */
/* JADX INFO: loaded from: classes.dex */
public class beachfront extends dern<Boolean> {

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final String f29017taiyuan = apical.beachfront("StorageNotLowTracker");

    public beachfront(Context context, arugula.attabal attabalVar) {
        super(context, attabalVar);
    }

    @Override // kabul.dern
    public IntentFilter competently() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // kabul.dern
    public void impromptu(Context context, Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        apical.dern().attabal(f29017taiyuan, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            wireman(Boolean.FALSE);
        } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            wireman(Boolean.TRUE);
        }
    }

    @Override // kabul.wireman
    /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
    public Boolean saneness() {
        Intent intentRegisterReceiver = this.f29037saneness.registerReceiver(null, competently());
        if (intentRegisterReceiver == null || intentRegisterReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = intentRegisterReceiver.getAction();
        action.getClass();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return Boolean.FALSE;
        }
        if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return Boolean.TRUE;
        }
        return null;
    }
}
