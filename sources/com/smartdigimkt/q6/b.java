package com.smartdigimkt.q6;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public class b extends a {
    protected static volatile a g;

    public b(Context context) {
        super(context);
    }

    @Override // com.smartdigimkt.q6.a
    public int a() {
        return 2;
    }

    public static a a(Context context) {
        if (g == null) {
            synchronized (a.class) {
                try {
                    if (g == null) {
                        g = new b(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return g;
    }
}
