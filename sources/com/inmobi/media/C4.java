package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class C4 {
    public static final JSONObject a(B4 b4) throws JSONException {
        Intrinsics.f(b4, "<this>");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("x", Float.valueOf(B2.a(b4.f22716a)));
        jSONObject.put("y", Float.valueOf(B2.a(b4.f22717b)));
        jSONObject.put("width", b4.f22718c);
        jSONObject.put("height", b4.d);
        return jSONObject;
    }
}
