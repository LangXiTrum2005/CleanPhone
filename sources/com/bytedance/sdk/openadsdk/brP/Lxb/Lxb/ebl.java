package com.bytedance.sdk.openadsdk.brP.Lxb.Lxb;

import android.content.Context;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.nJ;

/* JADX INFO: loaded from: classes2.dex */
public class ebl {
    public static lc Lxb(Context context, tD tDVar, String str) {
        if (lk.Lxb()) {
            return new JXs(context, tDVar, str);
        }
        return nJ.OY(context) ? new ZU(context, tDVar, str) : new Lxb(context, tDVar, str);
    }
}
