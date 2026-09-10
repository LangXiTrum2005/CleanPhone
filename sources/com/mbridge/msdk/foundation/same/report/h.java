package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.B5;
import com.ironsource.O6;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.out.Campaign;
import java.net.URLEncoder;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f33945b = "h";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f33946a;

    public h(Context context, int i10) {
        this.f33946a = context;
    }

    public void a(String str, com.mbridge.msdk.foundation.entity.e eVar, String str2) {
        JSONObject jSONObjectA = com.mbridge.msdk.foundation.entity.e.a(eVar);
        if (jSONObjectA != null) {
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObjectA);
        }
    }

    public void b(String str, String str2, String str3, String str4, String str5, boolean z10) {
        try {
            if (TextUtils.isEmpty(str5)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            if (z10) {
                jSONObject.put(CampaignEx.JSON_KEY_HB, 1);
            }
            jSONObject.put(X3.i.W, URLEncoder.encode("2000066", B5.O));
            jSONObject.put("rid", URLEncoder.encode(str, B5.O));
            jSONObject.put("rid_n", URLEncoder.encode(str2, B5.O));
            jSONObject.put(BidResponsedEx.KEY_CID, URLEncoder.encode(str3, B5.O));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, URLEncoder.encode(str4, B5.O));
            jSONObject.put("err_method", str5);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Exception e10) {
            q0.b(f33945b, e10.getMessage());
        }
    }

    public h(Context context) {
        this.f33946a = context.getApplicationContext();
    }

    public void a(int i10, int i11, String str, String str2, String str3) {
        i.a(this.f33946a, i10, i11, str, str2, str3);
    }

    public void a(String str, String str2, String str3, String str4, String str5, boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (z10) {
                jSONObject.put(CampaignEx.JSON_KEY_HB, 1);
            }
            jSONObject.put(X3.i.W, URLEncoder.encode("2000065", B5.O));
            jSONObject.put("rid", URLEncoder.encode(str, B5.O));
            jSONObject.put("rid_n", URLEncoder.encode(str2, B5.O));
            jSONObject.put(BidResponsedEx.KEY_CID, URLEncoder.encode(str3, B5.O));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, URLEncoder.encode(str4, B5.O));
            jSONObject.put(CampaignEx.JSON_KEY_CLICK_URL, URLEncoder.encode(str5, B5.O));
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Exception e10) {
            q0.b(f33945b, e10.getMessage());
        }
    }

    public void a(String str, String str2, String str3, String str4, String str5) {
        try {
            int iS = m0.s(this.f33946a);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(X3.i.W, URLEncoder.encode("2000071", B5.O));
            jSONObject.put("rid", URLEncoder.encode(str, B5.O));
            jSONObject.put("rid_n", URLEncoder.encode(str2, B5.O));
            jSONObject.put(BidResponsedEx.KEY_CID, URLEncoder.encode(str3, B5.O));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, URLEncoder.encode(str4, B5.O));
            jSONObject.put("reason", URLEncoder.encode(str5, B5.O));
            jSONObject.put("network_type", URLEncoder.encode(String.valueOf(iS), B5.O));
            jSONObject.put("result", URLEncoder.encode("0", B5.O));
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Exception e10) {
            q0.b(f33945b, e10.getMessage());
        }
    }

    public void a() {
        try {
            if (j.a()) {
                String strB = com.mbridge.msdk.foundation.controller.c.n().b();
                com.mbridge.msdk.setting.g gVarF = com.mbridge.msdk.setting.i.b().f(strB);
                if (gVarF == null) {
                    gVarF = com.mbridge.msdk.setting.i.b().a();
                }
                String strD = com.mbridge.msdk.foundation.tools.g.d();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(X3.i.W, "2000053");
                jSONObject.put("Appid", strB);
                jSONObject.put("uptips2", gVarF.x0());
                jSONObject.put("info_status", com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().g());
                jSONObject.put("iseu", gVarF.H());
                if (!TextUtils.isEmpty(strD)) {
                    jSONObject.put(O6.X0, strD);
                }
                jSONObject.put("GDPR_area", gVarF.K0());
                jSONObject.put("GDPR_consent", com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().e());
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
                j.c();
            }
        } catch (Throwable th2) {
            q0.b(f33945b, th2.getMessage());
        }
    }

    public void a(int i10, String str) {
        com.mbridge.msdk.foundation.same.report.metrics.d.b().a(j.a((Campaign) null, i10, "request"));
    }

    public void a(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click_type", "1");
            jSONObject.put(BidResponsedEx.KEY_CID, str);
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
            jSONObject.put(X3.i.W, "2000027");
            jSONObject.put("http_url", str3);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Exception e10) {
            q0.b(f33945b, e10.getMessage());
        }
    }
}
