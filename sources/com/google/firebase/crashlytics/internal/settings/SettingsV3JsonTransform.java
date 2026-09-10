package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.SystemCurrentTimeProvider;
import com.smartdigimkt.o1.b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
class SettingsV3JsonTransform implements SettingsJsonTransform {
    @Override // com.google.firebase.crashlytics.internal.settings.SettingsJsonTransform
    public final Settings a(SystemCurrentTimeProvider systemCurrentTimeProvider, JSONObject jSONObject) throws JSONException {
        long jCurrentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int iOptInt = jSONObject.optInt("cache_duration", b.l2);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        Settings.SessionData sessionData = jSONObject.has("session") ? new Settings.SessionData(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new Settings.SessionData(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        Settings.FeatureFlagData featureFlagData = new Settings.FeatureFlagData(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j = iOptInt;
        if (jSONObject.has("expires_at")) {
            jCurrentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            jCurrentTimeMillis = (j * 1000) + System.currentTimeMillis();
        }
        return new Settings(jCurrentTimeMillis, sessionData, featureFlagData, dOptDouble, dOptDouble2, iOptInt2);
    }
}
