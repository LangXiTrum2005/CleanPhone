package com.inmobi.media;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.qk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC3183qk {
    public static JSONObject a(int i, int i2, String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(str, i);
        jSONObject.put(str2, i2);
        return jSONObject;
    }
}
