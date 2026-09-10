package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.x4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0653x4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f31026c = "x4";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f31027d = "setSharedSignal";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f31028e = "getSharedSignal";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f31029f = "functionName";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f31030g = "functionParams";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f31031h = "success";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f31032i = "fail";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f31033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    C0635w4 f31034b;

    /* JADX INFO: renamed from: com.ironsource.x4$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f31035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        JSONObject f31036b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f31037c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f31038d;

        private a() {
        }

        public static a a(JSONObject jSONObject) {
            a aVar = new a();
            aVar.f31035a = jSONObject.optString("functionName");
            aVar.f31036b = jSONObject.optJSONObject("functionParams");
            aVar.f31037c = jSONObject.optString("success");
            aVar.f31038d = jSONObject.optString("fail");
            return aVar;
        }
    }

    public C0653x4(Context context, C0635w4 c0635w4) {
        this.f31033a = context;
        this.f31034b = c0635w4;
    }

    private a a(String str) throws JSONException {
        return a.a(new JSONObject(str));
    }

    private void b(Context context, a aVar, InterfaceC0480na interfaceC0480na) {
        C0395ie c0395ie = new C0395ie();
        JSONObject jSONObject = aVar.f31036b;
        this.f31034b.a(context, EnumC0617v4.a(jSONObject.optString("source")), jSONObject.optString(X3.i.W), jSONObject.optString("data"));
        interfaceC0480na.a(true, aVar.f31037c, c0395ie);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002e  */
    public void a(String str, InterfaceC0480na interfaceC0480na) throws Exception {
        byte b10;
        a aVarA = a(str);
        try {
            String str2 = aVarA.f31035a;
            int iHashCode = str2.hashCode();
            if (iHashCode != 576059875) {
                if (iHashCode == 1486812399 && str2.equals(f31027d)) {
                    b10 = 0;
                } else {
                    b10 = -1;
                }
            } else if (str2.equals(f31028e)) {
                b10 = 1;
            } else {
                b10 = -1;
            }
            if (b10 == 0) {
                b(this.f31033a, aVarA, interfaceC0480na);
            } else {
                if (b10 != 1) {
                    throw new UnsupportedOperationException("unsupported API: " + str);
                }
                a(this.f31033a, aVarA, interfaceC0480na);
            }
        } catch (Exception e10) {
            a(aVarA, interfaceC0480na, e10);
        }
    }

    private void a(Context context, a aVar, InterfaceC0480na interfaceC0480na) {
        C0395ie c0395ie = new C0395ie();
        JSONObject jSONObject = aVar.f31036b;
        c0395ie.b("data", this.f31034b.a(context, EnumC0617v4.a(jSONObject.optString("source")), jSONObject.optString(X3.i.W)));
        interfaceC0480na.a(true, aVar.f31037c, c0395ie);
    }

    private void a(a aVar, InterfaceC0480na interfaceC0480na, Exception exc) {
        C0474n4.d().a(exc);
        String message = exc.getMessage();
        Logger.i(f31026c, aVar.f31035a + " exception " + message);
        C0395ie c0395ie = new C0395ie();
        if (TextUtils.isEmpty(message)) {
            message = "Unknown error";
        }
        c0395ie.b("error", message);
        interfaceC0480na.a(false, aVar.f31038d, c0395ie);
    }
}
