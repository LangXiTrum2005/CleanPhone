package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.C0395ie;
import com.ironsource.C0474n4;
import com.ironsource.C0500oc;
import com.ironsource.C0504og;
import com.ironsource.InterfaceC0480na;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f30510d = "u";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f30511e = "updateToken";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f30512f = "getToken";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f30513g = "functionName";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f30514h = "functionParams";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f30515i = "success";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f30516j = "fail";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f30518b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C0500oc f30517a = new C0500oc();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C0504og f30519c = new C0504og();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f30520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        JSONObject f30521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f30522c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f30523d;

        public /* synthetic */ a(int i10) {
            this();
        }

        private a() {
        }
    }

    public u(Context context) {
        this.f30518b = context;
    }

    private a a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        a aVar = new a(0);
        aVar.f30520a = jSONObject.optString("functionName");
        aVar.f30521b = jSONObject.optJSONObject("functionParams");
        aVar.f30522c = jSONObject.optString("success");
        aVar.f30523d = jSONObject.optString("fail");
        return aVar;
    }

    public void a(String str, InterfaceC0480na interfaceC0480na) throws Exception {
        a aVarA = a(str);
        if (f30511e.equals(aVarA.f30520a)) {
            a(aVarA.f30521b, aVarA, interfaceC0480na);
            return;
        }
        if (f30512f.equals(aVarA.f30520a)) {
            a(aVarA, interfaceC0480na);
            return;
        }
        Logger.i(f30510d, "unhandled API request " + str);
    }

    public void a(JSONObject jSONObject, a aVar, InterfaceC0480na interfaceC0480na) {
        C0395ie c0395ie = new C0395ie();
        try {
            this.f30517a.a(jSONObject);
            interfaceC0480na.a(true, aVar.f30522c, c0395ie);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            Logger.i(f30510d, "updateToken exception " + e10.getMessage());
            interfaceC0480na.a(false, aVar.f30523d, c0395ie);
        }
    }

    private void a(a aVar, InterfaceC0480na interfaceC0480na) {
        try {
            JSONObject jSONObjectA = this.f30519c.a();
            Iterator<String> itKeys = jSONObjectA.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObjectA.get(next);
                if (obj instanceof String) {
                    jSONObjectA.put(next, StringUtils.encodeURI((String) obj));
                }
            }
            interfaceC0480na.a(true, aVar.f30522c, jSONObjectA);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            interfaceC0480na.a(false, aVar.f30523d, e10.getMessage());
        }
    }
}
