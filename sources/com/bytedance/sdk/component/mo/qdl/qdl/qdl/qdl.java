package com.bytedance.sdk.component.mo.qdl.qdl.qdl;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class qdl extends ud {
    private static volatile qdl qdl;

    private qdl(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.qdl.ud
    public /* bridge */ /* synthetic */ ud.C0086ud qdl() {
        return super.qdl();
    }

    public static qdl qdl(Context context) {
        if (qdl == null) {
            synchronized (qdl.class) {
                try {
                    if (qdl == null) {
                        qdl = new qdl(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return qdl;
    }
}
