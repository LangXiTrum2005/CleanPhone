package com.bytedance.sdk.openadsdk.exc.qdl.qdl;

import android.content.Context;
import com.bytedance.sdk.openadsdk.utils.gy;

/* JADX INFO: loaded from: classes3.dex */
public class wd {
    public static mo qdl(Context context, String str) {
        if (lnr.qdl()) {
            return new mzz(context, str);
        }
        return gy.mml(context) ? new mml(context, str) : new qdl(context, str);
    }
}
