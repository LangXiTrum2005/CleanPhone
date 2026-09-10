package com.mbridge.msdk.videocommon.setting;

import android.text.TextUtils;
import com.ironsource.C0594u;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, Integer> f38294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, com.mbridge.msdk.videocommon.entity.c> f38295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f38296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f38297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f38298e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f38299f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f38300g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f38301h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f38303j;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f38302i = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f38304k = "";
    private String l = "";

    public String a() {
        return this.f38303j;
    }

    public void b(String str) {
        this.f38303j = str;
    }

    public void c(String str) {
        this.l = str;
    }

    public void d(String str) {
        this.f38304k = str;
    }

    public void e(long j10) {
        this.f38297d = j10;
    }

    public String f() {
        return this.l;
    }

    public Map<String, com.mbridge.msdk.videocommon.entity.c> g() {
        return this.f38295b;
    }

    public long h() {
        return this.f38297d * 1000;
    }

    public long i() {
        return this.f38300g;
    }

    public String j() {
        return this.f38304k;
    }

    public JSONObject k() {
        JSONObject jSONObject = new JSONObject();
        try {
            Map<String, Integer> map = this.f38294a;
            if (map != null && map.size() > 0) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry<String, Integer> entry : this.f38294a.entrySet()) {
                        jSONObject2.put(entry.getKey(), entry.getValue().intValue());
                    }
                    jSONObject.put("caplist", jSONObject2);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            Map<String, com.mbridge.msdk.videocommon.entity.c> map2 = this.f38295b;
            if (map2 != null && map2.size() > 0) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry<String, com.mbridge.msdk.videocommon.entity.c> entry2 : this.f38295b.entrySet()) {
                        JSONObject jSONObject3 = new JSONObject();
                        String key = entry2.getKey();
                        com.mbridge.msdk.videocommon.entity.c value = entry2.getValue();
                        if (value != null) {
                            jSONObject3.put("name", value.c());
                            jSONObject3.put("amount", value.a());
                            jSONObject3.put("id", key);
                        }
                        jSONArray.put(jSONObject3);
                    }
                    jSONObject.put(C0594u.f30746j, jSONArray);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            jSONObject.put("getpf", this.f38296c);
            jSONObject.put("ruct", this.f38297d);
            jSONObject.put(CampaignEx.JSON_KEY_PLCT, this.f38298e);
            jSONObject.put("dlct", this.f38299f);
            jSONObject.put("vcct", this.f38300g);
            jSONObject.put("current_time", this.f38301h);
            jSONObject.put("vtag", this.f38304k);
            jSONObject.put("isDefault", this.f38302i);
            return jSONObject;
        } catch (Exception e12) {
            e12.printStackTrace();
            return jSONObject;
        }
    }

    public void a(long j10) {
        this.f38301h = j10;
    }

    public void b(long j10) {
        this.f38299f = j10;
    }

    public void c(long j10) {
        this.f38296c = j10;
    }

    public long d() {
        return this.f38296c * 1000;
    }

    public long e() {
        return this.f38298e * 1000;
    }

    public void f(long j10) {
        this.f38300g = j10;
    }

    public void a(Map<String, Integer> map) {
        this.f38294a = map;
    }

    public long b() {
        return this.f38301h;
    }

    public long c() {
        return this.f38299f;
    }

    public void d(long j10) {
        this.f38298e = j10;
    }

    public void a(int i10) {
        this.f38302i = i10;
    }

    public void b(Map<String, com.mbridge.msdk.videocommon.entity.c> map) {
        this.f38295b = map;
    }

    public static a a(String str) {
        a aVar = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                a aVar2 = new a();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("caplist");
                    aVar2.b(jSONObject.optString("ab_id", ""));
                    aVar2.c(jSONObject.optString("rid", ""));
                    if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
                        HashMap map = new HashMap();
                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                        while (itKeys != null && itKeys.hasNext()) {
                            String next = itKeys.next();
                            int iOptInt = jSONObjectOptJSONObject.optInt(next, 1000);
                            if (!TextUtils.isEmpty(next)) {
                                if (!TextUtils.isEmpty(next) && iOptInt == 0) {
                                    map.put(next, 1000);
                                } else {
                                    map.put(next, Integer.valueOf(iOptInt));
                                }
                            }
                        }
                        aVar2.a(map);
                    }
                    aVar2.b(com.mbridge.msdk.videocommon.entity.c.a(jSONObject.optJSONArray(C0594u.f30746j)));
                    aVar2.c(jSONObject.optLong("getpf", 43200L));
                    aVar2.e(jSONObject.optLong("ruct", 5400L));
                    aVar2.d(jSONObject.optLong(CampaignEx.JSON_KEY_PLCT, 3600L));
                    aVar2.b(jSONObject.optLong("dlct", 3600L));
                    aVar2.f(jSONObject.optLong("vcct", 5L));
                    aVar2.a(jSONObject.optLong("current_time"));
                    aVar2.d(jSONObject.optString("vtag", ""));
                    return aVar2;
                } catch (Exception e10) {
                    e = e10;
                    aVar = aVar2;
                    e.printStackTrace();
                    return aVar;
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
        return aVar;
    }
}
