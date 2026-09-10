package com.mbridge.msdk.splash.report;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.report.g;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    public static void a(CampaignEx campaignEx, String str, String str2) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(str2) || !campaignEx.isMraid()) {
                    return;
                }
                new h(c.n().d()).a(campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), campaignEx.getId(), str, str2, campaignEx.isBidCampaign());
            } catch (Exception e10) {
                q0.b("SplashReport", e10.getMessage());
            }
        }
    }

    public static void b(String str, CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(X3.i.W, "2000067");
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
                jSONObject.put(BidResponsedEx.KEY_CID, campaignEx.getId());
                jSONObject.put("rid", campaignEx.getRequestId());
                jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
                jSONObject.put(CampaignEx.JSON_KEY_CREATIVE_ID, campaignEx.getCreativeId());
                jSONObject.put(CampaignEx.JSON_KEY_HB, campaignEx.isBidCampaign() ? 1 : 0);
                jSONObject.put("network_type", m0.s(c.n().d()));
                d.b().a(jSONObject);
            } catch (Throwable th2) {
                q0.b("SplashReport", th2.getMessage());
            }
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str) {
        if (campaignEx != null) {
            try {
                if (campaignEx.isMraid()) {
                    n nVar = new n();
                    nVar.n(campaignEx.getRequestId());
                    nVar.o(campaignEx.getRequestIdNotice());
                    nVar.b(campaignEx.getId());
                    nVar.b(campaignEx.isMraid() ? n.N : n.O);
                    g.d(nVar, context.getApplicationContext(), str);
                }
            } catch (Exception e10) {
                q0.b("SplashReport", e10.getMessage());
            }
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2, long j10, int i10) {
        if (campaignEx != null) {
            try {
                if (campaignEx.isMraid()) {
                    n nVar = new n();
                    nVar.n(campaignEx.getRequestId());
                    nVar.o(campaignEx.getRequestIdNotice());
                    nVar.b(campaignEx.getId());
                    nVar.d(i10);
                    nVar.e(String.valueOf(System.currentTimeMillis() - j10));
                    nVar.g("");
                    nVar.m(str2);
                    nVar.a("6");
                    nVar.b(n.N);
                    g.b(nVar, str, campaignEx);
                }
            } catch (Exception e10) {
                q0.b("SplashReport", e10.getMessage());
            }
        }
    }

    public static void a(String str, CampaignEx campaignEx) {
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        n nVar = new n("2000061", campaignEx.getId(), campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), str, m0.s(c.n().d()));
        nVar.b(n.N);
        g.b(nVar, c.n().d(), str);
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
            q0.b("SplashReport", e10.getMessage());
        }
    }

    public static void a(int i10, String str, String str2, CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(X3.i.W, "2000068");
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                jSONObject.put(BidResponsedEx.KEY_CID, campaignEx.getId());
                jSONObject.put("rid", campaignEx.getRequestId());
                jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
                jSONObject.put(CampaignEx.JSON_KEY_CREATIVE_ID, campaignEx.getCreativeId());
                jSONObject.put(CampaignEx.JSON_KEY_HB, campaignEx.isBidCampaign() ? 1 : 0);
                jSONObject.put("network_type", m0.s(c.n().d()));
                jSONObject.put("result", i10);
                jSONObject.put("reason", str);
                d.b().a(jSONObject);
            } catch (Throwable th2) {
                q0.b("SplashReport", th2.getMessage());
            }
        }
    }

    public static void a(String str, int i10, CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(X3.i.W, "2000069");
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
                jSONObject.put(BidResponsedEx.KEY_CID, campaignEx.getId());
                jSONObject.put("rid", campaignEx.getRequestId());
                jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
                jSONObject.put(CampaignEx.JSON_KEY_CREATIVE_ID, campaignEx.getCreativeId());
                jSONObject.put(CampaignEx.JSON_KEY_HB, campaignEx.isBidCampaign() ? 1 : 0);
                jSONObject.put("network_type", m0.s(c.n().d()));
                jSONObject.put("close_type", i10);
                d.b().a(jSONObject);
            } catch (Throwable th2) {
                q0.b("SplashReport", th2.getMessage());
            }
        }
    }

    public static void a(Context context, CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().i() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().i(), false, false);
    }

    public static void a(CampaignEx campaignEx, String str, int i10, int i11, int i12) {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("flb_size", i11);
                jSONObject.put("x", i10);
                jSONObject.put("flb_type", i12);
            } catch (JSONException e10) {
                q0.b("SplashReport", "e:" + e10.getMessage());
            }
            j.b(c.n().d(), campaignEx, str, jSONObject.toString());
        } catch (Exception e11) {
            q0.b("SplashReport", e11.getMessage());
        }
    }

    public static void a(CampaignEx campaignEx, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(X3.i.W, "2000092");
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put(BidResponsedEx.KEY_CID, campaignEx.getId());
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject.put("network_type", String.valueOf(m0.s(c.n().d())));
            d.b().a(jSONObject);
        } catch (Exception e10) {
            q0.b("SplashReport", e10.getMessage());
        }
    }

    public static void a(CampaignEx campaignEx, String str, int i10) {
        try {
            a(str, i10, campaignEx);
        } catch (Exception e10) {
            q0.b("SplashReport", e10.getMessage());
        }
    }

    public static void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar, CampaignEx campaignEx, Context context, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        try {
            d.b().a(str, cVar, campaignEx, context, aVar);
        } catch (Exception e10) {
            q0.b("SplashReport", e10.getMessage());
        }
    }
}
