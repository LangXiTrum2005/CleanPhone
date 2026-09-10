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

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Of {
    public final void a(Context context, String appKey, JSONObject initResponse, String sdkVersion, String testSuiteControllerUrl, Boolean bool, boolean z10) {
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(appKey, "appKey");
        kotlin.jvm.internal.n.f(initResponse, "initResponse");
        kotlin.jvm.internal.n.f(sdkVersion, "sdkVersion");
        kotlin.jvm.internal.n.f(testSuiteControllerUrl, "testSuiteControllerUrl");
        Wf wf2 = Wf.f27610a;
        a(context, a(appKey, sdkVersion, wf2.c(context), wf2.a(context), wf2.b(context), bool, initResponse, z10, wf2.b(), wf2.c(), a()));
        Intent intent = new Intent(context, (Class<?>) TestSuiteActivity.class);
        intent.setFlags(805306368);
        intent.putExtra("controllerUrl", testSuiteControllerUrl);
        context.startActivity(intent);
    }

    public final String b(Context context) {
        kotlin.jvm.internal.n.f(context, "context");
        return a(context).getString("dataString", "");
    }

    private final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, List<String>> entry : Wf.f27610a.d().entrySet()) {
            jSONObject.putOpt(entry.getKey(), new JSONArray((Collection) entry.getValue()));
        }
        return jSONObject;
    }

    private final String a(String str, String str2, String str3, String str4, String str5, Boolean bool, JSONObject jSONObject, boolean z10, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        String string = new JSONObject(xj.b0.Q(new wj.f(Wa.f27581o, X3.f27645d), new wj.f("appKey", str), new wj.f("sdkVersion", str2), new wj.f("bundleId", str3), new wj.f("appName", str4), new wj.f(X3.j.W, str5), new wj.f("initResponse", jSONObject), new wj.f("isRvManual", Boolean.valueOf(z10)), new wj.f("generalProperties", jSONObject2), new wj.f("adaptersVersion", jSONObject3), new wj.f("metaData", jSONObject4), new wj.f("gdprConsent", bool))).toString();
        kotlin.jvm.internal.n.e(string, "JSONObject(\n            …ent))\n        .toString()");
        return string;
    }

    private final SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.unity3d.ad-mediation.testSuite", 0);
        kotlin.jvm.internal.n.e(sharedPreferences, "context.getSharedPrefere…EY, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }

    private final void a(Context context, String str) {
        SharedPreferences.Editor editorEdit = a(context).edit();
        kotlin.jvm.internal.n.e(editorEdit, "getTestSuitePrefs(context).edit()");
        editorEdit.putString("dataString", str);
        editorEdit.apply();
    }
}
