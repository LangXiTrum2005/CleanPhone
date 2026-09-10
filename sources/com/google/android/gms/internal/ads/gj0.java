package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class gj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f14883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14884f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f14885g;

    public gj0(String str, String str2, String str3, int i10, String str4, int i11, boolean z10) {
        this.f14879a = str;
        this.f14880b = str2;
        this.f14881c = str3;
        this.f14882d = i10;
        this.f14883e = str4;
        this.f14884f = i11;
        this.f14885g = z10;
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.f14879a);
        jSONObject.put("version", this.f14881c);
        if (((Boolean) zzba.zzc().a(am.Ra)).booleanValue()) {
            jSONObject.put("sdkVersion", this.f14880b);
        }
        jSONObject.put("status", this.f14882d);
        jSONObject.put("description", this.f14883e);
        jSONObject.put("initializationLatencyMillis", this.f14884f);
        if (((Boolean) zzba.zzc().a(am.Sa)).booleanValue()) {
            jSONObject.put("supportsInitialization", this.f14885g);
        }
        return jSONObject;
    }
}
