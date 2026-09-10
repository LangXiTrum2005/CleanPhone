package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.ad, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC2938ad {
    public static JSONObject a(String str, String str2, String str3, String str4) throws JSONException {
        Intrinsics.f(str, str2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(str3, str4);
        return jSONObject;
    }
}
