package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.w4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3803w4 {
    private static final String c = "w4";
    private static final String d = "setSharedSignal";
    private static final String e = "getSharedSignal";
    private static final String f = "functionName";
    private static final String g = "functionParams";
    private static final String h = "success";
    private static final String i = "fail";
    private final Context a;
    C3786v4 b;

    /* JADX INFO: renamed from: com.ironsource.w4$a */
    public static class a {
        String a;
        JSONObject b;
        String c;
        String d;

        private a() {
        }

        public static a a(JSONObject jSONObject) {
            a aVar = new a();
            aVar.a = jSONObject.optString("functionName");
            aVar.b = jSONObject.optJSONObject("functionParams");
            aVar.c = jSONObject.optString("success");
            aVar.d = jSONObject.optString("fail");
            return aVar;
        }
    }

    public C3803w4(Context context, C3786v4 c3786v4) {
        this.a = context;
        this.b = c3786v4;
    }

    private a a(String str) throws JSONException {
        return a.a(new JSONObject(str));
    }

    private void b(Context context, a aVar, InterfaceC3601ka interfaceC3601ka) {
        Vd vd = new Vd();
        JSONObject jSONObject = aVar.b;
        this.b.a(context, EnumC3769u4.a(jSONObject.optString("source")), jSONObject.optString(X3.i.W), jSONObject.optString("data"));
        interfaceC3601ka.a(true, aVar.c, vd);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002c  */
    public void a(String str, InterfaceC3601ka interfaceC3601ka) throws Exception {
        byte b;
        a aVarA = a(str);
        try {
            String str2 = aVarA.a;
            int iHashCode = str2.hashCode();
            if (iHashCode != 576059875) {
                if (iHashCode == 1486812399 && str2.equals(d)) {
                    b = 0;
                } else {
                    b = -1;
                }
            } else if (str2.equals(e)) {
                b = 1;
            } else {
                b = -1;
            }
            if (b == 0) {
                b(this.a, aVarA, interfaceC3601ka);
            } else {
                if (b == 1) {
                    a(this.a, aVarA, interfaceC3601ka);
                    return;
                }
                throw new UnsupportedOperationException("unsupported API: " + str);
            }
        } catch (Exception e2) {
            a(aVarA, interfaceC3601ka, e2);
        }
    }

    private void a(Context context, a aVar, InterfaceC3601ka interfaceC3601ka) {
        Vd vd = new Vd();
        JSONObject jSONObject = aVar.b;
        vd.b("data", this.b.a(context, EnumC3769u4.a(jSONObject.optString("source")), jSONObject.optString(X3.i.W)));
        interfaceC3601ka.a(true, aVar.c, vd);
    }

    private void a(a aVar, InterfaceC3601ka interfaceC3601ka, Exception exc) {
        C3631m4.d().a(exc);
        String message = exc.getMessage();
        Logger.i(c, aVar.a + " exception " + message);
        Vd vd = new Vd();
        if (TextUtils.isEmpty(message)) {
            message = "Unknown error";
        }
        vd.b("error", message);
        interfaceC3601ka.a(false, aVar.d, vd);
    }
}
