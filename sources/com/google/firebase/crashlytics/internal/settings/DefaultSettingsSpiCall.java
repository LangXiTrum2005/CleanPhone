package com.google.firebase.crashlytics.internal.settings;

import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.network.HttpGetRequest;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.network.HttpResponse;
import com.p004ironsource.m5;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
class DefaultSettingsSpiCall implements SettingsSpiCall {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20745a;

    public DefaultSettingsSpiCall(String str, HttpRequestFactory httpRequestFactory) {
        this.f20745a = str;
    }

    public static void a(HttpGetRequest httpGetRequest, SettingsRequest settingsRequest) {
        String str = settingsRequest.f20763a;
        if (str != null) {
            httpGetRequest.c("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        httpGetRequest.c("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        httpGetRequest.c("X-CRASHLYTICS-API-CLIENT-VERSION", "20.0.3");
        httpGetRequest.c("Accept", "application/json");
        httpGetRequest.c("X-CRASHLYTICS-DEVICE-MODEL", settingsRequest.f20764b);
        String str2 = settingsRequest.f20765c;
        if (str2 != null) {
            httpGetRequest.c("X-CRASHLYTICS-OS-BUILD-VERSION", str2);
        }
        String str3 = settingsRequest.d;
        if (str3 != null) {
            httpGetRequest.c("X-CRASHLYTICS-OS-DISPLAY-VERSION", str3);
        }
        String strA = settingsRequest.f20766e.c().a();
        if (strA != null) {
            httpGetRequest.c("X-CRASHLYTICS-INSTALLATION-ID", strA);
        }
    }

    public static HashMap b(SettingsRequest settingsRequest) {
        HashMap map = new HashMap();
        map.put("build_version", settingsRequest.f20767h);
        map.put("display_version", settingsRequest.g);
        map.put("source", Integer.toString(settingsRequest.f20768i));
        String str = settingsRequest.f;
        if (!TextUtils.isEmpty(str)) {
            map.put(m5.f25675p, str);
        }
        return map;
    }

    public final JSONObject c(HttpResponse httpResponse) {
        StringBuilder sb = new StringBuilder("Settings response code was: ");
        int i2 = httpResponse.f20719a;
        sb.append(i2);
        String string = sb.toString();
        Logger logger = Logger.f20289a;
        logger.e(string);
        String str = this.f20745a;
        if (i2 != 200 && i2 != 201 && i2 != 202 && i2 != 203) {
            logger.c(null, "Settings request failed; (status: " + i2 + ") from " + str);
            return null;
        }
        String str2 = httpResponse.f20720b;
        try {
            return new JSONObject(str2);
        } catch (Exception e2) {
            logger.f(e2, "Failed to parse settings JSON from ".concat(str));
            logger.f(null, "Settings response " + str2);
            return null;
        }
    }
}
