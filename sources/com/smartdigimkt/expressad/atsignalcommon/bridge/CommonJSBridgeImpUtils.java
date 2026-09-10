package com.smartdigimkt.expressad.atsignalcommon.bridge;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.smartdigimkt.b0.a;
import com.smartdigimkt.c0.f;
import com.smartdigimkt.m6.b;
import com.smartdigimkt.n.h;
import com.smartdigimkt.v0.v;
import com.smartdigimkt.x.d;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class CommonJSBridgeImpUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f34673a = "CommonJSBridgeImpUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f34674b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f34675c = 1;

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, d dVar) {
        if (f.o == null || TextUtils.isEmpty(dVar.j())) {
            return;
        }
        f.a(str, dVar, "banner");
    }

    public static String buildClickJsonObject(float f, float f2) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(a.g2, v.b(b.p().k(), f));
            jSONObject2.put(a.h2, v.b(b.p().k(), f2));
            jSONObject2.put(a.j2, 0);
            jSONObject2.put(a.k2, b.p().k().getResources().getConfiguration().orientation);
            jSONObject2.put(a.l2, v.d(b.p().k()));
            jSONObject.put(a.i2, jSONObject2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return jSONObject.toString();
    }

    public static void callbackExcep(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f34675c);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
            jSONObject.put("data", new JSONObject());
            h.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public static void callbackSuccess(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f34674b);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str);
            jSONObject.put("data", jSONObject2);
            h.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            callbackExcep(obj, e2.getMessage());
            e2.getMessage();
        }
    }

    public static String codeToJsonString(int i2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i2);
            String string = jSONObject.toString();
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void increaseOfferFrequence(Object obj, JSONObject jSONObject) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                callbackExcep(obj, "data is empty");
                return;
            }
            d dVarB = d.b(jSONObjectOptJSONObject);
            if (dVarB == null) {
                callbackExcep(obj, "data camapign is empty");
            } else {
                updateFrequence(dVarB);
                callbackSuccess(obj, "");
            }
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
        }
    }

    public static void updateFrequence(final d dVar) {
        new Thread(new Runnable() { // from class: com.smartdigimkt.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    CommonJSBridgeImpUtils.b(dVar.i0(), dVar);
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        }).start();
    }
}
