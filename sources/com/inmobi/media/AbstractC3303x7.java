package com.inmobi.media;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.x7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3303x7 {
    public static int a(String str, JSONObject jSONObject) {
        return (str == null || !jSONObject.has(str)) ? jSONObject.getInt("default") : jSONObject.getInt(str);
    }
}
