package com.bytedance.adsdk.lr.ik;

import com.bytedance.adsdk.lr.bgr;

/* JADX INFO: loaded from: classes2.dex */
public class fi {
    private static final fi ri = new fi();
    private final bgr<String, com.bytedance.adsdk.lr.xha> lr = new bgr<>(20);

    public static fi ri() {
        return ri;
    }

    public com.bytedance.adsdk.lr.xha ri(String str) {
        if (str == null) {
            return null;
        }
        return this.lr.ri(str);
    }

    public void ri(String str, com.bytedance.adsdk.lr.xha xhaVar) {
        if (str == null) {
            return;
        }
        this.lr.ri(str, xhaVar);
    }
}
