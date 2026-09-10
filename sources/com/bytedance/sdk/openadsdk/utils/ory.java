package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.C3700q2;
import com.ironsource.mediationsdk.d;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ory {
    public static void ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, Double d) {
        if (wjvVar == null || wjvVar.iyl() == null) {
            return;
        }
        Map<String, Object> mapIyl = wjvVar.iyl();
        try {
            Object obj = wjvVar.iyl().get(TTAdConstant.SDK_BIDDING_TYPE);
            if (obj != null && Integer.parseInt(obj.toString()) == 2) {
                String strReplace = (String) mapIyl.get(C3700q2.A);
                if (TextUtils.isEmpty(strReplace)) {
                    return;
                }
                if (d != null) {
                    strReplace = strReplace.replace("${AUCTION_BID_TO_WIN}", String.valueOf(d));
                }
                com.bytedance.sdk.openadsdk.core.nr.ik().ri(strReplace);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.utils.ac.ik("report Win error", new Object[0]);
        }
    }

    public static void ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, Double d, String str, String str2) {
        if (wjvVar == null || wjvVar.iyl() == null) {
            return;
        }
        Map<String, Object> mapIyl = wjvVar.iyl();
        try {
            Object obj = wjvVar.iyl().get(TTAdConstant.SDK_BIDDING_TYPE);
            if (obj != null && Integer.parseInt(obj.toString()) == 2) {
                String strReplace = (String) mapIyl.get(C3700q2.z);
                if (TextUtils.isEmpty(strReplace)) {
                    return;
                }
                if (d != null) {
                    strReplace = strReplace.replace(d.n, String.valueOf(d));
                }
                if (str != null) {
                    strReplace = strReplace.replace(d.l, str);
                }
                if (str2 != null) {
                    strReplace = strReplace.replace("${AUCTION_WINNER}", str2);
                }
                com.bytedance.sdk.openadsdk.core.nr.ik().ri(strReplace);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.utils.ac.ik("report Loss error", new Object[0]);
        }
    }
}
