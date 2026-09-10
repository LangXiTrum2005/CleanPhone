package androidx.work.impl.constraints.trackers;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.media.a;
import androidx.work.Logger;

/* JADX INFO: loaded from: classes.dex */
public class StorageNotLowTracker extends BroadcastReceiverConstraintTracker<Boolean> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f8743i = Logger.e("StorageNotLowTracker");

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public final Object a() {
        Intent intentRegisterReceiver = this.f8736b.registerReceiver(null, f());
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

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    public final void g(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        Logger.c().a(f8743i, a.C("Received ", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            c(Boolean.FALSE);
        } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            c(Boolean.TRUE);
        }
    }
}
