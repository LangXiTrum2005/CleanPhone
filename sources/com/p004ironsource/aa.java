package com.p004ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.p004ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class aa {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f24278c = "aa";
    private static final String d = "setSharedSignal";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f24279e = "getSharedSignal";
    private static final String f = "functionName";
    private static final String g = "functionParams";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f24280h = "success";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f24281i = "fail";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    z9 f24283b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f24284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        JSONObject f24285b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f24286c;
        String d;

        private a() {
        }

        public static a a(JSONObject jSONObject) {
            a aVar = new a();
            aVar.f24284a = jSONObject.optString("functionName");
            aVar.f24285b = jSONObject.optJSONObject("functionParams");
            aVar.f24286c = jSONObject.optString("success");
            aVar.d = jSONObject.optString("fail");
            return aVar;
        }
    }

    public aa(Context context, z9 z9Var) {
        this.f24282a = context;
        this.f24283b = z9Var;
    }

    private a a(String str) throws JSONException {
        return a.a(new JSONObject(str));
    }

    private void b(Context context, a aVar, yk ykVar) {
        is isVar = new is();
        JSONObject jSONObject = aVar.f24285b;
        this.f24283b.a(context, y9.a(jSONObject.optString("source")), jSONObject.optString("key"), jSONObject.optString("data"));
        ykVar.a(true, aVar.f24286c, isVar);
    }

    private void a(Context context, a aVar, yk ykVar) {
        is isVar = new is();
        JSONObject jSONObject = aVar.f24285b;
        isVar.b("data", this.f24283b.a(context, y9.a(jSONObject.optString("source")), jSONObject.optString("key")));
        ykVar.a(true, aVar.f24286c, isVar);
    }

    private void a(a aVar, yk ykVar, Exception exc) {
        q9.d().a(exc);
        String message = exc.getMessage();
        Logger.i(f24278c, aVar.f24284a + " exception " + message);
        is isVar = new is();
        if (TextUtils.isEmpty(message)) {
            message = "Unknown error";
        }
        isVar.b("error", message);
        ykVar.a(false, aVar.d, isVar);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002e  */
    public void a(String str, yk ykVar) throws Exception {
        byte b2;
        a aVarA = a(str);
        try {
            String str2 = aVarA.f24284a;
            int iHashCode = str2.hashCode();
            if (iHashCode != 576059875) {
                if (iHashCode == 1486812399 && str2.equals(d)) {
                    b2 = 0;
                } else {
                    b2 = -1;
                }
            } else if (str2.equals(f24279e)) {
                b2 = 1;
            } else {
                b2 = -1;
            }
            if (b2 == 0) {
                b(this.f24282a, aVarA, ykVar);
            } else if (b2 == 1) {
                a(this.f24282a, aVarA, ykVar);
            } else {
                throw new UnsupportedOperationException("unsupported API: " + str);
            }
        } catch (Exception e2) {
            a(aVarA, ykVar, e2);
        }
    }
}
