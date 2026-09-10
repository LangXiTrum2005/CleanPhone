package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.C0395ie;
import com.ironsource.C0474n4;
import com.ironsource.E1;
import com.ironsource.InterfaceC0480na;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f30489b = "q";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f30490c = "getPermissions";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f30491d = "isPermissionGranted";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f30492e = "permissions";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f30493f = "permission";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f30494g = "status";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f30495h = "functionName";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f30496i = "functionParams";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f30497j = "success";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f30498k = "fail";
    private static final String l = "unhandledPermission";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f30499a;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f30500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        JSONObject f30501b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f30502c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f30503d;

        public /* synthetic */ a(int i10) {
            this();
        }

        private a() {
        }
    }

    public q(Context context) {
        this.f30499a = context;
    }

    private a a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        a aVar = new a(0);
        aVar.f30500a = jSONObject.optString("functionName");
        aVar.f30501b = jSONObject.optJSONObject("functionParams");
        aVar.f30502c = jSONObject.optString("success");
        aVar.f30503d = jSONObject.optString("fail");
        return aVar;
    }

    public void b(JSONObject jSONObject, a aVar, InterfaceC0480na interfaceC0480na) {
        C0395ie c0395ie = new C0395ie();
        try {
            String string = jSONObject.getString(f30493f);
            c0395ie.b(f30493f, string);
            if (E1.d(this.f30499a, string)) {
                c0395ie.b("status", String.valueOf(E1.c(this.f30499a, string)));
                interfaceC0480na.a(true, aVar.f30502c, c0395ie);
            } else {
                c0395ie.b("status", l);
                interfaceC0480na.a(false, aVar.f30503d, c0395ie);
            }
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            c0395ie.b("errMsg", e10.getMessage());
            interfaceC0480na.a(false, aVar.f30503d, c0395ie);
        }
    }

    public void a(String str, InterfaceC0480na interfaceC0480na) throws Exception {
        a aVarA = a(str);
        if (f30490c.equals(aVarA.f30500a)) {
            a(aVarA.f30501b, aVarA, interfaceC0480na);
            return;
        }
        if (f30491d.equals(aVarA.f30500a)) {
            b(aVarA.f30501b, aVarA, interfaceC0480na);
            return;
        }
        Logger.i(f30489b, "PermissionsJSAdapter unhandled API request " + str);
    }

    public void a(JSONObject jSONObject, a aVar, InterfaceC0480na interfaceC0480na) {
        C0395ie c0395ie = new C0395ie();
        try {
            c0395ie.a(f30492e, E1.a(this.f30499a, jSONObject.getJSONArray(f30492e)));
            interfaceC0480na.a(true, aVar.f30502c, c0395ie);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            Logger.i(f30489b, "PermissionsJSAdapter getPermissions JSON Exception when getting permissions parameter " + e10.getMessage());
            c0395ie.b("errMsg", e10.getMessage());
            interfaceC0480na.a(false, aVar.f30503d, c0395ie);
        }
    }
}
