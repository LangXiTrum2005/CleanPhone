package com.p004ironsource;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.p004ironsource.mediationsdk.testSuite.TestSuiteActivity;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0002Jo\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0011J\u0010\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0018\u0010\u0003\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0004H\u0002JG\u0010\u0003\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0003\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/ironsource/fv;", "", "Lorg/json/JSONObject;", "a", "", "appKey", "sdkVersion", "bundleId", "appName", d9.i.W, "", d9.i.f24748b0, "initResponse", "isRewardedVideoManual", "generalProperties", "adaptersVersions", "metaData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lorg/json/JSONObject;ZLorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;)Ljava/lang/String;", "Landroid/content/Context;", "context", "Landroid/content/SharedPreferences;", "dataString", "", "testSuiteControllerUrl", "(Landroid/content/Context;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Z)V", "b", "(Landroid/content/Context;)Ljava/lang/String;", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class fv {
    private final SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.unity3d.ad-mediation.testSuite", 0);
        Intrinsics.e(sharedPreferences, "context.getSharedPrefere…EY, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }

    public final String b(Context context) {
        Intrinsics.f(context, "context");
        return a(context).getString("dataString", "");
    }

    private final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, List<String>> entry : qv.f26644a.d().entrySet()) {
            jSONObject.putOpt(entry.getKey(), new JSONArray((Collection) entry.getValue()));
        }
        return jSONObject;
    }

    private final void a(Context context, String dataString) {
        SharedPreferences.Editor editorEdit = a(context).edit();
        Intrinsics.e(editorEdit, "getTestSuitePrefs(context).edit()");
        editorEdit.putString("dataString", dataString);
        editorEdit.apply();
    }

    public final void a(Context context, String appKey, JSONObject initResponse, String sdkVersion, String testSuiteControllerUrl, Boolean consent, boolean isRewardedVideoManual) {
        Intrinsics.f(context, "context");
        Intrinsics.f(appKey, "appKey");
        Intrinsics.f(initResponse, "initResponse");
        Intrinsics.f(sdkVersion, "sdkVersion");
        Intrinsics.f(testSuiteControllerUrl, "testSuiteControllerUrl");
        qv qvVar = qv.f26644a;
        a(context, a(appKey, sdkVersion, qvVar.c(context), qvVar.a(context), qvVar.b(context), consent, initResponse, isRewardedVideoManual, qvVar.b(), qvVar.c(), a()));
        Intent intent = new Intent(context, (Class<?>) TestSuiteActivity.class);
        intent.setFlags(805306368);
        intent.putExtra("controllerUrl", testSuiteControllerUrl);
        context.startActivity(intent);
    }

    private final String a(String appKey, String sdkVersion, String bundleId, String appName, String appVersion, Boolean consent, JSONObject initResponse, boolean isRewardedVideoManual, JSONObject generalProperties, JSONObject adaptersVersions, JSONObject metaData) {
        String string = new JSONObject(MapsKt.j(new Pair("deviceOS", d9.d), new Pair("appKey", appKey), new Pair("sdkVersion", sdkVersion), new Pair("bundleId", bundleId), new Pair("appName", appName), new Pair(d9.i.W, appVersion), new Pair("initResponse", initResponse), new Pair("isRvManual", Boolean.valueOf(isRewardedVideoManual)), new Pair("generalProperties", generalProperties), new Pair("adaptersVersion", adaptersVersions), new Pair("metaData", metaData), new Pair("gdprConsent", consent))).toString();
        Intrinsics.e(string, "JSONObject(\n            …ent))\n        .toString()");
        return string;
    }
}
