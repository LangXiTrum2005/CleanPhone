package com.bytedance.sdk.component.QAg.Lxb;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    private static volatile Lxb LD;
    private volatile LD Lxb;

    private Lxb() {
    }

    public static Lxb Lxb() {
        if (LD == null) {
            synchronized (Lxb.class) {
                try {
                    if (LD == null) {
                        LD = new Lxb();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return LD;
    }

    public LD LD() {
        return this.Lxb;
    }

    public void Lxb(LD ld) {
        this.Lxb = ld;
    }
}
