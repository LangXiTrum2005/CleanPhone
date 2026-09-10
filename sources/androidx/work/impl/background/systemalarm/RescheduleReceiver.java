package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import d5.o;
import e5.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f5030a = o.i("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        o.g().e(f5030a, String.format("Received intent %s", intent), new Throwable[0]);
        try {
            l lVarB = l.b(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (l.l) {
                try {
                    lVarB.f39117i = pendingResultGoAsync;
                    if (lVarB.f39116h) {
                        pendingResultGoAsync.finish();
                        lVarB.f39117i = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (IllegalStateException e10) {
            o.g().f(f5030a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
        }
    }
}
