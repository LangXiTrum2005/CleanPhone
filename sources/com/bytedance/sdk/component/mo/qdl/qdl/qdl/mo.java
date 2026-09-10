package com.bytedance.sdk.component.mo.qdl.qdl.qdl;

import android.text.TextUtils;
import android.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public class mo {
    public static String qdl(String str) {
        return TextUtils.isEmpty(str) ? "" : Base64.encodeToString(str.getBytes(), 10);
    }

    public static String ud(String str) {
        return TextUtils.isEmpty(str) ? "" : new String(Base64.decode(str, 10));
    }
}
