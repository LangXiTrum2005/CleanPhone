package com.p004ironsource.sdk.controller;

import android.webkit.JavascriptInterface;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.q9;
import com.p004ironsource.sdk.utils.Logger;
import com.p004ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f26927c = "com.ironsource.sdk.controller.g";
    private static final String d = "functionName";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f26928e = "params";
    private static final String f = "hash";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f26929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s f26930b;

    public g(b bVar, s sVar) {
        this.f26929a = bVar;
        this.f26930b = sVar;
    }

    private String a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("functionName", SDKUtils.encodeString(str));
            jSONObject.put("params", SDKUtils.encodeString(str2));
            jSONObject.put(f, SDKUtils.encodeString(str3));
        } catch (JSONException e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
        return jSONObject.toString();
    }

    private void b(String str, String str2, String str3) {
        this.f26929a.a(a(str, str2, str3));
    }

    @JavascriptInterface
    public void messageHandler(String str, String str2, String str3) {
        try {
            Logger.i(f26927c, "messageHandler(" + str + " " + str3 + ")");
            if (this.f26930b.a(str, str2, str3)) {
                a(str, str2);
            } else {
                b(str, str2, str3);
            }
        } catch (Exception e2) {
            a(e2);
        }
    }

    private void a(Exception exc) {
        if (!(exc instanceof NoSuchMethodException)) {
            a(exc.getLocalizedMessage());
            return;
        }
        IronLog.INTERNAL.error(exc.toString());
        Logger.i(f26927c, "messageHandler failed with exception " + exc.getMessage());
    }

    private void a(String str) {
        this.f26929a.b(str);
    }

    private void a(String str, String str2) throws Exception {
        this.f26929a.a(str, str2);
    }
}
