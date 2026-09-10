package com.google.android.gms.internal.measurement;

import android.os.Build;
import android.util.Log;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends y2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f23712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f23713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f23714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicReference f23715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicLong f23716g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ConcurrentLinkedQueue f23717h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile y2 f23718b;

    static {
        String str = Build.FINGERPRINT;
        f23712c = str == null || "robolectric".equals(str);
        String str2 = Build.HARDWARE;
        f23713d = "goldfish".equals(str2) || "ranchu".equals(str2);
        String str3 = Build.TYPE;
        f23714e = "eng".equals(str3) || "userdebug".equals(str3);
        f23715f = new AtomicReference();
        f23716g = new AtomicLong();
        f23717h = new ConcurrentLinkedQueue();
    }

    public static void m() {
        while (true) {
            l lVar = (l) f23717h.poll();
            if (lVar == null) {
                return;
            }
            f23716g.getAndDecrement();
            m mVar = lVar.f23688a;
            bh bhVar = lVar.f23689b;
            fh fhVar = bhVar.f23327c;
            if ((fhVar != null && Boolean.TRUE.equals(fhVar.j(eh.f23442g))) || mVar.e(bhVar.f23325a)) {
                mVar.f(bhVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.y2
    public final boolean e(Level level) {
        return this.f23718b == null || this.f23718b.e(level);
    }

    @Override // com.google.android.gms.internal.measurement.y2
    public final void f(bh bhVar) {
        if (this.f23718b != null) {
            this.f23718b.f(bhVar);
            return;
        }
        if (f23716g.incrementAndGet() > 20) {
            f23717h.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        f23717h.offer(new l(this, bhVar));
        if (this.f23718b != null) {
            m();
        }
    }

    @Override // com.google.android.gms.internal.measurement.y2
    public final void i(RuntimeException runtimeException, bh bhVar) {
        if (this.f23718b != null) {
            this.f23718b.i(runtimeException, bhVar);
        } else {
            Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }
}
