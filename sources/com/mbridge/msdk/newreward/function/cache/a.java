package com.mbridge.msdk.newreward.function.cache;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.j;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.z0;
import com.mbridge.msdk.newreward.adapter.e;
import com.mbridge.msdk.newreward.function.command.f;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a {
    public static int h = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONArray f1610a;
    private JSONObject b;
    private String c;
    private int d;
    private String e;
    private e f;
    private com.mbridge.msdk.newreward.function.command.c g;

    /* JADX INFO: renamed from: com.mbridge.msdk.newreward.function.cache.a$a, reason: collision with other inner class name */
    public static class C0204a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.newreward.function.core.campaign.b f1611a;
        private double b;

        public C0204a(double d, com.mbridge.msdk.newreward.function.core.campaign.b bVar) {
            this.b = d;
            this.f1611a = bVar;
        }

        public com.mbridge.msdk.newreward.function.core.campaign.b a() {
            return this.f1611a;
        }
    }

    public void a(int i) {
    }

    public double b(String str) {
        b bVarA = a(str);
        if (bVarA != null && bVarA.h() != com.mbridge.msdk.foundation.cache.c.k && bVarA.h() != com.mbridge.msdk.foundation.cache.c.i) {
            try {
                String[] strArrSplit = i0.a(str.split("_")[3]).split("\\|");
                if (strArrSplit.length > 0) {
                    return Double.parseDouble(strArrSplit[0]);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return -1.0d;
    }

    public JSONObject c(String str) {
        JSONArray jSONArray = this.f1610a;
        if (jSONArray == null) {
            return null;
        }
        if (jSONArray.length() <= 1) {
            return this.f1610a.optJSONObject(0);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (int i = 0; i < this.f1610a.length(); i++) {
            try {
                JSONObject jSONObjectOptJSONObject = this.f1610a.optJSONObject(i);
                if (jSONObjectOptJSONObject != null && str.equals(jSONObjectOptJSONObject.getString("g"))) {
                    this.b = jSONObjectOptJSONObject;
                    return jSONObjectOptJSONObject;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public String d(String str) {
        b bVarA = a(str);
        if (bVarA != null && bVarA.h() != com.mbridge.msdk.foundation.cache.c.k && bVarA.h() != com.mbridge.msdk.foundation.cache.c.i) {
            String[] strArrSplit = i0.a(str.split("_")[3]).split("\\|");
            if (strArrSplit.length > 1) {
                return strArrSplit[1];
            }
        }
        return "";
    }

    public void e(String str) {
        this.e = str;
    }

    public void f(String str) {
        this.c = str;
    }

    public b a(String str) {
        b bVar = new b();
        if (TextUtils.isEmpty(str) || str.split("_").length <= 3 || TextUtils.isEmpty(str.split("_")[3])) {
            bVar.d("bid token exception");
            bVar.a(com.mbridge.msdk.foundation.cache.c.i);
            return bVar;
        }
        JSONArray jSONArray = this.f1610a;
        if (jSONArray == null || jSONArray.length() == 0) {
            bVar.d("config is empty");
            bVar.a(com.mbridge.msdk.foundation.cache.c.i);
            return bVar;
        }
        String strA = i0.a(str.split("_")[3]);
        if (TextUtils.isEmpty(strA)) {
            bVar.d("bid token exception:decode error");
            bVar.a(com.mbridge.msdk.foundation.cache.c.i);
            return bVar;
        }
        String[] strArrSplit = strA.split("\\|");
        if (strArrSplit.length == 0) {
            bVar.d("bid token can not get bid price");
            bVar.a(com.mbridge.msdk.foundation.cache.c.i);
            return bVar;
        }
        if (strArrSplit.length > 0) {
            try {
                Double.parseDouble(strArrSplit[0]);
            } catch (Exception unused) {
                bVar.d("bid token can not cast bid price");
                bVar.a(com.mbridge.msdk.foundation.cache.c.i);
                return bVar;
            }
        }
        if (TextUtils.isEmpty(this.c)) {
            bVar.d("unitId is empty");
            bVar.a(com.mbridge.msdk.foundation.cache.c.k);
        }
        return bVar;
    }

    private List<Map<Integer, String>> b(List<Map<Integer, String>> list, int i, String str, String str2) {
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            Map<Integer, String> map = list.get(i2);
            if (map != null && map.size() > 0) {
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    map.put(entry.getKey(), a(entry.getValue(), i, str, str2));
                }
                arrayList.add(map);
            }
        }
        return arrayList;
    }

    public void b(int i) {
        this.d = i;
    }

    public void a(JSONArray jSONArray) {
        this.f1610a = jSONArray;
    }

    public void a(List<com.mbridge.msdk.newreward.function.core.campaign.a> list, com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str, int i, String str2, int i2, double d) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        CampaignEx campaignExA = list.get(i3).a();
                        campaignExA.setReadyState(0);
                        if (cVar != null) {
                            campaignExA.setNLRid(cVar.o());
                        }
                        campaignExA.setNRid(str);
                        campaignExA.setReasond(str2);
                        campaignExA.setTyped(i);
                        String strB = i0.b(d + "");
                        campaignExA.setNoticeUrl(a(campaignExA.getNoticeUrl(), i2, str, strB));
                        campaignExA.setClickURL(a(campaignExA.getClickURL(), i2, str, strB));
                        campaignExA.setImpressionURL(a(campaignExA.getImpressionURL(), i2, str, strB));
                        campaignExA.setOnlyImpressionURL(a(campaignExA.getOnlyImpressionURL(), i2, str, strB));
                        campaignExA.setAdvImp(a(campaignExA.getAdvImpList(), i2, str, strB));
                        j nativeVideoTracking = campaignExA.getNativeVideoTracking();
                        if (nativeVideoTracking != null) {
                            nativeVideoTracking.d(a(nativeVideoTracking.d(), i2, str, strB));
                            nativeVideoTracking.c(a(nativeVideoTracking.c(), i2, str, strB));
                            nativeVideoTracking.k(a(nativeVideoTracking.k(), i2, str, strB));
                            nativeVideoTracking.s(a(nativeVideoTracking.t(), i2, str, strB));
                            nativeVideoTracking.a(a(nativeVideoTracking.a(), i2, str, strB));
                            nativeVideoTracking.b(a(nativeVideoTracking.b(), i2, str, strB));
                            nativeVideoTracking.e(a(nativeVideoTracking.e(), i2, str, strB));
                            nativeVideoTracking.t(a(nativeVideoTracking.u(), i2, str, strB));
                            nativeVideoTracking.u(a(nativeVideoTracking.u(), i2, str, strB));
                            nativeVideoTracking.v(a(nativeVideoTracking.w(), i2, str, strB));
                            nativeVideoTracking.f(a(nativeVideoTracking.f(), i2, str, strB));
                            nativeVideoTracking.g(a(nativeVideoTracking.g(), i2, str, strB));
                            nativeVideoTracking.h(a(nativeVideoTracking.h(), i2, str, strB));
                            nativeVideoTracking.i(a(nativeVideoTracking.i(), i2, str, strB));
                            nativeVideoTracking.j(a(nativeVideoTracking.j(), i2, str, strB));
                            nativeVideoTracking.l(a(nativeVideoTracking.l(), i2, str, strB));
                            nativeVideoTracking.q(a(nativeVideoTracking.r(), i2, str, strB));
                            nativeVideoTracking.m(a(nativeVideoTracking.m(), i2, str, strB));
                            nativeVideoTracking.r(a(nativeVideoTracking.s(), i2, str, strB));
                            nativeVideoTracking.n(a(nativeVideoTracking.n(), i2, str, strB));
                            nativeVideoTracking.a(b(nativeVideoTracking.o(), i2, str, strB));
                            nativeVideoTracking.p(a(nativeVideoTracking.q(), i2, str, strB));
                            nativeVideoTracking.o(a(nativeVideoTracking.p(), i2, str, strB));
                            campaignExA.setNativeVideoTracking(nativeVideoTracking);
                            campaignExA.setNativeVideoTrackingString(CampaignEx.object2TrackingStr(nativeVideoTracking));
                        }
                        campaignExA.setPv_urls(a(campaignExA.getPv_urls(), i2, str, strB));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public b a() {
        b bVar = new b();
        try {
            JSONArray jSONArray = this.f1610a;
            if (jSONArray == null || jSONArray.length() == 0) {
                bVar.d("setting config is null");
                bVar.a(com.mbridge.msdk.foundation.cache.c.i);
                return bVar;
            }
        } catch (Exception unused) {
            bVar.d("checkConfigAndDB exception");
            bVar.a(com.mbridge.msdk.foundation.cache.c.k);
        }
        return bVar;
    }

    public List<com.mbridge.msdk.newreward.function.core.campaign.b> a(int i, int i2, String str) {
        if (i >= 0) {
            a(i);
        }
        return com.mbridge.msdk.newreward.function.database.c.c().a().a(i2, str, this.c, true, 0, "");
    }

    private String a(String str, int i, String str2, String str3) {
        if (TextUtils.isEmpty(str) || str.contains("ca_sce") || str.contains("real_rid") || str.contains("real_bp")) {
            return str;
        }
        if (z0.c(str) > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("&ca_sce=");
            sb.append(i);
            sb.append("&real_rid=");
            sb.append(str2);
            return DM.m(sb, "&real_bp=", str3);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("?ca_sce=");
        sb2.append(i);
        sb2.append("&real_rid=");
        sb2.append(str2);
        return DM.m(sb2, "&real_bp=", str3);
    }

    private String a(Map<Integer, String> map, int i, String str, String str2) {
        if (map == null || map.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                String value = entry.getValue();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(CampaignEx.JSON_AD_IMP_KEY, entry.getKey());
                jSONObject.put("url", a(value, i, str, str2));
                jSONArray.put(jSONObject);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return jSONArray.toString();
    }

    private String[] a(String[] strArr, int i, String str, String str2) {
        if (strArr == null || strArr.length == 0) {
            return strArr;
        }
        String[] strArr2 = new String[strArr.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            strArr2[i2] = a(strArr[i2], i, str, str2);
        }
        return strArr2;
    }

    private List<String> a(List<String> list, int i, String str, String str2) {
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            arrayList.add(a(list.get(i2), i, str, str2));
        }
        return arrayList;
    }

    public void a(e eVar) {
        this.f = eVar;
    }

    public void a(com.mbridge.msdk.newreward.function.command.c cVar) {
        this.g = cVar;
    }

    public void a(String str, String str2, int i, double d) {
        if (d == 0.0d) {
            return;
        }
        try {
            if (i == 1) {
                a(h, 3, null, true, str2, str, -1, this.c);
            } else if (i == 2) {
                a(h, 1, null, true, str2, str, -1, this.c);
            } else if (i != 3) {
            } else {
                a(h, 4, null, true, str2, str, -1, this.c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void a(int i, int i2, List<CampaignEx> list, boolean z, String str, String str2, int i3, String str3) {
        String currentLocalRid;
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        try {
            eVar.a("type", i2 + "");
            eVar.a("result", z ? "1" : "2");
            eVar.a("max_usage_limit", i3 + "");
            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, str3 + "");
            eVar.a(com.umeng.ccg.a.j, "db");
            JSONObject jSONObject = this.b;
            if (jSONObject != null) {
                eVar.a("config", jSONObject.toString());
            }
            if (i2 == 1 && TextUtils.isEmpty(str2)) {
                try {
                    List<com.mbridge.msdk.newreward.function.core.campaign.b> listA = com.mbridge.msdk.newreward.function.database.c.c().a().a(this.d, this.e, str3, true, 0, "");
                    JSONArray jSONArray = new JSONArray();
                    if (listA != null && listA.size() > 0) {
                        for (int i4 = 0; i4 < listA.size(); i4++) {
                            com.mbridge.msdk.newreward.function.core.campaign.b bVar = listA.get(i4);
                            if (bVar != null) {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("rid", bVar.t());
                                jSONObject2.put("ts", bVar.z());
                                jSONObject2.put("lrid", bVar.p());
                                jSONObject2.put("ecppv", i0.b(bVar.k() + ""));
                                jSONObject2.put("state", bVar.A());
                                jSONObject2.put("showCount", bVar.y());
                                jSONObject2.put("interval_ts", bVar.n());
                                jSONArray.put(jSONObject2);
                            }
                        }
                    }
                    eVar.a("cache", jSONArray.toString());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            com.mbridge.msdk.foundation.same.report.metrics.c cVarA = null;
            if (list == null || list.size() <= 0) {
                currentLocalRid = str2;
            } else {
                try {
                    JSONArray jSONArray2 = new JSONArray();
                    CampaignEx campaignEx = list.get(0);
                    if (campaignEx != null) {
                        currentLocalRid = campaignEx.getCurrentLocalRid();
                        try {
                            cVarA = d.b().a(currentLocalRid);
                        } catch (JSONException e2) {
                            e = e2;
                            e.printStackTrace();
                        }
                    } else {
                        currentLocalRid = str2;
                    }
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        CampaignEx campaignEx2 = list.get(i5);
                        if (campaignEx2 != null) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("rid", campaignEx2.getRequestId());
                            jSONObject3.put("rid_n", campaignEx2.getRequestIdNotice());
                            jSONArray2.put(jSONObject3);
                        }
                    }
                    eVar.a("c_info", jSONArray2.toString());
                } catch (JSONException e3) {
                    e = e3;
                    currentLocalRid = str2;
                }
            }
            eVar.a("rid", str);
            eVar.a("lrid", currentLocalRid);
            if (cVarA == null) {
                new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            com.mbridge.msdk.newreward.function.command.c cVar = this.g;
            cVar.a(this.f, f.METRICS_KEY_M_CANDIDATE_DB, cVar.a("metrics_data", eVar));
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }
}
