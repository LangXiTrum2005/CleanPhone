package com.smartdigimkt.c0;

import android.text.TextUtils;
import com.smartdigimkt.v0.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f34024a = "f";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f34025b = "native";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f34026c = "reward";
    public static final String d = "interactive";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f34027e = "interstitial";
    public static final String f = "banner";
    public static final String g = "splash";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f34028h = "h5_native";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Map<String, Long> f34029i = new HashMap();
    public static Map<String, List<com.smartdigimkt.g0.a>> j = new HashMap();
    public static Map<String, List<com.smartdigimkt.g0.a>> k = new HashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static Map<String, List<com.smartdigimkt.g0.a>> f34030l = new HashMap();
    public static Map<String, List<com.smartdigimkt.g0.a>> m = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static Map<String, List<com.smartdigimkt.g0.a>> f34031n = new HashMap();
    public static Map<String, List<com.smartdigimkt.g0.a>> o = new HashMap();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static Map<String, List<com.smartdigimkt.g0.a>> f34032p = new HashMap();
    public static Map<String, List<com.smartdigimkt.g0.a>> q = new HashMap();

    public static void a(String str, com.smartdigimkt.x.d dVar, String str2) {
        Map<String, List<com.smartdigimkt.g0.a>> mapB = b(str2);
        if (dVar == null || mapB == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(dVar.j())) {
                return;
            }
            com.smartdigimkt.g0.a aVar = new com.smartdigimkt.g0.a(dVar.j(), dVar.N1());
            if (!mapB.containsKey(str)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(aVar);
                mapB.put(str, arrayList);
                return;
            }
            List<com.smartdigimkt.g0.a> list = mapB.get(str);
            if (list != null && list.size() == 20) {
                list.remove(0);
            }
            if (list != null) {
                list.add(aVar);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static void b(String str, com.smartdigimkt.x.d dVar, String str2) {
        Map<String, List<com.smartdigimkt.g0.a>> mapB = b(str2);
        if (dVar == null || mapB == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(dVar.j())) {
                return;
            }
            com.smartdigimkt.g0.a aVar = new com.smartdigimkt.g0.a(dVar.j(), dVar.N1());
            if (!mapB.containsKey(str)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(aVar);
                mapB.put(str, arrayList);
            } else {
                List<com.smartdigimkt.g0.a> list = mapB.get(str);
                if (list != null) {
                    list.add(aVar);
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private static Map<String, List<com.smartdigimkt.g0.a>> b(String str) {
        str.getClass();
        switch (str) {
            case "banner":
                return o;
            case "native":
                return k;
            case "reward":
                return f34030l;
            case "splash":
                return f34032p;
            case "h5_native":
                return q;
            case "interstitial":
                return f34031n;
            case "interactive":
                return m;
            default:
                return null;
        }
    }

    public static String a(String str, String str2) {
        Map<String, List<com.smartdigimkt.g0.a>> mapB;
        List<com.smartdigimkt.g0.a> list;
        JSONArray jSONArray = new JSONArray();
        if (TextUtils.isEmpty(str2)) {
            mapB = a(str);
        } else {
            mapB = b(str2);
        }
        if (mapB != null) {
            try {
                if (y.b(str) && mapB.containsKey(str) && (list = mapB.get(str)) != null && list.size() > 0) {
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("cid", list.get(i2).a());
                        jSONObject.put("rid", list.get(i2).c());
                        jSONArray.put(jSONObject);
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return jSONArray.toString();
    }

    public static void a(Map... mapArr) {
        try {
            for (Map map : mapArr) {
                if (map != null) {
                    map.clear();
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private static Map<String, List<com.smartdigimkt.g0.a>> a(String str) {
        if (k.containsKey(str)) {
            return k;
        }
        if (f34030l.containsKey(str)) {
            return f34030l;
        }
        if (m.containsKey(str)) {
            return m;
        }
        if (f34031n.containsKey(str)) {
            return f34031n;
        }
        if (o.containsKey(str)) {
            return o;
        }
        if (f34032p.containsKey(str)) {
            return f34032p;
        }
        if (q.containsKey(str)) {
            return q;
        }
        return null;
    }
}
