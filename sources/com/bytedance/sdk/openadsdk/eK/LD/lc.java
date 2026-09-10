package com.bytedance.sdk.openadsdk.eK.LD;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.nE;

/* JADX INFO: loaded from: classes2.dex */
public class lc {
    public static boolean Lxb(View view, int i) {
        return Lxb(view, false, i);
    }

    public static boolean Lxb(View view, boolean z, int i) {
        if (view == null) {
            return false;
        }
        return nE.Lxb(view, z ? 30 : 50, i);
    }
}
