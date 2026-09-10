package com.mbridge.msdk.foundation.same.buffer;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.db.e;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.c;
import com.mbridge.msdk.foundation.entity.d;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f33745a = "b";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static ConcurrentHashMap<String, ConcurrentHashMap<String, c>> f33749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static ConcurrentHashMap<String, ConcurrentHashMap<String, String>> f33750f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static ConcurrentHashMap<String, CopyOnWriteArrayList<String>> f33751g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Map<String, List<com.mbridge.msdk.foundation.same.metadata.a>> f33746b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Map<String, List<com.mbridge.msdk.foundation.same.metadata.a>> f33747c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Map<String, List<com.mbridge.msdk.foundation.same.metadata.a>> f33748d = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Map<String, List<com.mbridge.msdk.foundation.same.metadata.a>> f33752h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Map<String, List<com.mbridge.msdk.foundation.same.metadata.a>> f33753i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Map<String, List<com.mbridge.msdk.foundation.same.metadata.a>> f33754j = new HashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Map<String, List<com.mbridge.msdk.foundation.same.metadata.a>> f33755k = new HashMap();
    public static Map<String, Long> l = new HashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static Map<String, List<com.mbridge.msdk.foundation.same.metadata.a>> f33756m = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static Map<String, List<com.mbridge.msdk.foundation.same.metadata.a>> f33757n = new HashMap();

    public static void a(String str, String str2, String str3, long j10, long j11, long j12, String str4) {
        if (f33749e == null) {
            f33749e = new ConcurrentHashMap<>();
        }
        try {
            if (!f33749e.containsKey(str)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(str3);
                ConcurrentHashMap<String, c> concurrentHashMap = new ConcurrentHashMap<>();
                c cVar = new c();
                cVar.a(arrayList);
                cVar.a(j10);
                cVar.b(j11);
                cVar.c(j12);
                cVar.c(str4);
                concurrentHashMap.put(str2, cVar);
                f33749e.put(str, concurrentHashMap);
                return;
            }
            ConcurrentHashMap<String, c> concurrentHashMap2 = f33749e.get(str);
            if (concurrentHashMap2 != null) {
                c cVar2 = concurrentHashMap2.get(str2);
                if (cVar2 != null) {
                    if (cVar2.c() != null) {
                        cVar2.a(j10);
                        cVar2.b(j11);
                        cVar2.c(j12);
                        cVar2.c().add(str3);
                        cVar2.c(str4);
                        return;
                    }
                    return;
                }
                c cVar3 = new c();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(str3);
                cVar3.a(arrayList2);
                cVar3.a(j10);
                cVar3.b(j11);
                cVar3.c(j12);
                cVar3.c(str4);
                concurrentHashMap2.put(str2, cVar3);
            }
        } catch (Throwable th2) {
            q0.b(f33745a, th2.getMessage());
        }
    }

    private static Map<String, List<com.mbridge.msdk.foundation.same.metadata.a>> b(String str) {
        str.getClass();
        switch (str) {
            case "banner":
                return f33747c;
            case "native":
                return f33754j;
            case "reward":
                return f33755k;
            case "splash":
                return f33756m;
            case "h5_native":
                return f33748d;
            case "interstitial":
                return f33753i;
            case "interactive":
                return f33752h;
            default:
                return null;
        }
    }

    public static ConcurrentHashMap<String, c> c(String str) {
        ConcurrentHashMap<String, ConcurrentHashMap<String, c>> concurrentHashMap = f33749e;
        if (concurrentHashMap == null) {
            e eVarA = e.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
            if (eVarA != null) {
                eVarA.b(str, "");
                f33749e = new ConcurrentHashMap<>();
                return null;
            }
        } else if (concurrentHashMap.containsKey(str)) {
            return f33749e.get(str);
        }
        return null;
    }

    public static String d(String str) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<String>> concurrentHashMap;
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        return (TextUtils.isEmpty(str) || (concurrentHashMap = f33751g) == null || !concurrentHashMap.containsKey(str) || (copyOnWriteArrayList = f33751g.get(str)) == null || copyOnWriteArrayList.size() <= 0) ? "" : copyOnWriteArrayList.get(0);
    }

    public static void e(String str) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<String>> concurrentHashMap;
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        if (TextUtils.isEmpty(str) || (concurrentHashMap = f33751g) == null || !concurrentHashMap.containsKey(str) || (copyOnWriteArrayList = f33751g.get(str)) == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        copyOnWriteArrayList.remove(0);
    }

    public static void c(String str, String str2) {
        ConcurrentHashMap<String, ConcurrentHashMap<String, c>> concurrentHashMap;
        c cVarRemove;
        if (TextUtils.isEmpty(str) || (concurrentHashMap = f33749e) == null || !concurrentHashMap.containsKey(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            f33749e.remove(str);
            return;
        }
        ConcurrentHashMap<String, c> concurrentHashMap2 = f33749e.get(str);
        if (concurrentHashMap2 == null || !concurrentHashMap2.containsKey(str2) || (cVarRemove = concurrentHashMap2.remove(str2)) == null) {
            return;
        }
        try {
            String strD = cVarRemove.d();
            if (TextUtils.isEmpty(strD)) {
                return;
            }
            Iterator<Map.Entry<String, c>> it = concurrentHashMap2.entrySet().iterator();
            while (it.hasNext()) {
                if (strD.equals(it.next().getValue().d())) {
                    it.remove();
                }
            }
        } catch (Exception e10) {
            q0.a(f33745a, e10.getMessage());
        }
    }

    public static void d(String str, String str2) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            ConcurrentHashMap<String, ConcurrentHashMap<String, String>> concurrentHashMap2 = f33750f;
            if (concurrentHashMap2 == null || !concurrentHashMap2.containsKey(str) || (concurrentHashMap = f33750f.get(str2)) == null || !concurrentHashMap.containsKey(str2)) {
                return;
            }
            concurrentHashMap.remove(str2);
        } catch (Exception e10) {
            q0.a(f33745a, e10.getMessage());
        }
    }

    public static d b(String str, String str2) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        d dVar = new d();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                ConcurrentHashMap<String, ConcurrentHashMap<String, String>> concurrentHashMap2 = f33750f;
                if (concurrentHashMap2 != null && concurrentHashMap2.containsKey(str) && (concurrentHashMap = f33750f.get(str)) != null && concurrentHashMap.containsKey(str2)) {
                    dVar.a(1);
                    dVar.c(concurrentHashMap.get(str2));
                    return dVar;
                }
            } catch (Exception e10) {
                q0.a(f33745a, e10.getMessage());
                return dVar;
            }
        }
        return dVar;
    }

    public static void a(String str, String str2, int i10) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return;
        }
        if (f33751g == null) {
            f33751g = new ConcurrentHashMap<>();
        }
        try {
            if (f33751g.containsKey(str)) {
                copyOnWriteArrayList = f33751g.get(str);
                copyOnWriteArrayList.add(str2);
            } else {
                CopyOnWriteArrayList<String> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                copyOnWriteArrayList2.add(str2);
                f33751g.put(str, copyOnWriteArrayList2);
                copyOnWriteArrayList = copyOnWriteArrayList2;
            }
            int size = copyOnWriteArrayList.size() - i10;
            if (size >= 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    copyOnWriteArrayList.remove(i11);
                }
            }
        } catch (Exception e10) {
            q0.a(f33745a, e10.getMessage());
        }
    }

    public static void a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        try {
            if (f33750f == null) {
                f33750f = new ConcurrentHashMap<>();
            }
            if (f33750f.containsKey(str)) {
                if (f33750f.get(str) == null) {
                    ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
                    concurrentHashMap.put(str2, str3);
                    f33750f.put(str, concurrentHashMap);
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, String> concurrentHashMap2 = new ConcurrentHashMap<>();
            concurrentHashMap2.put(str2, str3);
            f33750f.put(str, concurrentHashMap2);
        } catch (Exception e10) {
            q0.a(f33745a, e10.getMessage());
        }
    }

    public static String a(String str, String str2) {
        Map<String, List<com.mbridge.msdk.foundation.same.metadata.a>> mapB;
        List<com.mbridge.msdk.foundation.same.metadata.a> list;
        JSONArray jSONArray = new JSONArray();
        if (TextUtils.isEmpty(str2)) {
            mapB = a(str);
        } else {
            mapB = b(str2);
        }
        if (mapB != null) {
            try {
                if (a1.b(str) && mapB.containsKey(str) && (list = mapB.get(str)) != null && list.size() > 0) {
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("2", list.get(i10).a());
                        jSONObject.put("1", list.get(i10).c());
                        jSONArray.put(jSONObject);
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return jSONArray.toString();
    }

    private static Map<String, List<com.mbridge.msdk.foundation.same.metadata.a>> a(String str) {
        if (f33754j.containsKey(str)) {
            return f33754j;
        }
        if (f33755k.containsKey(str)) {
            return f33755k;
        }
        if (f33752h.containsKey(str)) {
            return f33752h;
        }
        if (f33757n.containsKey(str)) {
            return f33757n;
        }
        if (f33753i.containsKey(str)) {
            return f33753i;
        }
        if (f33747c.containsKey(str)) {
            return f33747c;
        }
        if (f33756m.containsKey(str)) {
            return f33756m;
        }
        if (f33748d.containsKey(str)) {
            return f33748d;
        }
        return null;
    }

    public static void a(String str, CampaignEx campaignEx, String str2) {
        Map<String, List<com.mbridge.msdk.foundation.same.metadata.a>> mapB = b(str2);
        if (campaignEx == null || mapB == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(campaignEx.getId())) {
                return;
            }
            com.mbridge.msdk.foundation.same.metadata.a aVar = new com.mbridge.msdk.foundation.same.metadata.a(campaignEx.getId(), campaignEx.getRequestIdNotice());
            if (mapB.containsKey(str)) {
                List<com.mbridge.msdk.foundation.same.metadata.a> list = mapB.get(str);
                if (list != null && list.size() == 20) {
                    list.remove(0);
                }
                if (list != null) {
                    list.add(aVar);
                    return;
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(aVar);
            mapB.put(str, arrayList);
        } catch (Throwable th2) {
            q0.b(f33745a, th2.getMessage(), th2);
        }
    }
}
