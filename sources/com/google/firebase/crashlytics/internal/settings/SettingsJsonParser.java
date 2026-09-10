package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.SystemCurrentTimeProvider;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class SettingsJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SystemCurrentTimeProvider f20762a;

    public SettingsJsonParser(SystemCurrentTimeProvider systemCurrentTimeProvider) {
        this.f20762a = systemCurrentTimeProvider;
    }

    public final Settings a(JSONObject jSONObject) throws JSONException {
        SettingsJsonTransform settingsV3JsonTransform;
        int i2 = jSONObject.getInt("settings_version");
        if (i2 != 3) {
            Logger.f20289a.c(null, "Could not determine SettingsJsonTransform for settings version " + i2 + ". Using default settings values.");
            settingsV3JsonTransform = new DefaultSettingsJsonTransform();
        } else {
            settingsV3JsonTransform = new SettingsV3JsonTransform();
        }
        return settingsV3JsonTransform.a(this.f20762a, jSONObject);
    }
}
