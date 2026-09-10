package com.facebook.gamingservices.cloudgaming.internal;

import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class SDKLogger {
    public final Bundle a(String str) {
        Bundle bundle = new Bundle();
        if (str == null) {
            return bundle;
        }
        throw null;
    }

    public final void b(String str, String str2, JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        bundle.putString("request_id", str2);
        bundle.putString("function_type", str);
        bundle.putString("payload", jSONObject.toString());
        throw null;
    }

    public final void c(String str, String str2, JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        bundle.putString("request_id", str2);
        bundle.putString("function_type", str);
        throw null;
    }
}
