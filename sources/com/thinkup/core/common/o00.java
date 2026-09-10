package com.thinkup.core.common;

import android.text.TextUtils;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustEvent;
import com.appsflyer.AppsFlyerLib;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class o00 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile o00 f42134n;
    private final String o = "1";
    private final String m = "2";

    private o00() {
    }

    public static o00 o() {
        if (f42134n == null) {
            synchronized (o00.class) {
                try {
                    if (f42134n == null) {
                        f42134n = new o00();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f42134n;
    }

    public static void o(com.thinkup.core.common.on.n0 n0Var) {
        if (n0Var == null) {
            return;
        }
        try {
            com.thinkup.core.oo.n0 n0VarO = com.thinkup.core.oo.nm.o(com.thinkup.core.common.n.o0n.m().on()).o(n0Var.oomn());
            if (n0VarO != null) {
                String strN0m = n0VarO.n0m();
                if (TextUtils.isEmpty(strN0m)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(strN0m);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("1");
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("token");
                    if (!TextUtils.isEmpty(strOptString)) {
                        String strOnm = n0Var.onm();
                        double dMom = n0Var.mom() / 1000.0d;
                        String strOmm = n0Var.omm();
                        try {
                            AdjustEvent adjustEvent = new AdjustEvent(strOptString);
                            adjustEvent.setRevenue(dMom, strOnm);
                            adjustEvent.setOrderId(strOmm);
                            Adjust.trackEvent(adjustEvent);
                        } catch (Throwable unused) {
                        }
                    }
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("2");
                if (jSONObjectOptJSONObject2 != null) {
                    int iOptInt = jSONObjectOptJSONObject2.optInt("rtye");
                    HashMap map = new HashMap();
                    map.put("af_order_id", n0Var.omm());
                    map.put("af_content_id", n0Var.oomn());
                    map.put("af_content_type", n0Var.oono());
                    map.put("af_revenue", Double.valueOf(iOptInt == 2 ? n0Var.mom() : n0Var.mom() / 1000.0d));
                    map.put("af_currency", "USD");
                    AppsFlyerLib.getInstance().trackEvent(com.thinkup.core.common.n.o0n.m().on(), "af_ad_view", map);
                }
            }
        } catch (Throwable unused2) {
        }
    }

    private static void o(String str, double d, String str2, String str3) {
        try {
            AdjustEvent adjustEvent = new AdjustEvent(str);
            adjustEvent.setRevenue(d, str2);
            adjustEvent.setOrderId(str3);
            Adjust.trackEvent(adjustEvent);
        } catch (Throwable unused) {
        }
    }
}
