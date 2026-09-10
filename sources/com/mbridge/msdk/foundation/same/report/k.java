package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.m0;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class k {
    public static void a(com.mbridge.msdk.foundation.same.net.wrapper.e eVar, Context context) {
    }

    public static JSONObject a(Context context, com.mbridge.msdk.setting.g gVar) throws Exception {
        JSONObject jSONObject = new JSONObject();
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            String strQ = m0.q();
            if (!TextUtils.isEmpty(strQ)) {
                jSONObject.put("manufacturer", strQ);
            }
            int iN = m0.n();
            if (iN != -1) {
                jSONObject.put("sdkint", iN);
            }
            String strY = m0.y(context);
            if (!TextUtils.isEmpty(strY)) {
                jSONObject.put("is24H", strY);
            }
            String strZ = m0.z();
            if (!TextUtils.isEmpty(strZ)) {
                jSONObject.put("totalram", strZ);
            }
            String strZ2 = m0.z(context);
            if (!TextUtils.isEmpty(strZ2)) {
                jSONObject.put("totalmemory", strZ2);
            }
            jSONObject.put("adid_limit", com.mbridge.msdk.foundation.tools.g.a() + "");
            jSONObject.put("adid_limit_dev", com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? "1" : "0");
        }
        if (gVar.y0() == 1 && !TextUtils.isEmpty(com.mbridge.msdk.foundation.tools.g.e()) && com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            jSONObject.put("az_aid_info", com.mbridge.msdk.foundation.tools.g.e());
        }
        return jSONObject;
    }
}
