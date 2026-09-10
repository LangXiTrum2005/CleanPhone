package com.inmobi.media;

import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class Si {
    public static JSONObject a(String str, String str2, String str3, String str4) throws JSONException {
        Intrinsics.checkNotNullParameter(str, str2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(str3, str4);
        return jSONObject;
    }
}
