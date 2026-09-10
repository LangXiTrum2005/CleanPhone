package com.inmobi.media;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class Xh {
    public static JSONObject a(String str, int i) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(str, i);
        return jSONObject;
    }
}
