package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Ri {
    public static SharedPreferences a() {
        Context context = Ji.a;
        String str = (context != null ? context.getPackageName() : null) + "_preferences";
        if (context != null) {
            return context.getSharedPreferences(str, 0);
        }
        return null;
    }
}
