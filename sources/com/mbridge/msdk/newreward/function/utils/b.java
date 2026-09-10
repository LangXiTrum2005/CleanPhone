package com.mbridge.msdk.newreward.function.utils;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.r;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.foundation.tools.w0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b {
    public static CampaignEx a(String str, CampaignEx campaignEx) {
        JSONObject jSONObjectCampaignToJsonObject;
        String strValueOf;
        String strValueOf2;
        if (TextUtils.isEmpty(str)) {
            return campaignEx;
        }
        CampaignEx campaignWithBackData = null;
        if (campaignEx != null) {
            try {
                jSONObjectCampaignToJsonObject = CampaignEx.campaignToJsonObject(campaignEx);
            } catch (Throwable th) {
                o0.b("HybridCommunicatorUtil", th.getMessage());
                return campaignEx;
            }
        } else {
            jSONObjectCampaignToJsonObject = null;
        }
        if (jSONObjectCampaignToJsonObject != null) {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString(CampaignEx.JSON_KEY_NOTICE_URL);
            if (TextUtils.isEmpty(strOptString)) {
                strOptString = campaignEx.getNoticeUrl();
            }
            String strOptString2 = jSONObject.optString(CampaignEx.JSON_KEY_CLICK_URL);
            if (TextUtils.isEmpty(strOptString2)) {
                strOptString2 = campaignEx.getClickURL();
            }
            if (str.contains("notice")) {
                if (!jSONObject.has(CampaignEx.JSON_KEY_DEEP_LINK_URL)) {
                    jSONObjectCampaignToJsonObject.put(CampaignEx.JSON_KEY_DEEP_LINK_URL, "");
                }
                if (jSONObject.opt("akdlui") == null) {
                    jSONObjectCampaignToJsonObject.put("akdlui", "");
                }
            } else {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(com.mbridge.msdk.foundation.same.a.j);
                if (jSONObjectOptJSONObject != null) {
                    strValueOf = String.valueOf(t0.a(com.mbridge.msdk.foundation.controller.c.n().d(), Integer.parseInt(jSONObjectOptJSONObject.getString(com.mbridge.msdk.foundation.same.a.h))));
                    strValueOf2 = String.valueOf(t0.a(com.mbridge.msdk.foundation.controller.c.n().d(), Integer.parseInt(jSONObjectOptJSONObject.getString(com.mbridge.msdk.foundation.same.a.i))));
                } else {
                    strValueOf = "-999";
                    strValueOf2 = "-999";
                }
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    StringBuilder sb = new StringBuilder();
                    while (itKeys.hasNext()) {
                        sb.append("&");
                        String next = itKeys.next();
                        String strOptString3 = jSONObjectOptJSONObject.optString(next);
                        if (com.mbridge.msdk.foundation.same.a.h.equals(next) || com.mbridge.msdk.foundation.same.a.i.equals(next)) {
                            strOptString3 = String.valueOf(t0.a(com.mbridge.msdk.foundation.controller.c.n().d(), Integer.parseInt(strOptString3)));
                        }
                        sb.append(next);
                        sb.append("=");
                        sb.append(strOptString3);
                    }
                    strOptString = strOptString + ((Object) sb);
                }
                strOptString2 = com.mbridge.msdk.click.c.a(campaignEx.getClickURL(), strValueOf, strValueOf2);
            }
            Iterator<String> itKeys2 = jSONObject.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                jSONObjectCampaignToJsonObject.put(next2, jSONObject.getString(next2));
            }
            if (!TextUtils.isEmpty(campaignEx.getCampaignUnitId())) {
                jSONObjectCampaignToJsonObject.put("unitId", campaignEx.getCampaignUnitId());
            }
            jSONObjectCampaignToJsonObject.put(CampaignEx.JSON_KEY_CLICK_URL, strOptString2);
            jSONObjectCampaignToJsonObject.put(CampaignEx.JSON_KEY_NOTICE_URL, strOptString);
            campaignWithBackData = CampaignEx.parseCampaignWithBackData(jSONObjectCampaignToJsonObject);
        }
        return campaignWithBackData == null ? campaignEx : campaignWithBackData;
    }

    public static String a(String str, List<CampaignEx> list, boolean z, int i, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject.put("sdk_info", "MAL_16.9.41,3.0.1");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("instanceId", "");
            jSONObject2.put("rootViewInstanceId", "");
            jSONObject2.put("isRootTemplateWebView", false);
            jSONObject2.put("playVideoMute", i);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put("device", new r(com.mbridge.msdk.foundation.controller.c.n().d()).a());
            JSONArray jSONArray = new JSONArray();
            if (list != null && !list.isEmpty()) {
                for (CampaignEx campaignEx : list) {
                    jSONArray.put(CampaignEx.campaignToJsonObject(campaignEx, campaignEx.isReady(), a(campaignEx)));
                }
            }
            jSONObject.put("campaignList", jSONArray);
            String strE = h.b().e(com.mbridge.msdk.foundation.controller.c.n().b());
            if (!TextUtils.isEmpty(strE)) {
                JSONObject jSONObject3 = new JSONObject(strE);
                a(jSONObject3, str);
                String strC = h.b().c(str);
                if (!TextUtils.isEmpty(strC)) {
                    jSONObject3.put("ivreward", new JSONObject(strC));
                }
                jSONObject.put("appSetting", jSONObject3);
            }
            jSONObject.put("rewardSetting", com.mbridge.msdk.videocommon.setting.b.b().c().k());
            if (z2) {
                jSONObject.put("unitSetting", new JSONObject());
            } else {
                jSONObject.put("unitSetting", com.mbridge.msdk.videocommon.setting.b.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), str).H());
            }
            jSONObject.put("rw_plus", z ? "1" : "0");
        } catch (Throwable th) {
            o0.b("HybridCommunicatorUtil", th.getMessage());
        }
        return jSONObject.toString();
    }

    public static String a(String str, ArrayList<CampaignEx> arrayList) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject.put("sdk_info", "MAL_16.9.41,3.0.1");
            jSONObject.put("device", new r(com.mbridge.msdk.foundation.controller.c.n().d()).a());
            JSONArray jSONArray = new JSONArray();
            if (arrayList != null && !arrayList.isEmpty()) {
                for (CampaignEx campaignEx : arrayList) {
                    jSONArray.put(CampaignEx.campaignToJsonObject(campaignEx, campaignEx.isReady(), a(campaignEx)));
                }
            }
            jSONObject.put("campaignList", jSONArray);
            String strE = h.b().e(com.mbridge.msdk.foundation.controller.c.n().b());
            if (!TextUtils.isEmpty(strE)) {
                JSONObject jSONObject2 = new JSONObject(strE);
                a(jSONObject2, str);
                String strC = h.b().c(str);
                if (!TextUtils.isEmpty(strC)) {
                    jSONObject2.put("ivreward", new JSONObject(strC));
                }
                jSONObject.put("appSetting", jSONObject2);
            }
            jSONObject.put("unitSetting", com.mbridge.msdk.videocommon.setting.b.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), str).H());
        } catch (Throwable th) {
            o0.b("HybridCommunicatorUtil", th.getMessage());
        }
        return jSONObject.toString();
    }

    private static void a(JSONObject jSONObject, String str) {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            String string = w0.a(contextD, "MBridge_ConfirmTitle" + str, "").toString();
            String string2 = w0.a(contextD, "MBridge_ConfirmContent" + str, "").toString();
            String string3 = w0.a(contextD, "MBridge_CancelText" + str, "").toString();
            String string4 = w0.a(contextD, "MBridge_ConfirmText" + str, "").toString();
            if (!TextUtils.isEmpty(string)) {
                jSONObject.put("confirm_title", string);
            }
            if (!TextUtils.isEmpty(string2)) {
                jSONObject.put("confirm_description", string2);
            }
            if (!TextUtils.isEmpty(string3)) {
                jSONObject.put("confirm_t", string3);
            }
            if (TextUtils.isEmpty(string4)) {
                return;
            }
            jSONObject.put("confirm_c_play", string4);
            jSONObject.put("confirm_c_rv", string4);
        } catch (Exception e) {
            o0.b("HybridCommunicatorUtil", e.getMessage());
        }
    }

    private static boolean a(CampaignEx campaignEx) {
        g gVarD;
        try {
            String strB = com.mbridge.msdk.foundation.controller.c.n().b();
            long jA0 = (TextUtils.isEmpty(strB) || (gVarD = h.b().d(strB)) == null) ? 0L : gVarD.a0() * 1000;
            com.mbridge.msdk.videocommon.setting.a aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
            long jE = aVarC != null ? aVarC.e() : 0L;
            if (campaignEx != null) {
                return campaignEx.isSpareOffer(jE, jA0);
            }
            return false;
        } catch (Exception e) {
            o0.b("HybridCommunicatorUtil", e.getMessage());
            return false;
        }
    }

    public static String a(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            String string = jSONObject.toString();
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : string;
        } catch (Throwable th) {
            o0.b("HybridCommunicatorUtil", th.getMessage());
            return "";
        }
    }

    public static String a(float f, float f2, int i) {
        int i2;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.h, t0.b(com.mbridge.msdk.foundation.controller.c.n().d(), f));
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.i, t0.b(com.mbridge.msdk.foundation.controller.c.n().d(), f2));
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.m, i);
            try {
                i2 = com.mbridge.msdk.foundation.controller.c.n().d().getResources().getConfiguration().orientation;
            } catch (Throwable th) {
                o0.b("HybridCommunicatorUtil", th.getMessage());
                i2 = 1;
            }
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.k, i2);
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.l, t0.d(com.mbridge.msdk.foundation.controller.c.n().d()));
            jSONObject.put(com.mbridge.msdk.foundation.same.a.j, jSONObject2);
        } catch (Throwable th2) {
            o0.b("HybridCommunicatorUtil", th2.getMessage());
        }
        return jSONObject.toString();
    }
}
