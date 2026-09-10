package com.bytedance.sdk.component.utils;

import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
public class qt {
    public static void ri(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }
}
