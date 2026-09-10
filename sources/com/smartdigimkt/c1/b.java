package com.smartdigimkt.c1;

import android.content.Context;
import android.text.TextUtils;
import com.p004ironsource.d9;
import com.smartdigimkt.c0.f;
import com.smartdigimkt.v0.v;
import com.smartdigimkt.v0.y;
import com.smartdigimkt.x.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f34040a = "b";

    public static void a(Context context, List<d> list) {
    }

    public static String a(String str) {
        List<com.smartdigimkt.g0.a> list;
        try {
            Map<String, List<com.smartdigimkt.g0.a>> map = f.j;
            if (map == null || !y.b(str) || !map.containsKey(str) || (list = map.get(str)) == null || list.size() <= 0) {
                return "";
            }
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 0; i2 < list.size(); i2++) {
                JSONObject jSONObject = new JSONObject();
                com.smartdigimkt.g0.a aVar = list.get(i2);
                jSONObject.put("cid", aVar.a());
                jSONObject.put(com.smartdigimkt.q0.b.m, aVar.b());
                jSONArray.put(jSONObject);
            }
            return jSONArray.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static void a(String str, List<d> list) {
        Map<String, List<com.smartdigimkt.g0.a>> map = f.j;
        if (map == null || list == null || list.size() <= 0) {
            return;
        }
        if (y.b(str)) {
            if (map.containsKey(str)) {
                map.put(str, a(map.get(str), list));
            } else {
                map.put(str, a(new ArrayList(), list));
            }
        }
        f.j = map;
    }

    private static synchronized List<com.smartdigimkt.g0.a> a(List<com.smartdigimkt.g0.a> list, List<d> list2) {
        if (list2 != null) {
            try {
                if (list2.size() > 0) {
                    if (list == null) {
                        list = new ArrayList<>();
                    }
                    for (d dVar : list2) {
                        if (dVar != null) {
                            com.smartdigimkt.g0.a aVar = new com.smartdigimkt.g0.a(dVar.j(), dVar.r0());
                            if (list.size() >= 20) {
                                list.remove(0);
                            }
                            list.add(aVar);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return list;
    }

    public static d a(String str, d dVar) {
        String strValueOf;
        String strValueOf2;
        if (TextUtils.isEmpty(str)) {
            return dVar;
        }
        if (TextUtils.isEmpty(str) && dVar == null) {
            return null;
        }
        if (!str.contains("notice")) {
            try {
                JSONObject jSONObjectB = d.b(dVar);
                d dVarB = d.b(jSONObjectB);
                if (dVarB == null) {
                    dVarB = dVar;
                }
                if (!TextUtils.isEmpty(str)) {
                    String strOptString = jSONObjectB.optString("unitId");
                    if (!TextUtils.isEmpty(strOptString)) {
                        dVarB.G(strOptString);
                    }
                    JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject(com.smartdigimkt.b0.a.i2);
                    if (jSONObjectOptJSONObject != null) {
                        strValueOf = String.valueOf(v.a(com.smartdigimkt.m6.b.p().k(), Integer.valueOf(jSONObjectOptJSONObject.getString(com.smartdigimkt.b0.a.g2)).intValue()));
                        strValueOf2 = String.valueOf(v.a(com.smartdigimkt.m6.b.p().k(), Integer.valueOf(jSONObjectOptJSONObject.getString(com.smartdigimkt.b0.a.h2)).intValue()));
                    } else {
                        strValueOf = "-999";
                        strValueOf2 = "-999";
                    }
                    dVarB.H(com.smartdigimkt.o.b.a(dVarB.p0(), strValueOf, strValueOf2));
                    String strR1 = dVarB.r1();
                    if (jSONObjectOptJSONObject != null) {
                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                        StringBuilder sb = new StringBuilder();
                        while (itKeys.hasNext()) {
                            sb.append(d9.i.f24749c);
                            String next = itKeys.next();
                            String strOptString2 = jSONObjectOptJSONObject.optString(next);
                            if (com.smartdigimkt.b0.a.g2.equals(next) || com.smartdigimkt.b0.a.h2.equals(next)) {
                                strOptString2 = String.valueOf(v.a(com.smartdigimkt.m6.b.p().k(), Integer.valueOf(strOptString2).intValue()));
                            }
                            sb.append(next);
                            sb.append(d9.i.f24747b);
                            sb.append(strOptString2);
                        }
                        dVarB.g0(strR1 + ((Object) sb));
                    }
                }
                return dVarB;
            } catch (Throwable unused) {
                return dVar;
            }
        }
        try {
            JSONObject jSONObjectB2 = d.b(dVar);
            JSONObject jSONObject = new JSONObject(str);
            try {
                if (!jSONObject.has("deep_link")) {
                    jSONObjectB2.put("deep_link", "");
                }
            } catch (Exception unused2) {
            }
            Iterator<String> itKeys2 = jSONObject.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                jSONObjectB2.put(next2, jSONObject.getString(next2));
            }
            d dVarB2 = d.b(jSONObjectB2);
            String strOptString3 = jSONObjectB2.optString("unitId");
            if (!TextUtils.isEmpty(strOptString3)) {
                dVarB2.G(strOptString3);
            }
            return dVarB2;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return dVar;
        }
    }
}
