package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class BreadcrumbAnalyticsEventReceiver implements AnalyticsEventReceiver, BreadcrumbSource {
    public BreadcrumbHandler X;

    public static String b(Bundle bundle, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
    public final void a(BreadcrumbHandler breadcrumbHandler) {
        this.X = breadcrumbHandler;
        Logger.f20289a.b("Registered Firebase Analytics event receiver for breadcrumbs", null);
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver
    public final void onEvent(String str, Bundle bundle) {
        BreadcrumbHandler breadcrumbHandler = this.X;
        if (breadcrumbHandler != null) {
            try {
                breadcrumbHandler.a("$A$:" + b(bundle, str));
            } catch (JSONException unused) {
                Logger.f20289a.f(null, "Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
