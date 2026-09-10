package com.smartdigimkt.f3;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f35012i = 1000;
    public static final int j = 1000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, Integer> f35013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, com.smartdigimkt.d3.c> f35014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f35015c;
    private long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f35016e;
    private long f;
    private long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f35017h;

    public void a(long j2) {
        this.f35017h = j2;
    }

    public void b(long j2) {
        this.f = j2;
    }

    public void c(long j2) {
        this.f35015c = j2;
    }

    public void d(long j2) {
        this.f35016e = j2;
    }

    public long e() {
        return this.f35015c * 1000;
    }

    public long f() {
        return this.f35016e * 1000;
    }

    public Map<String, com.smartdigimkt.d3.c> g() {
        return this.f35014b;
    }

    public long h() {
        return this.d * 1000;
    }

    public long i() {
        return this.g;
    }

    public JSONObject j() {
        JSONObject jSONObject = new JSONObject();
        try {
            Map<String, Integer> map = this.f35013a;
            if (map != null && map.size() > 0) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry<String, Integer> entry : this.f35013a.entrySet()) {
                        jSONObject2.put(entry.getKey(), entry.getValue().intValue());
                    }
                    jSONObject.put(b.f35031a, jSONObject2);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            Map<String, com.smartdigimkt.d3.c> map2 = this.f35014b;
            if (map2 != null && map2.size() > 0) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry<String, com.smartdigimkt.d3.c> entry2 : this.f35014b.entrySet()) {
                        JSONObject jSONObject3 = new JSONObject();
                        String key = entry2.getKey();
                        com.smartdigimkt.d3.c value = entry2.getValue();
                        if (value != null) {
                            jSONObject3.put("name", value.c());
                            jSONObject3.put("amount", value.a());
                            jSONObject3.put("id", key);
                        }
                        jSONArray.put(jSONObject3);
                    }
                    jSONObject.put("reward", jSONArray);
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
            jSONObject.put("getpf", this.f35015c);
            jSONObject.put(b.x, this.d);
            jSONObject.put("plct", this.f35016e);
            jSONObject.put("dlct", this.f);
            jSONObject.put(b.f35018A, this.g);
            jSONObject.put("current_time", this.f35017h);
            return jSONObject;
        } catch (Exception e4) {
            e4.printStackTrace();
            return jSONObject;
        }
    }

    public static final a c() {
        a aVar = new a();
        HashMap map = new HashMap(5);
        map.put("1", 1000);
        map.put(b.j, 1000);
        map.put("8", 1000);
        HashMap map2 = new HashMap(3);
        map2.put("1", new com.smartdigimkt.d3.c("Virtual Item", 1));
        aVar.a(map);
        aVar.b(map2);
        aVar.c(43200L);
        aVar.e(5400L);
        aVar.d(com.smartdigimkt.o1.b.f37307P);
        aVar.b(com.smartdigimkt.o1.b.f37307P);
        aVar.f(5L);
        return aVar;
    }

    public Map<String, Integer> a() {
        if (this.f35013a == null) {
            HashMap map = new HashMap();
            this.f35013a = map;
            map.put("1", 1000);
            this.f35013a.put(b.j, 1000);
            this.f35013a.put("8", 1000);
        }
        return this.f35013a;
    }

    public long b() {
        return this.f35017h;
    }

    public long d() {
        return this.f;
    }

    public void e(long j2) {
        this.d = j2;
    }

    public void f(long j2) {
        this.g = j2;
    }

    public void b(Map<String, com.smartdigimkt.d3.c> map) {
        this.f35014b = map;
    }

    public void a(Map<String, Integer> map) {
        this.f35013a = map;
    }

    public static a a(String str) {
        a aVar = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                a aVar2 = new a();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(b.f35031a);
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
                    aVar2.b(com.smartdigimkt.d3.c.a(jSONObject.optJSONArray("reward")));
                    aVar2.c(jSONObject.optLong("getpf", 43200L));
                    aVar2.e(jSONObject.optLong(b.x, 5400L));
                    aVar2.d(jSONObject.optLong("plct", com.smartdigimkt.o1.b.f37307P));
                    aVar2.b(jSONObject.optLong("dlct", com.smartdigimkt.o1.b.f37307P));
                    aVar2.f(jSONObject.optLong(b.f35018A, 5L));
                    aVar2.a(jSONObject.optLong("current_time"));
                    return aVar2;
                } catch (Exception e2) {
                    e = e2;
                    aVar = aVar2;
                    e.printStackTrace();
                    return aVar;
                }
            } catch (Exception e3) {
                e = e3;
            }
        }
        return aVar;
    }
}
