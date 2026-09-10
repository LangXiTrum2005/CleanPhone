package com.smartdigimkt.f1;

/* JADX INFO: loaded from: classes5.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static com.smartdigimkt.w1.b f34976a;

    private g() {
    }

    public static com.smartdigimkt.w1.b a() {
        if (f34976a == null) {
            synchronized (g.class) {
                try {
                    if (f34976a == null) {
                        f34976a = new com.smartdigimkt.w1.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f34976a;
    }
}
