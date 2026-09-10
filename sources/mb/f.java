package mb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends BroadcastReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReference f45925b = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f45926a;

    public f(Context context) {
        this.f45926a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (g.f45927k) {
            try {
                Iterator it = ((x.d) g.l.values()).iterator();
                while (it.hasNext()) {
                    ((g) it.next()).h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f45926a.unregisterReceiver(this);
    }
}
