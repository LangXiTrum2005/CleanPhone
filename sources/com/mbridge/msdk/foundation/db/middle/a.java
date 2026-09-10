package com.mbridge.msdk.foundation.db.middle;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.g;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.y0;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f33496a = "FrequencyDaoMiddle";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f33497b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f33498c = "FrequencyDaoMiddle";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static JSONArray f33499d = new JSONArray();

    private a() {
        c();
    }

    public static a b() {
        if (f33497b == null) {
            synchronized (a.class) {
                try {
                    if (f33497b == null) {
                        f33497b = new a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f33497b;
    }

    private void c() {
        try {
            String str = (String) y0.a(c.n().d(), f33498c, f33499d.toString());
            if (TextUtils.isEmpty(str)) {
                return;
            }
            f33499d = new JSONArray(str);
        } catch (Exception e10) {
            q0.b(f33496a, e10.getMessage());
        }
    }

    private void d() {
        try {
            if (f33499d != null) {
                y0.b(c.n().d(), f33498c, f33499d.toString());
            }
        } catch (Exception e10) {
            q0.b(f33496a, e10.getMessage());
        }
    }

    public void a(g gVar) {
        JSONObject jSONObjectA;
        if (gVar == null || (jSONObjectA = a(gVar.a(), gVar.c(), gVar.d(), gVar.f(), gVar.e(), gVar.b())) == null) {
            return;
        }
        if (f33499d == null) {
            f33499d = new JSONArray();
        }
        f33499d.put(jSONObjectA);
        d();
    }

    public void a(String str) {
        if (f33499d != null) {
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < f33499d.length(); i10++) {
                try {
                    JSONObject jSONObject = f33499d.getJSONObject(i10);
                    if (jSONObject != null) {
                        if (jSONObject.optString("id", "").equals(str)) {
                            jSONObject.put("impression_count", jSONObject.optInt("impression_count", 0) + 1);
                            jSONArray.put(jSONObject);
                        } else {
                            jSONArray.put(jSONObject);
                        }
                    }
                } catch (JSONException e10) {
                    q0.b(f33496a, e10.getMessage());
                }
            }
            if (jSONArray.length() > 0) {
                f33499d = jSONArray;
            }
            d();
        }
    }

    public String[] a() {
        ArrayList arrayList = new ArrayList();
        if (f33499d != null) {
            for (int i10 = 0; i10 < f33499d.length(); i10++) {
                try {
                    JSONObject jSONObject = f33499d.getJSONObject(i10);
                    if (jSONObject != null && jSONObject.optInt("fc_a") < jSONObject.optInt("impression_count")) {
                        arrayList.add(jSONObject.optString("id"));
                    }
                } catch (JSONException e10) {
                    q0.b(f33496a, e10.getMessage());
                }
            }
        }
        String[] strArr = new String[arrayList.size()];
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            strArr[i11] = (String) arrayList.get(i11);
        }
        return strArr;
    }

    public void a(long j10) {
        if (f33499d != null) {
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < f33499d.length(); i10++) {
                try {
                    JSONObject jSONObject = f33499d.getJSONObject(i10);
                    if (jSONObject != null && jSONObject.optInt("ts") >= j10) {
                        jSONArray.put(jSONObject);
                    }
                } catch (JSONException e10) {
                    q0.b(f33496a, e10.getMessage());
                }
            }
            if (jSONArray.length() > 0) {
                f33499d = jSONArray;
            }
        }
        d();
    }

    private JSONObject a(String str, int i10, int i11, long j10, int i12, int i13) {
        Exception e10;
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("id", str);
                jSONObject.put("fc_a", i10);
                jSONObject.put("fc_b", i11);
                jSONObject.put("ts", j10);
                jSONObject.put("impression_count", i12);
                jSONObject.put("click_count", i13);
                return jSONObject;
            } catch (Exception e11) {
                e10 = e11;
                q0.b(f33496a, e10.getMessage());
                return jSONObject;
            }
        } catch (Exception e12) {
            e10 = e12;
            jSONObject = null;
        }
    }
}
