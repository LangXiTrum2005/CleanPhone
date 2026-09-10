package com.smartdigimkt.v0;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.p004ironsource.d9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f38994a = "SameCommon";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f38995b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f38996c = 1;
    public static final String d = "mbridge.msdk.db";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f38997e = 30000;
    public static final int f = 60000;
    public static final int g = 60000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f38998h = 60000;

    public static abstract class a {
        public abstract void a(String str, com.smartdigimkt.q0.e eVar);
    }

    public static long a(long j, long j2) {
        return j >= 0 ? j : j2;
    }

    public static String a(List<com.smartdigimkt.x.d> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (com.smartdigimkt.x.d dVar : list) {
            if (dVar != null && dVar.r0() != 0) {
                arrayList.add(dVar);
            }
        }
        if (arrayList.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            try {
                com.smartdigimkt.x.d dVar2 = (com.smartdigimkt.x.d) arrayList.get(i2);
                if (dVar2 != null) {
                    long jR0 = dVar2.r0();
                    if (i2 == arrayList.size() - 1) {
                        sb.append(jR0);
                    } else {
                        sb.append(jR0);
                        sb.append(",");
                    }
                }
            } catch (Exception unused) {
            }
        }
        return sb.toString();
    }

    public static boolean a(Context context, com.smartdigimkt.x.d dVar) {
        if (context == null || dVar == null) {
            return false;
        }
        return v.b(dVar) || dVar.y2() == 1 || !v.a(context, dVar.n());
    }

    public static void a(com.smartdigimkt.x.d dVar, Context context, com.smartdigimkt.q0.e eVar, a aVar) {
        a(dVar, context, eVar, aVar, 1);
    }

    public static void a(com.smartdigimkt.x.d dVar, Context context, com.smartdigimkt.q0.e eVar, a aVar, int i2) {
        int i3;
        if (dVar == null || aVar == null) {
            return;
        }
        if (eVar == null) {
            try {
                eVar = new com.smartdigimkt.q0.e();
            } catch (Exception e2) {
                if (com.smartdigimkt.b.b.f33800a) {
                    e2.printStackTrace();
                    return;
                }
                return;
            }
        }
        boolean zB = v.b(dVar);
        int iB = v.b(context, dVar.n());
        if (context != null) {
            try {
                i3 = d.a(context) ? 1 : 2;
            } catch (Exception e3) {
                e3.getMessage();
                i3 = 0;
            }
        } else {
            i3 = 0;
        }
        com.smartdigimkt.q0.f fVar = new com.smartdigimkt.q0.f();
        fVar.a("cid", dVar.j());
        fVar.a("wtick", Integer.valueOf(dVar.y2()));
        fVar.a("retarget_offer", Integer.valueOf(dVar.P1()));
        fVar.a(com.smartdigimkt.q0.b.W0, Integer.valueOf(iB));
        fVar.a("stage", Integer.valueOf(i2));
        fVar.a("ac", 0);
        fVar.a(com.smartdigimkt.q0.b.Z0, Integer.valueOf(i3));
        if (zB) {
            if (iB != 1) {
                eVar.a(com.smartdigimkt.q0.c.f37797Q, fVar);
                aVar.a(com.smartdigimkt.q0.c.f37797Q, eVar);
            }
            eVar.a(com.smartdigimkt.q0.c.f37798R, fVar);
            aVar.a(com.smartdigimkt.q0.c.f37798R, eVar);
            return;
        }
        if (iB == 1) {
            eVar.a(com.smartdigimkt.q0.c.f37797Q, fVar);
            aVar.a(com.smartdigimkt.q0.c.f37797Q, eVar);
        }
        eVar.a(com.smartdigimkt.q0.c.S, fVar);
        aVar.a(com.smartdigimkt.q0.c.S, eVar);
    }

    public static JSONObject a(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str2 : str.split(d9.i.f24749c)) {
                String[] strArrSplit = str2.split(d9.i.f24747b);
                if (strArrSplit.length == 2) {
                    String str3 = strArrSplit[0];
                    if (!TextUtils.isEmpty(str3)) {
                        String str4 = strArrSplit[1];
                        jSONObject.put(str3, str4 != null ? str4 : "");
                    }
                } else if (strArrSplit.length == 1) {
                    String str5 = strArrSplit[0];
                    if (!TextUtils.isEmpty(str5)) {
                        jSONObject.put(str5, "");
                    }
                }
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String a(String str, Map<String, String> map) {
        Uri uri = Uri.parse(str);
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.clearQuery();
        for (String str2 : uri.getQueryParameterNames()) {
            if (map.containsKey(str2)) {
                builderBuildUpon.appendQueryParameter(str2, map.get(str2));
            } else {
                Iterator<String> it = uri.getQueryParameters(str2).iterator();
                while (it.hasNext()) {
                    builderBuildUpon.appendQueryParameter(str2, it.next());
                }
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!uri.getQueryParameterNames().contains(key)) {
                builderBuildUpon.appendQueryParameter(key, entry.getValue());
            }
        }
        return builderBuildUpon.build().toString();
    }
}
