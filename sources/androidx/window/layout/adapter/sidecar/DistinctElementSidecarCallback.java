package androidx.window.layout.adapter.sidecar;

import a5.b;
import a5.g;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.WeakHashMap;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SidecarDeviceState f5003b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f5005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SidecarInterface.SidecarCallback f5006e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5002a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakHashMap f5004c = new WeakHashMap();

    public DistinctElementSidecarCallback(g gVar, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f5005d = gVar;
        this.f5006e = sidecarCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        if (a5.b.b(r2) == a5.b.b(r4)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDeviceStateChanged(@androidx.annotation.NonNull androidx.window.sidecar.SidecarDeviceState r4) {
        /*
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            java.lang.Object r0 = r3.f5002a
            monitor-enter(r0)
            a5.g r1 = r3.f5005d     // Catch: java.lang.Throwable -> L23
            androidx.window.sidecar.SidecarDeviceState r2 = r3.f5003b     // Catch: java.lang.Throwable -> L23
            r1.getClass()     // Catch: java.lang.Throwable -> L23
            boolean r1 = kotlin.jvm.internal.n.a(r2, r4)     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L14
            goto L21
        L14:
            if (r2 != 0) goto L17
            goto L25
        L17:
            int r1 = a5.b.b(r2)     // Catch: java.lang.Throwable -> L23
            int r2 = a5.b.b(r4)     // Catch: java.lang.Throwable -> L23
            if (r1 != r2) goto L25
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return
        L23:
            r3 = move-exception
            goto L2e
        L25:
            r3.f5003b = r4     // Catch: java.lang.Throwable -> L23
            androidx.window.sidecar.SidecarInterface$SidecarCallback r3 = r3.f5006e     // Catch: java.lang.Throwable -> L23
            r3.onDeviceStateChanged(r4)     // Catch: java.lang.Throwable -> L23
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return
        L2e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback.onDeviceStateChanged(androidx.window.sidecar.SidecarDeviceState):void");
    }

    public void onWindowLayoutChanged(@NonNull IBinder iBinder, @NonNull SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        boolean zB;
        synchronized (this.f5002a) {
            try {
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.f5004c.get(iBinder);
                this.f5005d.getClass();
                if (n.a(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                    zB = true;
                } else {
                    zB = (sidecarWindowLayoutInfo2 == null || sidecarWindowLayoutInfo == null) ? false : g.b(b.c(sidecarWindowLayoutInfo2), b.c(sidecarWindowLayoutInfo));
                }
                if (zB) {
                    return;
                }
                this.f5004c.put(iBinder, sidecarWindowLayoutInfo);
                this.f5006e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
