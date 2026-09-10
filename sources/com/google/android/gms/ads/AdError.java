package com.google.android.gms.ads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AdError {

    @NonNull
    public static final String UNDEFINED_DOMAIN = "undefined";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AdError f10621d;

    public AdError(int i10, @NonNull String str, @NonNull String str2, @Nullable AdError adError) {
        this.f10618a = i10;
        this.f10619b = str;
        this.f10620c = str2;
        this.f10621d = adError;
    }

    @Nullable
    public AdError getCause() {
        return this.f10621d;
    }

    public int getCode() {
        return this.f10618a;
    }

    @NonNull
    public String getDomain() {
        return this.f10620c;
    }

    @NonNull
    public String getMessage() {
        return this.f10619b;
    }

    @NonNull
    public String toString() {
        try {
            return zzb().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    @NonNull
    public final com.google.android.gms.ads.internal.client.zze zza() {
        com.google.android.gms.ads.internal.client.zze zzeVar;
        AdError adError = this.f10621d;
        if (adError == null) {
            zzeVar = null;
        } else {
            zzeVar = new com.google.android.gms.ads.internal.client.zze(adError.f10618a, adError.f10619b, adError.f10620c, null, null);
        }
        return new com.google.android.gms.ads.internal.client.zze(this.f10618a, this.f10619b, this.f10620c, zzeVar, null);
    }

    @NonNull
    public JSONObject zzb() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f10618a);
        jSONObject.put("Message", this.f10619b);
        jSONObject.put("Domain", this.f10620c);
        AdError adError = this.f10621d;
        if (adError == null) {
            jSONObject.put("Cause", "null");
            return jSONObject;
        }
        jSONObject.put("Cause", adError.zzb());
        return jSONObject;
    }

    public AdError(int i10, @NonNull String str, @NonNull String str2) {
        this(i10, str, str2, null);
    }
}
