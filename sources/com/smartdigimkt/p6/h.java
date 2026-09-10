package com.smartdigimkt.p6;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f37701a = com.smartdigimkt.m3.h.f36614b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Map<String, Integer> f37702b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Map<String, Integer> f37703c = new ConcurrentHashMap();
    int d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f37704e = 0;

    public synchronized void a(g gVar) {
        if (gVar != null) {
            try {
                gVar.toString();
                String strA = gVar.a();
                int iE = gVar.e();
                if (iE == 4) {
                    b(strA);
                } else if (iE == 6) {
                    a(strA);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.d++;
            this.f37702b.put(str, Integer.valueOf(a(this.f37702b, str, 0) + 1));
        }
    }

    public synchronized void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f37704e++;
            this.f37703c.put(str, Integer.valueOf(a(this.f37703c, str, 0) + 1));
        }
    }

    public synchronized void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator<Map.Entry<String, Integer>> it = this.f37702b.entrySet().iterator();
                while (it.hasNext()) {
                    String key = it.next().getKey();
                    int iA = a(this.f37702b, key, 0);
                    int iA2 = a(this.f37703c, key, 0);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("dsp_id", key);
                    jSONObject2.put("show_c", iA);
                    jSONObject2.put("click_c", iA2);
                    jSONArray.put(jSONObject2);
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("ad_fc", jSONArray);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private int a(Map<String, Integer> map, String str, int i2) {
        Integer num;
        return (map == null || (num = map.get(str)) == null) ? i2 : num.intValue();
    }
}
