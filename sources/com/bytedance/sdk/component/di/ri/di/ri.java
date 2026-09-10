package com.bytedance.sdk.component.di.ri.di;

import com.bytedance.sdk.component.di.ri.xha;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    private static volatile lr ri;

    public static lr ri() {
        if (ri == null) {
            synchronized (lr.class) {
                try {
                    if (ri == null) {
                        ri = new ik(xha.di().fi(), new di(xha.di().fi()));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ri;
    }
}
