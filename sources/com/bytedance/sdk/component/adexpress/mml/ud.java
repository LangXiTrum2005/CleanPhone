package com.bytedance.sdk.component.adexpress.mml;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class ud {
    public static boolean qdl(Context context) {
        return context != null && TextUtils.getLayoutDirectionFromLocale(context.getResources().getConfiguration().locale) == 1 && (context.getApplicationInfo().flags & 4194304) == 4194304;
    }
}
