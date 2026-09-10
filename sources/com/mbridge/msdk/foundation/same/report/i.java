package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class i {
    public static void a(Context context, int i10, int i11, String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(X3.i.W, "2000058");
            jSONObject.put("appid", com.mbridge.msdk.foundation.controller.c.n().b());
            jSONObject.put("dl_type", String.valueOf(i10));
            jSONObject.put("dl_link_type", String.valueOf(i11));
            jSONObject.put("rid", str);
            jSONObject.put("rid_n", str2);
            jSONObject.put(BidResponsedEx.KEY_CID, str3);
            jSONObject.put("tgt_v", m0.x(context));
            jSONObject.put("app_v_n", m0.C(context));
            jSONObject.put("app_v_c", m0.B(context));
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("ReportControllerDiff", e10.getMessage());
            }
        }
    }
}
