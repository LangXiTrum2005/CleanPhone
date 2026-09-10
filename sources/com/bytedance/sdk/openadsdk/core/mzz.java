package com.bytedance.sdk.openadsdk.core;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class mzz extends mo {
    private static volatile mzz qdl;

    private mzz(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mo
    public /* bridge */ /* synthetic */ mo.lnr qdl() {
        return super.qdl();
    }

    public static mzz qdl(Context context) {
        if (qdl == null) {
            synchronized (mzz.class) {
                try {
                    if (qdl == null) {
                        qdl = new mzz(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return qdl;
    }
}
