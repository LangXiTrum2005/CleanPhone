package com.bytedance.sdk.component.lr.ri.lr;

/* JADX INFO: loaded from: classes2.dex */
final class di {
    static long lr;
    static fi ri;

    private di() {
    }

    public static fi ri() {
        synchronized (di.class) {
            fi fiVar = ri;
            if (fiVar == null) {
                return new fi();
            }
            ri = fiVar.di;
            fiVar.di = null;
            lr -= 8192;
            return fiVar;
        }
    }

    public static void ri(fi fiVar) {
        if (fiVar.di == null && fiVar.xha == null) {
            if (fiVar.ka) {
                return;
            }
            synchronized (di.class) {
                try {
                    long j = lr;
                    if (j + 8192 > 65536) {
                        return;
                    }
                    lr = j + 8192;
                    fiVar.di = ri;
                    fiVar.ik = 0;
                    fiVar.lr = 0;
                    ri = fiVar;
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalArgumentException();
    }
}
