package zc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b0 f54801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f54802b;

    public a0(b0 b0Var, b0 b0Var2) {
        this.f54802b = b0Var;
        this.f54801a = b0Var2;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        this.f54802b.f54808a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        try {
            b0 b0Var = this.f54801a;
            if (b0Var == null) {
                return;
            }
            if (b0Var.d()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                b0 b0Var2 = this.f54801a;
                b0Var2.f54811d.f54906e.schedule(b0Var2, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.f54801a = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
