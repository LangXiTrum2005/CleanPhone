package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzex {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f10861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10862c;

    public zzex(String str, Bundle bundle, String str2) {
        this.f10860a = str;
        this.f10861b = bundle;
        this.f10862c = str2;
    }

    public final String zza() {
        return this.f10860a;
    }

    public final String zzb() {
        String str = this.f10862c;
        if (!TextUtils.isEmpty(str)) {
            try {
                return new JSONObject(str).optString("request_id", "");
            } catch (JSONException unused) {
            }
        }
        return "";
    }

    public final Bundle zzc() {
        return this.f10861b;
    }
}
