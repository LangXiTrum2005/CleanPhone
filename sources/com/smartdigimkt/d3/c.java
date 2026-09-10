package com.smartdigimkt.d3;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f34428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34429b;

    public c(String str, int i2) {
        this.f34428a = str;
        this.f34429b = i2;
    }

    public int a() {
        return this.f34429b;
    }

    public void b(String str) {
        this.f34428a = str;
    }

    public String c() {
        return this.f34428a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Reward{name='");
        sb.append(this.f34428a);
        sb.append("', amount=");
        return android.support.v4.media.a.p(sb, this.f34429b, AbstractJsonLexerKt.END_OBJ);
    }

    public static c b() {
        return new c("Virtual Item", 1);
    }

    public void a(int i2) {
        this.f34429b = i2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c A[Catch: Exception -> 0x0015, TRY_LEAVE, TryCatch #0 {Exception -> 0x0015, blocks: (B:3:0x0001, B:5:0x000f, B:14:0x002c, B:10:0x0019, B:12:0x001f), top: B:19:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[RETURN] */
    public static c a(String str) {
        c cVarB;
        c cVar = null;
        try {
            com.smartdigimkt.f3.a aVarC = com.smartdigimkt.f3.c.b().c();
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
        } catch (Exception e2) {
            e2.printStackTrace();
            return cVar;
        }
    }

    public static Map<String, c> a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                map.put(jSONObjectOptJSONObject.optString("id"), new c(jSONObjectOptJSONObject.optString("name"), jSONObjectOptJSONObject.optInt("amount")));
            }
            return map;
        } catch (Exception e2) {
            e2.printStackTrace();
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
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
