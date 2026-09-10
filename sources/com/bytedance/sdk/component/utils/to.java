package com.bytedance.sdk.component.utils;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public class to {
    public static void qdl(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }
}
