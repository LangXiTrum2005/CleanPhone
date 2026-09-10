package com.bytedance.sdk.openadsdk.bch.ud;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.hzv;

/* JADX INFO: loaded from: classes3.dex */
public class mo {
    public static boolean qdl(View view, int i2) {
        return qdl(view, false, i2);
    }

    public static boolean qdl(View view, boolean z2, int i2) {
        if (view == null) {
            return false;
        }
        return hzv.qdl(view, z2 ? 30 : 50, i2, false);
    }
}
