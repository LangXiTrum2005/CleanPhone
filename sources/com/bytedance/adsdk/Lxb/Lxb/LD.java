package com.bytedance.adsdk.Lxb.Lxb;

/* JADX INFO: loaded from: classes.dex */
public class LD extends RuntimeException {
    public LD(String str, Throwable th) {
        super("Unable to parse expression:".concat(String.valueOf(str)), th);
    }
}
