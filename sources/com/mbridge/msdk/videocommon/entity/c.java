package com.mbridge.msdk.videocommon.entity;

import android.text.TextUtils;
import d5.u;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f38284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f38285b;

    public c(String str, int i10) {
        this.f38284a = str;
        this.f38285b = i10;
    }

    public int a() {
        return this.f38285b;
    }

    public void b(String str) {
        this.f38284a = str;
    }

    public String c() {
        return this.f38284a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Reward{name='");
        sb2.append(this.f38284a);
        sb2.append("', amount=");
        return u.g(sb2, this.f38285b, '}');
    }

    public static c b() {
        return new c("Virtual Item", 1);
    }

    public void a(int i10) {
        this.f38285b = i10;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c A[Catch: Exception -> 0x0015, TRY_LEAVE, TryCatch #0 {Exception -> 0x0015, blocks: (B:3:0x0001, B:5:0x000f, B:14:0x002c, B:10:0x0019, B:12:0x001f), top: B:19:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[RETURN] */
    public static c a(String str) {
        c cVarB;
        c cVar = null;
        try {
            com.mbridge.msdk.videocommon.setting.a aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
            if (TextUtils.isEmpty(str)) {
                cVarB = b();
            } else {
                if (aVarC != null && aVarC.g() != null) {
                    cVarB = aVarC.g().get(str);
                }
                if (cVar == null) {
                    return b();
                }
                return cVar;
            }
            cVar = cVarB;
            if (cVar == null) {
                return b();
            }
            return cVar;
        } catch (Exception e10) {
            e10.printStackTrace();
            return cVar;
        }
    }

    public static Map<String, c> a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                map.put(jSONObjectOptJSONObject.optString("id"), new c(jSONObjectOptJSONObject.optString("name"), jSONObjectOptJSONObject.optInt("amount")));
            }
            return map;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static c a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            String strOptString = jSONObject.optString("name");
            int iOptInt = jSONObject.optInt("amount");
            jSONObject.optString("id");
            return new c(strOptString, iOptInt);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
