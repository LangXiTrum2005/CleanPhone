package com.smartdigimkt.g6;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f35468a = "a";

    public static void a(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
            jSONObject.put("data", new JSONObject());
            com.smartdigimkt.k6.c.a().a(obj, jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    public static void b(Object obj, String str) {
        try {
            com.smartdigimkt.k6.c.a().b(obj, str);
        } catch (Exception e2) {
            a(obj, e2.getMessage());
        }
    }

    public static void a(Object obj, JSONObject jSONObject) {
        try {
            new JSONObject().put("data", jSONObject);
            com.smartdigimkt.k6.c.a().b(obj, jSONObject.toString());
        } catch (Exception e2) {
            a(obj, e2.getMessage());
        }
    }
}
