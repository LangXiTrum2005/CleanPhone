package com.inmobi.media;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.je, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC3087je {
    public static JSONObject a(int i2, int i3, String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(str, i2);
        jSONObject.put(str2, i3);
        return jSONObject;
    }
}
