package com.thinkup.core.common.o;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class m0 {
    final String o = com.thinkup.core.n.m0.o;
    Map<String, Integer> m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Map<String, Integer> f42112n = new ConcurrentHashMap();
    int o0 = 0;
    int oo = 0;

    public final synchronized void m(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.oo++;
            this.f42112n.put(str, Integer.valueOf(o(this.f42112n, str) + 1));
        }
    }

    public final synchronized void o(on onVar) {
        if (onVar != null) {
            try {
                onVar.toString();
                String strM = onVar.m();
                int iO0 = onVar.o0();
                if (iO0 == 4) {
                    o(strM);
                } else if (iO0 == 6) {
                    m(strM);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void o(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.o0++;
            this.m.put(str, Integer.valueOf(o(this.m, str) + 1));
        }
    }

    public final synchronized void o(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator<Map.Entry<String, Integer>> it = this.m.entrySet().iterator();
                while (it.hasNext()) {
                    String key = it.next().getKey();
                    int iO = o(this.m, key);
                    int iO2 = o(this.f42112n, key);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("dsp_id", key);
                    jSONObject2.put("show_c", iO);
                    jSONObject2.put("click_c", iO2);
                    jSONArray.put(jSONObject2);
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("ad_fc", jSONArray);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private static int o(Map<String, Integer> map, String str) {
        Integer num;
        if (map == null || (num = map.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
