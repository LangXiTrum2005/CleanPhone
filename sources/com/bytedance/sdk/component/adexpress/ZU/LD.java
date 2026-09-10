package com.bytedance.sdk.component.adexpress.ZU;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class LD {
    public static boolean Lxb(Context context) {
        return context != null && TextUtils.getLayoutDirectionFromLocale(context.getResources().getConfiguration().locale) == 1 && (context.getApplicationInfo().flags & 4194304) == 4194304;
    }
}
