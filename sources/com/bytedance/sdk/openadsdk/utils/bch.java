package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import com.p004ironsource.z8;

/* JADX INFO: loaded from: classes3.dex */
public class bch {
    public static String qdl(Context context) {
        int iQdl = com.bytedance.sdk.component.utils.bqt.qdl(context, 0L);
        if (iQdl == 2) {
            return "2g";
        }
        if (iQdl == 3) {
            return z8.f27868a;
        }
        if (iQdl == 4) {
            return z8.f27869b;
        }
        if (iQdl != 5) {
            return iQdl != 6 ? "mobile" : "5g";
        }
        return "4g";
    }
}
