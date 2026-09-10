package com.bytedance.sdk.component.JXs.lk.lk;

import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
public class LD {
    public static void Lxb(Closeable closeable) {
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
