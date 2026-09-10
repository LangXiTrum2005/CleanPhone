package com.ironsource.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C0395ie;
import com.ironsource.C0474n4;
import com.ironsource.Gc;
import com.ironsource.InterfaceC0480na;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f30463c = "o";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f30464d = "activate";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f30465e = "startSession";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f30466f = "finishSession";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f30467g = "impressionOccurred";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f30468h = "getOmidData";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f30469i = "omidFunction";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f30470j = "omidParams";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f30471k = "success";
    private static final String l = "fail";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f30472m = "%s | unsupported OMID API";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f30473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Gc f30474b = new Gc();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f30475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        JSONObject f30476b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f30477c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f30478d;

        public /* synthetic */ a(int i10) {
            this();
        }

        private a() {
        }
    }

    public o(Context context) {
        this.f30473a = context;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void a(String str, InterfaceC0480na interfaceC0480na) throws Exception {
        C0395ie c0395ieA;
        a aVarA = a(str);
        C0395ie c0395ie = new C0395ie();
        JSONObject jSONObject = aVarA.f30476b;
        if (jSONObject != null) {
            String strOptString = jSONObject.optString("adViewId", "");
            if (!TextUtils.isEmpty(strOptString)) {
                c0395ie.b("adViewId", strOptString);
            }
        }
        try {
            String str2 = aVarA.f30475a;
            switch (str2.hashCode()) {
                case -1655974669:
                    if (str2.equals(f30464d)) {
                        this.f30474b.a(this.f30473a);
                        c0395ieA = this.f30474b.a();
                        c0395ie = c0395ieA;
                        interfaceC0480na.a(true, aVarA.f30477c, c0395ie);
                        return;
                    }
                    throw new IllegalArgumentException(aVarA.f30475a + " | unsupported OMID API");
                case -984459207:
                    if (str2.equals(f30468h)) {
                        c0395ieA = this.f30474b.a();
                        c0395ie = c0395ieA;
                        interfaceC0480na.a(true, aVarA.f30477c, c0395ie);
                        return;
                    }
                    throw new IllegalArgumentException(aVarA.f30475a + " | unsupported OMID API");
                case 70701699:
                    if (str2.equals(f30466f)) {
                        this.f30474b.b(aVarA.f30476b);
                        interfaceC0480na.a(true, aVarA.f30477c, c0395ie);
                        return;
                    }
                    throw new IllegalArgumentException(aVarA.f30475a + " | unsupported OMID API");
                case 1208109646:
                    if (str2.equals(f30467g)) {
                        this.f30474b.c(aVarA.f30476b);
                        interfaceC0480na.a(true, aVarA.f30477c, c0395ie);
                        return;
                    }
                    throw new IllegalArgumentException(aVarA.f30475a + " | unsupported OMID API");
                case 1850541012:
                    if (str2.equals(f30465e)) {
                        this.f30474b.d(aVarA.f30476b);
                        interfaceC0480na.a(true, aVarA.f30477c, c0395ie);
                        return;
                    }
                    throw new IllegalArgumentException(aVarA.f30475a + " | unsupported OMID API");
                default:
                    throw new IllegalArgumentException(aVarA.f30475a + " | unsupported OMID API");
            }
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            c0395ie.b("errMsg", e10.getMessage());
            Logger.i(f30463c, "OMIDJSAdapter " + aVarA.f30475a + " Exception: " + e10.getMessage());
            interfaceC0480na.a(false, aVarA.f30478d, c0395ie);
        }
    }

    private a a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        a aVar = new a(0);
        aVar.f30475a = jSONObject.optString(f30469i);
        aVar.f30476b = jSONObject.optJSONObject(f30470j);
        aVar.f30477c = jSONObject.optString("success");
        aVar.f30478d = jSONObject.optString("fail");
        return aVar;
    }
}
