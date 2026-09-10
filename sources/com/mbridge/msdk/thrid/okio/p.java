package com.mbridge.msdk.thrid.okio;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    static o f36818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static long f36819b;

    private p() {
    }

    public static o a() {
        synchronized (p.class) {
            try {
                o oVar = f36818a;
                if (oVar == null) {
                    return new o();
                }
                f36818a = oVar.f36816f;
                oVar.f36816f = null;
                f36819b -= 8192;
                return oVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void a(o oVar) {
        if (oVar.f36816f == null && oVar.f36817g == null) {
            if (oVar.f36814d) {
                return;
            }
            synchronized (p.class) {
                try {
                    long j10 = f36819b + 8192;
                    if (j10 > 65536) {
                        return;
                    }
                    f36819b = j10;
                    oVar.f36816f = f36818a;
                    oVar.f36813c = 0;
                    oVar.f36812b = 0;
                    f36818a = oVar;
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        throw new IllegalArgumentException();
    }
}
