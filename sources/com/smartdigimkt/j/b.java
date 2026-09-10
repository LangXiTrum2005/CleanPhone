package com.smartdigimkt.j;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.smartdigimkt.c0.f;
import com.smartdigimkt.n.h;
import com.smartdigimkt.v0.v;
import com.smartdigimkt.x.d;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f35893a = "b";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f35894b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f35895c = 1;

    public class a implements Runnable {
        final /* synthetic */ d X;

        public a(d dVar) {
            this.X = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                b.b(this.X.i0(), this.X);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, d dVar) {
        if (f.o == null || TextUtils.isEmpty(dVar.j())) {
            return;
        }
        f.a(str, dVar, "banner");
    }

    public static void a(Object obj, JSONObject jSONObject) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                a(obj, "data is empty");
                return;
            }
            d dVarB = d.b(jSONObjectOptJSONObject);
            if (dVarB == null) {
                a(obj, "data camapign is empty");
            } else {
                a(dVarB);
                b(obj, "");
            }
        } catch (Throwable th) {
            a(obj, th.getMessage());
        }
    }

    public static void b(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f35894b);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str);
            jSONObject.put("data", jSONObject2);
            h.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            a(obj, e2.getMessage());
            e2.getMessage();
        }
    }

    public static void a(d dVar) {
        new Thread(new a(dVar)).start();
    }

    public static String a(float f, float f2) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(com.smartdigimkt.b0.a.g2, v.b(com.smartdigimkt.u.a.f().d(), f));
            jSONObject2.put(com.smartdigimkt.b0.a.h2, v.b(com.smartdigimkt.u.a.f().d(), f2));
            jSONObject2.put(com.smartdigimkt.b0.a.j2, 0);
            jSONObject2.put(com.smartdigimkt.b0.a.k2, com.smartdigimkt.u.a.f().d().getResources().getConfiguration().orientation);
            jSONObject2.put(com.smartdigimkt.b0.a.l2, v.d(com.smartdigimkt.u.a.f().d()));
            jSONObject.put(com.smartdigimkt.b0.a.i2, jSONObject2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return jSONObject.toString();
    }

    public static String a(int i2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i2);
            String string = jSONObject.toString();
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void a(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f35895c);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
            jSONObject.put("data", new JSONObject());
            h.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            e2.getMessage();
        }
    }
}
