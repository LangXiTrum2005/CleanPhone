package com.mbridge.msdk.videocommon.entity;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f38279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f38280b;

    public a(String str, String str2) {
        this.f38279a = str;
        this.f38280b = str2;
    }

    public static a a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                return new a(jSONObject.optString("appId"), jSONObject.optString("placementId"));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }
}
