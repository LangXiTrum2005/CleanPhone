package com.bytedance.sdk.component.jbs.ri;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    private static volatile ri lr;
    private volatile lr ri;

    private ri() {
    }

    public static ri ri() {
        if (lr == null) {
            synchronized (ri.class) {
                try {
                    if (lr == null) {
                        lr = new ri();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return lr;
    }

    public lr lr() {
        return this.ri;
    }

    public void ri(lr lrVar) {
        this.ri = lrVar;
    }
}
