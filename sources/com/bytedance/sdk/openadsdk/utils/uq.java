package com.bytedance.sdk.openadsdk.utils;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.X3;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class uq {
    public static final String[] ik = {"api16-access-ttp.tiktokpangle.us", "api16-access-ttp-b.tiktokpangle.us", "api16-access-ttp.tiktokpangle-b.us", "api16-access-ttp-b.tiktokpangle-b.us"};
    public static int lr = Integer.MIN_VALUE;
    public static int ri = Integer.MIN_VALUE;

    public static synchronized void lr() {
        if (lr == 0) {
            return;
        }
        lr = 0;
        com.bytedance.sdk.openadsdk.core.qt.lr(0);
    }

    public static String ri() {
        if (ri == Integer.MIN_VALUE) {
            ri = com.bytedance.sdk.openadsdk.core.qt.fi();
        }
        if (ri < 0) {
            ri = 0;
        }
        String[] strArr = ik;
        try {
            return strArr[ri % strArr.length];
        } catch (Throwable unused) {
            return strArr[0];
        }
    }

    public static synchronized void ri(String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        while (true) {
            try {
                try {
                    String[] strArr = ik;
                    if (i >= strArr.length) {
                        break;
                    }
                    if (str.contains(strArr[i])) {
                        int i2 = ri + 1;
                        ri = i2;
                        com.bytedance.sdk.openadsdk.core.qt.ri(i2);
                        break;
                    }
                    i++;
                } catch (Throwable th) {
                    th.getMessage();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (str.contains("/api/ad/union/sdk/settings/") || str.contains("/api/ad/union/sdk/strategies/adn")) {
            if (lr == Integer.MIN_VALUE) {
                lr = com.bytedance.sdk.openadsdk.core.qt.di();
            }
            int i3 = lr + 1;
            lr = i3;
            if (i3 >= 3) {
                final String strJc = com.bytedance.sdk.openadsdk.core.settings.sf.lr().jc();
                final int i4 = lr;
                com.bytedance.sdk.openadsdk.core.settings.sf.lr().de();
                lr = 0;
                com.bytedance.sdk.openadsdk.slm.ka.ri("clear_domain", false, new com.bytedance.sdk.openadsdk.slm.lr() { // from class: com.bytedance.sdk.openadsdk.utils.uq.1
                    @Override // com.bytedance.sdk.openadsdk.slm.lr
                    public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put(X3.j.D, strJc);
                            jSONObject.put("times", i4);
                        } catch (Exception unused) {
                        }
                        return com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri("clear_domain").lr(jSONObject.toString());
                    }
                });
            }
            com.bytedance.sdk.openadsdk.core.qt.lr(lr);
        }
    }

    public static void ri(com.bytedance.sdk.component.jbs.di diVar, String str) {
        HashMap map = new HashMap();
        map.put("Referer", TTAdConstant.REQUEST_HEAD_REFERER);
        diVar.ri(str, map);
    }
}
