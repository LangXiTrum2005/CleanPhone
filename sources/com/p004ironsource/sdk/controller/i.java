package com.p004ironsource.sdk.controller;

import android.content.Context;
import com.p004ironsource.d9;
import com.p004ironsource.is;
import com.p004ironsource.on;
import com.p004ironsource.sdk.utils.Logger;
import com.p004ironsource.sdk.utils.SDKUtils;
import com.p004ironsource.vf;
import com.p004ironsource.yk;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f26936c = "i";
    private static final String d = "getDeviceData";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f26937e = "deviceDataFunction";
    private static final String f = "deviceDataParams";
    private static final String g = "success";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f26938h = "fail";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f26939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vf f26940b = on.U().f();

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f26941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        JSONObject f26942b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f26943c;
        String d;

        private b() {
        }
    }

    public i(Context context) {
        this.f26939a = context;
    }

    private is a() {
        is isVar = new is();
        isVar.b(SDKUtils.encodeString(d9.i.i0), SDKUtils.encodeString(String.valueOf(this.f26940b.c())));
        isVar.b(SDKUtils.encodeString(d9.i.j0), SDKUtils.encodeString(String.valueOf(this.f26940b.h(this.f26939a))));
        isVar.b(SDKUtils.encodeString(d9.i.k0), SDKUtils.encodeString(String.valueOf(this.f26940b.J(this.f26939a))));
        isVar.b(SDKUtils.encodeString(d9.i.l0), SDKUtils.encodeString(String.valueOf(this.f26940b.l(this.f26939a))));
        isVar.b(SDKUtils.encodeString(d9.i.m0), SDKUtils.encodeString(String.valueOf(this.f26940b.c(this.f26939a))));
        isVar.b(SDKUtils.encodeString(d9.i.n0), SDKUtils.encodeString(String.valueOf(this.f26940b.d(this.f26939a))));
        return isVar;
    }

    private b a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        b bVar = new b();
        bVar.f26941a = jSONObject.optString(f26937e);
        bVar.f26942b = jSONObject.optJSONObject(f);
        bVar.f26943c = jSONObject.optString("success");
        bVar.d = jSONObject.optString("fail");
        return bVar;
    }

    public void a(String str, yk ykVar) throws Exception {
        b bVarA = a(str);
        if (d.equals(bVarA.f26941a)) {
            ykVar.a(true, bVarA.f26943c, a());
            return;
        }
        Logger.i(f26936c, "unhandled API request " + str);
    }
}
