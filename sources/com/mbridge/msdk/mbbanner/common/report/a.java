package com.mbridge.msdk.mbbanner.common.report;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.setting.i;
import com.mbridge.msdk.setting.m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    public static void a(CampaignEx campaignEx, String str, String str2) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                new h(c.n().d()).a(campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), campaignEx.getId(), str, str2, campaignEx.isBidCampaign());
            } catch (Exception e10) {
                q0.b("BannerReport", e10.getMessage());
            }
        }
    }

    public static String b(String str) {
        String md5 = SameMD5.getMD5(v0.d());
        try {
            if (!TextUtils.isEmpty(str)) {
                String[] strArrSplit = str.split("_");
                if (strArrSplit.length < 3) {
                    return "";
                }
                String str2 = strArrSplit[2];
                if (!TextUtils.isEmpty(str2)) {
                    return str2;
                }
            }
            return md5;
        } catch (Exception e10) {
            q0.b("BannerReport", e10.getMessage());
            return "";
        }
    }

    public static void a(CampaignEx campaignEx, String str) {
        if (campaignEx != null) {
            try {
                String strB = com.mbridge.msdk.mbsignalcommon.mraid.c.b(campaignEx.getId());
                if (TextUtils.isEmpty(strB)) {
                    return;
                }
                new h(c.n().d()).b(campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), campaignEx.getId(), str, strB, campaignEx.isBidCampaign());
                com.mbridge.msdk.mbsignalcommon.mraid.c.a(campaignEx.getId());
            } catch (Throwable th2) {
                q0.b("BannerReport", th2.getMessage());
            }
        }
    }

    public static void a(String str, CampaignEx campaignEx, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (campaignEx.isBidCampaign()) {
                jSONObject.put(CampaignEx.JSON_KEY_HB, 1);
            }
            jSONObject.put(X3.i.W, "2000070");
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put(BidResponsedEx.KEY_CID, campaignEx.getId());
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject.put(CampaignEx.JSON_KEY_CLICK_URL, str2);
            jSONObject.put("network_type", String.valueOf(m0.s(c.n().d())));
            d.b().a(jSONObject);
        } catch (Exception e10) {
            q0.b("BannerReport", e10.getMessage());
        }
    }

    public static void a(String str, CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(X3.i.W, "2000067");
                jSONObject.put("rid", campaignEx.getRequestId());
                jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
                jSONObject.put(BidResponsedEx.KEY_CID, campaignEx.getId());
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
                jSONObject.put(CampaignEx.JSON_KEY_HB, campaignEx.isBidCampaign() ? 1 : 0);
                HashMap<String, String> map = com.mbridge.msdk.foundation.controller.a.f33385r;
                if (map != null) {
                    String str2 = map.get(str);
                    if (!TextUtils.isEmpty(str2)) {
                        jSONObject.put("u_stid", str2);
                    }
                }
                d.b().a(jSONObject);
            } catch (Throwable th2) {
                q0.b("BannerReport", th2.getMessage());
            }
        }
    }

    public static void a(Context context, CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().i() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().i(), false, false);
    }

    public static void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar, CampaignEx campaignEx, Context context, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        try {
            d.b().a(str, cVar, campaignEx, context, aVar);
        } catch (Exception e10) {
            q0.b("BannerReport", e10.getMessage());
        }
    }

    public static com.mbridge.msdk.foundation.same.report.metrics.c a(String str, String str2) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        try {
            LinkedHashMap<String, com.mbridge.msdk.foundation.same.report.metrics.c> linkedHashMapC = d.b().c();
            if (linkedHashMapC != null && !linkedHashMapC.isEmpty()) {
                Iterator<Map.Entry<String, com.mbridge.msdk.foundation.same.report.metrics.c>> it = linkedHashMapC.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, com.mbridge.msdk.foundation.same.report.metrics.c> next = it.next();
                    if (next != null && next.getValue().E()) {
                        it.remove();
                    }
                }
            }
            cVar = d.b().b(str2);
            if (cVar == null) {
                com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = new com.mbridge.msdk.foundation.same.report.metrics.c();
                try {
                    d.b().c().put(str2, cVar2);
                    cVar2.d(true);
                    cVar = cVar2;
                } catch (Exception e10) {
                    e = e10;
                    cVar = cVar2;
                    q0.b("BannerReport", e.getMessage());
                    return cVar;
                }
            }
            cVar.a(296);
            cVar.i(str2);
            cVar.n(str);
            return cVar;
        } catch (Exception e11) {
            e = e11;
        }
    }

    public static void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar, e eVar) {
        try {
            a(cVar, eVar);
            if (eVar != null) {
                cVar.a(str, eVar);
            }
            d.b().b(str, cVar, null);
        } catch (Exception e10) {
            q0.b("BannerReport", e10.getMessage());
        }
    }

    private static void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, e eVar) {
        List<CampaignEx> listO;
        try {
            String strB = cVar.B();
            if (TextUtils.isEmpty(strB) && (listO = cVar.o()) != null && !listO.isEmpty() && listO.get(0) != null) {
                strB = listO.get(0).getCampaignUnitId();
                cVar.a(listO.get(0).getAdType());
                cVar.n(strB);
            }
            m mVarD = i.b().d(c.n().b(), strB);
            if (mVarD != null) {
                if (eVar == null) {
                    eVar = new e();
                }
                eVar.a("us_rid", mVarD.I());
                HashMap<String, String> map = com.mbridge.msdk.foundation.controller.a.f33385r;
                if (map != null) {
                    String str = map.get(strB);
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    eVar.a("u_stid", str);
                    return;
                }
                eVar.a("u_stid", mVarD.a());
            }
        } catch (Exception e10) {
            q0.b("BannerReport", e10.getMessage());
        }
    }

    public static void a(String str) {
        LinkedHashMap<String, com.mbridge.msdk.foundation.same.report.metrics.c> linkedHashMapC;
        try {
            if (TextUtils.isEmpty(str) || (linkedHashMapC = d.b().c()) == null || linkedHashMapC.isEmpty()) {
                return;
            }
            Iterator<Map.Entry<String, com.mbridge.msdk.foundation.same.report.metrics.c>> it = linkedHashMapC.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, com.mbridge.msdk.foundation.same.report.metrics.c> next = it.next();
                if (next != null) {
                    com.mbridge.msdk.foundation.same.report.metrics.c value = next.getValue();
                    if (value.E()) {
                        it.remove();
                    }
                    if (value.B().equals(str)) {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th2) {
            q0.b("BannerReport", th2.getMessage());
        }
    }
}
