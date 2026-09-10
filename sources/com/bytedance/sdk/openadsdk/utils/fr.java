package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import com.ironsource.T3;

/* JADX INFO: loaded from: classes2.dex */
public class fr {
    public static String ri(Context context) {
        int iRi = com.bytedance.sdk.component.utils.su.ri(context, 0L);
        if (iRi == 2) {
            return "2g";
        }
        if (iRi == 3) {
            return T3.a;
        }
        if (iRi == 4) {
            return T3.b;
        }
        if (iRi != 5) {
            return iRi != 6 ? "mobile" : "5g";
        }
        return "4g";
    }
}
