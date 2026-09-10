package u;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f51641a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.d f51642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f51643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ComponentName f51644d;

    public l(c.d dVar, f fVar, ComponentName componentName) {
        this.f51642b = dVar;
        this.f51643c = fVar;
        this.f51644d = componentName;
    }

    public final void a(String str) {
        Bundle bundle = new Bundle();
        synchronized (this.f51641a) {
            try {
                try {
                    ((c.b) this.f51642b).m0(this.f51643c, str, bundle);
                } catch (RemoteException unused) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
