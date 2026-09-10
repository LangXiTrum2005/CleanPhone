package com.startapp.sdk.internal;

import android.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class e2 {
    public static String a(boolean z2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (z2) {
            jSONObject.put("isTestAd", z2);
        }
        String string = jSONObject.toString();
        Intrinsics.e(string, "toString(...)");
        byte[] bytes = string.getBytes(Charsets.f44691a);
        Intrinsics.e(bytes, "getBytes(...)");
        String strEncodeToString = Base64.encodeToString(bytes, 0);
        Intrinsics.c(strEncodeToString);
        return strEncodeToString;
    }
}
