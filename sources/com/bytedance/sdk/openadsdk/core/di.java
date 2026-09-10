package com.bytedance.sdk.openadsdk.core;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class di extends xha {
    private static volatile di ri;

    private di(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.core.xha
    public /* bridge */ /* synthetic */ xha.ik ri() {
        return super.ri();
    }

    public static di ri(Context context) {
        if (ri == null) {
            synchronized (di.class) {
                try {
                    if (ri == null) {
                        ri = new di(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ri;
    }
}
