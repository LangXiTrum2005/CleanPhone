package com.smartdigimkt.p6;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f37644e = "a";
    private static volatile a f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ConcurrentHashMap<String, Long> f37645a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ConcurrentHashMap<String, Long> f37646b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Map<String, C0565a> f37647c = new ConcurrentHashMap(5);
    Map<String, com.smartdigimkt.w6.i> d;

    /* JADX INFO: renamed from: com.smartdigimkt.p6.a$a, reason: collision with other inner class name */
    public static class C0565a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f37648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f37649b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f37650c;
    }

    private a() {
    }

    public boolean a(int i2, com.smartdigimkt.l8.e eVar, com.smartdigimkt.l8.f fVar) {
        return false;
    }

    public boolean b(com.smartdigimkt.l8.f fVar) {
        if (fVar.F0() == 0) {
            return false;
        }
        return fVar.F0() + (this.f37645a.get(fVar.h()) != null ? this.f37645a.get(fVar.h()).longValue() : 0L) >= System.currentTimeMillis();
    }

    public static a a() {
        if (f == null) {
            synchronized (a.class) {
                try {
                    if (f == null) {
                        f = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f;
    }

    public void b(String str, long j) {
        this.f37645a.put(str, Long.valueOf(j));
    }

    public void b(String str) {
        JSONObject jSONObjectOptJSONObject;
        this.d = new ConcurrentHashMap(3);
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                try {
                    String next = itKeys.next();
                    if (!TextUtils.isEmpty(next) && (jSONObjectOptJSONObject = jSONObject.optJSONObject(next)) != null) {
                        this.d.put(next, new com.smartdigimkt.w6.i(jSONObjectOptJSONObject));
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }

    public boolean a(com.smartdigimkt.l8.f fVar) {
        if (fVar.k() == 7) {
            return false;
        }
        if (fVar.p() == 0) {
            return false;
        }
        return fVar.p() + (this.f37646b.get(fVar.h()) != null ? this.f37646b.get(fVar.h()).longValue() : 0L) >= System.currentTimeMillis();
    }

    public void a(String str, long j) {
        this.f37646b.put(str, Long.valueOf(j));
    }

    public long a(String str) {
        Long l2 = this.f37646b.get(str);
        if (l2 != null) {
            return l2.longValue();
        }
        return 0L;
    }

    private boolean a(List<com.smartdigimkt.w6.i.a> list, C0565a c0565a) {
        if (c0565a != null && list != null) {
            try {
                list.toString();
                for (int i2 = 0; i2 < list.size(); i2++) {
                    com.smartdigimkt.w6.i.a aVar = list.get(i2);
                    if (aVar != null) {
                        String strA = aVar.a();
                        if (TextUtils.isEmpty(strA)) {
                            continue;
                        } else {
                            long jB = aVar.b();
                            Map<String, Long> mapC = aVar.c();
                            if (strA.equals("-88888")) {
                                if (!TextUtils.isEmpty(c0565a.f37649b) && mapC != null && !mapC.isEmpty()) {
                                    for (Map.Entry<String, Long> entry : mapC.entrySet()) {
                                        String key = entry.getKey();
                                        Long value = entry.getValue();
                                        if (value.longValue() > 0 && !TextUtils.isEmpty(key) && c0565a.f37649b.contains(key) && c0565a.f37650c + value.longValue() > System.currentTimeMillis()) {
                                            return true;
                                        }
                                    }
                                }
                            } else if (!TextUtils.isEmpty(c0565a.f37648a)) {
                                if (TextUtils.isEmpty(c0565a.f37649b)) {
                                    if (strA.equals(c0565a.f37648a) && ((mapC == null || mapC.isEmpty()) && jB > 0 && c0565a.f37650c + jB > System.currentTimeMillis())) {
                                        return true;
                                    }
                                } else if (mapC == null || mapC.isEmpty()) {
                                    if (jB > 0 && c0565a.f37650c + jB > System.currentTimeMillis()) {
                                        return true;
                                    }
                                } else {
                                    for (Map.Entry<String, Long> entry2 : mapC.entrySet()) {
                                        String key2 = entry2.getKey();
                                        Long value2 = entry2.getValue();
                                        if (value2.longValue() > 0 && !TextUtils.isEmpty(key2) && c0565a.f37649b.contains(key2) && c0565a.f37650c + value2.longValue() > System.currentTimeMillis()) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }
}
