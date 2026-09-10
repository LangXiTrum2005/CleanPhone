package com.umeng.commonsdk.statistics.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.analytics.pro.ay;

/* JADX INFO: loaded from: classes3.dex */
public class PreferenceWrapper {
    private static final String DEFAULT_PREFERENCE = ay.b().b(ay.j);

    private PreferenceWrapper() {
    }

    public static SharedPreferences getDefault(Context context) {
        if (context != null) {
            return context.getSharedPreferences(DEFAULT_PREFERENCE, 0);
        }
        return null;
    }

    public static SharedPreferences getInstance(Context context, String str) {
        if (context != null) {
            return context.getSharedPreferences(str, 0);
        }
        return null;
    }
}
