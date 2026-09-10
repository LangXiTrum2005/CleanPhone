package com.bytedance.sdk.openadsdk.ay.lr;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.pv;

/* JADX INFO: loaded from: classes2.dex */
public class di {
    public static boolean ri(View view, int i) {
        return ri(view, false, i);
    }

    public static boolean ri(View view, boolean z, int i) {
        if (view == null) {
            return false;
        }
        return pv.ri(view, z ? 30 : 50, i, false);
    }
}
