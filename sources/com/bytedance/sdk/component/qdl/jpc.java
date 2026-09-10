package com.bytedance.sdk.component.qdl;

/* JADX INFO: loaded from: classes.dex */
class jpc {
    private static boolean qdl;

    public static void qdl(RuntimeException runtimeException) {
        if (qdl) {
            throw runtimeException;
        }
    }
}
