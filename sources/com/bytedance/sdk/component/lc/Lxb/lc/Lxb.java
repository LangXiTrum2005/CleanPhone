package com.bytedance.sdk.component.lc.Lxb.lc;

import com.bytedance.sdk.component.lc.Lxb.OY;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    private static volatile LD Lxb;

    public static LD Lxb() {
        if (Lxb == null) {
            synchronized (LD.class) {
                try {
                    if (Lxb == null) {
                        Lxb = new lk(OY.ebl().lc(), new lc(OY.ebl().lc()));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Lxb;
    }
}
