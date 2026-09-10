package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;
import com.ironsource.C0474n4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f30397c = "com.ironsource.sdk.controller.g";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f30398d = "functionName";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f30399e = "params";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f30400f = "hash";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f30401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s f30402b;

    public g(b bVar, s sVar) {
        this.f30401a = bVar;
        this.f30402b = sVar;
    }

    private void a(Exception exc) {
        if (!(exc instanceof NoSuchMethodException)) {
            a(exc.getLocalizedMessage());
            return;
        }
        IronLog.INTERNAL.error(exc.toString());
        Logger.i(f30397c, "messageHandler failed with exception " + exc.getMessage());
    }

    private void b(String str, String str2, String str3) {
        this.f30401a.a(a(str, str2, str3));
    }

    @JavascriptInterface
    public void messageHandler(String str, String str2, String str3) {
        try {
            Logger.i(f30397c, "messageHandler(" + str + " " + str3 + ")");
            if (this.f30402b.a(str, str2, str3)) {
                a(str, str2);
            } else {
                b(str, str2, str3);
            }
        } catch (Exception e10) {
            a(e10);
        }
    }

    private void a(String str, String str2) throws Exception {
        this.f30401a.a(str, str2);
    }

    private void a(String str) {
        this.f30401a.b(str);
    }

    private String a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("functionName", SDKUtils.encodeString(str));
            jSONObject.put("params", SDKUtils.encodeString(str2));
            jSONObject.put(f30400f, SDKUtils.encodeString(str3));
        } catch (JSONException e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return jSONObject.toString();
    }
}
