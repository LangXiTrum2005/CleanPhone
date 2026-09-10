package com.smartdigimkt.q6;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public class c extends a {
    private static volatile c g;

    private c(Context context) {
        super(context);
    }

    @Override // com.smartdigimkt.q6.a
    public int a() {
        return 1;
    }

    public static c a(Context context) {
        if (g == null) {
            synchronized (c.class) {
                try {
                    if (g == null) {
                        g = new c(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return g;
    }
}
