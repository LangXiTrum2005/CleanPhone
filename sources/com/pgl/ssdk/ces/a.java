package com.pgl.ssdk.ces;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class a {
    public static native Object meta(int i2, Context context, Object obj);

    public static Object njss(int i2, Object obj) {
        try {
            b bVarE = b.e();
            if (bVarE != null) {
                return bVarE.a(i2, obj);
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
