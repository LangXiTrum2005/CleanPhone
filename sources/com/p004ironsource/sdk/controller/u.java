package com.p004ironsource.sdk.controller;

import android.content.Context;
import com.p004ironsource.environment.StringUtils;
import com.p004ironsource.is;
import com.p004ironsource.iw;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.q9;
import com.p004ironsource.ro;
import com.p004ironsource.sdk.utils.Logger;
import com.p004ironsource.yk;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class u {
    private static final String d = "u";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f27022e = "updateToken";
    private static final String f = "getToken";
    private static final String g = "functionName";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f27023h = "functionParams";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f27024i = "success";
    private static final String j = "fail";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f27026b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ro f27025a = new ro();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private iw f27027c = new iw();

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f27028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        JSONObject f27029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f27030c;
        String d;

        private b() {
        }
    }

    public u(Context context) {
        this.f27026b = context;
    }

    private b a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        b bVar = new b();
        bVar.f27028a = jSONObject.optString("functionName");
        bVar.f27029b = jSONObject.optJSONObject("functionParams");
        bVar.f27030c = jSONObject.optString("success");
        bVar.d = jSONObject.optString("fail");
        return bVar;
    }

    private void a(b bVar, yk ykVar) {
        try {
            JSONObject jSONObjectA = this.f27027c.a();
            Iterator<String> itKeys = jSONObjectA.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObjectA.get(next);
                if (obj instanceof String) {
                    jSONObjectA.put(next, StringUtils.encodeURI((String) obj));
                }
            }
            ykVar.a(true, bVar.f27030c, jSONObjectA);
        } catch (Exception e2) {
            q9.d().a(e2);
            ykVar.a(false, bVar.d, e2.getMessage());
        }
    }

    public void a(String str, yk ykVar) throws Exception {
        b bVarA = a(str);
        if (f27022e.equals(bVarA.f27028a)) {
            a(bVarA.f27029b, bVarA, ykVar);
            return;
        }
        if (f.equals(bVarA.f27028a)) {
            a(bVarA, ykVar);
            return;
        }
        Logger.i(d, "unhandled API request " + str);
    }

    public void a(JSONObject jSONObject, b bVar, yk ykVar) {
        is isVar = new is();
        try {
            this.f27025a.a(jSONObject);
            ykVar.a(true, bVar.f27030c, isVar);
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            Logger.i(d, "updateToken exception " + e2.getMessage());
            ykVar.a(false, bVar.d, isVar);
        }
    }
}
