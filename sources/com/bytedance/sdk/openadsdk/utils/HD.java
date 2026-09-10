package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import com.efs.sdk.base.core.util.NetworkUtil;

/* JADX INFO: loaded from: classes2.dex */
public class HD {
    public static String Lxb(Context context) {
        int iLxb = com.bytedance.sdk.component.utils.HD.Lxb(context, 0L);
        if (iLxb == 2) {
            return NetworkUtil.NETWORK_CLASS_2G;
        }
        if (iLxb == 3) {
            return NetworkUtil.NETWORK_CLASS_3G;
        }
        if (iLxb == 4) {
            return NetworkUtil.NETWORK_TYPE_WIFI;
        }
        if (iLxb != 5) {
            return iLxb != 6 ? "mobile" : NetworkUtil.NETWORK_CLASS_5G;
        }
        return NetworkUtil.NETWORK_CLASS_4G;
    }
}
