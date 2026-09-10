package com.mbridge.msdk.tracker.network;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile l f36928b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private u f36929a;

    private l() {
    }

    public static l a() {
        if (f36928b == null) {
            synchronized (l.class) {
                try {
                    if (f36928b == null) {
                        f36928b = new l();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f36928b;
    }

    public u b() {
        if (this.f36929a == null) {
            u uVarA = com.mbridge.msdk.tracker.network.toolbox.o.a(new com.mbridge.msdk.tracker.network.toolbox.b(new com.mbridge.msdk.tracker.network.toolbox.m()), null, 10, new com.mbridge.msdk.tracker.network.toolbox.l());
            this.f36929a = uVarA;
            uVarA.b();
        }
        return this.f36929a;
    }
}
