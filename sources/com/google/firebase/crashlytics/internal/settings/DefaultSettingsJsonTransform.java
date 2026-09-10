package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.SystemCurrentTimeProvider;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
class DefaultSettingsJsonTransform implements SettingsJsonTransform {
    public static Settings b(SystemCurrentTimeProvider systemCurrentTimeProvider) {
        return new Settings(System.currentTimeMillis() + ((long) 3600000), new Settings.SessionData(8), new Settings.FeatureFlagData(true, false, false), 10.0d, 1.2d, 60);
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsJsonTransform
    public final Settings a(SystemCurrentTimeProvider systemCurrentTimeProvider, JSONObject jSONObject) {
        return b(systemCurrentTimeProvider);
    }
}
