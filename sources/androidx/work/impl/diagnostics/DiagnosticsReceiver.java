package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import d5.o;
import e5.l;
import g9.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f5037a = o.i("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String str = f5037a;
        o.g().e(str, "Requesting diagnostics", new Throwable[0]);
        try {
            l.b(context).a(new k(DiagnosticsWorker.class).e());
        } catch (IllegalStateException e10) {
            o.g().f(str, "WorkManager is not initialized", e10);
        }
    }
}
