package com.bytedance.sdk.component.mo.qdl;

/* JADX INFO: loaded from: classes.dex */
public class lnr {
    public static void qdl(Object obj, String str) {
        if (obj == null) {
            qdl(str);
        }
    }

    public static void qdl(String str) {
        throw new IllegalArgumentException(str);
    }
}
