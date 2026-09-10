package com.p004ironsource.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.p004ironsource.is;
import com.p004ironsource.jp;
import com.p004ironsource.q9;
import com.p004ironsource.sdk.utils.Logger;
import com.p004ironsource.yk;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f26986c = "o";
    private static final String d = "activate";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f26987e = "startSession";
    private static final String f = "finishSession";
    private static final String g = "impressionOccurred";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f26988h = "getOmidData";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f26989i = "omidFunction";
    private static final String j = "omidParams";
    private static final String k = "success";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f26990l = "fail";
    private static final String m = "%s | unsupported OMID API";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f26991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jp f26992b = new jp();

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f26993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        JSONObject f26994b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f26995c;
        String d;

        private b() {
        }
    }

    public o(Context context) {
        this.f26991a = context;
    }

    private b a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        b bVar = new b();
        bVar.f26993a = jSONObject.optString(f26989i);
        bVar.f26994b = jSONObject.optJSONObject(j);
        bVar.f26995c = jSONObject.optString("success");
        bVar.d = jSONObject.optString("fail");
        return bVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void a(String str, yk ykVar) throws Exception {
        byte b2;
        b bVarA = a(str);
        is isVar = new is();
        JSONObject jSONObject = bVarA.f26994b;
        if (jSONObject != null) {
            String strOptString = jSONObject.optString("adViewId", "");
            if (!TextUtils.isEmpty(strOptString)) {
                isVar.b("adViewId", strOptString);
            }
        }
        try {
            String str2 = bVarA.f26993a;
            switch (str2.hashCode()) {
                case -1655974669:
                    if (!str2.equals(d)) {
                        b2 = -1;
                    } else {
                        b2 = 0;
                    }
                    break;
                case -984459207:
                    if (!str2.equals(f26988h)) {
                        b2 = -1;
                    } else {
                        b2 = 4;
                    }
                    break;
                case 70701699:
                    if (!str2.equals(f)) {
                        b2 = -1;
                    } else {
                        b2 = 2;
                    }
                    break;
                case 1208109646:
                    if (!str2.equals(g)) {
                        b2 = -1;
                    } else {
                        b2 = 3;
                    }
                    break;
                case 1850541012:
                    if (!str2.equals(f26987e)) {
                        b2 = -1;
                    } else {
                        b2 = 1;
                    }
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 != 0) {
                if (b2 == 1) {
                    this.f26992b.d(bVarA.f26994b);
                } else if (b2 == 2) {
                    this.f26992b.b(bVarA.f26994b);
                } else if (b2 == 3) {
                    this.f26992b.c(bVarA.f26994b);
                } else if (b2 != 4) {
                    throw new IllegalArgumentException(bVarA.f26993a + " | unsupported OMID API");
                }
                ykVar.a(true, bVarA.f26995c, isVar);
            }
            this.f26992b.a(this.f26991a);
            isVar = this.f26992b.a();
            ykVar.a(true, bVarA.f26995c, isVar);
        } catch (Exception e2) {
            q9.d().a(e2);
            isVar.b("errMsg", e2.getMessage());
            Logger.i(f26986c, "OMIDJSAdapter " + bVarA.f26993a + " Exception: " + e2.getMessage());
            ykVar.a(false, bVarA.d, isVar);
        }
    }
}
