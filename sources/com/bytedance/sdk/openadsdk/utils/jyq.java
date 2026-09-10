package com.bytedance.sdk.openadsdk.utils;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class jyq {
    public static final String[] lnr = {"api16-access-ttp.tiktokpangle.us", "api16-access-ttp-b.tiktokpangle.us", "api16-access-ttp.tiktokpangle-b.us", "api16-access-ttp-b.tiktokpangle-b.us"};
    public static int qdl = Integer.MIN_VALUE;
    public static int ud = Integer.MIN_VALUE;

    public static String qdl() {
        if (qdl == Integer.MIN_VALUE) {
            qdl = com.bytedance.sdk.openadsdk.core.tvp.mzz();
        }
        if (qdl < 0) {
            qdl = 0;
        }
        String[] strArr = lnr;
        try {
            return strArr[qdl % strArr.length];
        } catch (Throwable unused) {
            return strArr[0];
        }
    }

    public static synchronized void ud() {
        if (ud == 0) {
            return;
        }
        ud = 0;
        com.bytedance.sdk.openadsdk.core.tvp.ud(0);
    }

    public static synchronized void qdl(String str) {
        if (str == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            try {
                try {
                    String[] strArr = lnr;
                    if (i2 >= strArr.length) {
                        break;
                    }
                    if (str.contains(strArr[i2])) {
                        int i3 = qdl + 1;
                        qdl = i3;
                        com.bytedance.sdk.openadsdk.core.tvp.qdl(i3);
                        break;
                    }
                    i2++;
                } catch (Throwable th) {
                    th.getMessage();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (str.contains("/api/ad/union/sdk/settings/") || str.contains("/api/ad/union/sdk/strategies/adn")) {
            if (ud == Integer.MIN_VALUE) {
                ud = com.bytedance.sdk.openadsdk.core.tvp.mo();
            }
            int i4 = ud + 1;
            ud = i4;
            if (i4 >= 3) {
                final String strWc = com.bytedance.sdk.openadsdk.core.settings.rq.lnr().wc();
                final int i5 = ud;
                com.bytedance.sdk.openadsdk.core.settings.rq.lnr().xx();
                ud = 0;
                com.bytedance.sdk.openadsdk.bjy.lnr.qdl();
                com.bytedance.sdk.openadsdk.bjy.lnr.qdl("clear_domain", false, new com.bytedance.sdk.openadsdk.bjy.ud() { // from class: com.bytedance.sdk.openadsdk.utils.jyq.1
                    @Override // com.bytedance.sdk.openadsdk.bjy.ud
                    public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("domain", strWc);
                            jSONObject.put("times", i5);
                        } catch (Exception unused) {
                        }
                        return com.bytedance.sdk.openadsdk.bjy.qdl.mml.ud().qdl("clear_domain").ud(jSONObject.toString());
                    }
                });
            }
            com.bytedance.sdk.openadsdk.core.tvp.ud(ud);
        }
    }

    public static void qdl(com.bytedance.sdk.component.tvp.mo moVar, String str) {
        HashMap map = new HashMap();
        map.put("Referer", TTAdConstant.REQUEST_HEAD_REFERER);
        moVar.qdl(str, map);
    }
}
