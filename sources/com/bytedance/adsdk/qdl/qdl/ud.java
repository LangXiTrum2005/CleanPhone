package com.bytedance.adsdk.qdl.qdl;

/* JADX INFO: loaded from: classes.dex */
public class ud extends RuntimeException {
    public ud(String str, Throwable th) {
        super("Unable to parse expression:".concat(String.valueOf(str)), th);
    }
}
