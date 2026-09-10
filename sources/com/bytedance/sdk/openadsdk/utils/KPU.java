package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class KPU {
    public static void Lxb(com.bytedance.sdk.openadsdk.core.model.tD tDVar, Double d) {
        if (tDVar == null || tDVar.Hu() == null) {
            return;
        }
        Map<String, Object> mapHu = tDVar.Hu();
        try {
            Object obj = tDVar.Hu().get(TTAdConstant.SDK_BIDDING_TYPE);
            if (obj != null && Integer.parseInt(obj.toString()) == 2) {
                String strReplace = (String) mapHu.get("nurl");
                if (TextUtils.isEmpty(strReplace)) {
                    return;
                }
                if (d != null) {
                    strReplace = strReplace.replace("${AUCTION_BID_TO_WIN}", String.valueOf(d));
                }
                com.bytedance.sdk.openadsdk.core.kqm.lk().Lxb(strReplace);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.utils.sLN.LD("report Win error");
        }
    }

    public static void Lxb(com.bytedance.sdk.openadsdk.core.model.tD tDVar, Double d, String str, String str2) {
        if (tDVar == null || tDVar.Hu() == null) {
            return;
        }
        Map<String, Object> mapHu = tDVar.Hu();
        try {
            Object obj = tDVar.Hu().get(TTAdConstant.SDK_BIDDING_TYPE);
            if (obj != null && Integer.parseInt(obj.toString()) == 2) {
                String strReplace = (String) mapHu.get("lurl");
                if (TextUtils.isEmpty(strReplace)) {
                    return;
                }
                if (d != null) {
                    strReplace = strReplace.replace("${AUCTION_PRICE}", String.valueOf(d));
                }
                if (str != null) {
                    strReplace = strReplace.replace("${AUCTION_LOSS}", str);
                }
                if (str2 != null) {
                    strReplace = strReplace.replace("${AUCTION_WINNER}", str2);
                }
                com.bytedance.sdk.openadsdk.core.kqm.lk().Lxb(strReplace);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.utils.sLN.LD("report Loss error");
        }
    }
}
