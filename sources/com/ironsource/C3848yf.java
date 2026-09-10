package com.ironsource;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.yf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3848yf {
    public final void a(Context context, String appKey, JSONObject initResponse, String sdkVersion, String testSuiteControllerUrl, Boolean bool, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(initResponse, "initResponse");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(testSuiteControllerUrl, "testSuiteControllerUrl");
        Gf gf = Gf.a;
        a(context, a(appKey, sdkVersion, gf.c(context), gf.a(context), gf.b(context), bool, initResponse, z, gf.b(), gf.c(), a()));
        Intent intent = new Intent(context, (Class<?>) TestSuiteActivity.class);
        intent.setFlags(805306368);
        intent.putExtra("controllerUrl", testSuiteControllerUrl);
        context.startActivity(intent);
    }

    public final String b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return a(context).getString("dataString", "");
    }

    private final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, List<String>> entry : Gf.a.d().entrySet()) {
            jSONObject.putOpt(entry.getKey(), new JSONArray((Collection) entry.getValue()));
        }
        return jSONObject;
    }

    private final String a(String str, String str2, String str3, String str4, String str5, Boolean bool, JSONObject jSONObject, boolean z, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        String string = new JSONObject(p002kotlin.collections.seminary.impassible(patroclinal.formularize.attabal(Ta.o, X3.d), patroclinal.formularize.attabal("appKey", str), patroclinal.formularize.attabal("sdkVersion", str2), patroclinal.formularize.attabal("bundleId", str3), patroclinal.formularize.attabal("appName", str4), patroclinal.formularize.attabal(X3.j.W, str5), patroclinal.formularize.attabal("initResponse", jSONObject), patroclinal.formularize.attabal("isRvManual", Boolean.valueOf(z)), patroclinal.formularize.attabal("generalProperties", jSONObject2), patroclinal.formularize.attabal("adaptersVersion", jSONObject3), patroclinal.formularize.attabal("metaData", jSONObject4), patroclinal.formularize.attabal("gdprConsent", bool))).toString();
        Intrinsics.checkNotNullExpressionValue(string, "JSONObject(\n            …ent))\n        .toString()");
        return string;
    }

    private final SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.unity3d.ad-mediation.testSuite", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…EY, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }

    private final void a(Context context, String str) {
        SharedPreferences.Editor editorEdit = a(context).edit();
        Intrinsics.checkNotNullExpressionValue(editorEdit, "getTestSuitePrefs(context).edit()");
        editorEdit.putString("dataString", str);
        editorEdit.apply();
    }
}
