package com.bytedance.sdk.openadsdk.utils;

import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
public class aw {
    public static void ri(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }
}
