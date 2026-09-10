package com.p004ironsource.sdk.controller;

import android.content.Context;
import com.p004ironsource.b4;
import com.p004ironsource.is;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.q9;
import com.p004ironsource.sdk.utils.Logger;
import com.p004ironsource.yk;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f27006b = "q";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f27007c = "getPermissions";
    private static final String d = "isPermissionGranted";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f27008e = "permissions";
    private static final String f = "permission";
    private static final String g = "status";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f27009h = "functionName";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f27010i = "functionParams";
    private static final String j = "success";
    private static final String k = "fail";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f27011l = "unhandledPermission";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f27012a;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f27013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        JSONObject f27014b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f27015c;
        String d;

        private b() {
        }
    }

    public q(Context context) {
        this.f27012a = context;
    }

    private b a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        b bVar = new b();
        bVar.f27013a = jSONObject.optString("functionName");
        bVar.f27014b = jSONObject.optJSONObject("functionParams");
        bVar.f27015c = jSONObject.optString("success");
        bVar.d = jSONObject.optString("fail");
        return bVar;
    }

    public void b(JSONObject jSONObject, b bVar, yk ykVar) {
        String str;
        boolean z2;
        is isVar = new is();
        try {
            String string = jSONObject.getString(f);
            isVar.b(f, string);
            if (b4.d(this.f27012a, string)) {
                isVar.b("status", String.valueOf(b4.c(this.f27012a, string)));
                str = bVar.f27015c;
                z2 = true;
            } else {
                isVar.b("status", f27011l);
                str = bVar.d;
                z2 = false;
            }
            ykVar.a(z2, str, isVar);
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            isVar.b("errMsg", e2.getMessage());
            ykVar.a(false, bVar.d, isVar);
        }
    }

    public void a(String str, yk ykVar) throws Exception {
        b bVarA = a(str);
        if (f27007c.equals(bVarA.f27013a)) {
            a(bVarA.f27014b, bVarA, ykVar);
            return;
        }
        if (d.equals(bVarA.f27013a)) {
            b(bVarA.f27014b, bVarA, ykVar);
            return;
        }
        Logger.i(f27006b, "PermissionsJSAdapter unhandled API request " + str);
    }

    public void a(JSONObject jSONObject, b bVar, yk ykVar) {
        is isVar = new is();
        try {
            isVar.a(f27008e, b4.a(this.f27012a, jSONObject.getJSONArray(f27008e)));
            ykVar.a(true, bVar.f27015c, isVar);
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            Logger.i(f27006b, "PermissionsJSAdapter getPermissions JSON Exception when getting permissions parameter " + e2.getMessage());
            isVar.b("errMsg", e2.getMessage());
            ykVar.a(false, bVar.d, isVar);
        }
    }
}
