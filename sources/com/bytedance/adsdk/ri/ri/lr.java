package com.bytedance.adsdk.ri.ri;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends RuntimeException {
    public lr(String str, Throwable th) {
        super("Unable to parse expression:".concat(String.valueOf(str)), th);
    }
}
