package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class JXs extends lc {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile JXs Lxb;

    private JXs(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.core.lc
    public /* bridge */ /* synthetic */ lc.lk Lxb() {
        return super.Lxb();
    }

    public static JXs Lxb(Context context) {
        if (Lxb == null) {
            synchronized (JXs.class) {
                try {
                    if (Lxb == null) {
                        Lxb = new JXs(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Lxb;
    }
}
