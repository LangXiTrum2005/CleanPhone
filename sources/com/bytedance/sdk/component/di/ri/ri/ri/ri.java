package com.bytedance.sdk.component.di.ri.ri.ri;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class ri extends lr {
    private static volatile ri ri;

    private ri(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.component.di.ri.ri.ri.lr
    public /* bridge */ /* synthetic */ lr.C0209lr ri() {
        return super.ri();
    }

    public static ri ri(Context context) {
        if (ri == null) {
            synchronized (ri.class) {
                try {
                    if (ri == null) {
                        ri = new ri(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ri;
    }
}
