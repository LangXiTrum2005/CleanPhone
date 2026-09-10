package com.thinkup.core.common.on;

import android.text.TextUtils;
import com.p004ironsource.ne;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class m0o extends m00 {
    private long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f42194n;
    private int o;
    private String o0;
    private List<m0m> om;
    private List<m0m> on;
    private Map<Integer, m0n> oo;

    private m0o() {
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00eb  */
    public static m0o o(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONArray jSONArrayOptJSONArray;
        m0o m0oVar = new m0o();
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("e_cwf");
            if (jSONObjectOptJSONObject != null) {
                m0oVar.o0 = jSONObjectOptJSONObject.optString("oe_ids");
                m0oVar.o = jSONObjectOptJSONObject.optInt("ss_sw");
                m0oVar.f42194n = jSONObjectOptJSONObject.optInt("sd_sw");
                m0oVar.m = jSONObjectOptJSONObject.optLong(ne.u0);
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("oe");
                if (jSONObjectOptJSONObject2 != null) {
                    Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
                    while (itKeys.hasNext()) {
                        m0n m0nVar = new m0n();
                        String next = itKeys.next();
                        JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject(next);
                        if (jSONObjectOptJSONObject3 != null) {
                            m0nVar.o(jSONObjectOptJSONObject3.optLong("t"));
                            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject3.optJSONArray("c");
                            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("c_m");
                            if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0) {
                                jSONObject2 = jSONObjectOptJSONObject2;
                            } else {
                                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                                HashMap map = new HashMap();
                                int i2 = 0;
                                while (i2 < jSONArrayOptJSONArray2.length()) {
                                    String strOptString = jSONArrayOptJSONArray2.optString(i2);
                                    copyOnWriteArrayList.add(strOptString);
                                    if (TextUtils.isEmpty(strOptString) || jSONObjectOptJSONObject4 == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject4.optJSONArray(strOptString)) == null || jSONArrayOptJSONArray.length() <= 0) {
                                        jSONObject3 = jSONObjectOptJSONObject2;
                                    } else {
                                        ArrayList arrayList = new ArrayList();
                                        int i3 = 0;
                                        while (i3 < jSONArrayOptJSONArray.length()) {
                                            Object obj = jSONArrayOptJSONArray.get(i3);
                                            JSONObject jSONObject4 = jSONObjectOptJSONObject2;
                                            if ((obj instanceof String) && !TextUtils.isEmpty((CharSequence) obj)) {
                                                arrayList.add((String) obj);
                                            }
                                            i3++;
                                            jSONObjectOptJSONObject2 = jSONObject4;
                                        }
                                        jSONObject3 = jSONObjectOptJSONObject2;
                                        if (!arrayList.isEmpty()) {
                                            map.put(strOptString, arrayList);
                                        }
                                    }
                                    i2++;
                                    jSONObjectOptJSONObject2 = jSONObject3;
                                }
                                jSONObject2 = jSONObjectOptJSONObject2;
                                m0nVar.o(copyOnWriteArrayList);
                                if (!map.isEmpty()) {
                                    m0nVar.o(map);
                                }
                            }
                        } else {
                            jSONObject2 = jSONObjectOptJSONObject2;
                        }
                        int i4 = Integer.parseInt(next);
                        m0nVar.o(i4);
                        concurrentHashMap.put(Integer.valueOf(i4), m0nVar);
                        jSONObjectOptJSONObject2 = jSONObject2;
                    }
                }
                m0oVar.oo = concurrentHashMap;
            }
        } catch (Throwable unused) {
        }
        return m0oVar;
    }

    public final boolean m() {
        return this.o == 1;
    }

    public final boolean n() {
        return this.f42194n == 1;
    }

    public final List<m0m> o0() {
        return this.om;
    }

    public final List<m0m> om() {
        return this.on;
    }

    public final String on() {
        return this.o0;
    }

    public final Map<Integer, m0n> oo() {
        return this.oo;
    }

    public final void m(List<m0m> list) {
        this.on = list;
    }

    public final boolean o() {
        return TextUtils.isEmpty(this.o0);
    }

    public final boolean o(long j) {
        return j > 0 && System.currentTimeMillis() - j < this.m;
    }

    public final void o(List<m0m> list) {
        this.om = list;
    }
}
