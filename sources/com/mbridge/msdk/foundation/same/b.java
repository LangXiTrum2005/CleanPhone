package com.mbridge.msdk.foundation.same;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile b f33740b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Boolean f33741a = null;

    private b() {
    }

    public static b b() {
        if (f33740b == null) {
            synchronized (b.class) {
                try {
                    if (f33740b == null) {
                        f33740b = new b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f33740b;
    }

    public Boolean a() {
        return this.f33741a;
    }
}
